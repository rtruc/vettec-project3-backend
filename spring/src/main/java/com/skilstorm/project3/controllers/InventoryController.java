package com.skilstorm.project3.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin(origins = {"http://localhost:3000", "https://www.mywebsite.com"})

//@RequestMapping("/inventories")
public class InventoryController {

	@Autowired
	private InventoryService service;
	
	
	
	@GetMapping("/inventories")
	public Iterable<Inventory> findAll() {
		return service.findAll();
	}
	
	@GetMapping("/inventories/{inventoryID}")
	public Inventory findById(@PathVariable int inventoryID) {
		return service.findByID(inventoryID);
	}
	
	@GetMapping("/warehouses/{warehouseID}")
	public List<Inventory> findByWarehouse(@PathVariable int warehouseID) {
		return service.findByWarehouseID(warehouseID);
	}
	
	@GetMapping("/warehouses/{warehouseID}/{inventoryID}")
	public List<Inventory> findByWarehouseandItemID(@PathVariable int warehouseID, @PathVariable int inventoryID) {
		return service.findByWarehouseIDandItemID(warehouseID, inventoryID);
	}
	
	
	
	// CREATE
	@PostMapping("/inventories")
	public void createAuthor(@RequestBody Inventory inventory) {
		service.createInventory(inventory);
	}
	
	
	
	// UPDATE
	@PutMapping("/inventories/{inventoryID}")
	public void updateAuthor(@RequestBody Inventory inventory, @PathVariable int inventoryID) {
		service.updateInventory(inventory, inventoryID);
	}
	
	
	
	//DELETE
	@DeleteMapping("/inventories/{inventoryID}")
	public void deleteAuthorById(@PathVariable int inventoryID) {
		service.deleteInventoryById(inventoryID);
	}
	
}
