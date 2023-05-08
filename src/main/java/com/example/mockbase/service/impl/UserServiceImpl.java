package com.example.mockbase.service.impl;

import com.example.mockbase.entity.User;
import com.example.mockbase.repository.UserRepository;
import com.example.mockbase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired private UserRepository userRepository;

    @Override
    public List<User> getListUser() {
        return userRepository.findAll();
    }
}
