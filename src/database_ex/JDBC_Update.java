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
			System.out.println("�����ͺ��̽� ���� ����!");
			stmt = con.createStatement();
			// ���̺� �߰��� ������ ���� �ܼ� â���� ������� �Է��� �޵��� �Ѵ�.
			// UPDATE cunstomer SET password = '123',vip = 'n',
			// name = '������' WHERE ID = 'abc';

			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));

			// java.util.Scanner scan = new java.util.Scanner(System.in);

			System.out.println("customer ���̺� �� �����ϱ�....");

			// id �ʵ� ���� �Է� ����
			System.out.println("ID �Է� : ");
			String id = br.readLine();

			// name �ʵ� ���� �Է� ����
			// System.out.println("������ �̸��� �Է��ϼ��� : ");
			// String name = br.readLine();

			// password �ʵ� ���� �Է� ����
			System.out.println("������ password �Է� : ");
			String password = br.readLine();

			// vip �ʵ� ���� �Է� ����
			// System.out.println("������ vip �Է� : ");
			// String vip = br.readLine();

			// update �������� �ۼ�

			// String sql = "UPDATE customer SET password = '" + password +
			// "' , vip = '" + vip + "'," +"name ='" + name + "'" +"WHERE ID ='"
			// + id + "'";

//			String sql = "UPDATE chatuser SET name =  '������' " + "WHERE ID ='"
//					+ id + "'";
			 String sql = "UPDATE customer SET pw = '123'  WHERE ID ='ums114' ";

			// SQL ǥ��) update [tablename] set colum_name = colum_value, ...where
			// [colum_name] = colum_value

			// Statement ��ü�� executeUpdate(sql)�޼��带 �̿���
			// �����ͺ��̽� ������ ������ �����Ŵ
			int result = stmt.executeUpdate(sql);
			String msg = result > -1 ? "successful" : "fail";
			System.out.println(msg);
		} catch (Exception e) {
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
