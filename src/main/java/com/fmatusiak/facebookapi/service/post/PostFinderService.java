package com.fmatusiak.facebookapi.service.post;

import com.fmatusiak.facebookapi.config.FacebookBuildConfig;
import facebook4j.FacebookException;
import facebook4j.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostFinderService {

    @Autowired
    private FacebookBuildConfig facebookBuildConfig;

    public List<Post> getPublicPostsListByName(String postName) throws FacebookException {
        return facebookBuildConfig.getFacebookAuthorizeAndBuildInstance()
                .searchPosts(postName);
    }

    public List<Post> getAllPublicPosts() throws FacebookException {
        return facebookBuildConfig.getFacebookAuthorizeAndBuildInstance()
                .posts().getPosts();
    }

}
