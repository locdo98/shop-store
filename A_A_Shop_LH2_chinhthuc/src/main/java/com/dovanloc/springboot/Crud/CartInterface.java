package com.dovanloc.springboot.Crud;

import org.springframework.data.repository.CrudRepository;

import com.dovanloc.springboot.entity.Cart;

public interface CartInterface extends CrudRepository<Cart, Integer> {

}
