package com.fmatusiak.facebookapi.service.message;

import com.fmatusiak.facebookapi.config.FacebookBuildConfig;
import facebook4j.FacebookException;
import facebook4j.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MessageFinderService {

    @Autowired
    private FacebookBuildConfig facebookBuildConfig;

    public List<Message> getAllInboxMessages() throws FacebookException {
        return facebookBuildConfig.getFacebookAuthorizeAndBuildInstance()
                .messages().getInbox().stream().collect(Collectors.toList());
    }

    public List<Message> getAllOutboxMessages() throws FacebookException {
        return facebookBuildConfig.getFacebookAuthorizeAndBuildInstance()
                .messages().getOutbox().stream().collect(Collectors.toList());
    }

    public List<Message> getAllInboxMessagesFromUserId(String userId) throws FacebookException {
        return facebookBuildConfig.getFacebookAuthorizeAndBuildInstance()
                .messages().getInbox(userId).stream().collect(Collectors.toList());
    }

    public List<Message> getAllOutboxMessagesFromUserId(String userId) throws FacebookException {
        return facebookBuildConfig.getFacebookAuthorizeAndBuildInstance()
                .messages().getOutbox(userId).stream().collect(Collectors.toList());
    }

}
