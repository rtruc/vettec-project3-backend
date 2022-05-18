package com.skilstorm.project3.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

@Entity
@Table(name = "location")
public class Location {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "location_id")
	private int locationID;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	@Nullable
	private String state;

	@Column(name = "country")
	private String country;
	
	
	public Location() {
		
	}
	
	public Location(int locationID) {
		this.locationID = locationID;
	}
	
	public Location(String city, String state, String country) {
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	public Location(int locationID, String city, String state, String country) {
		this.locationID = locationID;
		this.city = city;
		this.state = state;
		this.country = country;	
	}

	public int getLocationID() {
		return locationID;
	}

	public void setLocationID(int locationID) {
		this.locationID = locationID;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Location [locationID=" + locationID + ", city=" + city + ", state=" + state + ", country=" + country
				+ "]";
	}
	
}
