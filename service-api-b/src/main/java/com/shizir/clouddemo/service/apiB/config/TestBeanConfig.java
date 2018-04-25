package com.shizir.clouddemo.service.apiB.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class TestBeanConfig {
    public Integer hashCode;

    TestBeanConfig()
    {
        hashCode = this.hashCode();
        System.out.println("TestConfig init ...");
    }

    //每次@Autowired TestBean myTestBean;时生成一个实例，不是每次http请求时
    //如果改成request，会报错
    @Bean
    @Scope("prototype")
    public TestBean myTestBean()
    {
        TestBean tb = new TestBean();
        tb.hashCode = this.hashCode;
        return tb;
    }
}
