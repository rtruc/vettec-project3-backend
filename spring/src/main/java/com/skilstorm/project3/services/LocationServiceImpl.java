package com.skilstorm.project3.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilstorm.project3.models.Location;
import com.skilstorm.project3.repositories.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationRepository repository;

	@Override
	public Iterable<Location> findAll() {
		return repository.findAll();
	}

	@Override
	public Location findByID(int locationID) {
		Optional<Location> optLocation = repository.findById(locationID);
		return optLocation.isPresent() ? optLocation.get() : null;
	}

	@Override
	public Location createLocation(Location location) {
		return repository.save(location);
	}

	@Override
	public Location updateLocation(Location location, int locationID) {
		findByID(locationID);
		location.setLocationID(locationID);
		return repository.save(location);
	}

	@Override
	public void deleteLocationById(int locationID) {
		repository.deleteById(locationID);		
	}
	
	
}
