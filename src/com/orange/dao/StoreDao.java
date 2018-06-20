package com.orange.dao;

import java.sql.SQLException;



import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.orange.domain.Store;
import com.orange.utils.C3P0Util;

public class StoreDao {
	//用户注册
	public void addUser(Store store) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		String sql = "INSERT INTO store(storeName,password,address,email,telephone,registime)"+"VALUES(?,?,?,?,?,?)";
		qr.update(sql, store.getStoreName(),store.getPassword(),store.getAddress(),store.getEmail(),store.getTelephone(),store.getRegistime());
	}
	//用户登录
	public Store findByUsernameAndPassword(String storeName, String password) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		return qr.query("select * from store where storeName=? and password=?", new BeanHandler<Store>(Store.class), storeName,password);
	}
	//通過id查找商家
	public Store findUserById(String storeId) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		return qr.query("select * from store where storeId=?", new BeanHandler<Store>(Store.class), storeId);
	}
	//修改用户信息
	public void modifySUser(Store store) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		qr.update("update store set storeName=?, password=?, sendTime=?, sendCost=?, type=?, description=?, openTime=?, address=?,email=?,telephone=?,imgUri=? where storeId=?",store.getStoreName(),store.getPassword(),store.getSendTime(),store.getSendCost(),store.getType(),store.getDescription(),store.getOpenTime(),store.getAddress(),store.getEmail(),store.getTelephone(),store.getImgUri(),store.getStoreId());
		
	}

	
	

	
    
}
