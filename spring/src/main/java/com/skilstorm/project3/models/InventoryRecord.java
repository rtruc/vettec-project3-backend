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
@Table(name = "inventory_record")
public class InventoryRecord {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "inventory_id")
	private int inventoryID;
	
	@Column(name = "warehouse_id")
	private int warehouseID;
	
	@ManyToOne
	@JoinColumn(name = "item_id")
	private Item item;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "inventory_date")
	private String inventoryDate;
	
	
	public InventoryRecord() {
		
	}
	
	public InventoryRecord(int inventoryID) {
		this.inventoryID = inventoryID;
	}
	
	public InventoryRecord(int warehouseID, Item item, int quantity, String inventoryDate) {
		this.warehouseID = warehouseID;
		this.item = item;
		this.quantity = quantity;
		this.inventoryDate = inventoryDate;
	}
	
	public InventoryRecord(int inventoryID, int warehouseID, Item item, int quantity, String inventoryDate) {
		this.inventoryID = inventoryID;
		this.warehouseID = warehouseID;
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

	public int getWarehouseID() {
		return warehouseID;
	}
	
	public void setWarehouseID(int warehouseID) {
		this.warehouseID = warehouseID;
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
		return "Inventory [inventoryID=" + inventoryID + ", warehouseID=" + warehouseID + ", item=" + item + ", quantity="
				+ quantity + ", inventoryDate=" + inventoryDate + "]";
	}

	
	
	
	
}
