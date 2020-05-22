package com.codejek.inventory.management.processor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codejek.inventory.management.entity.ICNStockEntity;
import com.codejek.inventory.management.model.ICNStockModel;
import com.codejek.inventory.management.service.ICNStockService;
import com.codejek.inventory.management.utils.Mapper;

@Component
public class ICNStockProcessor {

	@Autowired
	ICNStockService iCNStockService;
	
	public long addICNStock(ICNStockModel iCNStockModel) {
		
		ICNStockEntity iCNStockEntity = Mapper.mapICNStockModeltoEntity(iCNStockModel);
		Date date = new Date();
//		iCNStockEntity.setCreationTime(date.getTime());
//		iCNStockEntity.setLastModifiedTime(date.getTime());
		
		iCNStockEntity = iCNStockService.create(iCNStockEntity);
		 return iCNStockEntity.getId();
	}
	
	public long modifyICNStock(ICNStockModel iCNStockModel) {
		
		ICNStockEntity iCNStockEntity = Mapper.mapICNStockModeltoEntity(iCNStockModel);
		Date date = new Date();
//		iCNStockEntity.setLastModifiedTime(date.getTime());
		
		iCNStockEntity = iCNStockService.update(iCNStockEntity);
		 return iCNStockEntity.getId();
	}
	
	public ICNStockModel getICNStockModel(long id) {
		
		ICNStockEntity iCNStockEntity = iCNStockService.get(id);
		
		return Mapper.mapICNStockEntitytoModel(iCNStockEntity);
	}
	
	public List<ICNStockModel> findAllICNStocks(){
		
		List <ICNStockEntity> be = iCNStockService.getAll();
		
		List<ICNStockModel> bm = new ArrayList<ICNStockModel>();
		for(ICNStockEntity b : be) {
			bm.add(Mapper.mapICNStockEntitytoModel(b));
		}
		return bm;
	}
	
	public void removeICNStock(long id) {
		
		iCNStockService.delete(Mapper.mapICNStockModeltoEntity(getICNStockModel(id)));
	}
}
