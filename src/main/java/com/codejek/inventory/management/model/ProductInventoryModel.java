package com.codejek.inventory.management.model;

public class ProductInventoryModel {

	private long id;
	private ProductModel product;
	private WarehouseModel warehouse;
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
	public ProductModel getProduct() {
		return product;
	}
	public void setProduct(ProductModel product) {
		this.product = product;
	}
	public WarehouseModel getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(WarehouseModel warehouse) {
		this.warehouse = warehouse;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getProInvCode() {
		return proInvCode;
	}
	public void setProInvCode(String proInvCode) {
		this.proInvCode = proInvCode;
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
	public long getCostPerUnit() {
		return costPerUnit;
	}
	public void setCostPerUnit(long costPerUnit) {
		this.costPerUnit = costPerUnit;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
