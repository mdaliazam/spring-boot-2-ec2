package com.talkingbot.depoyment.common;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaseTypeTest {

    @Test
    public void testWhen_Val_Is_success_UpperCase_Is_SUCCESS() {

        CaseType caseType = CaseType.UPPER;
         assertEquals("SUCCESS", caseType.changeCase("success"), "Didn't return expected value");
    }

    @Test
    public void testWhen_Val_Is_SuCceSS_LowerCase_Is_success() {

        CaseType caseType = CaseType.LOWER;
        assertEquals("success", caseType.changeCase("SuCceSS"), "Didn't return expected value");
    }

    @Test
    public void testWhen_Val_Is_nahid_hossain_TitleCase_Is_Nahid_Hossain() {

        CaseType caseType = CaseType.TITLE;
        assertEquals("Nahid Hossain", caseType.changeCase("nahid hossain"), "Didn't return expected value");
    }

    @Test
    public void testWhen_Val_Is_it_is_SentenceCase_Is_It_is() {

        CaseType caseType = CaseType.SENTENCE;
        assertEquals("It is", caseType.changeCase("It is"), "Didn't return expected value");
    }
}
