package com.google.in.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table( name = "XYZ_USER_REGISTER")
public class UserRegister {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "USER_ID")
	private int id;
	
	@Column(name = "USER_NAME")
	private String userName;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "PHONE_NUM")
	private String phoneNum;
	
	@Column(name = "PASSWORD")
	private String password;
	
	public UserRegister() {
		// TODO Auto-generated constructor stub
	}

	public UserRegister(int id, String userName, String email, String phoneNum, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.phoneNum = phoneNum;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
  
	
	
}
