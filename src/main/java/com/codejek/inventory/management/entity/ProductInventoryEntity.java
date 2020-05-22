package com.codejek.inventory.management.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="product_inventory" , uniqueConstraints= @UniqueConstraint(columnNames={"product","grade"}))
public class ProductInventoryEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_inventory_id", updatable = false, nullable = false)
	@JsonIgnore
	private long id;
	@OneToOne
	@JoinColumn(name = "product", nullable = false)
	private ProductEntity product;
	@ManyToOne
	@JoinColumn(name = "warehouse_id", nullable = false)
	private WarehouseEntity warehouseEntity;
	private String grade;
	private String proInvCode;
	private long creationTime;
	private long lastModifiedTime;
	private int openQuantity;
	private int soldQuantity;
	private int damagedQuantity;
	private int currentQuantity;
	private long costPerUnit;
	private String productName;
	private String warehouseName;
	private String status;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public ProductEntity getProduct() {
		return product;
	}
	public void setProduct(ProductEntity product) {
		this.product = product;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
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
	public int getOpenQuantity() {
		return openQuantity;
	}
	public void setOpenQuantity(int openQuantity) {
		this.openQuantity = openQuantity;
	}
	public int getSoldQuantity() {
		return soldQuantity;
	}
	public void setSoldQuantity(int soldQuantity) {
		this.soldQuantity = soldQuantity;
	}
	public int getDamagedQuantity() {
		return damagedQuantity;
	}
	public void setDamagedQuantity(int damagedQuantity) {
		this.damagedQuantity = damagedQuantity;
	}
	public int getCurrentQuantity() {
		return currentQuantity;
	}
	public void setCurrentQuantity(int currentQuantity) {
		this.currentQuantity = currentQuantity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public long getCostPerUnit() {
		return costPerUnit;
	}
	public void setCostPerUnit(long costPerUnit) {
		this.costPerUnit = costPerUnit;
	}
	public String getProInvCode() {
		return proInvCode;
	}
	public void setProInvCode(String proInvCode) {
		this.proInvCode = proInvCode;
	}
	public WarehouseEntity getWarehouseEntity() {
		return warehouseEntity;
	}
	public void setWarehouseEntity(WarehouseEntity warehouseEntity) {
		this.warehouseEntity = warehouseEntity;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getWarehouseName() {
		return warehouseName;
	}
	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}
}
