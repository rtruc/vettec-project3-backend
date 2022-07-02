package com.skilstorm.project3.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilstorm.project3.models.InventoryRecord;
import com.skilstorm.project3.repositories.InventoryRecordRepository;

@Service
public class InventoryRecordServiceImpl implements InventoryRecordService {

	@Autowired
	private InventoryRecordRepository repository;
	
	
	
	@Override
	public Iterable<InventoryRecord> findAll() {
		return repository.findAll();
	}

	@Override
	public InventoryRecord findByID(int inventoryID) {
		Optional<InventoryRecord> optInventory = repository.findById(inventoryID);
		return optInventory.isPresent() ? optInventory.get() : null;
	}
	
	@Override
	public List<InventoryRecord> findByWarehouseID(int warehouseID) {
		Optional<List<InventoryRecord>> optInventory = repository.findByWarehouseID(warehouseID);
		return optInventory.isPresent() ? optInventory.get() : null;
	}
	
	@Override
	public List<InventoryRecord> findByWarehouseIDandItemID(int warehouseID, int itemID) {
		Optional<List<InventoryRecord>> optInventory = repository.findByWarehouseIDAndItemItemID(warehouseID, itemID);		
		return optInventory.isPresent() ? optInventory.get() : null;
	}


	
	@Override
	public InventoryRecord createInventoryRecord(InventoryRecord inventoryRecord) {
		return repository.save(inventoryRecord);

	}

	
	
	@Override
	public InventoryRecord updateInventoryRecord(InventoryRecord inventoryRecord, int inventoryID) {
		findByID(inventoryID);
		inventoryRecord.setInventoryID(inventoryID);
		return repository.save(inventoryRecord);
	}

	
	
	@Override
	public void deleteInventoryRecordById(int inventoryID) {
		repository.deleteById(inventoryID);		
		
	}
}
