package com.demo.controllers;

import com.demo.models.User;
import com.demo.services.UserServiceInterface;
import com.demo.servicesimp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class userController {
    @Autowired

    public UserServiceInterface userServiceInterface;



    @GetMapping("/all")
    public List<User> getAllUsers(){
       return  userServiceInterface.getAllUsers();
    }

}
