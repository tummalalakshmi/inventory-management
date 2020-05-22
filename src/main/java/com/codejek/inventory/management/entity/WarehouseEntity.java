package com.codejek.inventory.management.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vladmihalcea.hibernate.type.json.JsonStringType;

import lombok.Data;

@Entity
@Table(name="warehouse")
@Data
@TypeDef(name = "json", typeClass = JsonStringType.class)
public class WarehouseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_inventory_id", updatable = false, nullable = false)
	@JsonIgnore
	private long id;
	@Type(type = "json")
	@Column(columnDefinition = "json")
	private Address address;
	@Type(type = "json")
	@Column(columnDefinition = "json")
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
	public String getWarehouseName() {
		return warehouseName;
	}
	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}
}
