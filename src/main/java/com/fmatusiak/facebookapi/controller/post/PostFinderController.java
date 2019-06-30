package com.fmatusiak.facebookapi.controller.post;

import com.fmatusiak.facebookapi.service.post.PostFinderService;
import facebook4j.FacebookException;
import facebook4j.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("posts")
public class PostFinderController {

    @Autowired
    private PostFinderService postFinderService;

    @GetMapping(value = "getPublicPosts")
    public List<Post> getAllPublicPosts() throws FacebookException {
        return postFinderService.getAllPublicPosts();
    }

    @GetMapping(value = "getPublicPosts/{postName}")
    public List<Post> getPublicPostsListByName(@PathVariable String postName) throws FacebookException {
        return postFinderService.getPublicPostsListByName(postName);
    }

}
