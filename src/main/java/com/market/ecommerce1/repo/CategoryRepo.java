package com.market.ecommerce1.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.market.ecommerce1.model.CategoryModel;

public interface CategoryRepo extends MongoRepository<CategoryModel, Integer>{
		List<CategoryModel> findByIdContaining(int id);
		List<CategoryModel> findByEnabled(boolean enabled);

}
