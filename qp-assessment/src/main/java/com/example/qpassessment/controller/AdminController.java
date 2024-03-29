package com.example.qpassessment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.qpassessment.model.Grocery;
import com.example.qpassessment.service.AdminService;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/grocery")
    public List<Grocery> getAllGrocery() {
        return adminService.getAllGrocery();
    }

    @PostMapping("/grocery")
    public Grocery addGrocery(@RequestBody Grocery item) {
        return adminService.addGrocery(item);
    }

    @DeleteMapping("/grocery/{itemId}")
    public void removeGrocery(@PathVariable Long itemId) {
        adminService.removeGrocery(itemId);
    }

    @PutMapping("/grocery/{itemId}")
    public Grocery updateGroceryItem(@PathVariable Long itemId, @RequestBody Grocery newItem) {
        return adminService.updateGrocery(itemId, newItem);
    }

    @PutMapping("/grocery/{itemId}/inventory")
    public Grocery updateInventory(@PathVariable Long itemId, @RequestBody int newInventory) {
        return adminService.updateInventory(itemId, newInventory);
    }
}