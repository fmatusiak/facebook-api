package com.fmatusiak.facebookapi.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class FacebookAccessConfig {

    @Value("${facebook.appId}")
    private String appId;

    @Value("${facebook.appSecret}")
    private String appSecret;

    @Value("${facebook.accessToken}")
    private String accessToken;

    @Value("${facebook.perrmisions}")
    private String perrmisions;
}
