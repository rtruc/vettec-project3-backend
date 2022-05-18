package com.skilstorm.project3.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skilstorm.project3.models.Inventory;

@Repository
public interface InventoryRepository extends CrudRepository<Inventory, Integer>{
	Optional<List<Inventory>> findByWarehouseWarehouseID(int warehouseID);
	Optional<List<Inventory>> findByWarehouseWarehouseIDAndItemItemID(int warehouseID, int itemID);
	Optional<List<Inventory>> findByItemItemID(int itemID);
}
