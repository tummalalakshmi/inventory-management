package com.codejek.inventory.management.processor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codejek.inventory.management.entity.ProductInventoryEntity;
import com.codejek.inventory.management.model.ProductInventoryModel;
import com.codejek.inventory.management.service.ProductInventoryService;
import com.codejek.inventory.management.utils.Mapper;

@Component
public class ProductInventoryProcessor {

	@Autowired
	ProductInventoryService productInventoryService;
	
	public long addProductInventory(ProductInventoryModel productInventoryModel) {
		
		ProductInventoryEntity productInventoryEntity = Mapper.mapProductInventoryModeltoEntity(productInventoryModel);
		Date date = new Date();
		productInventoryEntity.setCreationTime(date.getTime());
		productInventoryEntity.setLastModifiedTime(date.getTime());
		
		productInventoryEntity = productInventoryService.create(productInventoryEntity);
		 return productInventoryEntity.getId();
	}
	
	public long modifyProductInventory(ProductInventoryModel productInventoryModel) {
		
		ProductInventoryEntity productInventoryEntity = Mapper.mapProductInventoryModeltoEntity(productInventoryModel);
		Date date = new Date();
		productInventoryEntity.setLastModifiedTime(date.getTime());
		
		productInventoryEntity = productInventoryService.update(productInventoryEntity);
		 return productInventoryEntity.getId();
	}
	
	public ProductInventoryModel getProductInventoryModel(long id) {
		
		ProductInventoryEntity productInventoryEntity = productInventoryService.get(id);
		
		return Mapper.mapProductInventoryEntitytoModel(productInventoryEntity);
	}
	
	public List<ProductInventoryModel> findAllProductInventorys(){
		
		List <ProductInventoryEntity> be = productInventoryService.getAll();
		
		List<ProductInventoryModel> bm = new ArrayList<ProductInventoryModel>();
		for(ProductInventoryEntity b : be) {
			bm.add(Mapper.mapProductInventoryEntitytoModel(b));
		}
		return bm;
	}
	
	public void removeProductInventory(long id) {
		
		productInventoryService.delete(Mapper.mapProductInventoryModeltoEntity(getProductInventoryModel(id)));
	}
}
