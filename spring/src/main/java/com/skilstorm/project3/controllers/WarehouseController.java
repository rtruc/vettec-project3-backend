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

import com.skilstorm.project3.models.Warehouse;
import com.skilstorm.project3.services.WarehouseService;

@RestController
@RequestMapping("/warehouses")
public class WarehouseController {

	@Autowired
	private WarehouseService service;
	
	@GetMapping
	public Iterable<Warehouse> findAll() {
		return service.findAll();
	}
	
	
	@GetMapping("/{warehouseID}")
	public Warehouse findById(@PathVariable int warehouseID) {
		return service.findByID(warehouseID);
	}
	
	// CREATE
	@PostMapping // POST HTTP Request /authors
	public void createAuthor(@RequestBody Warehouse warehouse) {
		service.createWarehouse(warehouse);
	}
	
	// UPDATE
	@PutMapping("/{warehouseID}") // PUT HTTP Request /authors
	public void updateAuthor(@RequestBody Warehouse warehouse, @PathVariable int warehouseID) {
		service.updateWarehouse(warehouse, warehouseID);
	}
	
	//DELETE
	@DeleteMapping("/{warehouseID}")
	public void deleteAuthorById(@PathVariable int warehouseID) {
		service.deleteWarehouseById(warehouseID);
	}
	
}
