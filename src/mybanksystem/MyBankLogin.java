package mybanksystem;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.TextField;
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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyBankLogin extends JFrame implements ActionListener {
	public JPanel p1, p2, p3;
	public JLabel laid, lapw, la3, la4, la5, la6, la7, la8, la9, la10;
	public JLabel la11, la12, la13, la14, la15, la16, la17;
	public JTextField idtf;
	public Image img;
	public JFrame f;
	public JButton lgbt, joinbt;
	public CardLayout cards;
	public JLabel jla1;
	public String id, pw, cash;
	public int cusnum = 0;
	public int no = 0;
	public JPasswordField pwtf;

	MyBankLogin() {

		cards = new CardLayout();
		setLayout(cards);

		ImageIcon img = new ImageIcon("c:/img/logo.jpg");
		jla1 = new JLabel(" ", img, JLabel.CENTER);
		laid = new JLabel("아이디  : ");
		lapw = new JLabel("비밀번호  : ");
		la3 = new JLabel("");
		la4 = new JLabel("            ");
		la5 = new JLabel("");
		la6 = new JLabel("");
		la7 = new JLabel("");
		la8 = new JLabel("");
		la9 = new JLabel("");
		la10 = new JLabel("         ");
		la11 = new JLabel("");
		la12 = new JLabel("");
		la13 = new JLabel("");
		la14 = new JLabel("");
		la15 = new JLabel("");
		la16 = new JLabel("");
		la17 = new JLabel("");

		lgbt = new JButton("로그인");
		joinbt = new JButton("회원가입");

		idtf = new JTextField("", 10);
		pwtf = new JPasswordField("", 12);

		// f = new Frame("로그인");

		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();

		p1.setBackground(Color.white);
		p2.setBackground(Color.white);
		p3.setBackground(Color.white);
		p3.add(jla1);

		//
		// add(f);

		setLayout(new GridLayout(3, 1));
		add(p3, "North");
		add(p1, "Center");
		add(p2, "South");

		p1.setLayout(new GridLayout(4, 4));
		p1.add(la8);
		p1.add(la9);
		p1.add(la10);
		p1.add(la11);
		p1.add(la3);
		p1.add(laid);
		p1.add(idtf);
		p1.add(la5);
		p1.add(la12);
		p1.add(la13);
		p1.add(la14);
		p1.add(la15);
		p1.add(la7);
		p1.add(lapw);
		p1.add(pwtf);
		p1.add(la4);

		// f.add(p2, "South");

		p2.setLayout(new GridLayout(2, 2, 5, 5));

		p2.add(la16);
		p2.add(la17);
		p2.add(lgbt);
		p2.add(joinbt);

		lgbt.addActionListener(this);
		joinbt.addActionListener(this);
		pwtf.addActionListener(this);

		setSize(500, 500);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

	public void db_connect() {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";

		Connection con = null;
		Statement stmt = null;
		// ---JDBC_Select 추가된 내용 -----
		ResultSet rs = null;

		// String name, email, tel; //데이터베이스에서 얻어온 필드값 저장할 변수

		String sql; // SQL문을 저장할 변수 선언
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "hr", "hr");
			stmt = con.createStatement();
			// ---JDBC_Select 추가된 내용 -----
			sql = "SELECT num,id,pw,cash FROM customer where id = '"
					+ idtf.getText() + "'";
			rs = stmt.executeQuery(sql); // 얻어진 레코드를 가져옴
			while (rs.next()) {
				/*
				 * no = rs.getInt("no"); name = rs.getString("name"); email =*
				 * rs.getString("email"); tel = rs.getString("tel");
				 */
				id = rs.getString("id");
				pw = rs.getString("pw");
				no = rs.getInt("num");
				cash = rs.getString("CASH");
				System.out.println(id + " = " + idtf.getText());
				// if (id.equals(idtf.getText())) {

				if (pw.equals(pwtf.getText())) {

					new MyBankMenu(idtf.getText());
					setVisible(false);
				}

				// }

			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("데이터베이스 연결 실패 !");

		} finally {

			try { // rs, stmt, con 객체를 close() 메서드를 호출해 해제
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {

			}

		}

	}

	public void actionPerformed(ActionEvent e) {
		Object object = e.getSource();
		if (object == joinbt) {

			MyBankjoin mbj = new MyBankjoin();
			this.setVisible(false);

		} else if (object == lgbt || object == pwtf) {
			db_connect();

		}

	}

	public static void main(String args[]) {

		new MyBankLogin();

	}
}
