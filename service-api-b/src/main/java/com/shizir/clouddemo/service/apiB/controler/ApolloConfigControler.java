package com.shizir.clouddemo.service.apiB.controler;

import com.ctrip.framework.apollo.model.ConfigChange;
import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Apollo Config配置示例
 */
@RestController
public class ApolloConfigControler {

    @Value("${URL.AgentCloud:}")
    String agentCloudUrl;

    @Value("${IP.Redis:}")
    String redisIP;

    @Value("${PassportInterfaceUrl:}")
    String passportInterfaceUrl;

    @RequestMapping("/ApolloConfig/AgentCloudUrl")
    public String GetCongigAgentCloudUrl()
    {
        return agentCloudUrl;
    }

    @RequestMapping("/ApolloConfig/RedisIP")
    public String GetCongigRedisIP()
    {
        return redisIP;
    }

    @RequestMapping("/ApolloConfig/common/psurl")
    public String GetPassUrl()
    {
        return passportInterfaceUrl;
    }

    @ApolloConfigChangeListener
    private void someChangeHandler(ConfigChangeEvent changeEvent) {
        String key = "URL.AgentCloud";
        if (changeEvent.isChanged(key)) {
            //refreshTimeout();
            ConfigChange change = changeEvent.getChange(key);
            agentCloudUrl = change.getNewValue();
        }
    }
}
