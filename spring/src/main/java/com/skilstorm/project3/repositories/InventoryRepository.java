package com.skilstorm.project3.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skilstorm.project3.models.Inventory;

@Repository
public interface InventoryRepository extends CrudRepository<Inventory, Integer>{

}
