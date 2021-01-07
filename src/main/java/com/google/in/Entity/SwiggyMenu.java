package com.google.in.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table( name = "XYZ_SWIGGY_MENU")
public class SwiggyMenu {

	@Id
	@Column( name="MENU_ID")
	private int id;
	
	@Column( name="ITEM_NAME")
	private String itemName;
	
	@Column( name="RES_NAME")
	private String resName;
	
	@Column( name="PRICE")
	private int price;
	
	@Column( name="MENU_TYPE")
	private String menuType;
	
	@ManyToOne
    @JoinColumn(name="ITEM_ID", nullable=false)
	private SwiggyItems swiggyItems;
	
	public SwiggyMenu() {
		
	}
}
