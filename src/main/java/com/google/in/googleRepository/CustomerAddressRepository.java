package com.google.in.googleRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.google.in.Entity.CustomerAddress;

public interface CustomerAddressRepository extends CrudRepository<CustomerAddress, Long>{

	@Query("from CustomerAddress where customerId=:id")
	CustomerAddress getAddress(@Param("id") int id);
}
