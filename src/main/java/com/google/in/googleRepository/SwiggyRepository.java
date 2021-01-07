package com.google.in.googleRepository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.google.in.Entity.SwiggyItems;

@Repository
public interface SwiggyRepository extends CrudRepository<SwiggyItems, Long>{

 
	List<SwiggyItems> findAll();
	
	@Query("select a.resName,b.itemName,b.price,b.menuType from SwiggyItems a JOIN SwiggyMenu b on a.swiggyId=b.swiggyItems")
	List<SwiggyItems> getSwiggyMenu();
	
}
