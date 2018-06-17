package com.orange.service;

import java.sql.SQLException;
import java.util.List;

import com.orange.dao.OrderDao;
import com.orange.domain.Order;
import com.orange.exception.OrderException;

public class OrderService {

	OrderDao od = new OrderDao();
	
	

	


	public List<Order> findOrderList1(String storeName) throws OrderException {
		try {
			return od.findOrderList1(storeName);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new OrderException("状态为1的订单查找失败");
		}
	}




	public void send(String orderId) throws OrderException {
		try {
			od.send(orderId);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new OrderException("送餐失败");
		}
	}




	public void acceptOrder(String orderId) throws OrderException {
		try {
			od.acceptOrder(orderId);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new OrderException("修改订单状态失败");
		}
	}




	public Order findOrderById(String orderId) throws OrderException {
		try {
			return od.findOrderById(orderId);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new OrderException("订单查找失败！");
		}
	}




	




	
	
	

}
