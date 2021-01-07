package com.google.in.myController;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.in.Entity.Login;
import com.google.in.Entity.Response;
import com.google.in.Entity.SwiggyItems;
import com.google.in.Entity.UserRegister;
import com.google.in.googleService.GoogleService;


@CrossOrigin(origins="http://localhost:4201")
@RestController
@RequestMapping("/api")
public class GoogleController {
    
//	@Autowired
//	Response response;
	
	@Autowired
	GoogleService googleService;
	
//	
Response response=new Response();
	
	
	@PostMapping(path="/homepage", produces="application/json")
	public Response display(@RequestBody Login login)  {
		response.setStatus("200");
		response.setMessage("weilcome");
	
		return response;
	}
	
	
	@PostMapping(path="/login", produces="application/json")
	public Response weelcome(@RequestBody UserRegister userRegister)  {
		
		
		
		return googleService.validateUser(userRegister);
	}
	
	@PostMapping(path="/register", produces="application/json")
	public Response saveRegisterDetails(@RequestBody UserRegister userRegister) {
		
		return googleService.saveUser(userRegister);
		
	}
	
	@GetMapping(path="/swiggyData", produces="application/json")
	public List<SwiggyItems> getSwiggyData(){
		return googleService.getSwiggyData();
		
	}
	
	@GetMapping(path="/swiggyMenu", produces="application/json")
	public List<SwiggyItems> getSwiggyMenu(){
		return googleService.getSwiggyMenu();
		
	}
	
}
