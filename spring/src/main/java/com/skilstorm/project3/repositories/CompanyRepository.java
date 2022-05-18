package com.skilstorm.project3.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skilstorm.project3.models.Company;

@Repository
public interface CompanyRepository extends CrudRepository<Company, Integer>{

}
