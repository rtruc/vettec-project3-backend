package com.skilstorm.project3.services;

import com.skilstorm.project3.models.Brand;

public interface BrandService {

	// READ
	Iterable<Brand> findAll();
	Brand findByID(int brandID);
	
	// CREATE
	Brand createBrand(Brand brand);
	
	// UPDATE
	Brand updateBrand(Brand brand, int brandID);
	
	// DELETE
	void deleteBrandById(int brandID);
}
