package com.market.ecommerce.repo;

//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.market.ecommerce.model.BrandModel;

@Repository
public interface BrandRepo extends JpaRepository<BrandModel, Integer>{
	
//	@Query("Select b from brand b wHERE b.name=?1")
//	public Optional<BrandModel> getBrandByName(String name);
//	
}
