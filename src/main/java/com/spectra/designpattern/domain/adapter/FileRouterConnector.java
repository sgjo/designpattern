package com.spectra.designpattern.domain.adapter;

import com.spectra.designpattern.domain.router.Router;
import com.spectra.designpattern.domain.speaker.AbstractSpeaker;

/**
 * Created by sgjo on 2018. 4. 14..
 */
public class FileRouterConnector implements RouterConnector {

    public void connectClient(AbstractSpeaker speaker) {

        Router router = Router.getInstance();
        router.registerClient(speaker);
    }

    public void connectAgent(AbstractSpeaker speaker) {

        Router router = Router.getInstance();
        router.registerAgent(speaker);

    }
}
