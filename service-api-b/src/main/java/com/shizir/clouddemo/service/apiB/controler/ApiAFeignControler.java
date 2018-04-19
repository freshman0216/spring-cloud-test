package com.shizir.clouddemo.service.apiB.controler;

import com.shizir.clouddemo.service.apiB.service.ApiAGitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Feign 方式调用服务示例
 */
@RestController
public class ApiAFeignControler {
    @Autowired
    ApiAGitConfig apiAGitConfig;

    @RequestMapping("/GitConfig/a/AgentCloudUrl")
    public String GetConfigAgentCloudUrl()
    {
        return apiAGitConfig.GetConfigAgentCloudUrl();
    }
}
