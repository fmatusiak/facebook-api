package com.fmatusiak.facebookapi.service.group;

import com.fmatusiak.facebookapi.config.FacebookBuildConfig;
import facebook4j.FacebookException;
import facebook4j.Group;
import facebook4j.ResponseList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class GroupFinderService {

    @Autowired
    private FacebookBuildConfig facebookBuildConfig;

    public ResponseList<Group> getAllFacebookGroupsUser() throws FacebookException {
        return facebookBuildConfig.getFacebookAuthorizeAndBuildInstance().groups().getGroups();
    }

    public List<Group> getallGroupsByGroupName(String groupName) throws FacebookException {
        return facebookBuildConfig.getFacebookAuthorizeAndBuildInstance().groups().getGroups()
                .stream().filter(group -> group.getName().contains(groupName)).collect(Collectors.toList());
    }

    public Group getAllFacebookGroupsByGroupId(String groupId) throws FacebookException {
        return facebookBuildConfig.getFacebookAuthorizeAndBuildInstance().groups().getGroup(groupId);
    }
}
