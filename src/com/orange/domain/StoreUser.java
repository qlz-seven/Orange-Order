package com.orange.domain;

import java.util.Date;

public class StoreUser {
	private int storeId;//商家编号
	private String storeName;//商家名称
	private String password;//商家密码
	private int sendTime;//送餐时间
	private int sendCost;//配送费
	private String type;//餐厅食品类型
	private String description;//商家介绍
	private String openTime;//营业时间
	private String addr;//商家地址
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
	public int getSendTime() {
		return sendTime;
	}
	public void setSendTime(int sendTime) {
		this.sendTime = sendTime;
	}
	public int getSendCost() {
		return sendCost;
	}
	public void setSendCost(int sendCost) {
		this.sendCost = sendCost;
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
	
	


}
