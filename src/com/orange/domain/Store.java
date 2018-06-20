package com.orange.domain;

import java.util.Date;

public class Store {
	private int storeId;//商家编号
	private String storeName;//商家名称
	private String password;//商家密码
	private String sendTime;//送餐时间
	private double sendCost;//配送费
	private double sengAtLeast;//起送费
	private String type;//餐厅食品类型
	private String description;//商家介绍
	private String openTime;//营业时间
	private String address;//商家地址
	private String email;//商家邮箱
	private String telephone;//商家电话
	private String imgUri;//商家头像
	private int order_num;//订单量
	private Date registime;//注册时间
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSendTime() {
		return sendTime;
	}
	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}
	public double getSendCost() {
		return sendCost;
	}
	public void setSendCost(double sendCost) {
		this.sendCost = sendCost;
	}
	public double getSengAtLeast() {
		return sengAtLeast;
	}
	public void setSengAtLeast(double sengAtLeast) {
		this.sengAtLeast = sengAtLeast;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOpenTime() {
		return openTime;
	}
	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}
	public String getAddress() {
		return address;
	}
	public void setAddr(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getImgUri() {
		return imgUri;
	}
	public void setImgUri(String imgUri) {
		this.imgUri = imgUri;
	}
	public int getOrder_num() {
		return order_num;
	}
	public void setOrder_num(int order_num) {
		this.order_num = order_num;
	}
	public Date getRegistime() {
		return registime;
	}
	public void setRegistime(Date registime) {
		this.registime = registime;
	}
	
	


}
