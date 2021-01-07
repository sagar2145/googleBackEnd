package com.google.in.googleService;

import java.util.List;

import com.google.in.Entity.Response;
import com.google.in.Entity.SwiggyItems;
import com.google.in.Entity.UserRegister;

public interface GoogleService {

	public Response saveUser(UserRegister userRegister) ;
	
	Response validateUser(UserRegister userRegister);
	
	List<SwiggyItems> getSwiggyData();
    List<SwiggyItems> getSwiggyMenu();
}
