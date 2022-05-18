package com.skilstorm.project3.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilstorm.project3.models.Company;
import com.skilstorm.project3.repositories.CompanyRepository;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyRepository repository;
	
	@Override
	public Iterable<Company> findAll() {
		return repository.findAll();
	}

	@Override
	public Company findByID(int companyID) {
		Optional<Company> optCompany = repository.findById(companyID);
		return optCompany.isPresent() ? optCompany.get() : null;
	}

	@Override
	public Company createCompany(Company company) {
		return repository.save(company);

	}

	@Override
	public Company updateCompany(Company company, int companyID) {
		findByID(companyID);
		company.setCompanyID(companyID);
		return repository.save(company);
	}

	@Override
	public void deleteCompanyById(int companyID) {
		repository.deleteById(companyID);		
		
	}

}
