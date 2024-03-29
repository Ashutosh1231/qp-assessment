package com.example.qpassessment.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.*;

@Entity
@Table(name="orders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long order_id;
	
	@ManyToMany
    @JoinTable(
        name = "order_grocery",
        joinColumns = @JoinColumn(name = "order_id"),
        inverseJoinColumns = @JoinColumn(name = "id")
    )
	private List<Grocery> items;

	public Long getOrderId() {
		return order_id;
	}

	public void setOrderId(Long order_id) {
		this.order_id = order_id;
	}

	public List<Grocery> getItems() {
		return items;
	}

	public void setItems(List<Grocery> items) {
		this.items = items;
	}
	
	
}
