package com.fmatusiak.facebookapi.service.group;

import facebook4j.FacebookException;
import facebook4j.Group;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GroupFinderServiceTest {

    @Autowired
    private GroupFinderService groupFinderService;

    @Test
    public void testGetAllFacebookGroupsUser() throws FacebookException {
        //given & when
        List<Group> groupList = groupFinderService.getAllFacebookGroupsUser();
        //then
        for (Group group : groupList) {
            Assert.assertNotNull(group);
        }
    }

    @Test
    public void testGetAllFacebookGroupsByContainName() throws FacebookException {
        //given & when
        List<Group> groupList = groupFinderService.getAllFacebookGroupsByContainName("D");
        //then
        for (Group group : groupList) {
            Assert.assertNotNull(group);
        }
    }
}