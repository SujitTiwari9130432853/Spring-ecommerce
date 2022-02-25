package com.market.ecommerce1.model;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="brand")
public class BrandModel {
	@Id
	int id;
	String name;
	String logo;
	boolean categories;
	
	public BrandModel() {
		
	}

	public BrandModel(int id, String name, String logo, boolean categories) {
		super();
		this.id = id;
		this.name = name;
		this.logo = logo;
		this.categories = categories;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public boolean isCategories() {
		return categories;
	}

	public void setCategories(boolean categories) {
		this.categories = categories;
	}

	@Override
	public String toString() {
		return "BrandModel [id=" + id + ", name=" + name + ", logo=" + logo + ", categories=" + categories + "]";
	}
	
	
	
	

}
