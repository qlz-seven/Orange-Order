package com.orange.dao;

import java.sql.SQLException;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;


import com.orange.domain.Order;
import com.orange.utils.C3P0Util;

public class OrderDao {

	

	

	
	//通过商家名称找到订单状态为1的所有订单
	public List<Order> findOrderList1(String storeName) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		return qr.query("SELECT * FROM s_order where storeName=? and state=1;", new BeanListHandler<Order>(Order.class),storeName);
	}

	
	//通过订单ID找到订单并把订单状态设置为3，表示已送餐
	public void send(String orderId) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		qr.update("update s_order set state=3 where orderId=?", orderId);
	}

	//通过订单ID查找订单并把订单状态设置为2，表示已接单
	public void acceptOrder(String orderId) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		qr.update("update s_order set state=2 where orderId=?", orderId);
	}

	public Order findOrderById(String orderId) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		return qr.query("select * from s_order where orderId=?", new BeanHandler<Order>(Order.class), orderId);
	}

	

	
	

}
