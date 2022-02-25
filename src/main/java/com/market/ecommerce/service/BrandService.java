package com.market.ecommerce.service;

import java.util.List;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.market.ecommerce.exception.NotFoundException;
import com.market.ecommerce.model.BrandModel;
import com.market.ecommerce.model.CategoryModel;
import com.market.ecommerce.repo.BrandRepo;
import com.market.ecommerce.repo.CategoryRepo;

@Service
@Transactional
public class BrandService {
	@Autowired
	BrandRepo brandrepo;
	
//	@Autowired
//	CategoryRepo categoryrepo;
//	
//	public BrandModel savebrand(BrandModel brand){
//		Optional<BrandModel> brand1=brandrepo.getBrandByName(brand.getName());
//		if(brand1.isPresent()){
//			String m2="Brand Already exist, Please check for other!!";
//			throw new NotFoundException(m2);
//		}
//		Optional<CategoryModel> category1=categoryrepo.findById(brand.getId());
//		if(brand.getLogo().isEmpty() || brand.getName().isEmpty()){
//			String m3="It is not Applicable";
//			throw new NotFoundException(m3);
//		}
//		if(brand.getId()<0){
//			String m4="Id found to be illegal, it mustnot be negative";
//			throw new NotFoundException(m4);
//		}
//		if(category1.isPresent()){
//			BrandModel brand2=brandrepo.save(brand);
//			return brand2;
//		}else{
//			String m5="Parent Category is not Present in database";
//			throw new NotFoundException(m5);
//		}
//	}
	
	public BrandModel saveBrand(BrandModel brandmodel){
		BrandModel updatedBrand=brandrepo.save(brandmodel);
		return updatedBrand;	
	}
	public Optional<BrandModel> getBrandById(int BrandId){
		Optional<BrandModel> brand=brandrepo.findById(BrandId);
		return brand;
	}
	public List<BrandModel> allBrand(BrandModel brand){
		List<BrandModel> brandmodel=brandrepo.findAll();
		return brandmodel;
	}
	
	
	public BrandModel saveBrand1(BrandModel brand){
		if(brand.getName().isEmpty()){
			String m1="The Data Found To Be Null, please check the value you entered!!";
			throw new NotFoundException(m1);
		}else{
			BrandModel updatedBrand=brandrepo.save(brand);
		return updatedBrand;
		}
	}
	
	public BrandModel updatedBrand(@PathVariable int id, @RequestBody BrandModel brand){
		Optional<BrandModel> brand1=brandrepo.findById(id);
		if (brand1.isPresent()) {
			
		BrandModel br=brand1.get();
		br.setId(brand.getId());
		br.setName(brand.getName());
		br.setLogo(brand.getLogo());
		br.setCategories(brand.getCategories());
		
		brandrepo.save(br);
	}
		return brand;
	}
	
	

}
