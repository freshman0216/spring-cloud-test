package com.shizir.clouddemo.service.apiB.config;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Date;

public class TestBean {
    public Integer hashCode;

    @Value("#{T(java.lang.Math).random()}")
    public String random;

    @PostConstruct
    private void initTestBean()
    {
        System.out.println("initTestBean called ...");
    }

    @PreDestroy
    private void preDestoryTestBean()
    {
        System.out.println("preDestoryTestBean called ...");
    }
}
