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
 * Servlet implementation class FindStoreByIdServlet
 */
@WebServlet("/findStoreByIdServlet")
public class FindStoreByIdServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String storeId = request.getParameter("storeId");
		StoreService sus = new StoreService();
		try {
			Store store = sus.findUserById(storeId);
			request.setAttribute("store", store);
			request.getRequestDispatcher("/store/storeinfo.jsp").forward(request, response);
		} catch (StoreException e) {
			e.printStackTrace();
			response.sendRedirect(request.getContextPath()+"/store/store_login.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
