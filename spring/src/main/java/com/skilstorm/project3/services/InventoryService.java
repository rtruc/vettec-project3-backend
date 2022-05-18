package com.skilstorm.project3.services;

import java.util.List;

import com.skilstorm.project3.models.Inventory;

public interface InventoryService {

	// READ
	Iterable<Inventory> findAll();
	Inventory findByID(int inventoryID);
	List<Inventory> findByWarehouseID(int warehouseID);
	List<Inventory> findByWarehouseIDandItemID(int warehouseID, int inventoryID);
	
	// CREATE
	Inventory createInventory(Inventory inventory);
	
	// UPDATE
	Inventory updateInventory(Inventory inventory, int inventoryID);
	
	// DELETE
	void deleteInventoryById(int inventoryID);
}
