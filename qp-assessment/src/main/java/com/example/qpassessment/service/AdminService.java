package com.example.qpassessment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.qpassessment.model.Grocery;
import com.example.qpassessment.repository.GroceryRepository;

@Service
public class AdminService {
	
	@Autowired
	private GroceryRepository groceryRepository;
	
	 public List<Grocery> getAllGrocery() {
	        return groceryRepository.findAll();
	    }

	    public Grocery addGrocery(Grocery item) {
	        return groceryRepository.save(item);
	    }

	    public void removeGrocery(Long itemId) {
	        groceryRepository.deleteById(itemId);
	    }

	    public Grocery updateGrocery(Long itemId, Grocery newItem) {
	        newItem.setId(itemId);
	        return groceryRepository.save(newItem);
	    }

	    public Grocery updateInventory(Long itemId, int newInventory) {
	        Grocery item = groceryRepository.findById(itemId).orElse(null);
	        if (item != null) {
	            item.setInventory(newInventory);
	            return groceryRepository.save(item);
	        }
	        return null;
	    }
}
