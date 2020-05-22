package com.codejek.inventory.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codejek.inventory.management.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long>{

}
