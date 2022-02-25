package com.market.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class ProductModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String name;
	String description;
	Double price;
	String images;
	String details;
	public ProductModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductModel(int id, String name, String description, Double price, String images, String details) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.images = images;
		this.details = details;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "ProductModel [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", images=" + images + ", details=" + details + "]";
	}
	

}
