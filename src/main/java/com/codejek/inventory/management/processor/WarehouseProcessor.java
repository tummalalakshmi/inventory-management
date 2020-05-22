package com.codejek.inventory.management.processor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codejek.inventory.management.entity.WarehouseEntity;
import com.codejek.inventory.management.model.WarehouseModel;
import com.codejek.inventory.management.service.WarehouseService;
import com.codejek.inventory.management.utils.Mapper;

@Component
public class WarehouseProcessor {

	@Autowired
	WarehouseService warehouseService;
	
	public long addWarehouse(WarehouseModel warehouseModel) {
		
		WarehouseEntity warehouseEntity = Mapper.mapWarehouseModeltoEntity(warehouseModel);
		Date date = new Date();
//		warehouseEntity.setCreationTime(date.getTime());
//		warehouseEntity.setLastModifiedTime(date.getTime());
		
		warehouseEntity = warehouseService.create(warehouseEntity);
		 return warehouseEntity.getId();
	}
	
	public long modifyWarehouse(WarehouseModel warehouseModel) {
		
		WarehouseEntity warehouseEntity = Mapper.mapWarehouseModeltoEntity(warehouseModel);
		Date date = new Date();
//		warehouseEntity.setLastModifiedTime(date.getTime());
		
		warehouseEntity = warehouseService.update(warehouseEntity);
		 return warehouseEntity.getId();
	}
	
	public WarehouseModel getWarehouseModel(long id) {
		
		WarehouseEntity warehouseEntity = warehouseService.get(id);
		
		return Mapper.mapWarehouseEntitytoModel(warehouseEntity);
	}
	
	public List<WarehouseModel> findAllWarehouses(){
		
		List <WarehouseEntity> be = warehouseService.getAll();
		
		List<WarehouseModel> bm = new ArrayList<WarehouseModel>();
		for(WarehouseEntity b : be) {
			bm.add(Mapper.mapWarehouseEntitytoModel(b));
		}
		return bm;
	}
	
	public void removeWarehouse(long id) {
		
		warehouseService.delete(Mapper.mapWarehouseModeltoEntity(getWarehouseModel(id)));
	}
}
