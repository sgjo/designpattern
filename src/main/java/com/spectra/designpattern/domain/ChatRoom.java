package com.spectra.designpattern.domain;

/**
 * Created by sgjo on 2018. 4. 4..
 */
public class ChatRoom {

    private String id;
    private String name;
    private Client client;
    private Server server;

    public ChatRoom(String id, String name)
    {
        this.id = id;
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
}
