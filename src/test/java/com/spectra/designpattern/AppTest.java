package com.spectra.designpattern;

import com.spectra.designpattern.domain.Agent;
import com.spectra.designpattern.domain.Client;
import com.spectra.designpattern.domain.Server;
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
        Server server = new Agent("agent1");
        server.register();

        Client client = new Client("skcho");
        client.register();

        client.send("I'd like to talk to somebody.");

        server.send("Yes, what can I do for you?");
    }
}
