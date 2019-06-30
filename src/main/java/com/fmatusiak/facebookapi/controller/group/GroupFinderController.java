package com.fmatusiak.facebookapi.controller.group;

import com.fmatusiak.facebookapi.service.group.GroupFinderService;
import facebook4j.FacebookException;
import facebook4j.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("groupFinder")
public class GroupFinderController {

    @Autowired
    private GroupFinderService groupFinderService;

    @GetMapping(value = "groups")
    public List<Group> getAllFacebookGroupsUser() throws FacebookException {
        return groupFinderService.getAllFacebookGroupsUser();
    }

    @GetMapping(value = "groups/groupName/{groupName}")
    public List<Group> getallGroupsByGroupName(@PathVariable String groupName) throws FacebookException {
        return groupFinderService.getallGroupsByGroupName(groupName);
    }

    @GetMapping(value = "groups/{groupId}")
    public Group getAllFacebookGroupsByGroudId(@PathVariable String groupId) throws FacebookException {
        return groupFinderService.getAllFacebookGroupsByGroupId(groupId);
    }
}
