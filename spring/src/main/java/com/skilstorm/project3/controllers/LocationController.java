package com.skilstorm.project3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilstorm.project3.models.Location;
import com.skilstorm.project3.services.LocationService;

@RestController
@CrossOrigin(origins = {"http://localhost:3000", "https://www.mywebsite.com"})

@RequestMapping("/locations")
public class LocationController {
	
	@Autowired
	private LocationService service;
	
	// GET
	@GetMapping
	public Iterable<Location> findAll() {
		return service.findAll();
	}
	@GetMapping("/{locationID}")
	public Location findById(@PathVariable int locationID) {
		return service.findByID(locationID);
	}
	
	// CREATE
	@PostMapping // POST HTTP Request /authors
	public void createLocation(@RequestBody Location location) {
		service.createLocation(location);
	}
	
	// UPDATE
	@PutMapping("/{locationID}") // PUT HTTP Request /authors
	public void updateLocation(@RequestBody Location location, @PathVariable int locationID) {
		service.updateLocation(location, locationID);
	}
	
	//DELETE
	@DeleteMapping("/{locationID}")
	public void deleteLocationById(@PathVariable int locationID) {
		service.deleteLocationById(locationID);
	}
	
}
