package com.codejek.inventory.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codejek.inventory.management.entity.WarehouseEntity;

public interface WarehouseRepository extends JpaRepository<WarehouseEntity, Long>{

}
