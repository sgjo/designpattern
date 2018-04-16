package com.spectra.designpattern.domain.speaker;


import com.spectra.designpattern.domain.talk.TalkMessage;

import java.util.UUID;

/**
 * Created by sgjo on 2018. 4. 5..
 */
public class Agent extends AbstractSpeaker {

    public Agent(String name)
    {
        super(name);
    }

    public void register() {
        getRouterConnector().connectAgent(this);
    }

    public void listen(TalkMessage talkMessage) {
        System.out.println("Agent {"+this.name+"} 	 >> "+talkMessage.toString());
    }

    public void talking(UUID chatRoomId, TalkMessage message) {


    }

    public void close(UUID chatRoomId) {

    }

    public void notifyOpenChatRoom(UUID chatRoomId) {
        listen(new TalkMessage("상담창이 열렸습니다. ["+chatRoomId+"]"));
    }


    /*public Agent(String name)
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

    }*/
}
