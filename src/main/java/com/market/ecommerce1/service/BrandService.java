package com.market.ecommerce1.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.market.ecommerce1.model.BrandModel;
import com.market.ecommerce1.repo.BrandRepo;

@Service
@Transactional
public class BrandService {
	@Autowired
	BrandRepo brandrepo;
	
	public BrandModel saveBrand(BrandModel brand){
		BrandModel updatedBrand=brandrepo.save(brand);
		return updatedBrand;		
	}
	
	public Optional<BrandModel> getBrandById(int brandId){
		Optional<BrandModel> brand=brandrepo.findById(brandId);
		return brand;
		
	}
	

}
