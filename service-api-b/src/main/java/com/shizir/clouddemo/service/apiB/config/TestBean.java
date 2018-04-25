package com.shizir.clouddemo.service.apiB.config;

import java.util.Date;

public class TestBean {
    public Integer hashCode;
    public Date date;

    TestBean()
    {
        date = new Date();
        System.out.println("TestBean init ...");
    }
}
