package com.codejek.inventory.management.processor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codejek.inventory.management.entity.LotEntity;
import com.codejek.inventory.management.model.LotModel;
import com.codejek.inventory.management.service.LotService;
import com.codejek.inventory.management.utils.Mapper;

@Component
public class LotProcessor {

	@Autowired
	LotService lotService;
	
	public long addLot(LotModel lotModel) {
		
		LotEntity lotEntity = Mapper.mapLotModeltoEntity(lotModel);
		Date date = new Date();
//		lotEntity.setCreationTime(date.getTime());
//		lotEntity.setLastModifiedTime(date.getTime());
		
		lotEntity = lotService.create(lotEntity);
		 return lotEntity.getId();
	}
	
	public long modifyLot(LotModel lotModel) {
		
		LotEntity lotEntity = Mapper.mapLotModeltoEntity(lotModel);
		Date date = new Date();
//		lotEntity.setLastModifiedTime(date.getTime());
		
		lotEntity = lotService.update(lotEntity);
		 return lotEntity.getId();
	}
	
	public LotModel getLotModel(long id) {
		
		LotEntity lotEntity = lotService.get(id);
		
		return Mapper.mapLotEntitytoModel(lotEntity);
	}
	
	public List<LotModel> findAllLots(){
		
		List <LotEntity> be = lotService.getAll();
		
		List<LotModel> bm = new ArrayList<LotModel>();
		for(LotEntity b : be) {
			bm.add(Mapper.mapLotEntitytoModel(b));
		}
		return bm;
	}
	
	public void removeLot(long id) {
		
		lotService.delete(Mapper.mapLotModeltoEntity(getLotModel(id)));
	}
}
