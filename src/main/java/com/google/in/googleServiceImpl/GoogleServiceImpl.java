package com.google.in.googleServiceImpl;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.in.Entity.CustomerAddress;
import com.google.in.Entity.Response;
import com.google.in.Entity.SwiggyItems;
import com.google.in.Entity.SwiggyMenu;
import com.google.in.Entity.UserRegister;
import com.google.in.googleRepository.CustomerAddressRepository;
import com.google.in.googleRepository.GoogleRepository;
import com.google.in.googleRepository.SwiggyMenuRepository;
import com.google.in.googleRepository.SwiggyRepository;
import com.google.in.googleService.GoogleService;


@Service
//@Component
public class GoogleServiceImpl implements GoogleService {

	@Autowired
	GoogleRepository googleRepository;
	
	@Autowired
	SwiggyRepository swiggyRepository;
	
	@Autowired
	SwiggyMenuRepository swiggyMenuRepository;
	
	@Autowired
	CustomerAddressRepository addressRepository;
//	@Autowired(required=true)
	Response response =new Response();
	
	
	@Override
	public Response saveUser(UserRegister userRegister) {
		try {
			
			if(!userRegister.equals(null)) {
				googleRepository.save(userRegister);
				response.setStatus("200");
				response.setMessage("success");
				
			}
			
		} catch (Exception e) {
			System.err.println("Exception : " + e.getMessage());
			response.setStatus("500");
			response.setMessage("unsuccessfull");
		}
		
		return response;
	}


	@Override
	public Response validateUser(UserRegister userRegister) {
		
		try {
			UserRegister userDetails=googleRepository.getByPassword(userRegister.getPassword());
			
			JSONObject j1=new JSONObject();
			j1.put("id", userDetails.getId());
			
		if(userDetails.getPassword().equals(userRegister.getPassword()) 
				&& userDetails.getUserName().equals(userRegister.getUserName())) {
			response.setStatus("200");
			response.setMessage("success");
			response.setJsonObject(j1);
		}
		else {
			response.setMessage("Invalid Credentials");
			response.setStatus("200");
		}
		}
		catch(Exception e) {
			System.err.println("Exception : " + e.getMessage());
			response.setStatus("500");
			response.setMessage("unsuccessfull");
		}
		return response;
	}


	@Override
	public List<SwiggyItems> getSwiggyData() {
		try {
			List<SwiggyItems> l1= swiggyRepository.findAll();
			return l1;
		} catch (Exception e) {
			System.err.println("Exception : " + e.getMessage());
			return null;
		}
		
	}


	@Override
	public List<SwiggyMenu> getSwiggyMenu(int id) {
		
		try {
			List<SwiggyMenu> j1= swiggyMenuRepository.getSwiggyMenu(id);
			return j1;
		} catch (Exception e) {
			System.err.println("Exception : " + e.getMessage());
			return null;
		}
		
		
		
	}


	@Override
	public SwiggyItems getRestaurantDetails(int id) {
		
		return swiggyRepository.findResDetails(id);
	}


	@Override
	public SwiggyMenu getMenuDetails(int id) {
		
		return swiggyMenuRepository.getMenuDetails(id);
	}


	@Override
	public List<CustomerAddress> getcustomerAddress(String name) {
		// TODO Auto-generated method stub
		
		
		return swiggyMenuRepository.getCustomerAddress(name);
	}


	@Override
	public CustomerAddress getAddress(int id) {
		// TODO Auto-generated method stub
		return addressRepository.getAddress(id);
	}

}
