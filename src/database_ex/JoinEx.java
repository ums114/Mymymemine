package database_ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JoinEx {

	// Join
	// ���� ���̺� ���� ������ �˻�
	// ���� >
	// select [tablename],[column],[tablename],[column]
	// from[tablename],[tablename]
	// where [���̺�1].[����Į����] = [���̺�2][����Į����];

	public JoinEx() {
		Connection conn = DBAction.getInstance().getConnection();
		// ex1)
		/* */
	String sql = "select chatuser.name, test.name "
				+ " from chatuser, test "
				+ " where chatuser.name = test.name";

//		ex)2
		
//		  String sql = "select chatuser.name = test.name "
//		  + " from chatuser, test " +" where chatuser.id = 'ȫ�浿' "
//		  +" and test.id = '������'";
		 

		ResultSet rs = null;
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int columncount = rsmd.getColumnCount();
			for (int i = 1; i <= columncount; i++) {
				System.out.print(rsmd.getColumnName(i) + "\t");
			}
			System.out.println();
			while (rs.next()) {
				for (int i = 1; i <= columncount; i++) {
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static void main(String args[]) {
		new JoinEx();
	}
}
