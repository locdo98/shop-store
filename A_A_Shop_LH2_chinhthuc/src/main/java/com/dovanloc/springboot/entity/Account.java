package com.dovanloc.springboot.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class Account {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String username;
	
	private String password;
	
	private String date_created;
	
	private String phone;
	
	private String address;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="account")
	private Set<Account_role> account_role;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="account")
	private Set<Cart> cart;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="account")
	private Set<Product> product;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="account")
	private Set<Customer_order> customer_order;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDate_created() {
		return date_created;
	}

	public void setDate_created(String date_created) {
		this.date_created = date_created;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<Account_role> getAccount_role() {
		return account_role;
	}

	public void setAccount_role(Set<Account_role> account_role) {
		this.account_role = account_role;
	}

	public Set<Cart> getCart() {
		return cart;
	}

	public void setCart(Set<Cart> cart) {
		this.cart = cart;
	}

	public Set<Product> getProduct() {
		return product;
	}

	public void setProduct(Set<Product> product) {
		this.product = product;
	}

	public Set<Customer_order> getCustomer_order() {
		return customer_order;
	}

	public void setCustomer_order(Set<Customer_order> customer_order) {
		this.customer_order = customer_order;
	}
	
	
}
