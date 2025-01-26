package com.manindra.springboot.userservice.controller;

import com.manindra.springboot.userservice.entity.Customer;
import com.manindra.springboot.userservice.entity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<Customer> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping
    public Customer createUser(@RequestBody Customer user) {
        return userRepository.save(user);
    }
}
