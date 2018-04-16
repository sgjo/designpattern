package com.spectra.designpattern.domain.router;

import com.spectra.designpattern.domain.chatroom.ChatRoomManager;
import com.spectra.designpattern.domain.speaker.AbstractSpeaker;

import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by sgjo on 2018. 4. 4..
 */
public class Router {

    private volatile static Router uniqueRouter;

    private int max_buffer_size;
    private Queue<AbstractSpeaker> server_wait_queue;
    private Queue<AbstractSpeaker> client_wait_queue;

    private Router(int max_buffer_size)
    {
        this.max_buffer_size = max_buffer_size;
        this.server_wait_queue = new LinkedBlockingQueue<AbstractSpeaker>();
        this.client_wait_queue = new ArrayBlockingQueue<AbstractSpeaker>(max_buffer_size);
    }

    public static Router getInstance() {
        if (uniqueRouter == null)
        {
            synchronized (Router.class)
            {
                if(uniqueRouter == null)
                {
                    uniqueRouter = new Router(1);
                }
            }
        }
        return uniqueRouter;
    }

    public boolean registerClient(AbstractSpeaker client)
    {
        boolean resultFlag = false;

        if(hasWaitServer())
        {
            AbstractSpeaker server = pollServer();
            UUID chatRoomId = openChatRoom(client, server);

            server.notifyOpenChatRoom(chatRoomId);
            client.notifyOpenChatRoom(chatRoomId);

        }
        else
        {
            resultFlag = client_wait_queue.add(client);
        }

        return resultFlag;
    }

    public boolean registerAgent(AbstractSpeaker agent)
    {
        return server_wait_queue.add(agent);
    }

    private UUID openChatRoom(AbstractSpeaker client, AbstractSpeaker server)
    {
        ChatRoomManager chatRoom = ChatRoomManager.getInstance();
        return chatRoom.openChatRoom(client, server);
    }

    private boolean hasWaitServer()
    {
        return !server_wait_queue.isEmpty();
    }

    private AbstractSpeaker pollServer()
    {
        return server_wait_queue.poll();
    }


}
