/*
 * Copyright (C) 2013?�?2023
 * Yfann Software Technology (Shanghai) Co.?��LTD
 * All Rights Reserved.
*/

package com.itedu.team03_01.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class IteduDispatcherServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String urlStr = request.getRequestURI();
		request.getSession().setAttribute("userId", "123456789");
		if ("/team03_01/home".equals(urlStr)) {
			request.getRequestDispatcher("/WEB-INF/jsp/home.jsp").forward(request, response);
		}else if ("/team03_01/login".equals(urlStr)) {
			request.getRequestDispatcher("/WEB-INF/jsp/XXX.jsp").forward(request, response);
		}

		else if ("".equals(urlStr)) {
			request.getRequestDispatcher("/WEB-INF/jsp/XXX.jsp").forward(request, response);
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String urlStr = request.getRequestURI();
		if ("/team03_01/complete".equals(urlStr)) {
			
			String username = request.getParameter("username");
			System.out.println(username);
			
			String userId= (String) request.getSession().getAttribute("userId");
			System.out.println(userId);
			
			request.setAttribute("username", username);
			request.getRequestDispatcher("/WEB-INF/jsp/complete.jsp").forward(request, response);

		} else if ("".equals(urlStr)) {
			request.getRequestDispatcher("/WEB-INF/jsp/XXX.jsp").forward(request, response);
		}

	}

}
