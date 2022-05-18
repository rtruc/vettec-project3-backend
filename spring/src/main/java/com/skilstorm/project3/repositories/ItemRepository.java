package com.skilstorm.project3.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skilstorm.project3.models.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Integer>{

}
