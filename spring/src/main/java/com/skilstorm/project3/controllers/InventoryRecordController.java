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
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilstorm.project3.models.InventoryRecord;
import com.skilstorm.project3.services.InventoryRecordService;

@RestController
@CrossOrigin(origins = {"http://localhost:3000", "http://www.ubno.com"})

//@RequestMapping("/inventoryRecords")
public class InventoryRecordController {

	@Autowired
	private InventoryRecordService service;
	
	
	
	@GetMapping("/inventoryRecords")
	public Iterable<InventoryRecord> findAll() {
		return service.findAll();
	}
	
	@GetMapping("/inventoryRecords/{inventoryID}")
	public InventoryRecord findById(@PathVariable int inventoryID) {
		return service.findByID(inventoryID);
	}
	
	@GetMapping("/warehouses/{warehouseID}")
	public List<InventoryRecord> findByWarehouse(@PathVariable int warehouseID) {
		return service.findByWarehouseID(warehouseID);
	}
	
	@GetMapping("/warehouses/{warehouseID}/{inventoryID}")
	public List<InventoryRecord> findByWarehouseandItemID(@PathVariable int warehouseID, @PathVariable int inventoryID) {
		return service.findByWarehouseIDandItemID(warehouseID, inventoryID);
	}
	
	
	
	// CREATE
	@PostMapping("/inventoryRecords")
	public void createInventoryRecord(@RequestBody InventoryRecord inventoryRecord) {
		service.createInventoryRecord(inventoryRecord);
	}
	
	
	// UPDATE
	@PutMapping("/inventoryRecords/{inventoryID}")
	public void updateInventory(@RequestBody InventoryRecord inventory, @PathVariable int inventoryID) {
		service.updateInventoryRecord(inventory, inventoryID);
	}
	
	
	
	//DELETE
	@DeleteMapping("/inventoryRecords/{inventoryID}")
	public void deleteInventoryById(@PathVariable int inventoryID) {
		service.deleteInventoryRecordById(inventoryID);
	}
	
}
