package com.demo.controllers;

import com.demo.models.User;
import com.demo.services.UserServiceInterface;
import com.demo.servicesimp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class userController {
    @Autowired

    public UserServiceInterface userServiceInterface;

    @GetMapping("/all")
    public List<User> getAllUsers(){
       return  userServiceInterface.getAllUsers();
    }

    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return  userServiceInterface.addUser(user);
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Long id){
        return  userServiceInterface.getUser(id);
    }

}
