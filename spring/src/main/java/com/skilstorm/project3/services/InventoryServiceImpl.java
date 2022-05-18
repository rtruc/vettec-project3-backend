package com.skilstorm.project3.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilstorm.project3.models.Inventory;
import com.skilstorm.project3.repositories.InventoryRepository;

@Service
public class InventoryServiceImpl implements InventoryService {

	@Autowired
	private InventoryRepository repository;
	
	@Override
	public Iterable<Inventory> findAll() {
		return repository.findAll();
	}

	@Override
	public Inventory findByID(int inventoryID) {
		Optional<Inventory> optInventory = repository.findById(inventoryID);
		return optInventory.isPresent() ? optInventory.get() : null;
	}

	@Override
	public Inventory createInventory(Inventory inventory) {
		return repository.save(inventory);

	}

	@Override
	public Inventory updateInventory(Inventory inventory, int inventoryID) {
		findByID(inventoryID);
		inventory.setInventoryID(inventoryID);
		return repository.save(inventory);
	}

	@Override
	public void deleteInventoryById(int inventoryID) {
		repository.deleteById(inventoryID);		
		
	}

}
