package com.market.ecommerce1.model;



import javax.persistence.Id;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="category")
public class CategoryModel{
	@Id
	int id;
	String name;
	String alias;
	boolean enabled;
	public CategoryModel() {
		
	}
	public CategoryModel(int id, String name, String alias, boolean enabled) {
		super();
		this.id = id;
		this.name = name;
		this.alias = alias;
		this.enabled = enabled;
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
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	@Override
	public String toString() {
		return "CategoryModel [id=" + id + ", name=" + name + ", alias=" + alias + ", enabled=" + enabled + "]";
	}
	
	
	

}
