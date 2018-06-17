package com.orange.domain;

public class Dish {
	private int dishId;//商品编号
	private String dishName;//商品名称
	private String dishType;//商品种类
	private int price;//价格
	private int num;//商品数量
	private String dishImg;//商品图片
	private String dishDescription;//商品介绍
	private int storeId;//商家ID
	public int getDishId() {
		return dishId;
	}
	public void setDishId(int dishId) {
		this.dishId = dishId;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public String getDishType() {
		return dishType;
	}
	public void setDishType(String dishType) {
		this.dishType = dishType;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getDishImg() {
		return dishImg;
	}
	public void setDishImg(String dishImg) {
		this.dishImg = dishImg;
	}
	public String getDishDescription() {
		return dishDescription;
	}
	public void setDishDescription(String dishDescription) {
		this.dishDescription = dishDescription;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	

}
