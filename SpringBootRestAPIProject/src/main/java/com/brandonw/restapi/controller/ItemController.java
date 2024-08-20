package com.brandonw.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brandonw.restapi.entity.Item;
import com.brandonw.restapi.repository.ItemRepository;


@RestController
public class ItemController {
	
	@Autowired
	ItemRepository repo;
	// Get all items
	// Endpoint @ localhost:8080/items
	@GetMapping("/items")
	public List<Item> getAllItems(){
		List<Item> items = repo.findAll();
		
		return items;
	}
}
