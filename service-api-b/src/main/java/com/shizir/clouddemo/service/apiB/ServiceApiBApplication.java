package com.shizir.clouddemo.service.apiB;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@EnableApolloConfig
@SpringBootApplication
public class ServiceApiBApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ServiceApiBApplication.class).web(true).run(args);
    }
}