package database_ex;

public class JDBC_Connect01 {

	public static void main(String args[]) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		try {
			Class.forName(driver);
			System.out.println("데이터베이스 드라이버 로딩 성공");
		} catch (Exception e) {
			System.out.println("데이터베이스 드라이버 로딩 실패!");
		}
	}

}
