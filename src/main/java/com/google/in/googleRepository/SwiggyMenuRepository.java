package com.google.in.googleRepository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.google.in.Entity.CustomerAddress;
import com.google.in.Entity.SwiggyMenu;

public interface SwiggyMenuRepository extends CrudRepository<SwiggyMenu, Long>{
     
	@Transactional
	@Query(value = "select a.SWIGGY_ID,a.RES_NAME,a.IMG_URL,a.RES_RATING,a.DELIVERY_TIME,a.DISCOUNT,a.OFFER,"
			+ "b.MENU_ID,b.ITEM_NAME,b.REST_NAME,b.PRICE,b.MENU_TYPE,b.ITEM_ID from XYZ_SWIGGY_MENU b JOIN XYZ_SWIGGY_ITEMS a on  a.SWIGGY_ID=b.ITEM_ID WHERE b.ITEM_ID=:id", nativeQuery = true)
	List<SwiggyMenu> getSwiggyMenu(@Param("id") int id);
	
	@Query("from SwiggyMenu where id=:id")
	SwiggyMenu getMenuDetails(@Param("id") int id);
	
	@Query("from CustomerAddress where name=:name")
	List<CustomerAddress> getCustomerAddress(@Param("name") String name);
	
}
