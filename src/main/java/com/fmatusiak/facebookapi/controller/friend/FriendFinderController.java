package com.fmatusiak.facebookapi.controller.friend;

import com.fmatusiak.facebookapi.service.friend.FriendFinderService;
import facebook4j.FacebookException;
import facebook4j.Friend;
import facebook4j.ResponseList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("friendFinder")
public class FriendFinderController {

    @Autowired
    private FriendFinderService friendFinderService;

    @GetMapping(value = "friends/{userId}")
    public ResponseList<Friend> getFriendsByUserId(@PathVariable String userId) throws FacebookException {
        return friendFinderService.getFriendsByUserId(userId);
    }

    @GetMapping(value = "friends")
    public List<Friend> getAllFriends() throws FacebookException {
        return friendFinderService.getAllFriends();
    }

}
