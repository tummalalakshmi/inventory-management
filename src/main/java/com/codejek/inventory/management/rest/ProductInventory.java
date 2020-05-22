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

import com.codejek.inventory.management.model.ProductInventoryModel;
import com.codejek.inventory.management.processor.ProductInventoryProcessor;

@Controller
@RequestMapping(path="/productInventory")
public class ProductInventory {

	private static final Logger log = LoggerFactory.getLogger(ProductInventory.class);
	@Autowired
	ProductInventoryProcessor productInventoryProcessor;
	@PostMapping(path="/")
	public @ResponseBody String addProductInventory (@RequestBody ProductInventoryModel productInventoryModel) {

		log.info("Adding Product Inventory");
		if(productInventoryProcessor.addProductInventory(productInventoryModel)>0){
			return "Saved";
		}
		return "Error";
	}
	
	@PutMapping(path="/")
	public @ResponseBody String modifyProductInventory (@RequestBody ProductInventoryModel productInventoryModel) {

		if(productInventoryProcessor.modifyProductInventory(productInventoryModel)>0){
			return "Modified";
		}
		return "Error";
	}
	
	@GetMapping(path="/")
	public @ResponseBody List<ProductInventoryModel> findAllProductInventorys(){
		
		return productInventoryProcessor.findAllProductInventorys();
	}

	@DeleteMapping(path="/{id}")
	public @ResponseBody void deleteProductInventory(@PathVariable("id") Long id) {
		
		productInventoryProcessor.removeProductInventory(id);
	}
}
