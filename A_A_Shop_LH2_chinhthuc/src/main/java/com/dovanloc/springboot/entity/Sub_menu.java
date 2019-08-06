package com.dovanloc.springboot.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="sub_menu")
public class Sub_menu {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int menu_sub_id;
	
	private String name_menu_sub;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="sub_menu")
	Set<Product> product;
	
	@ManyToOne
	@JoinColumn(name="menu_id")
	private Menu menu;

	public int getMenu_sub_id() {
		return menu_sub_id;
	}

	public void setMenu_sub_id(int menu_sub_id) {
		this.menu_sub_id = menu_sub_id;
	}

	public String getName_menu_sub() {
		return name_menu_sub;
	}

	public void setName_menu_sub(String name_menu_sub) {
		this.name_menu_sub = name_menu_sub;
	}

	public Set<Product> getProduct() {
		return product;
	}

	public void setProduct(Set<Product> product) {
		this.product = product;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
	
}
