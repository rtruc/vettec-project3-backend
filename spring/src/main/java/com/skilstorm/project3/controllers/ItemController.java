package com.skilstorm.project3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilstorm.project3.models.Item;
import com.skilstorm.project3.services.ItemService;

@RestController
@RequestMapping("/items")
public class ItemController {

	@Autowired
	private ItemService service;
	
	@GetMapping
	public Iterable<Item> findAll() {
		return service.findAll();
	}
	
	
	@GetMapping("/{itemID}")
	public Item findById(@PathVariable int itemID) {
		return service.findByID(itemID);
	}
	
	// CREATE
	@PostMapping // POST HTTP Request /authors
	public void createAuthor(@RequestBody Item item) {
		service.createItem(item);
	}
	
	// UPDATE
	@PutMapping("/{itemID}") // PUT HTTP Request /authors
	public void updateAuthor(@RequestBody Item item, @PathVariable int itemID) {
		service.updateItem(item, itemID);
	}
	
	//DELETE
	@DeleteMapping("/{itemID}")
	public void deleteAuthorById(@PathVariable int itemID) {
		service.deleteItemById(itemID);
	}
	
}
