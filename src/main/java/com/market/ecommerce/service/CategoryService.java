package com.market.ecommerce.service;


import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.market.ecommerce.exception.InvalidException;
import com.market.ecommerce.exception.NotFoundException;
import com.market.ecommerce.exception.NotInStockException;
import com.market.ecommerce.exception.RepeatException;
import com.market.ecommerce.model.CategoryModel;
import com.market.ecommerce.repo.CategoryRepo;


@Service
@Transactional
public class CategoryService {
	@Autowired
	CategoryRepo categoryrepo;
	
	
	public CategoryModel saveCategory(CategoryModel category){
		CategoryModel updatedCategory=categoryrepo.save(category);
		return updatedCategory;
	}
	
	public Optional<CategoryModel> getCategoryById(int catID){
		Optional<CategoryModel> category=categoryrepo.findById(catID);
		return category;
	}
	
	public List<CategoryModel> allCategory(CategoryModel category){
		List<CategoryModel> categorymodel=categoryrepo.findAll();
		return categorymodel;
	}
	
	public CategoryModel saveCategory1(CategoryModel category){
		if(category.getName().isEmpty()){
			String m1 = "It Can Not Be Null";
			throw new NotFoundException(m1);
		}else{
		CategoryModel updatedCategory=categoryrepo.save(category);
		return updatedCategory;
		}
	}
	
	public CategoryModel saveCategory2(CategoryModel category){
		if(category.getName()==null){
			String m2 = "NOT IN STOCK (OUT OF STOCK)";
			throw new NotInStockException(m2);
		}else{
			CategoryModel getCategory=categoryrepo.save(category);
			return getCategory; 
		}
	}
	
	public CategoryModel updateCategory(@PathVariable int id, @RequestBody CategoryModel category){
		Optional<CategoryModel> category1=categoryrepo.findById(id);
		if (category1.isPresent()) {
			CategoryModel cat=category1.get();
			cat.setId(category.getId());
			cat.setName(category.getName());
			cat.setAlias(category.getAlias());
			cat.setEnabled(false);
			
		}
		return category;
	}
	
	

}