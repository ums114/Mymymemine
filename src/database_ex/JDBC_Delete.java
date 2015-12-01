package database_ex;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Delete {
	public static void main(String args[]) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";

		Connection con = null;
		Statement stmt = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "hr", "hr");
			System.out.println("데이터베이스 연결 성공!");
			stmt = con.createStatement();

			// 테이블에 추가할 내용을 도스 콘솔 창에서 사용자의 입력을 받도록 한다.
			// DELETE FROM customer WHERE id = 'abc';

			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));

			// java.util.Scanner scan = new java.util.Scanner(System.in)
			System.out.println("test 테이블에 값 삭제하기....");
			// id 필드 값을 입력 받음
			System.out.println("ID 입력 : ");
			String id = br.readLine();

			// DELETE 쿼리문을 작성
			String sql = "DELETE FROM test " + " WHERE ID = '" + id + "' ";

			// String sql = "drop table test" << 테이블 자체를 지운다.
			// Statement 객체의 executeUpdate(sql) 메서드를 이용해
			// 데이터베이스 파일의 내용을 삭제시킴
			int result = stmt.executeUpdate(sql);
			String msg = result > -1 ? "successful" : "fail";
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
