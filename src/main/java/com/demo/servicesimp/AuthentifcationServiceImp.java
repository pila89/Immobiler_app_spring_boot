package com.demo.servicesimp;

import com.demo.Interfaces.Authentification;
import com.demo.Interfaces.UserServiceInterface;
import com.demo.models.RespLogin;
import com.demo.models.SendLogin;
import com.demo.models.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

@AllArgsConstructor

public class AuthentifcationServiceImp implements Authentification {
    @Autowired UserServiceInterface userServiceInterface;


    @Override
    public RespLogin login(SendLogin sendLogin) {
        User foundedUser = userServiceInterface.getUserByEmail(sendLogin.getEmail());
        System.out.println(foundedUser);
        /* user not found */
        if (foundedUser==null){
            return null;
        } else {
    if (sendLogin.getPassword().equals(foundedUser.getPassword())){
        RespLogin login = new RespLogin();
        login.setToken("salimamara");
        System.out.println("ok");
        return login;

    }else {
        /* password errone*/
        System.out.println("nook");
        return null;

    }
        }


        /*
  1.get User by email
  2.comparer password
  3.si oui return token sinn error

*/


    }
}
