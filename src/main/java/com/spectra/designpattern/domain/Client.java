package com.spectra.designpattern.domain;

import java.util.UUID;

/**
 * Created by sgjo on 2018. 4. 4..
 */
public class Client {

    private UUID id;
    private String name;

    private ChatRoom chatRoom;

    public Client(String name)
    {
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public boolean register()
    {
        System.out.println("Register");
        Router router = Router.getInstance();

        return router.register(this);
    }

    public void listen(String message)
    {
        System.out.println("Client Listen: "+message);
    }

    public void send(String message)
    {
        //System.out.println("Send:"+message);
        chatRoom.send(message);
    }

    public String getId() {
        return id.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChatRoom(ChatRoom chatRoom) {
        this.chatRoom = chatRoom;
    }
}
