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

import com.market.ecommerce.model.ProductModel;
import com.market.ecommerce.service.ProductService;



@RestController
@RequestMapping
public class ProductController {
	@Autowired
	ProductService productservice;
	@PostMapping("/product")
	public ProductModel addModel(@RequestBody ProductModel p1){
		ProductModel addedProduct=productservice.saveProduct1(p1);
		return addedProduct;
	}
	
	@GetMapping("/product/{id}")
	public Optional<ProductModel> getProduct(@PathVariable int id){
		Optional<ProductModel> product=productservice.getProductById(id);
		return product;
		
	}
	
	@GetMapping("allproduct")
	public List<ProductModel> allProduct(@RequestBody ProductModel productmodel){
		List<ProductModel> allProduct=productservice.allProduct(productmodel);
		return allProduct;
	}

}
