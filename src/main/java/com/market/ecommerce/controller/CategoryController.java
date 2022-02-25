package com.market.ecommerce.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.market.ecommerce.exception.NotNullException;
import com.market.ecommerce.model.CategoryModel;
import com.market.ecommerce.repo.CategoryRepo;
import com.market.ecommerce.service.CategoryService;

@RestController
@RequestMapping
public class CategoryController {
	@Autowired
	CategoryService categoryservice; 
	
	
	@PostMapping("/cat")
	public CategoryModel addCategory(@RequestBody CategoryModel c1){
		CategoryModel addedCategory=categoryservice.saveCategory1(c1);
		return addedCategory;
	}
	
	@GetMapping("/cat/get/{id}")
	public Optional<CategoryModel> getCategory(@PathVariable int id){
		Optional<CategoryModel> category=categoryservice.getCategoryById(id);
		return category;
	
	}
	
	@GetMapping("allcat")
	public List<CategoryModel> allCategory(@RequestBody CategoryModel c2){
		List<CategoryModel> allCategory=categoryservice.allCategory(c2);
		return allCategory;
		
	}
	

	@GetMapping("cat/{id}")
	public ResponseEntity<Object> nfe(@RequestBody CategoryModel model, @PathVariable int id){
		if(model==null)throw new NotNullException(null);
		return new ResponseEntity<Object>("No Data Found", HttpStatus.BAD_REQUEST);
		
	}
	
	

	
	
	
	
//	@GetMapping("cat/see/{id}")
//	public CategoryModel nis(@RequestBody CategoryModel model){
//		CategoryModel category=categoryservice.saveCategory2(model);
//		return category;
//	}
	
	
	
	
//	@GetMapping("cat/{name}")
//	public String getByName(@PathVariable String name){
//		String catName=categoryservice.getByName(name);
//		return catName;
//	}
//	

	
	
//	@GetMapping("/cat/{id}")
//	public ResponseEntity<Object> nfe(@RequestBody CategoryModel categorymodel){
//		if(categorymodel.getId()==0) throw new NotFoundException();
//		return new ResponseEntity<>("Required Category has not found, please enter valid Id",HttpStatus.BAD_REQUEST); 
//	}
//	public Optional<CategoryModel> getCategory(@PathVariable int id){
//		Optional<CategoryModel> category=categoryservice.getCategoryById(id);
//		return category;
//	}
	
//}


//
//		@GetMapping("cat/{id}")
//		public Optional<CategoryModel> getID(@PathVariable int id){
//			try {
//				Optional<CategoryModel> model=categoryservice.getCategoryById(id);
//				System.out.println(model);
//				if(model==null)throw new NotFoundException("NO DATA FOUND",HttpStatus.NOT_FOUND);
//			} catch (Exception e) {
//				throw new NotFoundException("NO DATA FOUND", HttpStatus.NOT_FOUND);
//			}
//			return categoryservice.getCategoryById(id);
//		}


//	@GetMapping("cat/{id}")
//	public Optional<CategoryModel> efID(@PathVariable int id){
//		Optional<CategoryModel> cm=categoryservice.getCategoryById(id);
//		if(cm.get().getName()==null)
//			throw new NotFoundException("Not Found Any Data"+id);
//		return cm;
//		
//	}


}

