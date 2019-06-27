package com.fmatusiak.facebookapi.service.group;

import com.fmatusiak.facebookapi.config.FacebookBuildConfig;
import facebook4j.FacebookException;
import facebook4j.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class GroupFinderService {

    @Autowired
    private FacebookBuildConfig facebookBuildConfig;

    public List<Group> getAllFacebookGroupsUser() throws FacebookException {
        return facebookBuildConfig
                .getFacebookAuthorizeAndBuildInstance()
                .groups().getGroups()
                .stream().collect(Collectors.toList());
    }

    public List<Group> getAllFacebookGroupsByContainName(String name) throws FacebookException {
        return getAllFacebookGroupsUser().stream()
                .filter(group -> group.getName().contains(name))
                .collect(Collectors.toList());
    }
}
