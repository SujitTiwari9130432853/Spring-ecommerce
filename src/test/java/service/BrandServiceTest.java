package service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.market.ecommerce.model.BrandModel;
import com.market.ecommerce.repo.BrandRepo;
import com.market.ecommerce.service.BrandService;
import static org.mockito.Mockito.when;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class BrandServiceTest {

		
	@InjectMocks
	BrandService brandservice;
	
	@Mock
	BrandRepo brandrepo;
	
	@Test
	public void findAlltest() {
		List<BrandModel> brandlist=new ArrayList<BrandModel>();
		BrandModel brand=new BrandModel();
		brand.setId(1);
		brand.setName("Apple");
		brand.setLogo("url");
		brand.setCategories("Electronics");
		brandlist.add(brand);
		when(brandrepo.findAll()).thenReturn(brandlist);
		assertEquals(1, brandservice.allBrand(brand).size());
		
	}
	
	@Test
	public void saveBrandTest(){
		List<BrandModel> brandlist=new ArrayList<>();
		BrandModel brand=new BrandModel(1, "Apple", "www.appleLogo.org", "not present");
		for (BrandModel brandModel : brandlist) {
			when(brandrepo.save(brand)).thenReturn(brandModel);
			//assertEquals(1, brandservice.saveBrand(brand));
			assertNotNull(brandservice.saveBrand(brand));
		}
	}
	
	@Test
	public void getByIdTest(){
		List<BrandModel> list=new ArrayList<>();
		BrandModel brand1=new BrandModel();
		brand1.setId(1);
		brand1.setName("Apple");
		brand1.setLogo("www.logo.com");
		brand1.setCategories("hvehdvhcbab");
		list.add(brand1);
		Optional<BrandModel> op1=list.stream().findAny();
		when(brandrepo.findById(1)).thenReturn(op1);
		assertEquals(op1, brandservice.getBrandById(1));
	}
	
	
}
