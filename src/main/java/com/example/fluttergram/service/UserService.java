package com.example.fluttergram.service;

import com.example.fluttergram.model.User;
import com.example.fluttergram.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAllUsers(){
        return  userRepository.findAll();}
}
