package com.demo.services;

import com.demo.models.User;

import java.util.List;

public interface UserServiceInterface {

    public List<User> getAllUsers();

    public User addUser(User user);

    public String deleteUser(String id);
}
