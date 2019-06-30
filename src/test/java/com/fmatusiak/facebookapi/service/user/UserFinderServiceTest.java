package com.fmatusiak.facebookapi.service.user;

import facebook4j.FacebookException;
import facebook4j.User;
import facebook4j.api.UserMethods;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserFinderServiceTest {

    @Autowired
    private UserFinderService userFinderService;

    @Test
    public void testGetUsersByName() throws FacebookException {
        //given & when
        List<User> userList = userFinderService.getUsersByName("A");
       //then
        for(User user : userList){
            Assert.notNull(user);
        }
    }

    @Test
    public void testGetAllUsers() {
        //given & when
        List<User> userList = userFinderService.getAllUsers();
        //then
        for(User user : userList){
            Assert.notNull(user);
        }
    }
}