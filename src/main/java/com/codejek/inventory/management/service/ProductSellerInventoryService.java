package com.codejek.inventory.management.service;

import java.util.List;

import com.codejek.inventory.management.entity.ProductSellerInventoryEntity;

public interface ProductSellerInventoryService {

	public ProductSellerInventoryEntity create(ProductSellerInventoryEntity productSellerInventoryEntity);
	public ProductSellerInventoryEntity update(ProductSellerInventoryEntity productSellerInventoryEntity);
	public ProductSellerInventoryEntity get(long id);
	public List<ProductSellerInventoryEntity> getAll();
	public void delete(ProductSellerInventoryEntity productSellerInventoryEntity);
}
