package sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.DBHelper;

public class SigninDemo {
	public static void main(String[] args) throws Exception {
		int exist_id=0;
		Connection conn = DBHelper.getConnection();
		PreparedStatement stmt = conn.prepareStatement("select * from login order by id");
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			exist_id=exist_id+1;
		}
		try {
			Statement stmt1 = conn.createStatement();
			stmt1.executeUpdate("insert into student(id,name) values(exist_id+1,'James')");
			System.out.println(10);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
