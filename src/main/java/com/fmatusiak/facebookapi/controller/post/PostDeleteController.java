package com.fmatusiak.facebookapi.controller.post;

import com.fmatusiak.facebookapi.service.post.PostDeleteService;
import facebook4j.FacebookException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("posts")
public class PostDeleteController {

    @Autowired
    private PostDeleteService postDeleteService;

    @DeleteMapping(value = "deletePost/{postId}")
    public boolean deletePostById(@PathVariable String postId) throws FacebookException {
        return postDeleteService.deletePostById(postId);
    }

}
