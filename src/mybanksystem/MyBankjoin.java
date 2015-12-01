package mybanksystem;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyBankjoin extends Frame implements ActionListener {
	public Panel p1, p2, p3;
	public Label la1, la2, la3, la4, la5, la6, namela, idla, pwla, cashla;
	public JLabel imgla;
	public JTextField idtf, pwtf, cashtf, nametf;
	public JButton joinbt, cancelbt;
	public int cust_idx = 1;
	public String idvalue, pwvalue, cashvalue, namevalue;

	MyBankjoin() {
		ImageIcon img = new ImageIcon("c:/img/logo.jpg");
		imgla = new JLabel(" ", img, JLabel.CENTER);
		setLayout(new BorderLayout());
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		la1 = new Label();
		la2 = new Label();
		la3 = new Label();
		la4 = new Label();
		setLayout(new GridLayout(3, 1, 200, 10));

		add(p1, "North");
		p1.add(imgla);

		add(p2, "Center");
		p2.setLayout(new GridLayout(4, 2));
		p2.add(namela = new Label("                        이름     :"));
		p2.add(nametf = new JTextField());
		p2.add(la1);
		p2.add(idla = new Label("                         I   D    :"));
		p2.add(idtf = new JTextField());
		p2.add(la2);
		p2.add(pwla = new Label("                     Password     :"));
		p2.add(pwtf = new JTextField());
		p2.add(la3);
		p2.add(cashla = new Label("                    최초 입금액   :"));
		p2.add(cashtf = new JTextField());
		p2.add(la4);

		add(p3, "South");
		p3.setLayout(new GridLayout(2, 2, 5, 5));
		p3.add(la5 = new Label());
		p3.add(la6 = new Label());
		p3.add(joinbt = new JButton("회원 가입"));
		p3.add(cancelbt = new JButton("취 소"));

		joinbt.addActionListener(this);
		cancelbt.addActionListener(this);

		setBackground(Color.white);

		setSize(500, 500);
		setLocation(550, 210);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

	public void connection() {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		Connection con = null;
		Statement stmt = null;
		PreparedStatement pstmt;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "hr", "hr");
			System.out.println("데이터베이스 연결 성공");
			stmt = con.createStatement();

			idvalue = idtf.getText();
			pwvalue = pwtf.getText();
			namevalue = nametf.getText();
			cashvalue = cashtf.getText();

			String psql = "select count(num) from customer";
			pstmt = con.prepareStatement(psql);
			ResultSet prs = pstmt.executeQuery();
			int idx = 0;
			if (prs.next()) {
				idx = prs.getInt(1);
			}
			if (prs != null)
				prs.close();
			if (pstmt != null)
				pstmt.close();

			String sql = insert(idx + 1, namevalue, idvalue, pwvalue,
					Integer.parseInt(cashvalue));
			int result = stmt.executeUpdate(sql);
			cust_idx++;

			String msg = result > -1 ? "successful" : "fail";
			System.out.println(msg);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("데이트베이스 연결 실패!");

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

	public String insert(int num, String name, String id, String pw, int cash) {

		String sql = "INSERT into customer values " + "(" + num + " ,'" + name
				+ "',  '" + id + "','" + pw + "','" + cash + "')";
		return sql;

	}

	public void actionPerformed(ActionEvent e) {
		String st;
		String bt;
		Object object = e.getSource();

		if (object == joinbt) {
			System.out.println("확인");
			connection();

		} else if (object == cancelbt) {
			System.out.println("취소");
		}

	}

	public static void main(String args[]) {
		new MyBankjoin();
	}

}
