package com.example.qpassessment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.qpassessment.model.Grocery;
import com.example.qpassessment.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/grocery")
    public List<Grocery> getAllGroceryItems() {
        return userService.getAllGroceryItems();
    }
}