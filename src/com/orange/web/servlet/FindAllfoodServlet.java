package com.orange.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.orange.domain.Food;
import com.orange.domain.Store;
import com.orange.exception.FoodException;
import com.orange.service.FoodService;

/**
 * Servlet implementation class FindAllfoodServlet
 */
@WebServlet("/findAllfoodServlet")
public class FindAllfoodServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Store store = (Store) session.getAttribute("store");
		int storeId = store.getStoreId();
		
		FoodService ds = new FoodService();
		try {
			List<Food> food = ds.findAllfood(storeId);
			request.setAttribute("food", food);
			request.getRequestDispatcher("/store/food.jsp").forward(request, response);
		} catch (FoodException e) {
			e.printStackTrace();
			request.setAttribute("food_msg", e.getMessage());
			request.getRequestDispatcher("/store/food.jsp").forward(request, response);
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
