package com.google.in.googleRepository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.google.in.Entity.Menu;
import com.google.in.Entity.SwiggyItems;

@Repository
public interface SwiggyRepository extends CrudRepository<SwiggyItems, Long>{

 
	List<SwiggyItems> findAll();
	
	
	@Query(value = "select a.SWIGGY_ID,a.RES_NAME,a.IMG_URL,a.RES_RATING,a.DELIVERY_TIME,a.DISCOUNT,a.OFFER,"
			+ "b.MENU_ID,b.ITEM_NAME,b.REST_NAME,b.PRICE,b.MENU_TYPE,b.ITEM_ID from XYZ_SWIGGY_ITEMS a JOIN XYZ_SWIGGY_MENU b on  a.SWIGGY_ID=b.ITEM_ID WHERE b.ITEM_ID=:id", nativeQuery = true)
	List<SwiggyItems> getSwiggyMenu(@Param("id") int id);
	
	@Query("from SwiggyItems where swiggyId=:id")
	SwiggyItems findResDetails(@Param("id") int id);
	
}
