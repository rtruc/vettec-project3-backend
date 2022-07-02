package com.skilstorm.project3.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skilstorm.project3.models.InventoryRecord;

@Repository
public interface InventoryRecordRepository extends CrudRepository<InventoryRecord, Integer>{
	Optional<List<InventoryRecord>> findByWarehouseID(int warehouseID);
	Optional<List<InventoryRecord>> findByWarehouseIDAndItemItemID(int warehouseID, int itemID);
	Optional<List<InventoryRecord>> findByItemItemID(int itemID);
}
