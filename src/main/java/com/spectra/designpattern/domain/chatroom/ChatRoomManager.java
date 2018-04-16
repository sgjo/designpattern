package com.spectra.designpattern.domain.chatroom;

import com.spectra.designpattern.domain.speaker.AbstractSpeaker;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by sgjo on 2018. 4. 16..
 */
public class ChatRoomManager {

    private volatile static ChatRoomManager uniqueChatRoomManager;
    private Map<UUID, ChatRoom> chatRooms;

    private ChatRoomManager()
    {
        this.chatRooms = new HashMap<UUID, ChatRoom>();
    }

    public static ChatRoomManager getInstance() {
        if (uniqueChatRoomManager == null)
        {
            synchronized (ChatRoomManager.class)
            {
                if(uniqueChatRoomManager == null)
                {
                    uniqueChatRoomManager = new ChatRoomManager();
                }
            }
        }
        return uniqueChatRoomManager;
    }

    public UUID openChatRoom(AbstractSpeaker client, AbstractSpeaker server)
    {
        ChatRoom chatRoom = new ChatRoom(client, server);
        chatRooms.put(chatRoom.getId(), chatRoom);

        return chatRoom.getId();

    }

    public ChatRoom getChatRoom(UUID chatRoomId)
    {
        return chatRooms.get(chatRoomId);
    }
}
