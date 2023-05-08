package com.example.mockbase.controller;

import com.example.mockbase.entity.User;
import com.example.mockbase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    UserService userService;


    @GetMapping("/user")
    public List<User> getListUser() {
        return userService.getListUser();
    }
    @GetMapping
    public String home() {
        return "This is home page";
    }
}
