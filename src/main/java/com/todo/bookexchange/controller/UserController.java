package com.todo.bookexchange.controller;

import com.todo.bookexchange.model.User;
import com.todo.bookexchange.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public User login(@RequestBody User user){
        Optional<User> exist = userRepository.findByMobile(user.getMobile());
        return exist.orElseGet(() -> userRepository.save(user));
    }
}
