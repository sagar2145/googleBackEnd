package com.google.in.googleRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.google.in.Entity.UserRegister;

@Repository
public interface GoogleRepository extends CrudRepository<UserRegister, Long>{

	
	UserRegister getByPassword(String password);
}
