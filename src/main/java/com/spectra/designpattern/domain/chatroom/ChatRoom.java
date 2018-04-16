package com.spectra.designpattern.domain.chatroom;

import com.spectra.designpattern.domain.speaker.AbstractSpeaker;
import com.spectra.designpattern.domain.talk.TalkMessage;

import java.util.UUID;

/**
 * Created by sgjo on 2018. 4. 4..
 */
public class ChatRoom {

    private UUID id;
    private AbstractSpeaker client;
    private AbstractSpeaker agent;

    public ChatRoom(AbstractSpeaker client, AbstractSpeaker agent)
    {
        this.id = UUID.randomUUID();
        this.client = client;
        this.agent = agent;
    }

    public void talking(TalkMessage message)
    {
        client.listen(message);
        agent.listen(message);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
