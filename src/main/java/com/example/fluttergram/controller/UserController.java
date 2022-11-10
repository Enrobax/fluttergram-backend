package com.example.fluttergram.controller;


import com.example.fluttergram.model.User;
import com.example.fluttergram.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/all")
    public List<User> getAllUsers(){
        return  userService.findAllUsers();
    }


    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return  userService.addUser(user);
    }
}
