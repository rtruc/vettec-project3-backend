package com.skilstorm.project3.services;

import com.skilstorm.project3.models.Company;

public interface CompanyService {

	// READ
	Iterable<Company> findAll();
	Company findByID(int companyID);
	
	// CREATE
	Company createCompany(Company company);
	
	// UPDATE
	Company updateCompany(Company company, int companyID);
	
	// DELETE
	void deleteCompanyById(int companyID);
}
