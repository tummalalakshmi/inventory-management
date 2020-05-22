package com.codejek.inventory.management.service;

import java.util.List;

import com.codejek.inventory.management.entity.ICNStockEntity;

public interface ICNStockService {

	public ICNStockEntity create(ICNStockEntity iCNStockEntity);
	public ICNStockEntity update(ICNStockEntity iCNStockEntity);
	public ICNStockEntity get(long id);
	public List<ICNStockEntity> getAll();
	public void delete(ICNStockEntity iCNStockEntity);
}
