package com.orange.service;

import java.sql.SQLException;
import java.util.List;

import com.orange.dao.OrderDao;
import com.orange.domain.Order;
import com.orange.exception.OrderException;

public class OrderService {

	OrderDao od = new OrderDao();
	
	

	


	public List<Order> findOrderList1(int storeId) throws OrderException {
		try {
			return od.findOrderList1(storeId);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new OrderException("没有待处理订单");
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
