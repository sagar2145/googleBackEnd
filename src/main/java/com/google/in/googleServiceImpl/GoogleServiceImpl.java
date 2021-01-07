package com.google.in.googleServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.in.Entity.Response;
import com.google.in.Entity.SwiggyItems;
import com.google.in.Entity.UserRegister;
import com.google.in.googleRepository.GoogleRepository;
import com.google.in.googleRepository.SwiggyRepository;
import com.google.in.googleService.GoogleService;


@Service
//@Component
public class GoogleServiceImpl implements GoogleService {

	@Autowired
	GoogleRepository googleRepository;
	
	@Autowired
	SwiggyRepository swiggyRepository;
	
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
		if(userDetails.getPassword().equals(userRegister.getPassword()) 
				&& userDetails.getUserName().equals(userRegister.getUserName())) {
			response.setStatus("200");
			response.setMessage("success");
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
			return swiggyRepository.findAll();
		} catch (Exception e) {
			System.err.println("Exception : " + e.getMessage());
			return null;
		}
		
	}


	@Override
	public List<SwiggyItems> getSwiggyMenu() {
		
		try {
			return swiggyRepository.getSwiggyMenu();
		} catch (Exception e) {
			System.err.println("Exception : " + e.getMessage());
			return null;
		}
		
	}

}
