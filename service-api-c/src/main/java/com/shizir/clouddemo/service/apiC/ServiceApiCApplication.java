package com.shizir.clouddemo.service.apiC;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.fang.agent.framework.utility.monitor.*", "com.shizir.clouddemo.service.apiC.*"})
public class ServiceApiCApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ServiceApiCApplication.class).web(true).run(args);
    }
}
