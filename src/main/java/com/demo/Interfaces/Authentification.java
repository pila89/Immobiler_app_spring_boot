package com.demo.Interfaces;

import com.demo.models.RespLogin;
import com.demo.models.SendLogin;
import com.demo.models.User;

public interface Authentification {
    public RespLogin login(SendLogin sendLogin);
}
