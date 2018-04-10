package com.spectra.designpattern;

import junit.framework.TestCase;

/**
 * Created by sgjo on 2018. 4. 6..
 */
public class Day1ExtendTest extends TestCase{

    /**
     * 1-6. 매니저 생성 하기
     */
    public void testCreateManager()
    {
        int paramActiveAgentCount = 10;
        int paramActiveManagerCount = 2;

        // 상담사, 매니저 배분대기 하기
        int resultActiveAgentCount = 0; // 코드를 삽입 하세요
        int resultActiveManagerCount = 0; // 코드를 삽입 하세요

        assertEquals("상담사 배분대기 완료!!", paramActiveAgentCount, resultActiveAgentCount);
        assertEquals("매니저 배분대기 완료!!", paramActiveManagerCount, resultActiveManagerCount);

        int paramQueueSize = 10;

        // 큐 사이즈 변경하기
        int resultQueueSize = 0; // 코드를 삽입 하세요

        assertEquals("매니저 Queue 사이즈 변경 완료!!", paramQueueSize, resultQueueSize);

        for(int i = 0 ; i < paramQueueSize; i++)
        {

            // 고객 문의 등록하기 큐 사이즈 만큼
            boolean isAddedClient = false; // 코드를 삽입 하세요

            assertTrue(isAddedClient);
        }


        // 고객 문의 등록하기
        boolean isAddedClient = true; // 코드를 삽입 하세요

        assertFalse(isAddedClient);

    }

    /**
     * 1-7. 메시지 유형이 확장 됩니다 (텍스트, 첨부파일, HTML, JSON)
     */
    public void testCreateMessageType()
    {
        int paramClientCount = 10;

        // 코드를 삽입 하세요

        int resultClientCount = 0;

        assertEquals("고객 접수 완료!!", paramClientCount, resultClientCount);

    }

    /**
     * 1-8. 고객 채널이 확장 됩니다.
     */
    public void testCreateClientWithChannel()
    {
        int paramMobileClientCount = 5;
        int paramPCClientCount = 5;

        int resultMobileClientCount = 0; // 코드를 삽입 하세요
        int resultPCClientCount = 0; // 코드를 삽입 하세요

        assertEquals("배분완료!!", paramMobileClientCount, resultMobileClientCount);
        assertEquals("배분완료!!", paramPCClientCount, resultPCClientCount);

    }


}
