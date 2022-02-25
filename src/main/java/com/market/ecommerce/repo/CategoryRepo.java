package com.market.ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.market.ecommerce.model.CategoryModel;

public interface CategoryRepo extends JpaRepository<CategoryModel, Integer>{

}
