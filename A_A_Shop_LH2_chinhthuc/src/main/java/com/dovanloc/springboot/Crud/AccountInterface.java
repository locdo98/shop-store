package com.dovanloc.springboot.Crud;

import org.springframework.data.repository.CrudRepository;

import com.dovanloc.springboot.entity.Account;

public interface AccountInterface extends CrudRepository<Account, Integer>{

}
