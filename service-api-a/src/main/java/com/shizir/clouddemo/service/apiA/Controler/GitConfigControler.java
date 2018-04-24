package com.shizir.clouddemo.service.apiA.Controler;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitConfigControler {

    private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Value("${URL.AgentCloud:}")
    String agentCloudUrl;

    @Value("${IP.Redis:}")
    String redisIP;

    @RequestMapping("/GitConfig/AgentCloudUrl")
    public String GetConfigAgentCloudUrl()
    {
        logger.info("calling trace GitConfigControler.GetConfigAgentCloudUrl  ");
        return agentCloudUrl;
    }

    @RequestMapping("/GitConfig/RedisIP")
    public String GetConfigRedisIP()
    {
        logger.info("calling trace GitConfigControler.GetConfigRedisIP  ");
        return redisIP;
    }
}
