package com.orange.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.orange.exception.DishException;
import com.orange.service.DishService;

/**
 * Servlet implementation class DelDishServlet
 */
@WebServlet("/delDishServlet")
public class DelDishServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("dishId");
		int dishId = Integer.parseInt(id);
		DishService ds = new DishService();
		try {
			ds.delDish(dishId);
			request.getRequestDispatcher("/store/dish.jsp").forward(request, response);
		} catch (DishException e) {
			e.printStackTrace();
			request.setAttribute("deldish_msg", e.getMessage());
			request.getRequestDispatcher("/store/dish.jsp").forward(request, response);
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
