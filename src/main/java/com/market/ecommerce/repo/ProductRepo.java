package com.market.ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.market.ecommerce.model.ProductModel;

public interface ProductRepo extends JpaRepository<ProductModel, Integer>{

}
