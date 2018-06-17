package com.orange.web.servlet;

import java.io.IOException;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;

import com.orange.domain.Dish;
import com.orange.domain.StoreUser;
import com.orange.exception.DishException;
import com.orange.service.DishService;

/**
 * Servlet implementation class DishAddServlet
 */
@WebServlet("/dishAddServlet")
public class DishAddServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取表单数据
		Dish dish = new Dish();
		HttpSession session = request.getSession();
		StoreUser store = (StoreUser) session.getAttribute("store");
		try {
			try {
				BeanUtils.populate(dish, request.getParameterMap());
				dish.setStoreId(store.getStoreId());
			} catch (Exception e) {
				e.printStackTrace();
			}
			//调用业务逻辑
			DishService ds = new DishService();
			ds.addDish(dish);
			//分发转向
			request.getRequestDispatcher("/store/dish_addsuccess.jsp").forward(request, response);
		} catch (DishException e) {
			request.setAttribute("dishadd_msg", e.getMessage());
			request.getRequestDispatcher("/store/dish_add.jsp").forward(request, response);
			return;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
