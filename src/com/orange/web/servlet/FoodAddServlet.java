package com.orange.web.servlet;

import java.io.IOException;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;

import com.orange.domain.Food;
import com.orange.domain.Store;
import com.orange.exception.FoodException;
import com.orange.service.FoodService;

/**
 * Servlet implementation class FoodAddServlet
 */
@WebServlet("/foodAddServlet")
public class FoodAddServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取表单数据
		Food food = new Food();
		HttpSession session = request.getSession();
		Store store = (Store) session.getAttribute("store");
		try {
			try {
				BeanUtils.populate(food, request.getParameterMap());
				food.setStoreId(store.getStoreId());
			} catch (Exception e) {
				e.printStackTrace();
			}
			//调用业务逻辑
			FoodService ds = new FoodService();
			ds.addFood(food);
			//分发转向
			request.getRequestDispatcher("/store/food_addsuccess.jsp").forward(request, response);
		} catch (FoodException e) {
			request.setAttribute("foodadd_msg", e.getMessage());
			request.getRequestDispatcher("/store/food_add.jsp").forward(request, response);
			return;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
