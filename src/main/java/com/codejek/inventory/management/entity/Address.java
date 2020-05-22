package com.codejek.inventory.management.entity;

import org.springframework.validation.annotation.Validated;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@ApiModel(description = "Address")
@Validated
@Data
public class Address {

	private long id;
	private String country;
	private String state;
	private long pinCode;
	private String district;
	private String addressDetails;
	private String location;
}
