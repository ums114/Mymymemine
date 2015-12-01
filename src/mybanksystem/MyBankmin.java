package mybanksystem;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyBankmin extends Frame implements ActionListener {
	public JPanel p, p1, p2;
	public JLabel la, idla, mola, addla, la1, la2, la3, la4, la5, la6, la7,
			la8, la9, imgla;
	public JTextField tf;
	public JButton bt1, bt2;

	public String id;

	MyBankmin(String id) {
		this.id = id;
		setTitle("출금 화면");

		JPanel p = new JPanel();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		p.setBackground(Color.white);
		p1.setBackground(Color.white);
		p2.setBackground(Color.white);

		bt1 = new JButton("출 금");
		bt2 = new JButton("이 전 화 면");

		tf = new JTextField("출금액을 입력하세요", 10);

		JLabel la = new JLabel();
		JLabel idla = new JLabel("아이디  :");
		JLabel mola = new JLabel("현재잔고  :");
		JLabel addla = new JLabel("출금 액 :");
		JLabel la1 = new JLabel();
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

		add(p, "North");
		p.add(imgla);

		add(p1, "Center");

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

		p2.setLayout(new GridLayout(2, 2));
		add(p2, "South");
		p2.add(la8);
		p2.add(la9);
		p2.add(bt1);
		p2.add(bt2);

		bt1.addActionListener(this);
		bt2.addActionListener(this);

		setSize(500, 500);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

	void db_connectmin() {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "hr", "hr");
			System.out.println("데이터베이스 연결 성공!");
			String sql = "SELECT * from CUSTOMER WHERE ID = '" + id + "'";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				int cash = rs.getInt("cash") - Integer.parseInt(tf.getText());

				System.out.println(id);
				sql = "UPDATE customer SET cash= '" + cash + "'  WHERE ID = '"
						+ id + "' ";

				int result = stmt.executeUpdate(sql);
				String msg = result > -1 ? "successful" : "fail";
				System.out.println(msg);
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("데이터베이스 연결 실패!");
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

	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (bt1 == obj) {
			db_connectmin();
		}

	}

	// public static void main(String args[]) {
	// // new MyBankmin();
	// }

}
