package database_ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * orcale Between mysql limit
 * 
 * Ư�� ������ �����͸� �˻��ҋ� ���.
 */

public class Between_Limit {

	public Between_Limit() {
		DBAction db = DBAction.getInstance();
		Connection conn = db.getConnection();
		String sql = "select * from chatuser "
				+ "where id between 'a' and 'b' order by id ASC";
		/* mysql limit */
		// select * from chatuser limit 2, 5 order by id desc;

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			while (rs.next()) {
				System.out.print(rs.getString("id"));
				System.out.print(rs.getString("pw"));
				System.out.println(rs.getString("name"));
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
		new Between_Limit();
	}
}
