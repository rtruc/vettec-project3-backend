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
@Table(name = "company")
public class Company {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "company_id")
	private int companyID;

	@Column(name = "company_name")
	private String companyName;
	
//	@Column(name = "location_id")
//	private int locationID;
	
	@ManyToOne
	@JoinColumn(name = "location_id")
	private Location location;
	
	
	
	public Company() {
		
	}
	
	public Company(int companyID) {
		this.companyID = companyID;
	}
	
	public Company(String companyName, Location location) {
		this.companyName = companyName;
		this.location = location;
	}
	
	public Company(int companyID, String companyName, Location location) {
		this.companyID = companyID;
		this.companyName = companyName;
		this.location = location;
	}

	
	
	public int getCompanyID() {
		return companyID;
	}

	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Company [companyID=" + companyID + ", companyName=" + companyName + ", location=" + location + "]";
	}
	
	
	
}
