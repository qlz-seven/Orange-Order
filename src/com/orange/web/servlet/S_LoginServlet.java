package com.orange.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.orange.domain.Store;
import com.orange.exception.StoreException;
import com.orange.service.StoreService;

/**
 * Servlet implementation class S_LoginServlet
 */
@WebServlet("/sloginServlet")
public class S_LoginServlet extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取表单数据
		String storeName = request.getParameter("storeName");
		String password = request.getParameter("password");
		
		StoreService us = new StoreService();
		try {
			Store store = us.login(storeName,password);
			request.getSession().setAttribute("store", store);
			request.getRequestDispatcher("/store/index.jsp").forward(request, response);
		} catch (StoreException e) {
			e.printStackTrace();
			request.setAttribute("store_msg", e.getMessage());
			request.getRequestDispatcher("/store/store_login.jsp").forward(request, response);
		}
		//调用业务逻辑
		
		//分发转向
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
