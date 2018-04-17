package com.spectra.designpattern.domain.talk;

import java.util.UUID;

/**
 * Created by sgjo on 2018. 4. 16..
 */
public abstract class TalkMessage {

    private UUID id;
    private String message;
    private String type;

    public TalkMessage(String type, String message)
    {
        this.id = UUID.randomUUID();
        this.message = message;
        this.type = type;
    }

    public static TalkMessage createTalkMessage(String type, String message)
    {
        TalkMessage talkMessage = null;

        if (type.equals("TEXT"))
        {
            talkMessage = new TextTalkMessage(message);
        }
        else if (type.equals("JSON"))
        {
            talkMessage = new JsonTalkMessage(message);
        }
        else if (type.equals("IMG"))
        {
            talkMessage = new ImageTalkMessage(message);
        }

        return talkMessage;
    }

    public String toString()
    {
        return "<"+this.type+">"+this.message;
    }
}
