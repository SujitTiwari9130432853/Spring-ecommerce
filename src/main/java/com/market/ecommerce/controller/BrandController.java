package com.market.ecommerce.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.market.ecommerce.model.BrandModel;
import com.market.ecommerce.service.BrandService;


@RestController
@RequestMapping
public class BrandController {
	@Autowired
	BrandService brandservice;
	@PostMapping("/brand")
	public BrandModel addBrand(@RequestBody BrandModel b1){
		BrandModel addedBrand=brandservice.saveBrand(b1);
		return addedBrand;
		
	}
	
	@GetMapping("/brand/{id}")
	public Optional<BrandModel> getBrand(@PathVariable int id){
		Optional<BrandModel> brand=brandservice.getBrandById(id);
		return brand;
	}
	
	@GetMapping("allbrand")
	public List<BrandModel> allBrand(@RequestBody BrandModel b1){
		List<BrandModel> allBrand=brandservice.allBrand(b1);
		return allBrand;
		
	}

}
