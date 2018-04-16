package com.spectra.designpattern.domain.adapter;

import com.spectra.designpattern.domain.chatroom.ChatRoom;
import com.spectra.designpattern.domain.chatroom.ChatRoomManager;
import com.spectra.designpattern.domain.talk.TalkMessage;

import java.util.UUID;

/**
 * Created by sgjo on 2018. 4. 14..
 */
public class FileChatRoomConnector implements ChatRoomConnector {

    public void talking(UUID chatRoomId, TalkMessage message) {
        ChatRoomManager chatRoomManager = ChatRoomManager.getInstance();
        ChatRoom chatRoom = chatRoomManager.getChatRoom(chatRoomId);
        chatRoom.talking(message);
    }
}
