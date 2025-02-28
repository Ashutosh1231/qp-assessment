package com.example.qpassessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.qpassessment.model.Grocery;

@Repository
public interface GroceryRepository extends JpaRepository<Grocery, Long> {
}
