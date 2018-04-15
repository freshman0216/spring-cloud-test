package com.shizir.clouddemo.service.apiA.Controler;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitConfigControler {

    @Value("${spring.application.name}")
    String configServerName;

    @RequestMapping("/GitConfig/GetConnfig")
    public String GetCongigServerName()
    {
        return configServerName;
    }
}
