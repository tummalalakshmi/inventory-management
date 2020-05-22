package com.codejek.inventory.management.entity;

import org.springframework.validation.annotation.Validated;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@ApiModel(description = "Product")
@Validated
@Data
public class Product {

	private String productName;
	private String productCode;
	private String productDesc;
	private String measurementUnit;
	private String sellerName;
	private String brand;
	private String subCat;
	private int quantity;
	private int price;
}
