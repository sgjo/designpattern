package com.spectra.designpattern;

import junit.framework.TestCase;

/**
 * Created by sgjo on 2018. 4. 6..
 */
public class Day1Test extends TestCase{

    /**
     * 1-1. 상담사 배분대기 하기
     */
    public void testCreateAgent()
    {
        int paramActiveAgentCount = 10;

        int resultActiveAgentCount = 0; // 코드를 삽입 하세요

        assertEquals("상담사 배분대기 완료!!", paramActiveAgentCount, resultActiveAgentCount);
    }

    /**
     * 1-2. 고객 문의 접수 하기
     */
    public void testCreateClient()
    {
        int paramClientCount = 10;

        int resultClientCount = 0; // 코드를 삽입 하세요

        assertEquals("고객 접수 완료!!", paramClientCount, resultClientCount);

    }

    /**
     * 1-3. 할당 하기
     */
    public void testRouting()
    {
        int paramActiveAgentCount = 5;
        int paramClientCount = 10;

        int resultChatRoomsCount = 0; // 코드를 삽입 하세요

        assertEquals("배분완료!!", paramActiveAgentCount, resultChatRoomsCount);

    }

    /**
     * 1-4. 상담하기
     */
    public void testTalking()
    {
        int CLIENT_MESSAGE_COUNT = 3;
        int AGENT_MESSAGE_COUNT = 3;

        int paramActiveAgentCount = 5;
        int paramClientCount = 10;

        int resultMessageCount = 0; // 코드를 삽입 하세요

        assertEquals("상담하기 - 메시지 수!!",
                paramClientCount * (CLIENT_MESSAGE_COUNT+AGENT_MESSAGE_COUNT),
                resultMessageCount);
    }

    /**
     * 1-5. 종료하기
     */
    public void testTalkEnd()
    {
        int paramActiveAgentCount = 5;

        int resultChatRoomsCount = 0; // 코드를 삽입 하세요
        int resultActiveAgentCount = 0; // 코드를 삽입 하세요
        int resultClientCount = 0; // 코드를 삽입 하세요

        assertEquals("종료 - 채팅방 수!!", 0, resultChatRoomsCount);
        assertEquals("종료 - 배분대기 상담사 수!!", paramActiveAgentCount, resultActiveAgentCount);
        assertEquals("종료 - 고객 수!!", 0, resultClientCount);

    }
}
