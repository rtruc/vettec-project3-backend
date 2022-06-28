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

import com.skilstorm.project3.models.Brand;
import com.skilstorm.project3.services.BrandService;

@RestController
@CrossOrigin(origins = {"http://localhost:3000", "http://www.ubno.com"})
@RequestMapping("/brands")
public class BrandController {

	@Autowired
	private BrandService service;
	
	@GetMapping
	public Iterable<Brand> findAll() {
		return service.findAll();
	}
	
	
	@GetMapping("/{brandID}")
	public Brand findById(@PathVariable int brandID) {
		return service.findByID(brandID);
	}
	
	// CREATE
	@PostMapping // POST HTTP Request /authors
	public void createBrand(@RequestBody Brand brand) {
		service.createBrand(brand);
	}
	
	// UPDATE
	@PutMapping("/{brandID}") // PUT HTTP Request /authors
	public void updateBrand(@RequestBody Brand brand, @PathVariable int brandID) {
		service.updateBrand(brand, brandID);
	}
	
	//DELETE
	@DeleteMapping("/{brandID}")
	public void deleteBrandById(@PathVariable int brandID) {
		service.deleteBrandById(brandID);
	}
	
}
