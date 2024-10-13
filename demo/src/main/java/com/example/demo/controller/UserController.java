package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public UserDTO createUser(@RequestBody UserDTO userDTO) {
        User user = userService.convertToEntity(userDTO);
        // Normally, you would save the user to a database here.
        return userService.convertToDTO(user);
    }

    @GetMapping
    public List<UserDTO> getUsers() {
        // Mock data for demonstration.
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "John Doe", "john@example.com"));
        return userService.convertToDTOs(users);
    }
}