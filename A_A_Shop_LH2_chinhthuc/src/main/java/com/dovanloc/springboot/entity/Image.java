package com.dovanloc.springboot.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="image")
public class Image {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="image")
	private Set<Product_image> product_image;

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

	public Set<Product_image> getProduct_image() {
		return product_image;
	}

	public void setProduct_image(Set<Product_image> product_image) {
		this.product_image = product_image;
	}
	
	
}
