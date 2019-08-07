package com.dovanloc.springboot.Crud;

import org.springframework.data.repository.CrudRepository;

import com.dovanloc.springboot.entity.Size;

public interface SIzeInterface extends CrudRepository<Size, Integer> {

}
