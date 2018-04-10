package com.spectra.designpattern.domain;

import java.util.UUID;

/**
 * Created by sgjo on 2018. 4. 4..
 */
public abstract class Server {

    protected UUID id;
    protected String name;
    protected ChatRoom chatRoom;

    abstract public boolean register();
    abstract public void listen(String message);
    abstract public void send(String message);

    public ChatRoom getChatRoom() {
        return chatRoom;
    }

    public void setChatRoom(ChatRoom chatRoom) {
        this.chatRoom = chatRoom;
    }
}
