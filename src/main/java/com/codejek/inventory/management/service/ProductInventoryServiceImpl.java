package com.codejek.inventory.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codejek.inventory.management.entity.ProductInventoryEntity;
import com.codejek.inventory.management.repository.ProductInventoryRepository;

@Service
@Transactional
public class ProductInventoryServiceImpl implements ProductInventoryService{

	@Autowired
	ProductInventoryRepository productInventoryRepository;
	
	@Override
	public ProductInventoryEntity create(ProductInventoryEntity productInventoryEntity) {
		
		return productInventoryRepository.save(productInventoryEntity);
	}

	@Override
	public ProductInventoryEntity update(ProductInventoryEntity productInventoryEntity) {
		
		return productInventoryRepository.save(productInventoryEntity);
	}

	@Override
	public ProductInventoryEntity get(long id) {
		
		return productInventoryRepository.getOne(id);
	}

	@Override
	public List<ProductInventoryEntity> getAll() {
		
		return productInventoryRepository.findAll();
	}

	@Override
	public void delete(ProductInventoryEntity productInventoryEntity) {
		
		productInventoryRepository.delete(productInventoryEntity);
	}
}
