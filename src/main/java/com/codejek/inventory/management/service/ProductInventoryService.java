package com.codejek.inventory.management.service;

import java.util.List;

import com.codejek.inventory.management.entity.ProductInventoryEntity;

public interface ProductInventoryService {

	public ProductInventoryEntity create(ProductInventoryEntity productInventoryEntity);
	public ProductInventoryEntity update(ProductInventoryEntity productInventoryEntity);
	public ProductInventoryEntity get(long id);
	public List<ProductInventoryEntity> getAll();
	public void delete(ProductInventoryEntity productInventoryEntity);
}
