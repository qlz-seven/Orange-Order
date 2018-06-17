package com.orange.web.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.orange.domain.StoreUser;
import com.orange.exception.UserException;
import com.orange.service.S_UserService;


@WebServlet("/sregisterServlet")
public class S_RegisterServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//获取表单数据
		StoreUser store = new StoreUser();
		try {
			BeanUtils.populate(store, request.getParameterMap());
			//调用业务逻辑
			S_UserService usi =  new S_UserService();
			usi.regist(store);
			//分发转向
			request.getSession().setAttribute("store", store);
			request.getRequestDispatcher("/store/registsuccess.jsp").forward(request, response);
		}catch(UserException e) {
			request.setAttribute("store_msg", e.getMessage());
			request.getRequestDispatcher("/store/store_registe.jsp").forward(request, response);
			return;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}


}
