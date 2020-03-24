package com.itedu.team03_01.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServletDemon extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   	 String username = request.getParameter("username");
     String password = request.getParameter("password");

         request.setAttribute("username", username);
         request.setAttribute("password", password);
         System.out.println("username=" + username);
         System.out.println("password=" + password);

         
		 if("admin".equals(username)&&"admin".equals(password)) {
			  request.getRequestDispatcher("/WEB-INF/jsp/home.jsp").forward(request, response);
			 }else {
			  request.getRequestDispatcher("login.jsp").forward(request, response);
			 }
       
       
    }
}
