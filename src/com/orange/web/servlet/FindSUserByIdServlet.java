package com.orange.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.orange.domain.StoreUser;
import com.orange.exception.UserException;
import com.orange.service.S_UserService;

/**
 * Servlet implementation class FindSUserByIdServlet
 */
@WebServlet("/findSUserByIdServlet")
public class FindSUserByIdServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String storeId = request.getParameter("storeId");
		S_UserService sus = new S_UserService();
		try {
			StoreUser store = sus.findUserById(storeId);
			request.setAttribute("store", store);
			request.getRequestDispatcher("/store/storeinfo.jsp").forward(request, response);
		} catch (UserException e) {
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
