package com.google.in.googleService;

import java.util.List;

import com.google.in.Entity.CustomerAddress;
import com.google.in.Entity.Response;
import com.google.in.Entity.SwiggyItems;
import com.google.in.Entity.SwiggyMenu;
import com.google.in.Entity.UserRegister;

public interface GoogleService {

	public Response saveUser(UserRegister userRegister) ;
	
	Response validateUser(UserRegister userRegister);
	
	List<SwiggyItems> getSwiggyData();
    List<SwiggyMenu> getSwiggyMenu(int id);
    SwiggyItems getRestaurantDetails(int id);
    SwiggyMenu getMenuDetails(int id);  
    List<CustomerAddress> getcustomerAddress(String name);
    CustomerAddress getAddress(int id);
}
