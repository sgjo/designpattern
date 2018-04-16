package com.spectra.designpattern.domain.adapter;

import com.spectra.designpattern.domain.talk.TalkMessage;

import java.util.UUID;

/**
 * Created by sgjo on 2018. 4. 14..
 */
public interface ChatRoomConnector {

    void talking(UUID chatRoomId, TalkMessage message);
}
