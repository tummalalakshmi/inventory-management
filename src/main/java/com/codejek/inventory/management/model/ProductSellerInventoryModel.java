package com.codejek.inventory.management.model;

import org.springframework.validation.annotation.Validated;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "ProductSellerInventory")
@Validated
public class ProductSellerInventoryModel {

	private long id;
	private ProductModel product;
	private long creationTime;
	private long lastModifiedTime;
	private long collectedQuantity;
	private long approvedQuantity;
	private long costPerUnit;
	private String status;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public ProductModel getProduct() {
		return product;
	}
	public void setProduct(ProductModel product) {
		this.product = product;
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
	public long getCollectedQuantity() {
		return collectedQuantity;
	}
	public void setCollectedQuantity(long collectedQuantity) {
		this.collectedQuantity = collectedQuantity;
	}
	public long getApprovedQuantity() {
		return approvedQuantity;
	}
	public void setApprovedQuantity(long approvedQuantity) {
		this.approvedQuantity = approvedQuantity;
	}
	public long getCostPerUnit() {
		return costPerUnit;
	}
	public void setCostPerUnit(long costPerUnit) {
		this.costPerUnit = costPerUnit;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
