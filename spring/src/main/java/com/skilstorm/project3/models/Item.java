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
@Table(name = "item")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "item_id")
	private int itemID;
	
	@Column(name = "item_name")
	private String itemName;
	
	@Column(name = "item_type")
	private String itemType;
	
	@ManyToOne
	@JoinColumn(name = "brand_id")
	private Brand brand;
	
	@Column(name = "unit_volume")
	private int unitVolume;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "image_url")
	private String imageURL;
	
	
	public Item() {
		
	}
	
	
	
	public Item(int itemID) {
		this.itemID = itemID;
	}
	
	public Item(String itemName, String itemType, Brand brand, 
				int unitVolume, String description, String imageURL) {
		this.itemName = itemName;
		this.itemType = itemType;
		this.brand = brand;
		this.unitVolume = unitVolume;
		this.description = description;
		this.imageURL = imageURL;
	}
	
	public Item(int itemID, String itemName, String itemType, Brand brand, 
				int unitVolume, String description, String imageURL) {
		this.itemID = itemID;
		this.itemName = itemName;
		this.itemType = itemType;
		this.brand = brand;
		this.unitVolume = unitVolume;
		this.description = description;
		this.imageURL = imageURL;
	}



	public int getItemID() {
		return itemID;
	}



	public void setItemID(int itemID) {
		this.itemID = itemID;
	}



	public String getItemName() {
		return itemName;
	}



	public void setItemName(String itemName) {
		this.itemName = itemName;
	}



	public String getItemType() {
		return itemType;
	}



	public void setItemType(String itemType) {
		this.itemType = itemType;
	}



	public Brand getBrand() {
		return brand;
	}



	public void setBrand(Brand brand) {
		this.brand = brand;
	}



	public int getUnitVolume() {
		return unitVolume;
	}



	public void setUnitVolume(int unitVolume) {
		this.unitVolume = unitVolume;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getImageURL() {
		return imageURL;
	}



	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}



	@Override
	public String toString() {
		return "Item [itemID=" + itemID + ", itemName=" + itemName + ", itemType=" + itemType + ", brand=" + brand
				+ ", unitVolume=" + unitVolume + ", description=" + description + ", imageURL=" + imageURL + "]";
	}
	
	
	
	
	
}
