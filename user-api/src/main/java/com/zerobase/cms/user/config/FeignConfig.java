package com.zerobase.cms.user.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import feign.auth.BasicAuthRequestInterceptor;


@Configuration
public class FeignConfig {

    @Qualifier(value = "mailgun")
    @Bean
    public BasicAuthRequestInterceptor  basicAuthenticationInterceptor(){
        return new BasicAuthRequestInterceptor ("api","8893932331880d8d36347874b037f539-d51642fa-f0f7bf3a");
    }
}
