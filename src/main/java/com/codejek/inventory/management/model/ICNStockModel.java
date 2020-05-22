package com.codejek.inventory.management.model;

import java.util.List;

import org.springframework.validation.annotation.Validated;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "ICNStock")
@Validated
public class ICNStockModel {

	private long id;
	private List<ProductSellerInventoryModel> productList;
	private String sellerName;
	private long creationTime;
	private long lastModifiedTime;
	private InventoryCollectionNodeModel inventoryCollNode;
	private LotModel lot;
	private String status;
	private String advStockRecNum;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<ProductSellerInventoryModel> getProductList() {
		return productList;
	}
	public void setProductList(List<ProductSellerInventoryModel> productList) {
		this.productList = productList;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
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
	public InventoryCollectionNodeModel getInventoryCollNode() {
		return inventoryCollNode;
	}
	public void setInventoryCollNode(InventoryCollectionNodeModel inventoryCollNode) {
		this.inventoryCollNode = inventoryCollNode;
	}
	public LotModel getLot() {
		return lot;
	}
	public void setLot(LotModel lot) {
		this.lot = lot;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAdvStockRecNum() {
		return advStockRecNum;
	}
	public void setAdvStockRecNum(String advStockRecNum) {
		this.advStockRecNum = advStockRecNum;
	}
}
