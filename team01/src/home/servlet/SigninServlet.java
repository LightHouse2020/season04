package home.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SigninServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {

	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		String signin_username=request.getParameter("signin_username");
		String signin_password=request.getParameter("signin_password");
		String signin_phonenumber=request.getParameter("signin_phonenumber");
		System.out.print(signin_username);
		System.out.print(signin_password);
		System.out.print(signin_phonenumber);
		request.getRequestDispatcher("login.jsp").forward(request, response);
		
		}
}
