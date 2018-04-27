package com.shizir.clouddemo.service.apiB;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 启用了：
 * 1. 服务发现和注册
 * 2. 开启Feign方式调用restful api
 * 3. 开启apollo 配置(支持公共命名空间)
 */
@EnableDiscoveryClient
@EnableFeignClients
@EnableApolloConfig({"TEST1.Fang.SFB.Framework"})
@SpringBootApplication
public class ServiceApiBApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ServiceApiBApplication.class).web(true).run(args);
    }
}