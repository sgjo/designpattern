package com.spectra.designpattern.domain.speaker;

import com.spectra.designpattern.domain.adapter.ChatRoomConnector;
import com.spectra.designpattern.domain.adapter.RouterConnector;
import com.spectra.designpattern.domain.talk.TalkMessage;

import java.util.UUID;

/**
 * Created by sgjo on 2018. 4. 13..
 */
public abstract class AbstractSpeaker {

    protected UUID id;
    protected String name;

    private RouterConnector routerConnector;
    private ChatRoomConnector chatRoomConnector;

    protected AbstractSpeaker(String name){
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public abstract void register();
    public abstract void listen(TalkMessage message);
    public abstract void talking(UUID chatRoomId, TalkMessage message);
    public abstract void close(UUID chatRoomId);
    public abstract void notifyOpenChatRoom(UUID chatRoomId);

    public UUID getId(){
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }

    public RouterConnector getRouterConnector() {
        return routerConnector;
    }

    public void setRouterConnector(RouterConnector routerConnector) {
        this.routerConnector = routerConnector;
    }

    public ChatRoomConnector getChatRoomConnector() {
        return chatRoomConnector;
    }

    public void setChatRoomConnector(ChatRoomConnector chatRoomConnector) {
        this.chatRoomConnector = chatRoomConnector;
    }
}
