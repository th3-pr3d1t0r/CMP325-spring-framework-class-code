package com.example.Cmp325.service;
import com.example.Cmp325.model.User;
import com.example.Cmp325.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service


public class UserServiceImpl {
    @Autowired
    UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);

    }
    @Override
    public User updateUser(User user){
        Optional<User> optionalUser= userRepository.findById(user.grtId());
        if (optionalUser.isPresent()){

        } else {
            throw new RuntimeException("user not found")
        }
        return null;


    }
    @Override
    public List<User> getAllUser(){
        return userRepository.findAll();
    }
}
