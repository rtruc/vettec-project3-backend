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
@Table(name = "warehouse")
public class Warehouse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "warehouse_id")
	private int warehouseID;
	
	@Column(name = "warehouse_name")
	private String warehouseName;

	@ManyToOne
	@JoinColumn(name = "location_id")
	private Location location;
	
	@Column(name = "max_storage_capacity")
	private int maxStorageCapacity;
	
	
	
	public Warehouse() {
		
	}

	public Warehouse(int warehouseID) {
		this.warehouseID = warehouseID;
	}
	
	public Warehouse(String warehouseName, Location location, int maxStorageCapacity) {
		this.warehouseName = warehouseName;
		this.location = location;
		this.maxStorageCapacity = maxStorageCapacity;
	}

	public Warehouse(int warehouseID, String warehouseName, Location location, int maxStorageCapacity) {
		this.warehouseID = warehouseID;
		this.warehouseName = warehouseName;
		this.location = location;
		this.maxStorageCapacity = maxStorageCapacity;
	}

	public int getWarehouseID() {
		return warehouseID;
	}

	public void setWarehouseID(int warehouseID) {
		this.warehouseID = warehouseID;
	}

	public String getWarehouseName() {
		return warehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public int getMaxStorageCapacity() {
		return maxStorageCapacity;
	}

	public void setMaxStorageCapacity(int maxStorageCapacity) {
		this.maxStorageCapacity = maxStorageCapacity;
	}

	@Override
	public String toString() {
		return "Warehouse [warehouseID=" + warehouseID + ", warehouseName=" + warehouseName + ", location=" + location
				+ ", maxStorageCapacity=" + maxStorageCapacity + "]";
	}
	
	
	
	
}
