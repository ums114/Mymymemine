package network_ex;

import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
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
import javax.swing.JLabel;

public class ChatLogin extends Frame implements ActionListener {
	public Panel p1, p2, p3;
	public Label laid, lapw, la3, la4, la5, la6, la7, la8, la9, la10;
	public Label la11, la12, la13, la14, la15, la16, la17;
	public TextField tf1, tf2;
	public Image img;
	public Frame f;
	public JButton lgbt, joinbt;
	public CardLayout cards;
	public JLabel jla1;
	public String id, pw;

	ChatLogin() {

		cards = new CardLayout();
		setLayout(cards);

		ImageIcon img = new ImageIcon("c:/img/logo.jpg");
		jla1 = new JLabel(" ", img, JLabel.CENTER);
		laid = new Label("아이디  : ");
		lapw = new Label("비밀번호  : ");
		la3 = new Label("");
		la4 = new Label("            ");
		la5 = new Label("");
		la6 = new Label("");
		la7 = new Label("");
		la8 = new Label("");
		la9 = new Label("");
		la10 = new Label("         ");
		la11 = new Label("");
		la12 = new Label("");
		la13 = new Label("");
		la14 = new Label("");
		la15 = new Label("");
		la16 = new Label("");
		la17 = new Label("");

		lgbt = new JButton("로그인");
		joinbt = new JButton("회원가입");

		tf1 = new TextField("", 10);
		tf2 = new TextField("", 12);

		// f = new Frame("로그인");

		p1 = new Panel();
		p2 = new Panel();

		//
		// add(f);

		setLayout(new GridLayout(3, 1));
		add(jla1, "North");
		add(p1, "Center");
		add(p2, "South");

		p1.setLayout(new GridLayout(4, 4));
		p1.add(la8);
		p1.add(la9);
		p1.add(la10);
		p1.add(la11);
		p1.add(la3);
		p1.add(laid);
		p1.add(tf1);
		p1.add(la5);
		p1.add(la12);
		p1.add(la13);
		p1.add(la14);
		p1.add(la15);
		p1.add(la7);
		p1.add(lapw);
		p1.add(tf2);
		p1.add(la4);

		// f.add(p2, "South");

		p2.setLayout(new GridLayout(2, 2, 5, 5));

		p2.add(la16);
		p2.add(la17);
		p2.add(lgbt);
		p2.add(joinbt);

		lgbt.addActionListener(this);
		joinbt.addActionListener(this);

		setSize(500, 500);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

	public void database() {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";

		Connection con = null;
		Statement stmt = null;

		ResultSet rs = null;
		int no = 0;

		String sql; // SQL문을 저장할 변수 선언
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "hr", "hr");
			stmt = con.createStatement();
			// ---JDBC_Select 추가된 내용 -----

			sql = "SELECT id,pw FROM chatuser";

			System.out.println("번호 \t 이름 \t\t 이메일 \t\t 전화번호 \n");
			System.out.println("----------------------------------");
			rs = stmt.executeQuery(sql); // 얻어진 레코드를 가져옴

			while (rs.next()) {

				String idtext = tf1.getText();
				String pwtext = tf2.getText();
				id = rs.getString("id");
				pw = rs.getString("pw");

				if (idtext == id) {

					if (pwtext == pw) {
						ChatClient chat = new ChatClient("localhost");

					}
				}
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
				System.out.println(e.getMessage());
			}

		}

	}

	public void actionPerformed(ActionEvent e) {
		database();

	}

	public static void main(String args[]) {

		new ChatLogin();

	}
}
