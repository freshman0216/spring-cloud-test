package com.shizir.clouddemo.service.apiB.service;

import org.springframework.stereotype.Component;

/**
 * 通过Feign方式调用api-a的服务，调用接口失败处理类
 */
@Component
public class ApiAGitConfigHystrix implements ApiAGitConfig  {

    @Override
    public String GetConfigAgentCloudUrl() {
        return "call apiA error";
    }
}