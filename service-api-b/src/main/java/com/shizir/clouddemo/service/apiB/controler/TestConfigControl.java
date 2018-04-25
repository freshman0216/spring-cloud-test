package com.shizir.clouddemo.service.apiB.controler;

import com.shizir.clouddemo.service.apiB.config.TestBean;
import org.omg.CORBA.INTERNAL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConfigControl {

    @Autowired
    TestBean myTestBean;

    @RequestMapping("/TestConfig/Config")
    public TestBean GetConfigValue()
    {
        return myTestBean;
    }
}
