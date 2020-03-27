package home.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdbc.DBHelper;

public class HomeServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		request.getParameter("username");
		request.getParameter("password");
		request.getRequestDispatcher("/html/home.html").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		String login_username=request.getParameter("login_username");
		String login_password=request.getParameter("login_password");
		Connection conn = DBHelper.getConnection();

		PreparedStatement stmt = null;
		try {
			stmt = conn.prepareStatement("select * from login order by id");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ResultSet rs = null;
		try {
			rs = stmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while (rs.next()) {
				if(rs.getString(2).contentEquals(login_username)&&rs.getString(3).contentEquals(login_password)) {
					request.getRequestDispatcher("jsp/home.html").forward(request, response);
				}
			}
			request.getRequestDispatcher("login.jsp").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}
