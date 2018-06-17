package com.orange.web.servlet;

import java.io.IOException;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.orange.domain.Dish;

import com.orange.service.DishService;

/**
 * Servlet implementation class ModifyDishServlet
 */
@WebServlet("/modifyDishServlet")
public class ModifyDishServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Dish dish = new Dish();
		try {
			
			BeanUtils.populate(dish, request.getParameterMap());
			
			DishService ds = new DishService();
			ds.modifyDish(dish);
			response.sendRedirect(request.getContextPath()+"/store/modifydishsucc.jsp");
		} catch (Exception e) {
			response.getWriter().write(e.getMessage());
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
