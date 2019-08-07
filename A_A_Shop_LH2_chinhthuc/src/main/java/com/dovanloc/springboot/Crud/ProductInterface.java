package com.dovanloc.springboot.Crud;

import org.springframework.data.repository.CrudRepository;

import com.dovanloc.springboot.entity.Product;

public interface ProductInterface extends CrudRepository<Product, Integer>{

}
