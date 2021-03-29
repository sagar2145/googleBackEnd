package com.google.in.Entity;

import org.json.simple.JSONObject;

public class Response {

	
	private String status;
	private String message;
	private JSONObject jsonObject;
	
	public Response() {
		// TODO Auto-generated constructor stub
	}

	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}



	public JSONObject getJsonObject() {
		return jsonObject;
	}



	public void setJsonObject(JSONObject jsonObject) {
		this.jsonObject = jsonObject;
	}
	
	
	
}
