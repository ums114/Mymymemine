package database_ex;

public class JDBC_Connect01 {

	public static void main(String args[]) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		try {
			Class.forName(driver);
			System.out.println("�����ͺ��̽� ����̹� �ε� ����");
		} catch (Exception e) {
			System.out.println("�����ͺ��̽� ����̹� �ε� ����!");
		}
	}

}
