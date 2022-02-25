package com.market.ecommerce1.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.market.ecommerce1.model.CategoryModel;
import com.market.ecommerce1.repo.CategoryRepo;

@Service
@Transactional
public class CategoryService {
	@Autowired
	CategoryRepo categoryrepo;
	
	public CategoryModel saveCategory(CategoryModel category){
		CategoryModel updatedCategory=categoryrepo.save(category);
		return updatedCategory;
	}
	
	public Optional<CategoryModel> getCategoryByID(int catId){
		Optional<CategoryModel> category=categoryrepo.findById(catId);
		return category;
	}
	
}
