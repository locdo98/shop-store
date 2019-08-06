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

import org.hibernate.validator.internal.constraintvalidators.bv.number.bound.MaxValidatorForNumber;

@Entity
@Table(name="product")
public class Product {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String date_created;
	
	private String images;
	
	private int price;
	
	private String detail;
	
	private int amount;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="product")
	private Set<Cart> cart;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="product")
	private Set<Product_color> product_color;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="product")
	private Set<Product_image> product_image;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="product")
	private Set<Product_size> product_size;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="product")
	private Set<Order_item> order_item;
	
	@ManyToOne
	@JoinColumn(name="menu_id")
	private Menu menu;
	
	@ManyToOne
	@JoinColumn(name="menu_sub_id")
	private Sub_menu sub_menu;
	
	@ManyToOne
	@JoinColumn(name="menu_sub_sub_id")
	private Sub_sub_menu sub_sub_menu;
	
	@ManyToOne
	@JoinColumn(name="account")
	private Account account;

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

	public String getDate_created() {
		return date_created;
	}

	public void setDate_created(String date_created) {
		this.date_created = date_created;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Set<Cart> getCart() {
		return cart;
	}

	public void setCart(Set<Cart> cart) {
		this.cart = cart;
	}

	public Set<Product_color> getProduct_color() {
		return product_color;
	}

	public void setProduct_color(Set<Product_color> product_color) {
		this.product_color = product_color;
	}

	public Set<Product_image> getProduct_image() {
		return product_image;
	}

	public void setProduct_image(Set<Product_image> product_image) {
		this.product_image = product_image;
	}

	public Set<Product_size> getProduct_size() {
		return product_size;
	}

	public void setProduct_size(Set<Product_size> product_size) {
		this.product_size = product_size;
	}

	public Set<Order_item> getOrder_item() {
		return order_item;
	}

	public void setOrder_item(Set<Order_item> order_item) {
		this.order_item = order_item;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public Sub_menu getSub_menu() {
		return sub_menu;
	}

	public void setSub_menu(Sub_menu sub_menu) {
		this.sub_menu = sub_menu;
	}

	public Sub_sub_menu getSub_sub_menu() {
		return sub_sub_menu;
	}

	public void setSub_sub_menu(Sub_sub_menu sub_sub_menu) {
		this.sub_sub_menu = sub_sub_menu;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	
}

