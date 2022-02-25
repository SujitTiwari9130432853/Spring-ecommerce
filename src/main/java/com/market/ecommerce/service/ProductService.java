package com.market.ecommerce.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.market.ecommerce.exception.NotFoundException;
import com.market.ecommerce.model.ProductModel;
import com.market.ecommerce.repo.ProductRepo;



@Service
@Transactional
public class ProductService {
	@Autowired
	ProductRepo productrepo;
	public ProductModel saveProduct(ProductModel productmodel){
		ProductModel updatedProduct = productrepo.save(productmodel);
		return updatedProduct;
	}
	
	public Optional<ProductModel> getProductById(int productId){
		Optional<ProductModel> product=productrepo.findById(productId);
		return product;
		
	}
	
	public List<ProductModel> allProduct(ProductModel productmodel){
		List<ProductModel> productModel=productrepo.findAll();
		return productModel;
		
	}
	
	public ProductModel saveProduct1(ProductModel product){
		if (product.getName().isEmpty()) {
			String m1="The Product Is Found to be Null";
			throw new NotFoundException(m1);
		} else {
			ProductModel updatedProduct=productrepo.save(product);
			return updatedProduct;
		}
	}
	
	public ProductModel updateProduct(@PathVariable int id, @RequestBody ProductModel product){
		Optional<ProductModel> product1=productrepo.findById(id);
		if (product1.isPresent()) {
			
			ProductModel pr=product1.get();
			pr.setId(product.getId());
			pr.setName(product.getName());
			pr.setImages(product.getImages());
			pr.setDescription(product.getDescription());
			pr.setDetails(product.getDetails());
			pr.setPrice(product.getPrice());
			
			productrepo.save(pr);
		}
		return product;
	}

}
