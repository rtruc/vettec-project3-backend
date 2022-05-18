package com.skilstorm.project3.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skilstorm.project3.models.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
