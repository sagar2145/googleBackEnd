package com.google.in.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table( name = "XYZ_SWIGGY_ITEMS")
public class SwiggyItems {

	
	@Id
	@Column( name="SWIGGY_ID")
	private int swiggyId;
	
	@Column( name="RES_NAME")
	private String resName;
	
	@Column( name="RES_ITEM")
	private String resItem;
	
	@Column( name="IMG_URL")
	private String imgURL;
	
	@Column( name="RES_RATING")
	private String resRating;
	
	@Column( name="DELIVERY_TIME")
	private String deliveryTime;
	
	@Column( name="DISCOUNT")
	private String discount;
	
	@Column( name="OFFER")
	private String offer;
	
	 @OneToMany(mappedBy="swiggyItems")
	private List<SwiggyMenu> swiggyMenu;
	
	public SwiggyItems() {
		
	}


	
	
}
