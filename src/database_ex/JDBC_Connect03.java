package database_ex;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_Connect03 {
	public static void main(String args[]) {
		// String driver = "com.mysql.jdbc.Driver";
		// String url = "jdbc:mysql://localhost/webapp";
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		Connection con = null;
		Statement stmt = null;

		Statement pstmt = null;
		// PreparedStatement pstmt = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "hr", "hr");
			System.out.println("데이터베이스 연결 성공!");
			stmt = con.createStatement();
			System.out.println("Statement instance : " + stmt);

		} catch (Exception e) {
			System.out.println("데이터베이스 연결 실패 !");
		} finally {
			try {
				if (con != null)
					stmt.close();
				if (stmt != null)
					con.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}
}
