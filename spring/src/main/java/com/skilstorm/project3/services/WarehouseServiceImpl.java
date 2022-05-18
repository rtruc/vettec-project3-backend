package com.skilstorm.project3.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilstorm.project3.models.Warehouse;
import com.skilstorm.project3.repositories.WarehouseRepository;

@Service
public class WarehouseServiceImpl implements WarehouseService {

	@Autowired
	private WarehouseRepository repository;
	
	@Override
	public Iterable<Warehouse> findAll() {
				return repository.findAll();
	}

	@Override
	public Warehouse findByID(int warehouseID) {
		Optional<Warehouse> optWarehouse = repository.findById(warehouseID);
		return optWarehouse.isPresent() ? optWarehouse.get() : null;
	}

	@Override
	public Warehouse createWarehouse(Warehouse warehouse) {
		return repository.save(warehouse);

	}

	@Override
	public Warehouse updateWarehouse(Warehouse warehouse, int warehouseID) {
		findByID(warehouseID);
		warehouse.setWarehouseID(warehouseID);
		return repository.save(warehouse);
	}

	@Override
	public void deleteWarehouseById(int warehouseID) {
		repository.deleteById(warehouseID);		
		
	}
}
