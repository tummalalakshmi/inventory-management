package com.codejek.inventory.management.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.TypeDef;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vladmihalcea.hibernate.type.json.JsonStringType;

@Entity
@Table(name="product_seller_inventory")
@TypeDef(name = "json", typeClass = JsonStringType.class)
public class ProductSellerInventoryEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_seller_inventory_id", updatable = false, nullable = false)
	@JsonIgnore
	private long id;
	@OneToOne
	@JoinColumn(name = "product", nullable = false)
	private ProductEntity product;
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
	public ProductEntity getProduct() {
		return product;
	}
	public void setProduct(ProductEntity product) {
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
