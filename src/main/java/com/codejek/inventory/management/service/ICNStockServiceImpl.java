package com.codejek.inventory.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codejek.inventory.management.entity.ICNStockEntity;
import com.codejek.inventory.management.repository.ICNStockRepository;

@Service
@Transactional
public class ICNStockServiceImpl implements ICNStockService{

	@Autowired
	ICNStockRepository iCNStockRepository;
	
	@Override
	public ICNStockEntity create(ICNStockEntity iCNStockEntity) {
		
		return iCNStockRepository.save(iCNStockEntity);
	}

	@Override
	public ICNStockEntity update(ICNStockEntity iCNStockEntity) {
		
		return iCNStockRepository.save(iCNStockEntity);
	}

	@Override
	public ICNStockEntity get(long id) {
		
		return iCNStockRepository.getOne(id);
	}

	@Override
	public List<ICNStockEntity> getAll() {
		
		return iCNStockRepository.findAll();
	}

	@Override
	public void delete(ICNStockEntity iCNStockEntity) {
		
		iCNStockRepository.delete(iCNStockEntity);
	}
}
