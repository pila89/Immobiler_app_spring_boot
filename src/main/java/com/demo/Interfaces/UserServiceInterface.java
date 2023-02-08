package com.demo.Interfaces;

import com.demo.models.User;

import java.util.List;
import java.util.Optional;

public interface UserServiceInterface {

    public List<User> getAllUsers();

    public User addUser(User user);

    public String deleteUser(Long id);

    public Optional<User> getUser(Long id);


}
