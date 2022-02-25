package service;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.when;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.market.ecommerce.model.ProductModel;
import com.market.ecommerce.repo.ProductRepo;
import com.market.ecommerce.service.ProductService;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest {
	
	@InjectMocks
	ProductService productservice;
	
	@Mock
	ProductRepo productrepo;
	
	@Test
	public void findAlltest() {
		List<ProductModel> productlist=new ArrayList<ProductModel>();
		ProductModel product=new ProductModel();
		product.setId(1);
		product.setName("i phone 13 pro");
		product.setDetails("edkjdehhkhw");
		product.setImages("www.iphone13pro.jpg");
		product.setPrice(192000.23);
		product.setDescription("jjseabdk");
		productlist.add(product);
		when(productrepo.findAll()).thenReturn(productlist);
		assertEquals(1, productservice.allProduct(product).size());
		
	}
	
	@Test
	public void saveProducttest(){
		List<ProductModel> productlist=new ArrayList<>();
		ProductModel product=new ProductModel(1, "iphone 13 pro", "available", 119200.200, "www.iphone13pro.jpg", "gwebdhjdwjbbewj");
		for (ProductModel productModel : productlist) {
			when(productrepo.save(product)).thenReturn(productModel);
			assertEquals(1, productservice.saveProduct(product));
		}
		
	}
	
	@Test
	public void getByIdTest(){
		List<ProductModel> list=new ArrayList<>();
		ProductModel product1=new ProductModel();
		product1.setId(1);
		product1.setName("iPhone13Pro");
		product1.setDescription("Available");
		product1.setDetails("hjbehjbscajbwjc");
		product1.setPrice(119200.20);
		product1.setImages("www.iphone13pro.jpg");
		list.add(product1);
		Optional<ProductModel> op1=list.stream().findAny();
		when(productrepo.findById(1)).thenReturn(op1);
		assertEquals(op1, productservice.getProductById(1));
	}
}
