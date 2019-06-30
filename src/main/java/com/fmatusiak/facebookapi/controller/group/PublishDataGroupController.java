package com.fmatusiak.facebookapi.controller.group;

import com.fmatusiak.facebookapi.service.group.PublishDataGroupService;
import facebook4j.FacebookException;
import facebook4j.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URL;
import java.util.List;

@RestController
@RequestMapping("publishDataGroup")
public class PublishDataGroupController {

    @Autowired
    private PublishDataGroupService publishDataGroupService;

    @PostMapping(value = "publish/{groupList}/{urlList}/{message}")
    public void publishDataOnGroups(
            @PathVariable List<Group> groupsList
            , @PathVariable List<URL> urlList
            , @PathVariable String message)
            throws FacebookException, InterruptedException {
        publishDataGroupService.publishDataOnGroups(groupsList, urlList, message);
    }


}
