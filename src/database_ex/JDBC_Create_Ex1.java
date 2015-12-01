package database_ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Create_Ex1 {
	public static void main(String args[]) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		Connection con = null;
		Statement stmt = null;

		Statement pstmt = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "hr", "hr");
			System.out.println("데이터베이스 연결 성공");
			stmt = con.createStatement();
			String sql1 = "CREATE TABLE bankcustomer(no number(1) PRIMARY KEY , 이름 VARCHAR(20) not null , id VARCHAR(20) not null , pw varchar2(10) not null , cash number(10) not null)";
			
			
			int result1 = stmt.executeUpdate(sql1);
			String msg = result1 > -1 ? "successful" : "fail";
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("데이터베이스 연결 실패!");
		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
