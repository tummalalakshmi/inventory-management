package com.codejek.inventory.management.service;

import java.util.List;

import com.codejek.inventory.management.entity.InventoryCollectionNodeEntity;

public interface InventoryCollectionNodeService {

	public InventoryCollectionNodeEntity create(InventoryCollectionNodeEntity inventoryCollectionNodeEntity);
	public InventoryCollectionNodeEntity update(InventoryCollectionNodeEntity inventoryCollectionNodeEntity);
	public InventoryCollectionNodeEntity get(long id);
	public List<InventoryCollectionNodeEntity> getAll();
	public void delete(InventoryCollectionNodeEntity inventoryCollectionNodeEntity);
}
