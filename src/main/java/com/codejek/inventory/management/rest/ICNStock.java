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

import com.codejek.inventory.management.model.ICNStockModel;
import com.codejek.inventory.management.processor.ICNStockProcessor;

@Controller
@RequestMapping(path="/iCNStock")
public class ICNStock {

	private static final Logger log = LoggerFactory.getLogger(ICNStock.class);
	@Autowired
	ICNStockProcessor iCNStockProcessor;
	@PostMapping(path="/")
	public @ResponseBody String addICNStock (@RequestBody ICNStockModel iCNStockModel) {

		log.info("Adding Product Inventory");
		if(iCNStockProcessor.addICNStock(iCNStockModel)>0){
			return "Saved";
		}
		return "Error";
	}
	
	@PutMapping(path="/")
	public @ResponseBody String modifyICNStock (@RequestBody ICNStockModel iCNStockModel) {

		if(iCNStockProcessor.modifyICNStock(iCNStockModel)>0){
			return "Modified";
		}
		return "Error";
	}
	
	@GetMapping(path="/")
	public @ResponseBody List<ICNStockModel> findAllICNStocks(){
		
		return iCNStockProcessor.findAllICNStocks();
	}

	@DeleteMapping(path="/{id}")
	public @ResponseBody void deleteICNStock(@PathVariable("id") Long id) {
		
		iCNStockProcessor.removeICNStock(id);
	}
}
