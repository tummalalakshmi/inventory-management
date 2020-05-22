package com.codejek.inventory.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codejek.inventory.management.entity.ProductSellerInventoryEntity;

public interface ProductSellerInventoryRepository extends JpaRepository<ProductSellerInventoryEntity, Long>{

}
