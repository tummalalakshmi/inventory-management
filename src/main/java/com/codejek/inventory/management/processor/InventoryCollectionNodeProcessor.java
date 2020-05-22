package com.codejek.inventory.management.processor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codejek.inventory.management.entity.InventoryCollectionNodeEntity;
import com.codejek.inventory.management.model.InventoryCollectionNodeModel;
import com.codejek.inventory.management.service.InventoryCollectionNodeService;
import com.codejek.inventory.management.utils.Mapper;

@Component
public class InventoryCollectionNodeProcessor {

	@Autowired
	InventoryCollectionNodeService inventoryCollectionNodeService;
	
	public long addInventoryCollectionNode(InventoryCollectionNodeModel inventoryCollectionNodeModel) {
		
		InventoryCollectionNodeEntity inventoryCollectionNodeEntity = Mapper.mapInventoryCollectionNodeModeltoEntity(inventoryCollectionNodeModel);
		Date date = new Date();
		inventoryCollectionNodeEntity.setCreationTime(date.getTime());
		inventoryCollectionNodeEntity.setLastModifiedTime(date.getTime());
		
		inventoryCollectionNodeEntity = inventoryCollectionNodeService.create(inventoryCollectionNodeEntity);
		 return inventoryCollectionNodeEntity.getId();
	}
	
	public long modifyInventoryCollectionNode(InventoryCollectionNodeModel inventoryCollectionNodeModel) {
		
		InventoryCollectionNodeEntity inventoryCollectionNodeEntity = Mapper.mapInventoryCollectionNodeModeltoEntity(inventoryCollectionNodeModel);
		Date date = new Date();
		inventoryCollectionNodeEntity.setLastModifiedTime(date.getTime());
		
		inventoryCollectionNodeEntity = inventoryCollectionNodeService.update(inventoryCollectionNodeEntity);
		 return inventoryCollectionNodeEntity.getId();
	}
	
	public InventoryCollectionNodeModel getInventoryCollectionNodeModel(long id) {
		
		InventoryCollectionNodeEntity inventoryCollectionNodeEntity = inventoryCollectionNodeService.get(id);
		
		return Mapper.mapInventoryCollectionNodeEntitytoModel(inventoryCollectionNodeEntity);
	}
	
	public List<InventoryCollectionNodeModel> findAllInventoryCollectionNodes(){
		
		List <InventoryCollectionNodeEntity> be = inventoryCollectionNodeService.getAll();
		
		List<InventoryCollectionNodeModel> bm = new ArrayList<InventoryCollectionNodeModel>();
		for(InventoryCollectionNodeEntity b : be) {
			bm.add(Mapper.mapInventoryCollectionNodeEntitytoModel(b));
		}
		return bm;
	}
	
	public void removeInventoryCollectionNode(long id) {
		
		inventoryCollectionNodeService.delete(Mapper.mapInventoryCollectionNodeModeltoEntity(getInventoryCollectionNodeModel(id)));
	}
}
