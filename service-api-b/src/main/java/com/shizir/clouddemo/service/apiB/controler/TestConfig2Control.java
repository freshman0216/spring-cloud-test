package com.shizir.clouddemo.service.apiB.controler;

import com.shizir.clouddemo.service.apiB.config.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConfig2Control {

    @Autowired
    TestBean myTestBean;

    @RequestMapping("/TestConfig2/Config")
    public TestBean GetConfigValue()
    {
        return myTestBean;
    }
}
