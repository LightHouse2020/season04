package sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jdbc.DBHelper;

public class PreparedStatementDemo {
	public static void main(String[] args) throws Exception {
		Connection conn = DBHelper.getConnection();
		// PreparedStatement stmt = conn.prepareStatement("insert into test_table values(?,?)");
		// stmt.setInt(1, 4);
		// stmt.setString(2, "老谭");
		// stmt.execute();
		PreparedStatement stmt = conn.prepareStatement("select * from login order by id");
//		stmt.setString(1, "user");
//		stmt.setString(2, "000003");
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			System.out.print(rs.getString(1)+',');
			System.out.print(rs.getString(2)+',');
			System.out.println(rs.getString(3));
		}
	}
}
