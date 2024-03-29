package com.example.qpassessment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.qpassessment.model.Grocery;
import com.example.qpassessment.repository.GroceryRepository;

@Service
public class UserService {

    @Autowired
    private GroceryRepository groceryRepository;

    public List<Grocery> getAllGroceryItems() {
        return groceryRepository.findAll();
    }
}