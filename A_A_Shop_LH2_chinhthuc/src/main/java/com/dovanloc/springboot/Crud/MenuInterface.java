package com.dovanloc.springboot.Crud;

import org.springframework.data.repository.CrudRepository;

import com.dovanloc.springboot.entity.Menu;

public interface MenuInterface extends CrudRepository<Menu, Integer>{

}
