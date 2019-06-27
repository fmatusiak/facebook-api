package com.fmatusiak.facebookapi.service.post;

import com.fmatusiak.facebookapi.config.FacebookBuildConfig;
import facebook4j.FacebookException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostDeleteService {

    @Autowired
    private FacebookBuildConfig facebookBuildConfig;

    public boolean deletePostById(String postId) throws FacebookException {
        return facebookBuildConfig.getFacebookAuthorizeAndBuildInstance().deletePost(postId);
    }
}
