package com.codejek.inventory.management.model;

import org.springframework.validation.annotation.Validated;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "Lot")
@Validated
public class LotModel {

	private long id;
	private String barCode;
	private long entryTime;
	private long lastModifiedTime;
	private WarehouseModel warehouse;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBarCode() {
		return barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
	public long getEntryTime() {
		return entryTime;
	}
	public WarehouseModel getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(WarehouseModel warehouse) {
		this.warehouse = warehouse;
	}
	public void setEntryTime(long entryTime) {
		this.entryTime = entryTime;
	}
	public long getLastModifiedTime() {
		return lastModifiedTime;
	}
	public void setLastModifiedTime(long lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}
}
