package com.dovanloc.springboot.Crud;

import org.springframework.data.repository.CrudRepository;

import com.dovanloc.springboot.entity.Role;

public interface RoleInterface extends CrudRepository<Role, Integer>{

}
