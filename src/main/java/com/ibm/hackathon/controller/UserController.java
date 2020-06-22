package com.ibm.hackathon.controller;

import com.ibm.hackathon.model.User;
import com.ibm.hackathon.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value = "Traveller-User")
@RequestMapping("/v1/api/traveller")
public class UserController {

    @Autowired
    private UserService userService;

    @CrossOrigin(origins = "*")
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer userId){
       return userService.getUser(userId);
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/user")
    public void createUser(@RequestBody User user){
        userService.addUser(user);
    }
}
