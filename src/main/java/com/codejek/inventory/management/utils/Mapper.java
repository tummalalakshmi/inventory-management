package com.codejek.inventory.management.utils;

import java.util.ArrayList;
import java.util.List;

import com.codejek.inventory.management.entity.ICNStockEntity;
import com.codejek.inventory.management.entity.InventoryCollectionNodeEntity;
import com.codejek.inventory.management.entity.LotEntity;
import com.codejek.inventory.management.entity.ProductEntity;
import com.codejek.inventory.management.entity.ProductInventoryEntity;
import com.codejek.inventory.management.entity.ProductSellerInventoryEntity;
import com.codejek.inventory.management.entity.WarehouseEntity;
import com.codejek.inventory.management.model.ICNStockModel;
import com.codejek.inventory.management.model.InventoryCollectionNodeModel;
import com.codejek.inventory.management.model.LotModel;
import com.codejek.inventory.management.model.ProductInventoryModel;
import com.codejek.inventory.management.model.ProductModel;
import com.codejek.inventory.management.model.ProductSellerInventoryModel;
import com.codejek.inventory.management.model.WarehouseModel;

public class Mapper {

	
	public static InventoryCollectionNodeEntity mapInventoryCollectionNodeModeltoEntity(InventoryCollectionNodeModel inventoryCollectionNodeModel) {
		
		InventoryCollectionNodeEntity inventoryCollectionNodeEntity = new InventoryCollectionNodeEntity();
		inventoryCollectionNodeEntity.setName(inventoryCollectionNodeModel.getName());
		inventoryCollectionNodeEntity.setContactName(inventoryCollectionNodeModel.getContactName());
		inventoryCollectionNodeEntity.setCreationTime(inventoryCollectionNodeModel.getCreationTime());
		inventoryCollectionNodeEntity.setId(inventoryCollectionNodeModel.getId());
		inventoryCollectionNodeEntity.setLastModifiedTime(inventoryCollectionNodeModel.getLastModifiedTime());
		inventoryCollectionNodeEntity.setPhone(inventoryCollectionNodeModel.getPhone());
		return inventoryCollectionNodeEntity;
	}
	
	public static InventoryCollectionNodeModel mapInventoryCollectionNodeEntitytoModel(InventoryCollectionNodeEntity inventoryCollectionNodeEntity) {
		
		InventoryCollectionNodeModel inventoryCollectionNodeModel = new InventoryCollectionNodeModel();
		inventoryCollectionNodeModel.setId(inventoryCollectionNodeEntity.getId());
		inventoryCollectionNodeModel.setName(inventoryCollectionNodeEntity.getName());inventoryCollectionNodeEntity.setContactName(inventoryCollectionNodeModel.getContactName());
		inventoryCollectionNodeModel.setCreationTime(inventoryCollectionNodeEntity.getCreationTime());
		inventoryCollectionNodeModel.setLastModifiedTime(inventoryCollectionNodeEntity.getLastModifiedTime());
		inventoryCollectionNodeModel.setPhone(inventoryCollectionNodeEntity.getPhone());
		return inventoryCollectionNodeModel;
	}
	
	public static LotEntity mapLotModeltoEntity(LotModel lotModel) {
		
		LotEntity lotEntity = new LotEntity();
		lotEntity.setBarCode(lotModel.getBarCode());
		lotEntity.setEntryTime(lotModel.getEntryTime());
		lotEntity.setId(lotModel.getId());
		lotEntity.setLastModifiedTime(lotModel.getLastModifiedTime());
		lotEntity.setWarehouseEntity(mapWarehouseModeltoEntity(lotModel.getWarehouse()));
		return lotEntity;
	}
	
	public static LotModel mapLotEntitytoModel(LotEntity lotEntity) {
		
		LotModel lotModel = new LotModel();
		lotModel.setId(lotEntity.getId());
		lotModel.setBarCode(lotEntity.getBarCode());
		lotModel.setEntryTime(lotEntity.getEntryTime());
		lotModel.setLastModifiedTime(lotEntity.getLastModifiedTime());
		lotModel.setWarehouse(mapWarehouseEntitytoModel(lotEntity.getWarehouseEntity()));
		return lotModel;
	}
	
	public static ProductInventoryEntity mapProductInventoryModeltoEntity(ProductInventoryModel productInventoryModel) {
		
		ProductInventoryEntity productInventoryEntity = new ProductInventoryEntity();
		productInventoryEntity.setId(productInventoryModel.getId());
		productInventoryEntity.setCostPerUnit(productInventoryModel.getCostPerUnit());
		productInventoryEntity.setCreationTime(productInventoryModel.getCreationTime());
		productInventoryEntity.setCurrentQuantity(productInventoryModel.getCurrentQuantity());
		productInventoryEntity.setDamagedQuantity(productInventoryModel.getDamagedQuantity());
		productInventoryEntity.setGrade(productInventoryModel.getGrade());
		productInventoryEntity.setId(productInventoryModel.getId());
		productInventoryEntity.setLastModifiedTime(productInventoryModel.getLastModifiedTime());
		productInventoryEntity.setOpenQuantity(productInventoryModel.getOpenQuantity());
		productInventoryEntity.setProduct(mapProductModeltoEntity(productInventoryModel.getProduct()));
		productInventoryEntity.setProductName(productInventoryEntity.getProduct().getName());
		productInventoryEntity.setProInvCode(productInventoryModel.getProInvCode());
		productInventoryEntity.setSoldQuantity(productInventoryEntity.getSoldQuantity());
		productInventoryEntity.setStatus(productInventoryModel.getStatus());
		productInventoryEntity.setWarehouseEntity(mapWarehouseModeltoEntity(productInventoryModel.getWarehouse()));
		productInventoryEntity.setWarehouseName(productInventoryEntity.getWarehouseEntity().getWarehouseName());
		return productInventoryEntity;
	}
	
