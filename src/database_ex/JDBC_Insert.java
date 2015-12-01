package database_ex;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Insert {
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

			// =========JDBC_Insert 추가된 내용==========
			String sql = insert();

			int result = stmt.executeUpdate(sql);
			String msg = result > -1 ? "successful" : "fail";
			System.out.println(msg);

		} catch (Exception e) {
			System.out.println("데이트베이스 연결 실패!");

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

	public static String insert() throws IOException {
		java.util.Scanner scan = new java.util.Scanner(System.in);

		System.out.println(" customer 테이블에 값 입력하기.....");
		// System.out.println("번호 입력 : ");
		// int num = br.readLine(); //can.next();
		int num = 1;

		// 테이블에 추가할 name 필드 값을 입력 받음
		// System.out.println("이름 입력 : ");
		// String name = scan.next();

		// 테이블에 추가할 id 필드 값을 입력 받음
		System.out.println("아이디 입력 : ");
		String id = scan.next();

		System.out.println("암  호 입력 : ");
		String pw = scan.next();

		// 테이블에 추가할 gold 필드 값을 입력 받음
		// System.out.println(" 잔   고 입력 : ");
		// int gold = scan.nextInt();

		// 테이블에 추가할 vip 필드 값을 입력 받음
		// System.out.println(" vip  입력 : ");
		// String vip = br.readLine();

		// Insert 쿼리문을 작성

		// String sql = "INSERT into" + "customer values" + "("// +num +",'"
		// + // name +
		// "','" + id + "','" + pw + "',"
		// // gold + "','"
		// // + vip
		// + "')";

		String sql = "INSERT into chatuser values ('" + id + "' , '" + pw
				+ "','')";
		// String sql = "INSERT into test values ('id','pw')";
		return sql;

	}
}