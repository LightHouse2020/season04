package home.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		request.getRequestDispatcher("/html/home.html").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		String login_username=request.getParameter("login_username");
		String login_password=request.getParameter("login_password");
		String signin_username=request.getParameter("signin_username");
		String signin_password=request.getParameter("signin_password");
		System.out.print(signin_username);
		request.getRequestDispatcher("/html/home.html").forward(request, response);
		if("meng".equals(login_username)&&"123456".equals(login_password)) {
			request.getRequestDispatcher("jsp/home.html").forward(request, response);
		}
		else {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		}
}
