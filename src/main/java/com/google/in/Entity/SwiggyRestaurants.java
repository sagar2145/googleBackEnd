package com.google.in.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table( name = "XYZ_SWIGGY_RESTAURANTS")
public class SwiggyRestaurants {
	
	@Id
	@Column( name="RES_ID")
	private String resId;
	
	@Column( name="RES_NAME")
	private String resName;
	
	@Column( name="ADDRESS")
	private String address;
	
	@Column( name="IMG_URL")
	private String imgUrl;
	
	public SwiggyRestaurants() {
		// TODO Auto-generated constructor stub
	}

	public String getResId() {
		return resId;
	}

	public void setResId(String resId) {
		this.resId = resId;
	}

	public String getResName() {
		return resName;
	}

	public void setResName(String resName) {
		this.resName = resName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
	
	
	

}
