package com.google.in.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table( name = "XYZ_LOGIN")
public class Login {

	@Id
	@Column( name="id")
	private int id;
	@Column( name="userName")
	private String userName;
	@Column( name="userPassword")
	private String userPassword;
	
 
	public Login() {
		// TODO Auto-generated constructor stub
	}

	public Login(int id, String userName, String userPassword) {
		super();
		this.id = id;
		this.userName = userName;
		this.userPassword = userPassword;
	}





	
}
