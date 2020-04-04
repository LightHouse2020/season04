package home.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdbc.ConnectionDemo;

public class HomeServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {

	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		
		String urlStr = request.getRequestURI();

		
		//LoginDemo 对比数据库中的用户名和密码，若成功则进入到主页
		if ("/team01/home".equals(urlStr)) {
			String login_username=request.getParameter("login_username");
			String login_password=request.getParameter("login_password");
			Connection conn = ConnectionDemo.getConnection();
	
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
						request.setAttribute("success", "True");
						request.getRequestDispatcher("/jsp/home.jsp").forward(request, response);
					}
				}
				request.setAttribute("success", "False");
				request.getRequestDispatcher("login.jsp").forward(request, response);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		//SigninDemo 将用户输入的用户名和密码写入数据库
		if ("/team01/sign_in".equals(urlStr)) {
			String signin_username;
			String signin_password;
			String signin_phonenumber;
			
			int exist_id=0;
			signin_username=request.getParameter("signin_username");
			signin_password=request.getParameter("signin_password");
			signin_phonenumber=request.getParameter("signin_phonenumber");
			System.out.print(signin_username);
			System.out.print(signin_password);
			System.out.print(signin_phonenumber);
			
			//如果输入的值为空，则提示错误并保持原界面
			if (signin_username==""||signin_password==""||signin_phonenumber=="") {
				request.getRequestDispatcher("jsp/sign_in.jsp").forward(request, response);
			}
			
			//创建一个连接到数据库
			Connection conn = ConnectionDemo.getConnection();
			
//			//创建一个新的数据库
//				int number=1;
				
//				Statement stmt2 = null;
//				try {
//					stmt2 = conn.createStatement();
//				} catch (SQLException e2) {
//					// TODO Auto-generated catch block
//					e2.printStackTrace();
//				}
//				if (number==1) {
//				try {
//					stmt2.executeQuery("CREATE TABLE public.login\r\n" + 
//							"(\r\n" + 
//							"    id integer NOT NULL,\r\n" + 
//							"    user_name character varying(64) COLLATE pg_catalog.\"default\",\r\n" + 
//							"    password character varying(64) COLLATE pg_catalog.\"default\",\r\n" + 
//							"    phone_number character varying(64) COLLATE pg_catalog.\"default\",\r\n" + 
//							"    CONSTRAINT lesson_pkey1 PRIMARY KEY (id)\r\n" + 
//							")\r\n" + 
//							"WITH (\r\n" + 
//							"    OIDS = FALSE\r\n" + 
//							")\r\n" + 
//							"TABLESPACE pg_default;\r\n" + 
//							"\r\n" + 
//							"ALTER TABLE public.login\r\n" + 
//							"    OWNER to postgres;");
//					number=number+1;
//				} catch (SQLException e2) {
//					// TODO Auto-generated catch block
//					e2.printStackTrace();
//				}
//				}
			
			// 将用户的信息写入数据库
			PreparedStatement stmt = null;
			try {
				stmt = conn.prepareStatement("select * from login order by id");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			ResultSet rs = null;
			try {
				rs = stmt.executeQuery();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				while (rs.next()) {
					exist_id=exist_id+1;
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				if (signin_username!=""&&signin_password!=""&&signin_phonenumber!="") {
					Statement stmt1 = conn.createStatement();
					stmt1.executeUpdate("insert into login(id,user_name,password,phone_number) "
							+ "values('" + (exist_id+1) + "','"+signin_username+"','"+signin_password+"','"+signin_phonenumber+"')");
				}		
			} catch (SQLException e) {
				e.printStackTrace();
			}
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return;
		}
		
		
		if ("/team01/log_out".equals(urlStr)) {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
	}
}
