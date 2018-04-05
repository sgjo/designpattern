package com.spectra.designpattern.domain;

/**
 * Created by sgjo on 2018. 4. 4..
 */
public abstract class Server {

    protected String id;
    protected String name;

    abstract public boolean register();
    abstract public void listen(String message);
    abstract public void send();

}
