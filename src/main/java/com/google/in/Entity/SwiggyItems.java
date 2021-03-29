package com.google.in.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

//@Data
@Entity
@Table(name = "XYZ_SWIGGY_ITEMS")
public class SwiggyItems implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5096797088459064987L;

	@Id
	@Column(name = "SWIGGY_ID")
	private int swiggyId;

	@Column(name = "RES_NAME")
	private String resName;

	@Column(name = "IMG_URL")
	private String imgURL;

	@Column(name = "RES_RATING")
	private String resRating;

	@Column(name = "DELIVERY_TIME")
	private String deliveryTime;

	@Column(name = "DISCOUNT")
	private String discount;

	@Column(name = "OFFER")
	private String offer;

//	@JsonManagedReference
//	@JsonIgnore
	@OneToMany(mappedBy = "items")
	private List<SwiggyMenu> menu;

	public SwiggyItems() {

	}

	public int getSwiggyId() {
		return swiggyId;
	}
	
	

//	@Override
//	public String toString() {
//		return "SwiggyItems [swiggyId=" + swiggyId + ", resName=" + resName + ", imgURL=" + imgURL + ", resRating="
//				+ resRating + ", deliveryTime=" + deliveryTime + ", discount=" + discount + ", offer=" + offer + "]";
//	}

	public void setSwiggyId(int swiggyId) {
		this.swiggyId = swiggyId;
	}

	public String getResName() {
		return resName;
	}

	public void setResName(String resName) {
		this.resName = resName;
	}

	public String getImgURL() {
		return imgURL;
	}

	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}

	public String getResRating() {
		return resRating;
	}

	public void setResRating(String resRating) {
		this.resRating = resRating;
	}

	public String getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getOffer() {
		return offer;
	}

	public void setOffer(String offer) {
		this.offer = offer;
	}

//	public List<SwiggyMenu> getMenu() {
//		return menu;
//	}
//
//	public void setMenu(List<SwiggyMenu> menu) {
//		this.menu = menu;
//	}

	
}
