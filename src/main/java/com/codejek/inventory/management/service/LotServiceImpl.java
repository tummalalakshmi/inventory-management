package com.codejek.inventory.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codejek.inventory.management.entity.LotEntity;
import com.codejek.inventory.management.repository.LotRepository;

@Service
@Transactional
public class LotServiceImpl implements LotService{

	@Autowired
	LotRepository lotRepository;
	
	@Override
	public LotEntity create(LotEntity lotEntity) {
		
		return lotRepository.save(lotEntity);
	}

	@Override
	public LotEntity update(LotEntity lotEntity) {
		
		return lotRepository.save(lotEntity);
	}

	@Override
	public LotEntity get(long id) {
		
		return lotRepository.getOne(id);
	}

	@Override
	public List<LotEntity> getAll() {
		
		return lotRepository.findAll();
	}

	@Override
	public void delete(LotEntity lotEntity) {
		
		lotRepository.delete(lotEntity);
	}
}
