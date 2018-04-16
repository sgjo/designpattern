package com.spectra.designpattern.service;

import com.spectra.designpattern.domain.adapter.ChatRoomConnector;
import com.spectra.designpattern.domain.adapter.FileChatRoomConnector;
import com.spectra.designpattern.domain.adapter.FileRouterConnector;
import com.spectra.designpattern.domain.adapter.RouterConnector;
import com.spectra.designpattern.domain.speaker.AbstractSpeaker;
import com.spectra.designpattern.domain.speaker.Client;
import com.spectra.designpattern.domain.talk.TalkMessage;

import java.util.UUID;

/**
 * Created by sgjo on 2018. 4. 13..
 */
public class SpeakerLogicService {

    public void connect(AbstractSpeaker speaker)
    {
        RouterConnector routerConnector = new FileRouterConnector();

        speaker.setRouterConnector(routerConnector);
        speaker.register();

    }

    public void talking(AbstractSpeaker speaker, UUID chatRoomId, String message)
    {
        ChatRoomConnector chatRoomConnector = new FileChatRoomConnector();
        speaker.setChatRoomConnector(chatRoomConnector);

        speaker.talking(chatRoomId, new TalkMessage(message));

    }

    public void close(UUID chatRoomId)
    {
        ChatRoomConnector chatRoomConnector = new FileChatRoomConnector();

        AbstractSpeaker speaker = new Client("John"); // Factory Pattern
        speaker.setChatRoomConnector(chatRoomConnector);

        speaker.close(chatRoomId);

    }

}
