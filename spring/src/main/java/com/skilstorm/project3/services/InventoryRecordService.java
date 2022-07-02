package com.skilstorm.project3.services;

import java.util.List;

import com.skilstorm.project3.models.InventoryRecord;

public interface InventoryRecordService {

	// READ
	Iterable<InventoryRecord> findAll();
	InventoryRecord findByID(int inventoryID);
	List<InventoryRecord> findByWarehouseID(int warehouseID);
	List<InventoryRecord> findByWarehouseIDandItemID(int warehouseID, int inventoryID);
	
	// CREATE
	InventoryRecord createInventoryRecord(InventoryRecord inventory);
	
	// UPDATE
	InventoryRecord updateInventoryRecord(InventoryRecord inventory, int inventoryID);
	
	// DELETE
	void deleteInventoryRecordById(int inventoryID);
}
