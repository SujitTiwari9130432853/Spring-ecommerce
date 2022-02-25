package com.market.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name="category")
	public class CategoryModel {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		int id;
		String name;
		String alias;
		boolean enabled;
		
		
		public CategoryModel() {
			super();
			// TODO Auto-generated constructor stub
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
			return "Category [id=" + id + ", name=" + name + ", alias=" + alias + ", enabled=" + enabled + "]";
		}
		
		

	}


