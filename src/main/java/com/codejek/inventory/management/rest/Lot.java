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

import com.codejek.inventory.management.model.LotModel;
import com.codejek.inventory.management.processor.LotProcessor;

@Controller
@RequestMapping(path="/lot")
public class Lot {

	private static final Logger log = LoggerFactory.getLogger(Lot.class);
	@Autowired
	LotProcessor lotProcessor;
	@PostMapping(path="/")
	public @ResponseBody String addLot (@RequestBody LotModel lotModel) {

		log.info("Adding Product Inventory");
		if(lotProcessor.addLot(lotModel)>0){
			return "Saved";
		}
		return "Error";
	}
	
	@PutMapping(path="/")
	public @ResponseBody String modifyLot (@RequestBody LotModel lotModel) {

		if(lotProcessor.modifyLot(lotModel)>0){
			return "Modified";
		}
		return "Error";
	}
	
	@GetMapping(path="/")
	public @ResponseBody List<LotModel> findAllLots(){
		
		return lotProcessor.findAllLots();
	}

	@DeleteMapping(path="/{id}")
	public @ResponseBody void deleteLot(@PathVariable("id") Long id) {
		
		lotProcessor.removeLot(id);
	}
}
