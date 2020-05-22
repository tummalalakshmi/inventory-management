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

import com.codejek.inventory.management.model.InventoryCollectionNodeModel;
import com.codejek.inventory.management.processor.InventoryCollectionNodeProcessor;

@Controller
@RequestMapping(path="/inventoryCollectionNode")
public class InventoryCollectionNode {

	private static final Logger log = LoggerFactory.getLogger(InventoryCollectionNode.class);
	@Autowired
	InventoryCollectionNodeProcessor inventoryCollectionNodeProcessor;
	@PostMapping(path="/")
	public @ResponseBody String addInventoryCollectionNode (@RequestBody InventoryCollectionNodeModel inventoryCollectionNodeModel) {

		log.info("Adding Product Inventory");
		if(inventoryCollectionNodeProcessor.addInventoryCollectionNode(inventoryCollectionNodeModel)>0){
			return "Saved";
		}
		return "Error";
	}
	
	@PutMapping(path="/")
	public @ResponseBody String modifyInventoryCollectionNode (@RequestBody InventoryCollectionNodeModel inventoryCollectionNodeModel) {

		if(inventoryCollectionNodeProcessor.modifyInventoryCollectionNode(inventoryCollectionNodeModel)>0){
			return "Modified";
		}
		return "Error";
	}
	
	@GetMapping(path="/")
	public @ResponseBody List<InventoryCollectionNodeModel> findAllInventoryCollectionNodes(){
		
		return inventoryCollectionNodeProcessor.findAllInventoryCollectionNodes();
	}

	@DeleteMapping(path="/{id}")
	public @ResponseBody void deleteInventoryCollectionNode(@PathVariable("id") Long id) {
		
		inventoryCollectionNodeProcessor.removeInventoryCollectionNode(id);
	}
}
