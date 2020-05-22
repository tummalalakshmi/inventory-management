package com.codejek.inventory.management.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.codejek.inventory.management.model.WarehouseModel;
import com.codejek.inventory.management.processor.WarehouseProcessor;

@Controller
@RequestMapping(path="/warehouse")
public class Warehouse {

	private static final Logger log = LoggerFactory.getLogger(Warehouse.class);
	@Autowired
	WarehouseProcessor warehouseProcessor;
	@PostMapping(path="/")
	public @ResponseBody String addWarehouse (@RequestBody WarehouseModel warehouseModel) {

		log.info("Adding Product Inventory");
		if(warehouseProcessor.addWarehouse(warehouseModel)>0){
			return "Saved";
		}
		return "Error";
	}
	
	@PutMapping(path="/")
	public @ResponseBody String modifyWarehouse (@RequestBody WarehouseModel warehouseModel) {

		if(warehouseProcessor.modifyWarehouse(warehouseModel)>0){
			return "Modified";
		}
		return "Error";
	}
	
	@GetMapping(path="/")
	public @ResponseBody List<WarehouseModel> findAllWarehouses(){
		
		return warehouseProcessor.findAllWarehouses();
	}

	@DeleteMapping(path="/{id}")
	public @ResponseBody void deleteWarehouse(@PathVariable("id") Long id) {
		
		warehouseProcessor.removeWarehouse(id);
	}
}
