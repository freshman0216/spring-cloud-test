package com.shizir.clouddemo.service.apiB.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 通过Feign方式调用api-a的服务
 */
@FeignClient(value = "service-api-a", fallback = ApiAGitConfigHystrix.class)
//@FeignClient(value = "service-api-a")
@Primary
public interface ApiAGitConfig {
    @RequestMapping(method = RequestMethod.GET, value = "/GitConfig/AgentCloudUrl")
    String GetConfigAgentCloudUrl();

    //有参数的示例
    //String HouseName(@RequestParam(value = "houseName") String houseName);
}
