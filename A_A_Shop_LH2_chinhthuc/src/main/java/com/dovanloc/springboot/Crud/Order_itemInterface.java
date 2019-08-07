package com.dovanloc.springboot.Crud;

import org.springframework.data.repository.CrudRepository;

import com.dovanloc.springboot.entity.Order_item;

public interface Order_itemInterface extends CrudRepository<Order_item, Integer>{

}
