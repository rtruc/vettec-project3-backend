package com.skilstorm.project3.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
	
@Entity
@Table(name = "brand")
public class Brand {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "brand_id")
	private int brandID;
	
	@Column(name = "brand_name")
	private String brandName;
	
	@ManyToOne
	@JoinColumn(name = "company_id")
	private Company company;
	
	@ManyToOne
	@JoinColumn(name = "location_id")
	private Location location;
	
	
	public Brand() {
		
	}
	
	public Brand(int brandID) {
		this.brandID = brandID;
	}
	
	public Brand(String brandName, Company company, Location location) {
		this.brandName = brandName;
		this.company = company;
		this.location = location;
	}
	
	public Brand(int brandID, String brandName, Company company, Location location) {
		this.brandID = brandID;
		this.brandName = brandName;
		this.company = company;
		this.location = location;
	}

	public int getBrandID() {
		return brandID;
	}

	public void setBrandID(int brandID) {
		this.brandID = brandID;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Brand [brandID=" + brandID + ", brandName=" + brandName + ", company=" + company + ", location="
				+ location + "]";
	}
	
	
	
	
	
	
}

