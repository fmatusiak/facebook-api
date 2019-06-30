package com.fmatusiak.facebookapi.service.message;

import com.fmatusiak.facebookapi.config.FacebookBuildConfig;
import facebook4j.FacebookException;
import facebook4j.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageFinderService {

    @Autowired
    private FacebookBuildConfig facebookBuildConfig;

    public List<Message> getAllInboxMessages() throws FacebookException {
        return facebookBuildConfig.getFacebookAuthorizeAndBuildInstance()
                .messages().getInbox();
    }

    public List<Message> getAllOutboxMessages() throws FacebookException {
        return facebookBuildConfig.getFacebookAuthorizeAndBuildInstance()
                .messages().getOutbox();
    }

    public List<Message> getAllInboxMessagesFromUserId(String userId) throws FacebookException {
        return facebookBuildConfig.getFacebookAuthorizeAndBuildInstance()
                .messages().getInbox(userId);
    }

    public List<Message> getAllOutboxMessagesFromUserId(String userId) throws FacebookException {
        return facebookBuildConfig.getFacebookAuthorizeAndBuildInstance()
                .messages().getOutbox(userId);
    }

}
