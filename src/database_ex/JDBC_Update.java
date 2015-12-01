package database_ex;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Update {
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
			// UPDATE cunstomer SET password = '123',vip = 'n',
			// name = '만득이' WHERE ID = 'abc';

			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));

			// java.util.Scanner scan = new java.util.Scanner(System.in);

			System.out.println("customer 테이블에 값 갱신하기....");

			// id 필드 값을 입력 받음
			System.out.println("ID 입력 : ");
			String id = br.readLine();

			// name 필드 값을 입력 받음
			// System.out.println("변경할 이름을 입력하세요 : ");
			// String name = br.readLine();

			// password 필드 값을 입력 받음
			System.out.println("변경할 password 입력 : ");
			String password = br.readLine();

			// vip 필드 값을 입력 받음
			// System.out.println("변경할 vip 입력 : ");
			// String vip = br.readLine();

			// update 쿼리문을 작성

			// String sql = "UPDATE customer SET password = '" + password +
			// "' , vip = '" + vip + "'," +"name ='" + name + "'" +"WHERE ID ='"
			// + id + "'";

//			String sql = "UPDATE chatuser SET name =  '개똥이' " + "WHERE ID ='"
//					+ id + "'";
			 String sql = "UPDATE customer SET pw = '123'  WHERE ID ='ums114' ";

			// SQL 표현) update [tablename] set colum_name = colum_value, ...where
			// [colum_name] = colum_value

			// Statement 객체의 executeUpdate(sql)메서드를 이용해
			// 데이터베이스 파일의 내용을 변경시킴
			int result = stmt.executeUpdate(sql);
			String msg = result > -1 ? "successful" : "fail";
			System.out.println(msg);
		} catch (Exception e) {
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
