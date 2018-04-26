package com.shizir.clouddemo.service.apiB.config;

import org.springframework.beans.factory.annotation.Value;

public class ApolloBean {

    public @Value("${URL.AgentCloud:}")
    String agentCloudUrl;

    @Value("${IP.Redis:}")
    public String redisIP;

    public ApolloBean()
    {
        System.out.println("ApolloBean init ...");
    }
}