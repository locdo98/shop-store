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
@Table(name="menu")
public class Menu {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int menu_id;
	
	private String name_menu;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="menu")
	Set<Sub_menu> sub_menu;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="menu")
	Set<Product> product;

	public int getMenu_id() {
		return menu_id;
	}

	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}

	public String getName_menu() {
		return name_menu;
	}

	public void setName_menu(String name_menu) {
		this.name_menu = name_menu;
	}

	public Set<Sub_menu> getSub_menu() {
		return sub_menu;
	}

	public void setSub_menu(Set<Sub_menu> sub_menu) {
		this.sub_menu = sub_menu;
	}

	public Set<Product> getProduct() {
		return product;
	}

	public void setProduct(Set<Product> product) {
		this.product = product;
	}
	
	
}
