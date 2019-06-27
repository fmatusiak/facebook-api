package com.fmatusiak.facebookapi.service.post;

import com.fmatusiak.facebookapi.config.FacebookBuildConfig;
import facebook4j.FacebookException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.MalformedURLException;
import java.net.URL;

@Service
public class PostAddService {

    @Autowired
    private FacebookBuildConfig facebookBuildConfig;

    public String addPostLinkToFacebook(String urlLink) throws MalformedURLException, FacebookException {
        return facebookBuildConfig.getFacebookAuthorizeAndBuildInstance().postLink(new URL(urlLink));
    }

    public String addPostLinkToFacebook(String urlLink, String message) throws MalformedURLException
            , FacebookException {
        return facebookBuildConfig.getFacebookAuthorizeAndBuildInstance().postLink(new URL(urlLink), message);
    }

    public String addPostLinkToFacebook(String userId, String urlLink, String message) throws MalformedURLException,
            FacebookException {
        return facebookBuildConfig.getFacebookAuthorizeAndBuildInstance().postLink(userId, new URL(urlLink), message);
    }

}
