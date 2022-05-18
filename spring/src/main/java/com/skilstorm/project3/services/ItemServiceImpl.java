package com.skilstorm.project3.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilstorm.project3.models.Item;
import com.skilstorm.project3.repositories.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepository repository;
	
	@Override
	public Iterable<Item> findAll() {
		return repository.findAll();
	}

	@Override
	public Item findByID(int itemID) {
		Optional<Item> optItem = repository.findById(itemID);
		return optItem.isPresent() ? optItem.get() : null;
	}

	@Override
	public Item createItem(Item item) {
		return repository.save(item);

	}

	@Override
	public Item updateItem(Item item, int itemID) {
		findByID(itemID);
		item.setItemID(itemID);
		return repository.save(item);
	}

	@Override
	public void deleteItemById(int itemID) {
		repository.deleteById(itemID);		
		
	}

}
