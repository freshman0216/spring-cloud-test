package com.shizir.clouddemo.service.apiB.config;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Date;

public class ApolloBean {

    @Value("${URL.AgentCloud:}")
    public String agentCloudUrl;

    @Value("${IP.Redis:}")
    public String redisIP;

    @Value("#{T(java.lang.Math).random()}")
    public String random;

    public ApolloBean()
    {
        System.out.println("ApolloBean called ...");
    }

    @PostConstruct
    private void initApolloBean()
    {
        System.out.println("initApolloBean called ...");
    }

    @PreDestroy
    private void preDestoryApolloBean()
    {
        System.out.println("preDestoryApolloBean called ...");
    }
}