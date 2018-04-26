package com.shizir.clouddemo.service.apiB.controler;

import com.ctrip.framework.apollo.model.ConfigChange;
import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;
import com.shizir.clouddemo.service.apiB.config.ApolloBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Apollo Config配置示例
 */
@RestController
public class ApolloConfigControler {

    @Autowired
    ApolloBean myApolloBean;

    @Value("${URL.AgentCloud:}")
    String agentCloudUrl;

    @Value("${IP.Redis:}")
    String redisIP;

    @Value("${PassportInterfaceUrl:}")
    String passportInterfaceUrl;

    //值可以自动更新，但要是用Apollo 0.10.0以上版本
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

    //bean指是可以自动更新的，因为对象实例化后，获取属性值都要重新走@Value注解逻辑
    //@Configuration beanConfig只是为了生成对象实例
    @RequestMapping("/ApolloConfig/GetAolloBean")
    public ApolloBean GetAolloBean()
    {
        return  myApolloBean;
    }

    //0.10.0以上版本不需要这段代码就可以自动更新了
    /*@ApolloConfigChangeListener
    private void someChangeHandler(ConfigChangeEvent changeEvent) {
        String key = "URL.AgentCloud";
        if (changeEvent.isChanged(key)) {
            //refreshTimeout();
            ConfigChange change = changeEvent.getChange(key);
            agentCloudUrl = change.getNewValue();
        }
    }*/
}
