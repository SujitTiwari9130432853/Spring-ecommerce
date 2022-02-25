package com.market.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="brand")
public class BrandModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String name;
	String logo;
	String categories;
	public BrandModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BrandModel(int id, String name, String logo, String categories) {
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
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	@Override
	public String toString() {
		return "BrandModel [id=" + id + ", name=" + name + ", logo=" + logo + ", categories=" + categories + "]";
	}
	

}
