package com.orange.service;

import java.sql.SQLException;

import com.orange.dao.S_UserDao;
import com.orange.domain.StoreUser;
import com.orange.exception.UserException;

public class S_UserService {

    S_UserDao sud = new S_UserDao();
	
	public void regist(StoreUser store) throws UserException{
		
		try {
			sud.addUser(store);
		} catch (SQLException e) {
			
			e.printStackTrace();
			throw new UserException("注册失败！");
		}
	}

	public StoreUser login(String storeName, String password) throws UserException {
		StoreUser store = null;
		try {
			store = sud.findByUsernameAndPassword(storeName,password);
			if(store==null) {
				throw new UserException("用户名或密码错误！");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new UserException("用户登录失败!");
		}
		return store;
	}

	public StoreUser findUserById(String storeId) throws UserException {

		try {
			return sud.findUserById(storeId);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new UserException("商家信息錯誤！");
		}
	}

	public void modifySUser(StoreUser store) throws UserException {
		try {
			sud.modifySUser(store);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new UserException("修改商家信息失败");
		}
		
	}



}
