package com.dovanloc.springboot.Crud;

import org.springframework.data.repository.CrudRepository;

import com.dovanloc.springboot.entity.Customer_order;

public interface Customer_oderInterface extends CrudRepository<Customer_order, Integer> {

}
