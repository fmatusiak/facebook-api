package com.fmatusiak.facebookapi.service.post;

import com.fmatusiak.facebookapi.config.FacebookBuildConfig;
import facebook4j.FacebookException;
import facebook4j.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostFinderService {

    @Autowired
    private FacebookBuildConfig facebookBuildConfig;

    public List<Post> getPublicPostsListByName(String postsName) throws FacebookException {
        return facebookBuildConfig.getFacebookAuthorizeAndBuildInstance()
                .searchPosts(postsName).stream().collect(Collectors.toList());
    }

    public List<Post> getAllPublicPosts() throws FacebookException {
        return facebookBuildConfig.getFacebookAuthorizeAndBuildInstance()
                .posts().getPosts().stream().collect(Collectors.toList());
    }

}
