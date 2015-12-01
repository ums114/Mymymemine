package mybanksystem;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import database_ex.DBAction;

public class MyBankadd extends JFrame implements ActionListener {
	public JPanel p, p1, p2;
	public JLabel la, idla, mola, addla, la1, la2, la3, la4, la5, la6, la7,
			la8, la9, imgla;
	public JTextField tf;
	public JButton bt1, bt2;
	public String id;

	MyBankadd(String id) {
		this.id = id;
		setTitle("�Ա� ȭ��");

		JPanel p = new JPanel();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		p.setBackground(Color.white);
		p1.setBackground(Color.white);
		p2.setBackground(Color.white);

		bt1 = new JButton("�� ��");
		bt2 = new JButton("�� �� ȭ ��");

		tf = new JTextField("�Աݾ��� �Է��ϼ���", 10);

		JLabel la = new JLabel();
		JLabel idla = new JLabel("���̵�  :");
		JLabel mola = new JLabel("�����ܰ�  :");
		JLabel addla = new JLabel("�Ա� �� :");
		JLabel la1 = new JLabel(id);
		JLabel la2 = new JLabel();
		JLabel la3 = new JLabel();
		JLabel la4 = new JLabel();
		JLabel la5 = new JLabel();
		JLabel la6 = new JLabel();
		JLabel la7 = new JLabel();
		JLabel la8 = new JLabel();
		JLabel la9 = new JLabel();

		setLayout(new GridLayout(3, 1));
		p1.setLayout(new GridLayout(3, 4));
		ImageIcon img = new ImageIcon("c:/img/logo.jpg");
		imgla = new JLabel(" ", img, JLabel.TRAILING);

		add(p);
		p.add(imgla);

		add(p1);

		Connection conn = DBAction.getInstance().getConnection();
		String sql = "select cash from customer where id = '" + id + "'";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				la4.setText(rs.getString(1));
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		p1.add(la);
		p1.add(idla);
		p1.add(la1);
		p1.add(la2);

		p1.add(la3);
		p1.add(mola);
		p1.add(la4);
		p1.add(la5);

		p1.add(la7);
		p1.add(addla);
		p1.add(tf);
		p1.add(la6);

		tf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf.setText("");
			}
		});

		p2.setLayout(new GridLayout(2, 2, 5, 5));
		add(p2);
		p2.add(la8);
		p2.add(la9);
		p2.add(bt1);
		p2.add(bt2);

		bt1.addActionListener(this);
		bt2.addActionListener(this);

		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	void db_connectadd() {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "hr", "hr");
			System.out.println("�����ͺ��̽� ���� ����!");
			String sql = "SELECT * from CUSTOMER WHERE ID = '" + id + "'";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				int cash = rs.getInt("cash") + Integer.parseInt(tf.getText());

				sql = "UPDATE customer SET cash= '" + cash + "'  WHERE ID = '"
						+ id + "' ";

				int result = stmt.executeUpdate(sql);
				String msg = result > -1 ? "successful" : "fail";
				System.out.println(msg);

			}

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
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		if (obj == bt1) {
			db_connectadd();
		}

	}

	// public static void main(String args[]) {
	// new MyBankadd();
	// }

}
