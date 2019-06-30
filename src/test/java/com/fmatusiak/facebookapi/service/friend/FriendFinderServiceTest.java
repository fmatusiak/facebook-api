package com.fmatusiak.facebookapi.service.friend;

import com.fmatusiak.facebookapi.service.user.UserFinderService;
import facebook4j.FacebookException;
import facebook4j.Friend;
import facebook4j.ResponseList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class FriendFinderServiceTest {

    @Autowired
    private FriendFinderService friendFinderService;

    @Autowired
    private UserFinderService userFinderService;

    @Test
    public void testGetAllFriends() throws FacebookException {
        //given & when
       ResponseList<Friend> friends = friendFinderService.getAllFriends();

       //then
       for(Friend friend : friends){
           Assert.assertNotNull(friend);
       }
    }

    @Test
    public void getFriendsByUserId() throws FacebookException {
        //given & when
        ResponseList<Friend> friends = friendFinderService.getFriendsByUserId
                (userFinderService.getAllUsers().getMe().getId());

        //then
        for(Friend friend : friends){
            Assert.assertNotNull(friend);
        }
    }
}