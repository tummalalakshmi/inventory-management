package com.codejek.inventory.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codejek.inventory.management.entity.ProductInventoryEntity;

public interface ProductInventoryRepository extends JpaRepository<ProductInventoryEntity, Long>{

}
