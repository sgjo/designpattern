package com.spectra.designpattern.domain;

/**
 * Created by sgjo on 2018. 4. 4..
 */
public class Client {

    private String id;
    private String name;

    public Client(String id, String name)
    {
        this.id = id;
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
        System.out.println("Send:"+message);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
