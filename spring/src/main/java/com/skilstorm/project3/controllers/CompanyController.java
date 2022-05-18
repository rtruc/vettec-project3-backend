package com.skilstorm.project3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilstorm.project3.models.Company;
import com.skilstorm.project3.services.CompanyService;

@RestController
@RequestMapping("/companies")
public class CompanyController {

	@Autowired
	private CompanyService service;
	
	@GetMapping
	public Iterable<Company> findAll() {
		return service.findAll();
	}
	
	
	@GetMapping("/{companyID}")
	public Company findById(@PathVariable int companyID) {
		return service.findByID(companyID);
	}
	
	// CREATE
	@PostMapping // POST HTTP Request /authors
	public void createAuthor(@RequestBody Company company) {
		service.createCompany(company);
	}
	
	// UPDATE
	@PutMapping("/{companyID}") // PUT HTTP Request /authors
	public void updateAuthor(@RequestBody Company company, @PathVariable int companyID) {
		service.updateCompany(company, companyID);
	}
	
	//DELETE
	@DeleteMapping("/{companyID}")
	public void deleteAuthorById(@PathVariable int companyID) {
		service.deleteCompanyById(companyID);
	}
	
}
