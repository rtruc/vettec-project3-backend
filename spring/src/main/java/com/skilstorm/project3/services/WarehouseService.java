package com.skilstorm.project3.services;

import com.skilstorm.project3.models.Warehouse;

public interface WarehouseService {

	// READ
	Iterable<Warehouse> findAll();
	Warehouse findByID(int warehouseID);
	
	// CREATE
	Warehouse createWarehouse(Warehouse warehouse);
	
	// UPDATE
	Warehouse updateWarehouse(Warehouse warehouse, int warehouseID);
	
	// DELETE
	void deleteWarehouseById(int warehouseID);
	
}
