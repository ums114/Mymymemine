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
			System.out.println("�����ͺ��̽� ���� ����");
			stmt = con.createStatement();

			// =========JDBC_Insert �߰��� ����==========
			String sql = insert();

			int result = stmt.executeUpdate(sql);
			String msg = result > -1 ? "successful" : "fail";
			System.out.println(msg);

		} catch (Exception e) {
			System.out.println("����Ʈ���̽� ���� ����!");

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

		System.out.println(" customer ���̺� �� �Է��ϱ�.....");
		// System.out.println("��ȣ �Է� : ");
		// int num = br.readLine(); //can.next();
		int num = 1;

		// ���̺� �߰��� name �ʵ� ���� �Է� ����
		// System.out.println("�̸� �Է� : ");
		// String name = scan.next();

		// ���̺� �߰��� id �ʵ� ���� �Է� ����
		System.out.println("���̵� �Է� : ");
		String id = scan.next();

		System.out.println("��  ȣ �Է� : ");
		String pw = scan.next();

		// ���̺� �߰��� gold �ʵ� ���� �Է� ����
		// System.out.println(" ��   �� �Է� : ");
		// int gold = scan.nextInt();

		// ���̺� �߰��� vip �ʵ� ���� �Է� ����
		// System.out.println(" vip  �Է� : ");
		// String vip = br.readLine();

		// Insert �������� �ۼ�

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