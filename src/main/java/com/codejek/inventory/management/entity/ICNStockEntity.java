package com.codejek.inventory.management.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name="inc_stock", uniqueConstraints= @UniqueConstraint(columnNames={"advStockRecNum"}))
@Data
public class ICNStockEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "inv_coll_stock_id", updatable = false, nullable = false)
	@JsonIgnore
	private long id;
	@OneToMany
	@JoinColumn(name = "productList", nullable = false)
	private List<ProductSellerInventoryEntity> productList;
	private String sellerName;
	private long creationTime;
	private long lastModifiedTime;
	@ManyToOne
	@JoinColumn(name = "invCollNode")
	private InventoryCollectionNodeEntity inventoryCollNode;
	@ManyToOne
	@JoinColumn(name = "lot_id")
	private LotEntity lotEntity;
	private String status;
	private String advStockRecNum;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<ProductSellerInventoryEntity> getProductList() {
		return productList;
	}
	public void setProductList(List<ProductSellerInventoryEntity> productList) {
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
	public InventoryCollectionNodeEntity getInventoryCollNode() {
		return inventoryCollNode;
	}
	public void setInventoryCollNode(InventoryCollectionNodeEntity inventoryCollNode) {
		this.inventoryCollNode = inventoryCollNode;
	}
	public LotEntity getLotEntity() {
		return lotEntity;
	}
	public void setLotEntity(LotEntity lotEntity) {
		this.lotEntity = lotEntity;
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
