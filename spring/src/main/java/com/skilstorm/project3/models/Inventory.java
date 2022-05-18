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
@Table(name = "inventory")
public class Inventory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "inventory_id")
	private int inventoryID;
	
	@ManyToOne
	@JoinColumn(name = "warehouse_id")
	private Warehouse warehouse;
	
	@ManyToOne
	@JoinColumn(name = "item_id")
	private Item item;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "inventory_date")
	private String inventoryDate;
	
	
	public Inventory() {
		
	}
	
	public Inventory(int inventoryID) {
		this.inventoryID = inventoryID;
	}
	
	public Inventory(Warehouse warehouse, Item item, int quantity, String inventoryDate) {
		this.warehouse = warehouse;
		this.item = item;
		this.quantity = quantity;
		this.inventoryDate = inventoryDate;
	}
	
	public Inventory(int inventoryID, Warehouse warehouse, Item item, int quantity, String inventoryDate) {
		this.inventoryID = inventoryID;
		this.warehouse = warehouse;
		this.item = item;
		this.quantity = quantity;
		this.inventoryDate = inventoryDate;
	}

	public int getInventoryID() {
		return inventoryID;
	}

	public void setInventoryID(int inventoryID) {
		this.inventoryID = inventoryID;
	}

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getInventoryDate() {
		return inventoryDate;
	}

	public void setInventoryDate(String inventoryDate) {
		this.inventoryDate = inventoryDate;
	}

	@Override
	public String toString() {
		return "Inventory [inventoryID=" + inventoryID + ", warehouse=" + warehouse + ", item=" + item + ", quantity="
				+ quantity + ", inventoryDate=" + inventoryDate + "]";
	}

	
	
	
	
}
