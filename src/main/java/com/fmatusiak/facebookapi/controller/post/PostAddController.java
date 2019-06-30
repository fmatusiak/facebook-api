package com.fmatusiak.facebookapi.controller.post;

import com.fmatusiak.facebookapi.service.post.PostAddService;
import facebook4j.FacebookException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;

@RestController
@RequestMapping("posts")
public class PostAddController {

    @Autowired
    private PostAddService postAddService;

    @PostMapping(value = "addPost/{urlLink}")
    public String addPostLinkToFacebook(@PathVariable String urlLink) throws MalformedURLException, FacebookException {
        return postAddService.addPostLinkToFacebook(urlLink);
    }

    @PostMapping(value = "addPost/{urlLink}/{message}")
    public String addPostLinkToFacebook(
            @PathVariable String urlLink
            , @PathVariable String message) throws MalformedURLException
            , FacebookException {
        return postAddService.addPostLinkToFacebook(urlLink, message);
    }

    @PostMapping(value = "addPost/{userId}/{urlLink}/{message}")
    public String addPostLinkToFacebook(
            @PathVariable String userId
            , @PathVariable String urlLink
            , @PathVariable String message) throws MalformedURLException,
            FacebookException {
        return postAddService.addPostLinkToFacebook(userId, urlLink, message);
    }

}
