package com.fmatusiak.facebookapi.service.group;

import com.fmatusiak.facebookapi.config.FacebookBuildConfig;
import facebook4j.FacebookException;
import facebook4j.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URL;
import java.util.List;

@Service
public class PublishDataGroupService {

    private final int MILLIS = 20000;

    @Autowired
    private FacebookBuildConfig facebookBuildConfig;

    public void publishDataOnGroups(List<Group> groupsList, List<URL> urlList, String message)
            throws InterruptedException, FacebookException {
        for (URL url : urlList) {
            for (Group group : groupsList) {
                facebookBuildConfig.getFacebookAuthorizeAndBuildInstance().postGroupLink(group.getId(), url, message);
                Thread.sleep(MILLIS);
            }
        }
    }
}

