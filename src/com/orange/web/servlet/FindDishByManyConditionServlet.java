package com.orange.web.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.orange.domain.Dish;
import com.orange.exception.DishException;
import com.orange.service.DishService;


import com.orange.domain.StoreUser;


/**
 * Servlet implementation class FindDishByManyConditionServlet
 */
@WebServlet("/findDishByManyConditionServlet")
public class FindDishByManyConditionServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//获取表单数据
		String dishName = request.getParameter("dishName");
		HttpSession session = request.getSession();
		StoreUser store = (StoreUser)session.getAttribute("store");
		int storeId = store.getStoreId();
		
		DishService ds = new DishService();
		try {
			Dish dish = ds.findDishByDishname(dishName,storeId);
			request.setAttribute("dish", dish);
			request.getRequestDispatcher("/store/dish_list.jsp").forward(request, response);
		} catch (DishException e) {
			e.printStackTrace();
			request.setAttribute("dish_msg", e.getMessage());
			request.getRequestDispatcher("/store/dish_list.jsp").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
