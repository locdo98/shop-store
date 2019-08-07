package com.dovanloc.springboot.Crud;

import org.springframework.data.repository.CrudRepository;

import com.dovanloc.springboot.entity.Category;

public interface CategoryInterface extends CrudRepository<Category, Integer>{
	
	

}
