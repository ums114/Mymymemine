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
			System.out.println("�����ͺ��̽� ���� ����!");
			stmt = con.createStatement();

			// ���̺� �߰��� ������ ���� �ܼ� â���� ������� �Է��� �޵��� �Ѵ�.
			// DELETE FROM customer WHERE id = 'abc';

			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));

			// java.util.Scanner scan = new java.util.Scanner(System.in)
			System.out.println("test ���̺� �� �����ϱ�....");
			// id �ʵ� ���� �Է� ����
			System.out.println("ID �Է� : ");
			String id = br.readLine();

			// DELETE �������� �ۼ�
			String sql = "DELETE FROM test " + " WHERE ID = '" + id + "' ";

			// String sql = "drop table test" << ���̺� ��ü�� �����.
			// Statement ��ü�� executeUpdate(sql) �޼��带 �̿���
			// �����ͺ��̽� ������ ������ ������Ŵ
			int result = stmt.executeUpdate(sql);
			String msg = result > -1 ? "successful" : "fail";
			System.out.println(msg);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�����ͺ��̽� ���� ����!");

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
