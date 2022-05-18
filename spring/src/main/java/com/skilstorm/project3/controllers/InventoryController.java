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

import com.skilstorm.project3.models.Inventory;
import com.skilstorm.project3.services.InventoryService;

@RestController
@RequestMapping("/inventories")
public class InventoryController {

	@Autowired
	private InventoryService service;
	
	@GetMapping
	public Iterable<Inventory> findAll() {
		return service.findAll();
	}
	
	
	@GetMapping("/{inventoryID}")
	public Inventory findById(@PathVariable int inventoryID) {
		return service.findByID(inventoryID);
	}
	
	// CREATE
	@PostMapping // POST HTTP Request /authors
	public void createAuthor(@RequestBody Inventory inventory) {
		service.createInventory(inventory);
	}
	
	// UPDATE
	@PutMapping("/{inventoryID}") // PUT HTTP Request /authors
	public void updateAuthor(@RequestBody Inventory inventory, @PathVariable int inventoryID) {
		service.updateInventory(inventory, inventoryID);
	}
	
	//DELETE
	@DeleteMapping("/{inventoryID}")
	public void deleteAuthorById(@PathVariable int inventoryID) {
		service.deleteInventoryById(inventoryID);
	}
	
}
