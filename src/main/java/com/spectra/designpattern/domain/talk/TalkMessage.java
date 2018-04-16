package com.spectra.designpattern.domain.talk;

import java.util.UUID;

/**
 * Created by sgjo on 2018. 4. 16..
 */
public class TalkMessage {

    private UUID id;
    private String message;

    public TalkMessage(String message)
    {
        this.id = UUID.randomUUID();
        this.message = message;
    }

    public String toString()
    {
        return this.message;
    }
}
