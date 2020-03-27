package sql;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.DBHelper;


//在数据库中删除不要的id
public class RefreshSQL {
	public static void main(String[] args) {
		Connection conn = DBHelper.getConnection();
		try {
			Statement stmt = conn.createStatement();
			stmt.execute("delete from login where id between 7 and 40");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
