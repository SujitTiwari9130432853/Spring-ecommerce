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
import org.mockito.junit.MockitoJUnit;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.PathVariable;

import com.market.ecommerce.model.CategoryModel;
import com.market.ecommerce.repo.CategoryRepo;
import com.market.ecommerce.service.CategoryService;
import com.sun.xml.bind.v2.schemagen.xmlschema.Any;

import javassist.tools.reflect.Sample;


@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class CategoryServiceTest {
	
	@InjectMocks
	CategoryService categoryservice;
	
	@Mock
	CategoryRepo categoryrepo;

	@Test
	public void findAlltest() {
		List<CategoryModel> catlist = new ArrayList<CategoryModel>();
		CategoryModel category1=new CategoryModel();
		category1.setId(1);
		category1.setName("Electronics");
		category1.setAlias("E1");
		category1.setEnabled(false);
		catlist.add(category1);
		when(categoryrepo.findAll()).thenReturn(catlist);
		assertEquals(1, categoryservice.allCategory(category1).size());
	}
	
	
	@Test
	public void saveCategoryTest(){
		List<CategoryModel> catlist1=new ArrayList<>();
		CategoryModel category2=new CategoryModel(1, "Electronics", "E1", false);
		for (CategoryModel categoryModel : catlist1) {
			when(categoryrepo.save(category2)).thenReturn(categoryModel);
			assertEquals(1, categoryservice.saveCategory(category2));
			//assertNotNull(categoryservice.saveCategory(category2));
		}
	}
	
//	@Test
//	public void getbyIdtest(){
//		int id=0;
//		Optional<CategoryModel> category3=categoryrepo.findById(id);
//		CategoryModel categorymodel=new CategoryModel(1, "Electronics", "E1", false);
//		categoryrepo.save(categorymodel);
//		when(categoryrepo.findById(id)).thenReturn(category3);
//		assertEquals(1, categoryservice.getCategoryById(id) );
//	}
	
//	@Test
//	public void getByIdTest(){
//		List<CategoryModel> catlist2=new ArrayList<>();
//		CategoryModel category4=new CategoryModel();
//		category4.setId(1);
//		category4.setName("Electronics");
//		category4.setAlias("E1");
//		category4.setEnabled(false);
//		catlist2.add(category4);
//		Integer id = catlist2.indexOf(category4);
//		when(categoryrepo.findAll().get(0)).thenReturn(catlist2.get(category4.getId()));
//		assertEquals(id, categoryservice.allCategory(category4).get(0));
//		
//	}
//	
	@Test
	public void getByIDTest(){
		List<CategoryModel> list=new ArrayList<>();
		CategoryModel category5=new CategoryModel();
		category5.setId(1);
		category5.setName("Electronics");
		category5.setAlias("E1");
		category5.setEnabled(false);
		list.add(category5);
		Optional<CategoryModel> op1=list.stream().findAny();
		when(categoryrepo.findById(1)).thenReturn(op1);
		assertEquals(op1, categoryservice.getCategoryById(1));
	}
	
	
	

}
