package com.brandonw.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

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
	
	// Get a specific item
	// Endpoint @ localhost:8080/items/1
	@GetMapping("/items/{id}")
	public Item getItem(@PathVariable int id) {
		
		Item item = repo.findById(id).get();
		
		return item;
	}
	
	// Endpoint @ localhost:8080/item/add
	@PostMapping("/item/add")
	// Response code of 201 (created) to confirm data creation status
	@ResponseStatus(code = HttpStatus.CREATED)
	public void createItem(@RequestBody Item item) {
		repo.save(item);
	}
	
	// Endpoint @ localhost:8080/item/update/1
	@PutMapping("/item/update/{id}")
	public Item updateItem(@PathVariable int id) {
		Item item = repo.findById(id).get();
		item.setName("book");
		item.setPrice(2500);
		item.setDepartment("reading");
		repo.save(item);
		return item;
	}
	
	// Endpoint @ localhost:8080/item/delete/1
	@DeleteMapping("/item/delete/{id}")
	public void removeItem(@PathVariable int id) {
		Item item = repo.findById(id).get();
		repo.delete(item);
	}
}
