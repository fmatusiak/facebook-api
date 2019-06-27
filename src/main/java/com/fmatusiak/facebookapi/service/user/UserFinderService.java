package com.fmatusiak.facebookapi.service.user;

import com.fmatusiak.facebookapi.config.FacebookBuildConfig;
import facebook4j.FacebookException;
import facebook4j.User;
import facebook4j.api.UserMethods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserFinderService {

    @Autowired
    private FacebookBuildConfig facebookBuildConfig;

    private List<User> getUsersByName(String usersName) throws FacebookException {
        return facebookBuildConfig.getFacebookAuthorizeAndBuildInstance()
                .searchUsers(usersName).stream().collect(Collectors.toList());
    }

    private UserMethods getAllUsers() {
        return facebookBuildConfig.getFacebookAuthorizeAndBuildInstance().users();
    }

}
