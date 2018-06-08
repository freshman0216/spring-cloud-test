package com.shizir.clouddemo.service.apiC.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControl {

    @RequestMapping("/hello")
    public String GetConfigValue()
    {
        return "hello";
    }
}
