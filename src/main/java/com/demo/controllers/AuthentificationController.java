package com.demo.controllers;

import com.demo.Interfaces.Authentification;
import com.demo.Interfaces.UserServiceInterface;
import com.demo.models.RespLogin;
import com.demo.models.SendLogin;
import com.demo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthentificationController {
    @Autowired

    public Authentification authentificationInterface;
    @PostMapping("/login")

    public RespLogin login (@RequestBody SendLogin sendLogin){
        return  authentificationInterface.login(sendLogin);
    }
}
