package com.orange.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.orange.domain.Dish;
import com.orange.exception.DishException;
import com.orange.service.DishService;

/**
 * Servlet implementation class FindDishByIdServlet
 */
@WebServlet("/findDishByIdServlet")
public class FindDishByIdServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dishId = request.getParameter("dishId");
		DishService ds = new DishService();
		try {
			Dish dish = ds.findDishById(dishId);
			request.setAttribute("dish", dish);
			request.getRequestDispatcher("/store/dish_edit.jsp").forward(request, response);
		} catch (DishException e) {
			e.printStackTrace();
			request.setAttribute("dish_msg",e.getMessage());
			request.getRequestDispatcher("/store/dish_edit.jsp").forward(request, response);
			
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
