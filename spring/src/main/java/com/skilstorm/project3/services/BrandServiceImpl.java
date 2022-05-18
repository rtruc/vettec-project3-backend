package com.skilstorm.project3.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilstorm.project3.models.Brand;
import com.skilstorm.project3.repositories.BrandRepository;

@Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	private BrandRepository repository;
	
	@Override
	public Iterable<Brand> findAll() {
		return repository.findAll();
	}

	@Override
	public Brand findByID(int brandID) {
		Optional<Brand> optBrand = repository.findById(brandID);
		return optBrand.isPresent() ? optBrand.get() : null;
	}

	@Override
	public Brand createBrand(Brand brand) {
		return repository.save(brand);

	}

	@Override
	public Brand updateBrand(Brand brand, int brandID) {
		findByID(brandID);
		brand.setBrandID(brandID);
		return repository.save(brand);
	}

	@Override
	public void deleteBrandById(int brandID) {
		repository.deleteById(brandID);		
		
	}

}
