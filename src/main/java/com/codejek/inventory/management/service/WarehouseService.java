package com.codejek.inventory.management.service;

import java.util.List;

import com.codejek.inventory.management.entity.WarehouseEntity;

public interface WarehouseService {

	public WarehouseEntity create(WarehouseEntity warehouseEntity);
	public WarehouseEntity update(WarehouseEntity warehouseEntity);
	public WarehouseEntity get(long id);
	public List<WarehouseEntity> getAll();
	public void delete(WarehouseEntity warehouseEntity);
}
