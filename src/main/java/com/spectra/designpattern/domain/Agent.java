package com.spectra.designpattern.domain;

/**
 * Created by sgjo on 2018. 4. 5..
 */
public class Agent extends Server {

    public Agent(String id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public boolean register() {
        Router router = Router.getInstance();
        return router.addServer(this);
    }

    public void listen(String message) {
        System.out.println("Server Listen : " + message);
    }

    public void send() {

    }
}
