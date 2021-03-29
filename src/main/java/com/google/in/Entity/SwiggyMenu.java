package com.google.in.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Data
@Entity
@Table(name = "XYZ_SWIGGY_MENU")
public class SwiggyMenu implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7208663870593106473L;

	@Id
	@Column(name = "MENU_ID")
	private int id;

	@Column(name = "ITEM_NAME")
	private String itemName;

	@Column(name = "REST_NAME")
	private String restName;

	@Column(name = "PRICE")
	private int price;

	@Column(name = "MENU_TYPE")
	private String menuType;

//	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "ITEM_ID")
	private SwiggyItems items;

	public SwiggyMenu() {

	}

	public SwiggyMenu(int id, String itemName, String restName, int price, String menuType, SwiggyItems items) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.restName = restName;
		this.price = price;
		this.menuType = menuType;
		this.items = items;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMenuType() {
		return menuType;
	}

	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}

	public String getRestName() {
		return restName;
	}

	public void setRestName(String restName) {
		this.restName = restName;
	}

	public SwiggyItems getItems() {
		return items;
	}

	public void setItems(SwiggyItems items) {
		this.items = items;
	}

}
