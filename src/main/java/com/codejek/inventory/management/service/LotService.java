package com.codejek.inventory.management.service;

import java.util.List;

import com.codejek.inventory.management.entity.LotEntity;

public interface LotService {

	public LotEntity create(LotEntity lotEntity);
	public LotEntity update(LotEntity lotEntity);
	public LotEntity get(long id);
	public List<LotEntity> getAll();
	public void delete(LotEntity lotEntity);
}
