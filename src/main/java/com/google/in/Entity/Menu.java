package com.google.in.Entity;

import java.util.List;

public class Menu {

	private int id;
	private String restName;
	private String itemName;
	private String price;
	private String menuType;
	private SwiggyItems items;
	private int swiggyId;
	private String imgURL;
	private String resName;
	private String resRating;
	private String deliveryTime;
	private String discount;
	private String offer;
	private List<SwiggyMenu> swiggyMenu;

	public Menu() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getResName() {
		return resName;
	}

	public void setResName(String resName) {
		this.resName = resName;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getMenuType() {
		return menuType;
	}

	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}

	public SwiggyItems getItems() {
		return items;
	}

	public void setItems(SwiggyItems items) {
		this.items = items;
	}

	public int getSwiggyId() {
		return swiggyId;
	}

	public void setSwiggyId(int swiggyId) {
		this.swiggyId = swiggyId;
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

	public List<SwiggyMenu> getSwiggyMenu() {
		return swiggyMenu;
	}

	public void setSwiggyMenu(List<SwiggyMenu> swiggyMenu) {
		this.swiggyMenu = swiggyMenu;
	}

	public String getRestName() {
		return restName;
	}

	public void setRestName(String restName) {
		this.restName = restName;
	}

}
