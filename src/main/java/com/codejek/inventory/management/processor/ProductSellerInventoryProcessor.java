package com.codejek.inventory.management.processor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codejek.inventory.management.entity.ProductSellerInventoryEntity;
import com.codejek.inventory.management.model.ProductSellerInventoryModel;
import com.codejek.inventory.management.service.ProductSellerInventoryService;
import com.codejek.inventory.management.utils.Mapper;

@Component
public class ProductSellerInventoryProcessor {

	@Autowired
	ProductSellerInventoryService productSellerInventoryService;
	
	public long addProductSellerInventory(ProductSellerInventoryModel productSellerInventoryModel) {
		
		ProductSellerInventoryEntity productSellerInventoryEntity = Mapper.mapProductSellerInventoryModeltoEntity(productSellerInventoryModel);
		Date date = new Date();
//		productSellerInventoryEntity.setCreationTime(date.getTime());
//		productSellerInventoryEntity.setLastModifiedTime(date.getTime());
		
		productSellerInventoryEntity = productSellerInventoryService.create(productSellerInventoryEntity);
		 return productSellerInventoryEntity.getId();
	}
	
	public long modifyProductSellerInventory(ProductSellerInventoryModel productSellerInventoryModel) {
		
		ProductSellerInventoryEntity productSellerInventoryEntity = Mapper.mapProductSellerInventoryModeltoEntity(productSellerInventoryModel);
		Date date = new Date();
//		productSellerInventoryEntity.setLastModifiedTime(date.getTime());
		
		productSellerInventoryEntity = productSellerInventoryService.update(productSellerInventoryEntity);
		 return productSellerInventoryEntity.getId();
	}
	
	public ProductSellerInventoryModel getProductSellerInventoryModel(long id) {
		
		ProductSellerInventoryEntity productSellerInventoryEntity = productSellerInventoryService.get(id);
		
		return Mapper.mapProductSellerInventoryEntitytoModel(productSellerInventoryEntity);
	}
	
	public List<ProductSellerInventoryModel> findAllProductSellerInventorys(){
		
		List <ProductSellerInventoryEntity> be = productSellerInventoryService.getAll();
		
		List<ProductSellerInventoryModel> bm = new ArrayList<ProductSellerInventoryModel>();
		for(ProductSellerInventoryEntity b : be) {
			bm.add(Mapper.mapProductSellerInventoryEntitytoModel(b));
		}
		return bm;
	}
	
	public void removeProductSellerInventory(long id) {
		
		productSellerInventoryService.delete(Mapper.mapProductSellerInventoryModeltoEntity(getProductSellerInventoryModel(id)));
	}
}
