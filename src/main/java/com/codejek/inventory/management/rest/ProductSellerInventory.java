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

import com.codejek.inventory.management.model.ProductSellerInventoryModel;
import com.codejek.inventory.management.processor.ProductSellerInventoryProcessor;

@Controller
@RequestMapping(path="/productSellerInventory")
public class ProductSellerInventory {

	private static final Logger log = LoggerFactory.getLogger(ProductSellerInventory.class);
	@Autowired
	ProductSellerInventoryProcessor productSellerInventoryProcessor;
	@PostMapping(path="/")
	public @ResponseBody String addProductSellerInventory (@RequestBody ProductSellerInventoryModel productSellerInventoryModel) {

		log.info("Adding Product Inventory");
		if(productSellerInventoryProcessor.addProductSellerInventory(productSellerInventoryModel)>0){
			return "Saved";
		}
		return "Error";
	}
	
	@PutMapping(path="/")
	public @ResponseBody String modifyProductSellerInventory (@RequestBody ProductSellerInventoryModel productSellerInventoryModel) {

		if(productSellerInventoryProcessor.modifyProductSellerInventory(productSellerInventoryModel)>0){
			return "Modified";
		}
		return "Error";
	}
	
	@GetMapping(path="/")
	public @ResponseBody List<ProductSellerInventoryModel> findAllProductSellerInventorys(){
		
		return productSellerInventoryProcessor.findAllProductSellerInventorys();
	}

	@DeleteMapping(path="/{id}")
	public @ResponseBody void deleteProductSellerInventory(@PathVariable("id") Long id) {
		
		productSellerInventoryProcessor.removeProductSellerInventory(id);
	}
}
