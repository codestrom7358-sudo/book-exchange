package com.todo.bookexchange.controller;

import com.todo.bookexchange.model.User;
import com.todo.bookexchange.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // REGISTER NEW USER
    @PostMapping("/register")
    public String register(@RequestBody User user) {

        User existing = userRepository.findByPhone(user.getPhone());

        if (existing != null) {
            return "Phone already registered";
        }

        userRepository.save(user);
        return "Registration successful";
    }

    // LOGIN OLD USER
    @PostMapping("/login")
    public String login(@RequestBody User user) {

        User existing = userRepository.findByPhone(user.getPhone());

        if (existing == null) {
            return "User not found";
        }

        if (existing.getPassword().equals(user.getPassword())) {
            return "Login successful";
        } else {
            return "Wrong password";
        }
    }
}
