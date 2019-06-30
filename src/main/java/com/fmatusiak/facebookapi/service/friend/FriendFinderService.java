package com.fmatusiak.facebookapi.service.friend;

import com.fmatusiak.facebookapi.config.FacebookBuildConfig;
import facebook4j.FacebookException;
import facebook4j.Friend;
import facebook4j.ResponseList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FriendFinderService {

    @Autowired
    private FacebookBuildConfig facebookBuildConfig;

    public ResponseList<Friend> getAllFriends() throws FacebookException {
        return facebookBuildConfig.getFacebookAuthorizeAndBuildInstance().friends().getFriends();
    }

    public ResponseList<Friend> getFriendsByUserId(String userId) throws FacebookException {
        return facebookBuildConfig.getFacebookAuthorizeAndBuildInstance().friends().getFriends(userId);
    }

}
