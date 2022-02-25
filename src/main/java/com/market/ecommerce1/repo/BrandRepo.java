package com.market.ecommerce1.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.market.ecommerce1.model.BrandModel;


public interface BrandRepo extends MongoRepository<BrandModel, Integer>{
	List<BrandModel> findByIdContaining(int id);
	List<BrandModel> findByEnabled(boolean enabled);

}
