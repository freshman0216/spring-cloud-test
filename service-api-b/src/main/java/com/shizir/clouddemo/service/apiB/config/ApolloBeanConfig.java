package com.shizir.clouddemo.service.apiB.config;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableApolloConfig({"TEST1.Fang.SFB.Framework"})
public class ApolloBeanConfig {

    public ApolloBeanConfig()
    {
        System.out.println("ApolloBeanConfig init ...");
    }

    @Bean
    public ApolloBean myApolloBean() {
        ApolloBean ab = new ApolloBean();
        return ab;
    }
}
