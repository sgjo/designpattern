package com.spectra.designpattern;

import com.spectra.designpattern.domain.adapter.ChatRoomConnector;
import com.spectra.designpattern.domain.adapter.FileChatRoomConnector;
import com.spectra.designpattern.domain.adapter.FileRouterConnector;
import com.spectra.designpattern.domain.adapter.RouterConnector;
import com.spectra.designpattern.domain.speaker.AbstractSpeaker;
import com.spectra.designpattern.domain.speaker.Agent;
import com.spectra.designpattern.domain.speaker.Client;
import com.spectra.designpattern.service.SpeakerLogicService;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testTalk()
    {
        AbstractSpeaker agent1 = createAgent("agent1");
        AbstractSpeaker agent2 = createAgent("agent2");
        AbstractSpeaker agent3 = createAgent("agent3");

        SpeakerLogicService speakerLogicService = new SpeakerLogicService();
        speakerLogicService.connect(agent1);
        speakerLogicService.connect(agent2);
        speakerLogicService.connect(agent3);

        AbstractSpeaker client1 = createClient("client1");
        AbstractSpeaker client2 = createClient("client2");
        AbstractSpeaker client3 = createClient("client3");
        speakerLogicService.connect(client1);
        speakerLogicService.connect(client2);
        speakerLogicService.connect(client3);


    }

    private AbstractSpeaker createAgent(String name)
    {
        RouterConnector routerConnector = new FileRouterConnector();
        ChatRoomConnector chatRoomConnector = new FileChatRoomConnector();

        AbstractSpeaker agent = new Agent(name);
        agent.setRouterConnector(routerConnector);
        agent.setChatRoomConnector(chatRoomConnector);

        return agent;
    }

    private AbstractSpeaker createClient(String name)
    {
        RouterConnector routerConnector = new FileRouterConnector();
        ChatRoomConnector chatRoomConnector = new FileChatRoomConnector();

        AbstractSpeaker client = new Client(name);
        client.setRouterConnector(routerConnector);
        client.setChatRoomConnector(chatRoomConnector);

        return client;
    }
}