	public static ProductInventoryModel mapProductInventoryEntitytoModel(ProductInventoryEntity productInventoryEntity) {
		
		ProductInventoryModel productInventoryModel = new ProductInventoryModel();
		productInventoryModel.setId(productInventoryEntity.getId());
		productInventoryModel.setCostPerUnit(productInventoryEntity.getCostPerUnit());
		productInventoryModel.setCreationTime(productInventoryEntity.getCreationTime());
		productInventoryModel.setCurrentQuantity(productInventoryEntity.getCurrentQuantity());
		productInventoryModel.setDamagedQuantity(productInventoryEntity.getDamagedQuantity());
		productInventoryModel.setGrade(productInventoryEntity.getGrade());
		productInventoryModel.setId(productInventoryEntity.getId());
		productInventoryModel.setLastModifiedTime(productInventoryEntity.getLastModifiedTime());
		productInventoryModel.setOpenQuantity(productInventoryEntity.getOpenQuantity());
		productInventoryModel.setProduct(mapProductEntitytoModel(productInventoryEntity.getProduct()));
		productInventoryModel.setProductName(productInventoryEntity.getProductName());
		productInventoryModel.setProInvCode(productInventoryEntity.getProInvCode());
		productInventoryModel.setSoldQuantity(productInventoryEntity.getSoldQuantity());
		productInventoryModel.setStatus(productInventoryEntity.getStatus());
		productInventoryModel.setWarehouse(mapWarehouseEntitytoModel(productInventoryEntity.getWarehouseEntity()));
		productInventoryModel.setWarehouseName(productInventoryEntity.getWarehouseName());
		return productInventoryModel;
	}
	
	public static ProductEntity mapProductModeltoEntity(ProductModel productModel) {
		
		ProductEntity productEntity = new ProductEntity();
		productEntity.setId(productModel.getId());
		productEntity.setBrand(productModel.getBrand());
		productEntity.setCode(productModel.getCode());
		productEntity.setCreationTime(productModel.getCreationTime());
		productEntity.setLastModifiedTime(productModel.getLastModifiedTime());
		productEntity.setLongDesc(productModel.getLongDesc());
		productEntity.setMeasurementUnit(productModel.getMeasurementUnit());
		productEntity.setName(productModel.getName());
		productEntity.setShortDesc(productModel.getShortDesc());
		productEntity.setSubCat(productModel.getSubCategory());
		return productEntity;
	}
	
	public static ProductModel mapProductEntitytoModel(ProductEntity productEntity) {
		
		ProductModel productModel = new ProductModel();
		productModel.setId(productEntity.getId());
		productModel.setBrand(productEntity.getBrand());
		productModel.setCode(productEntity.getCode());
		productModel.setCreationTime(productEntity.getCreationTime());
		productModel.setLastModifiedTime(productEntity.getLastModifiedTime());
		productModel.setLongDesc(productEntity.getLongDesc());
		productModel.setMeasurementUnit(productEntity.getMeasurementUnit());
		productModel.setName(productEntity.getName());
		productModel.setShortDesc(productEntity.getShortDesc());
		productModel.setSubCategory(productEntity.getSubCat());
		return productModel;
	}

	public static ProductSellerInventoryModel mapProductSellerInventoryEntitytoModel(
			ProductSellerInventoryEntity productSellerInventoryEntity) {
		
		ProductSellerInventoryModel productSellerInventoryModel = new ProductSellerInventoryModel();
		productSellerInventoryModel.setApprovedQuantity(productSellerInventoryEntity.getApprovedQuantity());
		productSellerInventoryModel.setCollectedQuantity(productSellerInventoryEntity.getCollectedQuantity());
		productSellerInventoryModel.setCostPerUnit(productSellerInventoryEntity.getCostPerUnit());
		productSellerInventoryModel.setCreationTime(productSellerInventoryEntity.getCreationTime());
		productSellerInventoryModel.setId(productSellerInventoryEntity.getId());
		productSellerInventoryModel.setLastModifiedTime(productSellerInventoryEntity.getLastModifiedTime());
		productSellerInventoryModel.setProduct(mapProductEntitytoModel(productSellerInventoryEntity.getProduct()));
		productSellerInventoryModel.setStatus(productSellerInventoryEntity.getStatus());
		return productSellerInventoryModel;
	}

