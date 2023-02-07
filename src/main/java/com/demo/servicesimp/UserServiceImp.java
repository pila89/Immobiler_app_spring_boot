package com.demo.servicesimp;

import com.demo.models.User;
import com.demo.repository.UserRepository;
import com.demo.services.UserServiceInterface;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImp implements UserServiceInterface {

    private UserRepository userRepository;
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public String deleteUser(String id) {
        userRepository.deleteById(id);
        return "succeful delete";
    }
}
