package database_ex;

import java.sql.Connection;
import java.sql.DriverManager;

public class JBC_Connect02 {
	public static void main(String args[]) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "hr", "hr");
			System.out.println("데이터베이스 연결 성공!");

		} catch (Exception e) {
			System.out.println("데이터베이스 연결 실패!");
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
