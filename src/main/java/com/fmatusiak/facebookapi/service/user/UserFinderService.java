package com.fmatusiak.facebookapi.service.user;

import com.fmatusiak.facebookapi.config.FacebookBuildConfig;
import facebook4j.FacebookException;
import facebook4j.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserFinderService {

    @Autowired
    private FacebookBuildConfig facebookBuildConfig;

    public List<User> getUsersByName(String usersName) throws FacebookException {
        return facebookBuildConfig.getFacebookAuthorizeAndBuildInstance().searchUsers(usersName);
    }

    public List<User> getAllUsers() {
        return (List<User>) facebookBuildConfig.getFacebookAuthorizeAndBuildInstance().users();
    }

}
