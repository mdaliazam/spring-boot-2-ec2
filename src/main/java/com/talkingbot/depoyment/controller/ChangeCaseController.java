package com.talkingbot.depoyment.controller;


import com.talkingbot.depoyment.common.CaseType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping("/change")
@Slf4j
public class ChangeCaseController {

    @GetMapping("/case/{caseType}/{val}")
    public String changeCase(@PathVariable("caseType") String caseType, @PathVariable("val") String val) {

        CaseType selectedCaseType = CaseType.valueOf(caseType.toUpperCase(Locale.ROOT));
        if (selectedCaseType == null) {
            return "Result: " + val;
        }

        return "Changed case result: " + selectedCaseType.changeCase(val);

    }

}
