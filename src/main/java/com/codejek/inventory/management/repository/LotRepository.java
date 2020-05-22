package com.codejek.inventory.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codejek.inventory.management.entity.LotEntity;

public interface LotRepository extends JpaRepository<LotEntity, Long>{

}
