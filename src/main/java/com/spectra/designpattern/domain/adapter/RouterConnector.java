package com.spectra.designpattern.domain.adapter;

import com.spectra.designpattern.domain.speaker.AbstractSpeaker;

/**
 * Created by sgjo on 2018. 4. 14..
 */
public interface RouterConnector {

    void connectClient(AbstractSpeaker speaker);
    void connectAgent(AbstractSpeaker speaker);

}
