package com.skilstorm.project3.services;

import com.skilstorm.project3.models.Item;

public interface ItemService {

	// READ
	Iterable<Item> findAll();
	Item findByID(int itemID);
	
	// CREATE
	Item createItem(Item item);
	
	// UPDATE
	Item updateItem(Item item, int itemID);
	
	// DELETE
	void deleteItemById(int itemID);
}
