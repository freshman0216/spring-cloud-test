package com.shizir.clouddemo.service.apiA;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceApiAApplication {
    public static void main(String[] args) {
//        SpringApplication.run(ApiAServiceApplication.class, args);
        new SpringApplicationBuilder(ServiceApiAApplication.class).web(true).run(args);
    }
}