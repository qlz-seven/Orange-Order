package com.orange.service;

import java.sql.SQLException;

import com.orange.dao.StoreDao;
import com.orange.domain.Store;
import com.orange.exception.StoreException;

public class StoreService {

    StoreDao sud = new StoreDao();
	
	public void regist(Store store) throws StoreException{
		
		try {
			sud.addUser(store);
		} catch (SQLException e) {
			
			e.printStackTrace();
			throw new StoreException("注册失败！");
		}
	}

	public Store login(String storeName, String password) throws StoreException {
		Store store = null;
		try {
			store = sud.findByUsernameAndPassword(storeName,password);
			if(store==null) {
				throw new StoreException("用户名或密码错误！");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new StoreException("用户登录失败!");
		}
		return store;
	}

	public Store findUserById(String storeId) throws StoreException {

		try {
			return sud.findUserById(storeId);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new StoreException("商家信息錯誤！");
		}
	}

	public void modifySUser(Store store) throws StoreException {
		try {
			sud.modifySUser(store);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new StoreException("修改商家信息失败");
		}
		
	}



}
