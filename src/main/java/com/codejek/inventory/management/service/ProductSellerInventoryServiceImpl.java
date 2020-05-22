package com.codejek.inventory.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codejek.inventory.management.entity.ProductSellerInventoryEntity;
import com.codejek.inventory.management.repository.ProductSellerInventoryRepository;

@Service
@Transactional
public class ProductSellerInventoryServiceImpl implements ProductSellerInventoryService{

	@Autowired
	ProductSellerInventoryRepository productSellerInventoryRepository;
	
	@Override
	public ProductSellerInventoryEntity create(ProductSellerInventoryEntity productSellerInventoryEntity) {
		
		return productSellerInventoryRepository.save(productSellerInventoryEntity);
	}

	@Override
	public ProductSellerInventoryEntity update(ProductSellerInventoryEntity productSellerInventoryEntity) {
		
		return productSellerInventoryRepository.save(productSellerInventoryEntity);
	}

	@Override
	public ProductSellerInventoryEntity get(long id) {
		
		return productSellerInventoryRepository.getOne(id);
	}

	@Override
	public List<ProductSellerInventoryEntity> getAll() {
		
		return productSellerInventoryRepository.findAll();
	}

	@Override
	public void delete(ProductSellerInventoryEntity productSellerInventoryEntity) {
		
		productSellerInventoryRepository.delete(productSellerInventoryEntity);
	}
}
