package com.fmatusiak.facebookapi.service.friend;

import com.fmatusiak.facebookapi.config.FacebookBuildConfig;
import facebook4j.FacebookException;
import facebook4j.Friend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FriendFinderService {

    @Autowired
    private FacebookBuildConfig facebookBuildConfig;

    public List<Friend> getAllFriends() throws FacebookException {
        return facebookBuildConfig.getFacebookAuthorizeAndBuildInstance()
                .friends().getFriends().stream().collect(Collectors.toList());
    }

}
