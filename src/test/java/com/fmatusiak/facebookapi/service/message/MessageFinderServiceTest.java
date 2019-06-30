package com.fmatusiak.facebookapi.service.message;

import facebook4j.FacebookException;
import facebook4j.Message;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MessageFinderServiceTest {

    @Autowired
    private MessageFinderService messageFinderService;

    @Test
    public void testGetAllInboxMessages() throws FacebookException {
        //given & when
        List<Message> inboxMessages = messageFinderService.getAllInboxMessages();

        //then
        for(Message message : inboxMessages){
            Assert.assertNotNull(message);
        }
    }

    @Test
    public void testFetAllOutboxMessages() throws FacebookException {
        //given & when
        List<Message> outboxMessages = messageFinderService.getAllOutboxMessages();

        //then
        for(Message message : outboxMessages){
            Assert.assertNotNull(message);
        }
    }
}