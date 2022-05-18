package com.skilstorm.project3.services;

import com.skilstorm.project3.models.Location;

public interface LocationService {
	
	// READ
	Iterable<Location> findAll();
	Location findByID(int locationID);
	
	// CREATE
	Location createLocation(Location location);
	
	// UPDATE
	Location updateLocation(Location location, int locationID);
	
	// DELETE
	void deleteLocationById(int locationID);
}
