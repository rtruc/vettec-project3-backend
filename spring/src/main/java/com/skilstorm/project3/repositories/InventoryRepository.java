package com.skilstorm.project3.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skilstorm.project3.models.Inventory;

@Repository
public interface InventoryRepository extends CrudRepository<Inventory, Integer>{
	List<Inventory> findByWarehouseWarehouseID(int warehouseID);
//	List<Inventory> findByWarehouse(Warehouse warehouse);
}
