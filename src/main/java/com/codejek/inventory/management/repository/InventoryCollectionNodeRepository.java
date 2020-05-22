package com.codejek.inventory.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codejek.inventory.management.entity.InventoryCollectionNodeEntity;

public interface InventoryCollectionNodeRepository extends JpaRepository<InventoryCollectionNodeEntity	, Long>{

}
