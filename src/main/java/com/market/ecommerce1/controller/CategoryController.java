package com.market.ecommerce1.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.market.ecommerce1.model.CategoryModel;
import com.market.ecommerce1.service.CategoryService;

@RestController
@RequestMapping
public class CategoryController {
	@Autowired
	CategoryService categoryservice;
	
	@PostMapping("/cat1")
	public CategoryModel addCategory(@RequestBody CategoryModel c1){
		CategoryModel addedCategory=categoryservice.saveCategory(c1);
		return addedCategory;
	}
	
	@GetMapping("cat/{id}")
	public Optional<CategoryModel> getCategory(@PathVariable int id){
		Optional<CategoryModel> category=categoryservice.getCategoryByID(id);
		return category;
	}
	
	@PutMapping("/category/{id}")
	public Optional<CategoryModel> updateCategory(@PathVariable int id, @RequestBody CategoryModel category){
		Optional<CategoryModel> category1=categoryservice.getCategoryByID(id);
		return category1;
		
		
	}
	

}
