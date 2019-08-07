package com.dovanloc.springboot.Crud;

import org.springframework.data.repository.CrudRepository;

import com.dovanloc.springboot.entity.Image;

public interface ImageInterface extends CrudRepository<Image, Integer> {

}
