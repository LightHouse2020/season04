package com.itedu.team03_01.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServletDemon extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   	 String username = request.getParameter("username");
     String password = request.getParameter("password");
     String email = request.getParameter("email");
     request.setAttribute("username", username);
     request.setAttribute("password", password);
     request.setAttribute("email", email);
     System.out.println("username=" + username);
     System.out.println("password=" + password);
     System.out.println("email=" + email);
     request.getSession().setAttribute("userId", "987654321");
		 if((username!=null)&&(password!=null)&&(email!=null)) {
			  request.getRequestDispatcher("/WEB-INF/jsp/confirm.jsp").forward(request, response);
			 }else {
			  request.getRequestDispatcher("register.jsp").forward(request, response);
			 }

       
    }
}