	public static ProductSellerInventoryEntity mapProductSellerInventoryModeltoEntity(
			ProductSellerInventoryModel productSellerInventoryModel) {
		
		ProductSellerInventoryEntity productSellerInventoryEntity = new ProductSellerInventoryEntity();
		productSellerInventoryEntity.setApprovedQuantity(productSellerInventoryModel.getApprovedQuantity());
		productSellerInventoryEntity.setCollectedQuantity(productSellerInventoryModel.getCollectedQuantity());
		productSellerInventoryEntity.setCostPerUnit(productSellerInventoryModel.getCostPerUnit());
		productSellerInventoryEntity.setCreationTime(productSellerInventoryModel.getCreationTime());
		productSellerInventoryEntity.setId(productSellerInventoryModel.getId());
		productSellerInventoryEntity.setLastModifiedTime(productSellerInventoryModel.getLastModifiedTime());
		productSellerInventoryEntity.setProduct(mapProductModeltoEntity(productSellerInventoryModel.getProduct()));
		productSellerInventoryEntity.setStatus(productSellerInventoryModel.getStatus());
		return productSellerInventoryEntity;
	}

	public static WarehouseModel mapWarehouseEntitytoModel(WarehouseEntity warehouseEntity) {

		WarehouseModel warehouseModel = new WarehouseModel();
		warehouseModel.setWarehouseName(warehouseEntity.getWarehouseName());
		warehouseModel.setAddress(warehouseEntity.getAddress());
		warehouseModel.setContactPerson(warehouseEntity.getContactPerson());
		warehouseModel.setCreationTime(warehouseEntity.getCreationTime());
		warehouseModel.setId(warehouseEntity.getId());
		warehouseModel.setLastModifiedTime(warehouseEntity.getLastModifiedTime());
		warehouseModel.setWarehouseName(warehouseEntity.getWarehouseName());
		return warehouseModel;
	}

	public static WarehouseEntity mapWarehouseModeltoEntity(WarehouseModel warehouseModel) {

		WarehouseEntity warehouseEntity = new WarehouseEntity();
		warehouseEntity.setWarehouseName(warehouseModel.getWarehouseName());
		warehouseEntity.setAddress(warehouseModel.getAddress());
		warehouseEntity.setContactPerson(warehouseModel.getContactPerson());
		warehouseEntity.setCreationTime(warehouseModel.getCreationTime());
		warehouseEntity.setId(warehouseModel.getId());
		warehouseEntity.setLastModifiedTime(warehouseModel.getLastModifiedTime());
		warehouseEntity.setWarehouseName(warehouseModel.getWarehouseName());
		return warehouseEntity;
	}

	public static ICNStockModel mapICNStockEntitytoModel(ICNStockEntity iCNStockEntity) {

		ICNStockModel icnStockModel = new ICNStockModel();
		icnStockModel.setAdvStockRecNum(iCNStockEntity.getAdvStockRecNum());
		icnStockModel.setCreationTime(iCNStockEntity.getCreationTime());
		icnStockModel.setId(iCNStockEntity.getId());
		icnStockModel.setInventoryCollNode(mapInventoryCollectionNodeEntitytoModel(iCNStockEntity.getInventoryCollNode()));
		icnStockModel.setLastModifiedTime(iCNStockEntity.getLastModifiedTime());
		icnStockModel.setLot(mapLotEntitytoModel(iCNStockEntity.getLotEntity()));
		icnStockModel.setSellerName(iCNStockEntity.getSellerName());
		icnStockModel.setStatus(iCNStockEntity.getStatus());
		List<ProductSellerInventoryModel> pm = new ArrayList<ProductSellerInventoryModel>();
		for(ProductSellerInventoryEntity p : iCNStockEntity.getProductList()) {
			pm.add(mapProductSellerInventoryEntitytoModel(p));
		}
		icnStockModel.setProductList(pm);
		return icnStockModel;
	}

	public static ICNStockEntity mapICNStockModeltoEntity(ICNStockModel icnStockModel) {

		ICNStockEntity iCNStockEntity = new ICNStockEntity();
		iCNStockEntity.setAdvStockRecNum(icnStockModel.getAdvStockRecNum());
		iCNStockEntity.setCreationTime(icnStockModel.getCreationTime());
		iCNStockEntity.setId(icnStockModel.getId());
		iCNStockEntity.setInventoryCollNode(mapInventoryCollectionNodeModeltoEntity(icnStockModel.getInventoryCollNode()));
		iCNStockEntity.setLastModifiedTime(icnStockModel.getLastModifiedTime());
		iCNStockEntity.setLotEntity(mapLotModeltoEntity(icnStockModel.getLot()));
		iCNStockEntity.setSellerName(icnStockModel.getSellerName());
		iCNStockEntity.setStatus(icnStockModel.getStatus());
		List<ProductSellerInventoryEntity> pm = new ArrayList<ProductSellerInventoryEntity>();
		for(ProductSellerInventoryModel p : icnStockModel.getProductList()) {
			pm.add(mapProductSellerInventoryModeltoEntity(p));
		}
		iCNStockEntity.setProductList(pm);
		return iCNStockEntity;
	}
}
