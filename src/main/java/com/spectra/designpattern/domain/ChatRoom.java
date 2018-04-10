package com.spectra.designpattern.domain;

import java.util.UUID;

/**
 * Created by sgjo on 2018. 4. 4..
 */
public class ChatRoom {

    private UUID id;
    private String name;
    private Client client;
    private Server server;

    public ChatRoom(String name)
    {
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public boolean openChatRoom(Client client, Server server)
    {
        this.client = client;
        this.server = server;

        client.listen("Welcome! Open");
        server.listen("Start with Client:"+client.getName());

        return true;
    }

    public boolean send(String message)
    {
        this.client.listen(message);
        this.server.listen(message);

        return true;
    }
}
