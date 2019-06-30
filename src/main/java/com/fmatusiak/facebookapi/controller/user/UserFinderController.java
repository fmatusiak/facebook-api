package com.fmatusiak.facebookapi.controller.user;

import com.fmatusiak.facebookapi.service.user.UserFinderService;
import facebook4j.FacebookException;
import facebook4j.User;
import facebook4j.api.UserMethods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("userFinder")
public class UserFinderController {

    @Autowired
    private UserFinderService userFinderService;

    @GetMapping(value = "users/{userName}")
    private List<User> getUsersByName(@PathVariable String usersName) throws FacebookException {
        return userFinderService.getUsersByName(usersName);
    }

    @GetMapping(value = "users")
    private UserMethods getAllUsers() {
        return userFinderService.getAllUsers();
    }

}
