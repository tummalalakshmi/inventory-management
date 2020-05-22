package com.codejek.inventory.management.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name="lot")
@Data
public class LotEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "lot_id", updatable = false, nullable = false)
	@JsonIgnore
	private long id;
	private String barCode;
	private long entryTime;
	private long lastModifiedTime;
	@ManyToOne
	@JoinColumn(name = "warehouse_id", nullable = false)
	private WarehouseEntity warehouseEntity;
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
	public void setEntryTime(long entryTime) {
		this.entryTime = entryTime;
	}
	public WarehouseEntity getWarehouseEntity() {
		return warehouseEntity;
	}
	public void setWarehouseEntity(WarehouseEntity warehouseEntity) {
		this.warehouseEntity = warehouseEntity;
	}
	public long getLastModifiedTime() {
		return lastModifiedTime;
	}
	public void setLastModifiedTime(long lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}
}
