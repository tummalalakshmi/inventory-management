package com.codejek.inventory.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codejek.inventory.management.entity.WarehouseEntity;
import com.codejek.inventory.management.repository.WarehouseRepository;

@Service
@Transactional
public class WarehouseServiceImpl implements WarehouseService{

	@Autowired
	WarehouseRepository warehouseRepository;
	
	@Override
	public WarehouseEntity create(WarehouseEntity warehouseEntity) {
		
		return warehouseRepository.save(warehouseEntity);
	}

	@Override
	public WarehouseEntity update(WarehouseEntity warehouseEntity) {
		
		return warehouseRepository.save(warehouseEntity);
	}

	@Override
	public WarehouseEntity get(long id) {
		
		return warehouseRepository.getOne(id);
	}

	@Override
	public List<WarehouseEntity> getAll() {
		
		return warehouseRepository.findAll();
	}

	@Override
	public void delete(WarehouseEntity warehouseEntity) {
		
		warehouseRepository.delete(warehouseEntity);
	}
}
