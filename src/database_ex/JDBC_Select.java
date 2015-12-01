package database_ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Select {
	public static void main(String args[]) {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";

		Connection con = null;
		Statement stmt = null;
		// ---JDBC_Select �߰��� ���� -----
		ResultSet rs = null;
		int no = 0;
		// String name, email, tel; //�����ͺ��̽����� ���� �ʵ尪 ������ ����
		String id, pw;
		String sql; // SQL���� ������ ���� ����
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "hr", "hr");
			stmt = con.createStatement();
			// ---JDBC_Select �߰��� ���� -----
			sql = "SELECT id,pass FROM test";
			System.out.println("��ȣ \t �̸� \t\t �̸��� \t\t ��ȭ��ȣ \n");
			System.out.println("----------------------------------");
			rs = stmt.executeQuery(sql); // ����� ���ڵ带 ������
			while (rs.next()) {
				/*
				 * no = rs.getInt("no"); name = rs.getString("name"); email =*
				 * rs.getString("email"); tel = rs.getString("tel");
				 */
				id = rs.getString("id");
				pw = rs.getString("pass");
				System.out.println("id : " + id + " , pw : " + pw);

			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�����ͺ��̽� ���� ���� !");

		} finally {

			try { // rs, stmt, con ��ü�� close() �޼��带 ȣ���� ����
				if (rs != null)
					rs.close();
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