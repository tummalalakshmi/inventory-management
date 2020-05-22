package com.codejek.inventory.management.model;

import org.springframework.validation.annotation.Validated;

import com.codejek.inventory.management.entity.Address;
import com.codejek.inventory.management.entity.CompanyAgent;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "Warehouse")
@Validated
public class WarehouseModel {

	private long id;
	private Address address;
	private CompanyAgent contactPerson;
	private long creationTime;
	private long lastModifiedTime;
	private String warehouseName;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(long creationTime) {
		this.creationTime = creationTime;
	}
	public long getLastModifiedTime() {
		return lastModifiedTime;
	}
	public void setLastModifiedTime(long lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public CompanyAgent getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(CompanyAgent contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getWarehouseName() {
		return warehouseName;
	}
	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}
}
