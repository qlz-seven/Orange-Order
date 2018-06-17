package com.orange.dao;

import java.sql.SQLException;



import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.orange.domain.StoreUser;
import com.orange.utils.C3P0Util;

public class S_UserDao {
	//用户注册
	public void addUser(StoreUser store) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		String sql = "INSERT INTO S_USER(storeName,password,addr,email,telephone,registime)"+"VALUES(?,?,?,?,?,?)";
		qr.update(sql, store.getStoreName(),store.getPassword(),store.getAddr(),store.getEmail(),store.getTelephone(),store.getRegistime());
	}
	//用户登录
	public StoreUser findByUsernameAndPassword(String storeName, String password) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		return qr.query("select * from s_user where storeName=? and password=?", new BeanHandler<StoreUser>(StoreUser.class), storeName,password);
	}
	//通過id查找商家
	public StoreUser findUserById(String storeId) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		return qr.query("select * from s_user where storeId=?", new BeanHandler<StoreUser>(StoreUser.class), storeId);
	}
	//修改用户信息
	public void modifySUser(StoreUser store) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		qr.update("update s_user set storeName=?, password=?, sendTime=?, sendCost=?, type=?, description=?, openTime=?, addr=?,email=?,telephone=?,imgUri=? where storeId=?",store.getStoreName(),store.getPassword(),store.getSendTime(),store.getSendCost(),store.getType(),store.getDescription(),store.getOpenTime(),store.getAddr(),store.getEmail(),store.getTelephone(),store.getImgUri(),store.getStoreId());
		
	}

	
	

	
    
}
