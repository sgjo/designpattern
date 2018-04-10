package com.spectra.designpattern.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by sgjo on 2018. 4. 4..
 */
public class Router {

    private volatile static Router uniqueRouter;

    private int max_buffer_size;
    private Queue<Server> server_wait_queue;
    private Queue<Client> client_wait_queue;

    private Router(int max_buffer_size)
    {
        this.max_buffer_size = max_buffer_size;
        this.server_wait_queue = new LinkedBlockingQueue<Server>();
        this.client_wait_queue = new ArrayBlockingQueue<Client>(max_buffer_size);
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

    public boolean register(Client client)
    {
        boolean resultFlag = false;

        if(hasWaitServer())
        {
            Server server = pollServer();
            resultFlag = openChatRoom(client, server);
        }
        else
        {
            resultFlag = client_wait_queue.add(client);
        }

        return resultFlag;
    }

    private boolean hasWaitServer()
    {
        return !server_wait_queue.isEmpty();
    }

    private Server pollServer()
    {
        return server_wait_queue.poll();
    }

    private boolean openChatRoom(Client client, Server server)
    {
        ChatRoom chatRoom = new ChatRoom("helloWorld");
        client.setChatRoom(chatRoom);
        server.setChatRoom(chatRoom);

        return chatRoom.openChatRoom(client, server);
    }

    public boolean addServer(Server server)
    {
        return server_wait_queue.add(server);
    }



}
