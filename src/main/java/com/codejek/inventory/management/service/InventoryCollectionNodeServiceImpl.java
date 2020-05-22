package com.codejek.inventory.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codejek.inventory.management.entity.InventoryCollectionNodeEntity;
import com.codejek.inventory.management.repository.InventoryCollectionNodeRepository;

@Service
@Transactional
public class InventoryCollectionNodeServiceImpl implements InventoryCollectionNodeService{

	@Autowired
	InventoryCollectionNodeRepository inventoryCollectionNodeRepository;
	
	@Override
	public InventoryCollectionNodeEntity create(InventoryCollectionNodeEntity inventoryCollectionNodeEntity) {
		
		return inventoryCollectionNodeRepository.save(inventoryCollectionNodeEntity);
	}

	@Override
	public InventoryCollectionNodeEntity update(InventoryCollectionNodeEntity inventoryCollectionNodeEntity) {
		
		return inventoryCollectionNodeRepository.save(inventoryCollectionNodeEntity);
	}

	@Override
	public InventoryCollectionNodeEntity get(long id) {
		
		return inventoryCollectionNodeRepository.getOne(id);
	}

	@Override
	public List<InventoryCollectionNodeEntity> getAll() {
		
		return inventoryCollectionNodeRepository.findAll();
	}

	@Override
	public void delete(InventoryCollectionNodeEntity inventoryCollectionNodeEntity) {
		
		inventoryCollectionNodeRepository.delete(inventoryCollectionNodeEntity);
	}
}
