package com.codejek.inventory.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codejek.inventory.management.entity.ICNStockEntity;

public interface ICNStockRepository extends JpaRepository<ICNStockEntity, Long>{

}
