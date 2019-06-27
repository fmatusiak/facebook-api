package com.fmatusiak.facebookapi.config;

import facebook4j.Facebook;
import facebook4j.FacebookFactory;
import facebook4j.auth.AccessToken;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class FacebookBuildConfig {

    @Autowired
    private FacebookAccessConfig facebookAccessConfig;

    public Facebook getFacebookAuthorizeAndBuildInstance() {
        Facebook facebook = new FacebookFactory().getInstance();
        facebook.setOAuthAppId(facebookAccessConfig.getAppId(), facebookAccessConfig.getAppSecret());
        facebook.setOAuthPermissions(facebookAccessConfig.getPerrmisions());
        facebook.setOAuthAccessToken(new AccessToken(facebookAccessConfig.getAccessToken()));
        return facebook;
    }

}
