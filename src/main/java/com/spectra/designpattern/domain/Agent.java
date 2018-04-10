package com.spectra.designpattern.domain;

import java.util.UUID;

/**
 * Created by sgjo on 2018. 4. 5..
 */
public class Agent extends Server {

    public Agent(String name)
    {
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public boolean register() {
        Router router = Router.getInstance();
        return router.addServer(this);
    }

    public void listen(String message) {
        System.out.println("Server Listen : " + message);
    }

    public void send(String message) {

        chatRoom.send(message);

    }
}
