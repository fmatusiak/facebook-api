package com.fmatusiak.facebookapi.controller.message;


import com.fmatusiak.facebookapi.service.message.MessageFinderService;
import facebook4j.FacebookException;
import facebook4j.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("messageFinder")
public class MessageFinderController {

    @Autowired
    private MessageFinderService messageFinderService;

    @GetMapping(value = "allInboxMessages")
    public List<Message> getAllInboxMessages() throws FacebookException {
        return messageFinderService.getAllInboxMessages();
    }

    @GetMapping(value = "allOutboxMessages")
    public List<Message> getAllOutboxMessages() throws FacebookException {
        return messageFinderService.getAllOutboxMessages();
    }

    @GetMapping(value = "allInboxMessages/{userId}")
    public List<Message> getAllInboxMessagesFromUserId(String userId) throws FacebookException {
        return messageFinderService.getAllInboxMessagesFromUserId(userId);
    }

    @GetMapping(value = "allOutboxMessages/{userId}")
    public List<Message> getAllOutboxMessagesFromUserId(String userId) throws FacebookException {
        return messageFinderService.getAllOutboxMessagesFromUserId(userId);
    }

}
