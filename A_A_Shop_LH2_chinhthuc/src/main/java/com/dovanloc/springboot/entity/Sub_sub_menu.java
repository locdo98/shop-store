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
@Table(name="sub_sub_menu")
public class Sub_sub_menu {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int menu_sub_sub_id;
	
	private String menu_sub_sub_name;
	
	@ManyToOne
	@JoinColumn(name="menu_sub_id")
	private Sub_menu sub_menu;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="sub_sub_menu")
	private Set<Product> product;

	public int getMenu_sub_sub_id() {
		return menu_sub_sub_id;
	}

	public void setMenu_sub_sub_id(int menu_sub_sub_id) {
		this.menu_sub_sub_id = menu_sub_sub_id;
	}

	public String getMenu_sub_sub_name() {
		return menu_sub_sub_name;
	}

	public void setMenu_sub_sub_name(String menu_sub_sub_name) {
		this.menu_sub_sub_name = menu_sub_sub_name;
	}

	public Sub_menu getSub_menu() {
		return sub_menu;
	}

	public void setSub_menu(Sub_menu sub_menu) {
		this.sub_menu = sub_menu;
	}

	public Set<Product> getProduct() {
		return product;
	}

	public void setProduct(Set<Product> product) {
		this.product = product;
	}
	
	
}
