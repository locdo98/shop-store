package com.dovanloc.springboot.Crud;

import org.springframework.data.repository.CrudRepository;

import com.dovanloc.springboot.entity.Color;

public interface ColorInterface extends CrudRepository<Color, Integer> {

}
