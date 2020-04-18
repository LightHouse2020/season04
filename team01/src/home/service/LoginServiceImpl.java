package home.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import home.form.LoginForm;
import home.result.ServiceResult;
import jdbc.ConnectionDemo;

// POJO
public class LoginServiceImpl implements Service {

	@Override
	public ServiceResult execute(LoginForm form) {
		final Connection conn = ConnectionDemo.getConnection();// ***业务逻辑层代码
		String username=form.getUsername();
		String password=form.getPassword();
		PreparedStatement stmt = null;// **持久层代码
		ResultSet rs = null;// **持久层代码
		final ServiceResult serviceResult = new ServiceResult();
		boolean hasUserInfo = false;
		try {// **持久层代码
			stmt = conn.prepareStatement("select * from login order by id");// **持久层代码
			rs = stmt.executeQuery();// **持久层代码
			while (rs.next()) {
				if(rs.getString(2).contentEquals(username)&&rs.getString(3).contentEquals(password)) {
					serviceResult.setStatus("success");
					serviceResult.setPageId("/jsp/home.jsp");
				}
			}
				serviceResult.setStatus("false");
				serviceResult.setPageId("/jsp/register.jsp");
		} catch (final SQLException e) {
			e.printStackTrace();
		}

		return serviceResult;

	}

}
