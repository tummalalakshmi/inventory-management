package com.codejek.inventory.management.service;

import java.util.List;

import com.codejek.inventory.management.entity.ProductEntity;

public interface ProductService {

	public ProductEntity create(ProductEntity productEntity);
	public ProductEntity update(ProductEntity productEntity);
	public ProductEntity get(long id);
	public List<ProductEntity> getAll();
	public void delete(ProductEntity productEntity);
}
