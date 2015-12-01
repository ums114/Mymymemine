package network_ex;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class teacherchatinglogin extends JFrame implements Runnable,
		ActionListener {

	private BufferedReader i;
	private PrintWriter o;
	private JTextArea output;
	private JTextField input;
	private JLabel label;
	private Thread listener;
	private String host;
	private JScrollPane js;
	private JScrollBar jb;
	private JTextField tf_id;
	private JTextField tf_pw;
	public JButton submit;
	public JButton cancel;
	public JDialog loginView;

	public teacherchatinglogin(String server) {

		super("채팅 프로그램");
		host = server;
		listener = new Thread(this);
		listener.start();

		output = new JTextArea();
		js = new JScrollPane(output);
		jb = js.getVerticalScrollBar();
		getContentPane().add(js, "Center");

		// getContentPane().add(new JScrollPane(output), "Center"); // 스크롤팬은
		// 가능
		output.setEditable(false);
		Panel bottom = new Panel(new BorderLayout());
		label = new JLabel("사용자이름");
		bottom.add(label, "West");
		input = new JTextField();
		input.addActionListener(this);
		bottom.add(input, "Center");

		getContentPane().add(bottom, "South");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(900, 400);
		setVisible(false);

		
		// login id, pw form
		tf_id = new JTextField();
		tf_pw = new JTextField();
		submit = new JButton("login");
		cancel = new JButton("cancel");
		loginView = new JDialog(this, "Login");
		JPanel la_p = new JPanel(new GridLayout(2, 1));
		JPanel input_p = new JPanel(new GridLayout(2, 1));

		JPanel center_p = new JPanel(new BorderLayout());
		center_p.add(la_p, "West");
		center_p.add(input_p, "Center");

		Panel submit_p = new Panel(new GridLayout(2, 1));

		la_p.add(new JLabel("아이디"));
		la_p.add(new JLabel("암   호"));
		input_p.add(tf_id);
		input_p.add(tf_pw);

		center_p.add(la_p, "West");
		center_p.add(input_p, "Center");

		submit_p.add(submit);
		submit_p.add(cancel);
		loginView.setLayout(new BorderLayout());
		loginView.add(center_p, "Center");
		loginView.add(submit_p, "South");
		loginView.setLocation(300, 200);
		loginView.setSize(200, 150);
		loginView.setVisible(true);
		submit.addActionListener(this);

	}

	public void run() {
		try {
			Socket s = new Socket(host, 9830);
			InputStream ins = s.getInputStream();
			OutputStream os = s.getOutputStream();
			i = new BufferedReader(new InputStreamReader(ins));
			o = new PrintWriter(new OutputStreamWriter(os), true);
			while (true) {
				String line = i.readLine();
				output.append(line + "\n");
				jb.setValue(jb.getMaximum());
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public void actionPerformed(ActionEvent e) {
		Object c = e.getSource();
		if (c == input) {
			label.setText("메시지");
			o.println(input.getText());
			input.setText("");
		} else if (c.equals(submit)) {
			if (viewResult()) {
				setVisible(true);
			} else {
				System.exit(0);
			}
		}
	}

	public boolean viewResult() {
		Connection conn = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String id_ = tf_id.getText();
		String pw_ = tf_pw.getText();

		String sql = "select pw from chatuser " + "where id = '" + id_ + "'";

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			// login id chacking
			if (rs.next()) {
				String pw = rs.getString(1);
				if (pw.equals(pw_)) { // loging successful
					loginView.setVisible(false);
					System.out.println("loging successful");
					return true;

				} else {
					System.out.println("암호가 틀립니다, " + "다시 입력해주세요 ^^");
				}
			} else {
				System.out.println(id_ + "는 존재하지 않습니다.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (stmt != null)
					stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
			System.out.println("데이터베이스 연결 성공!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void main(String args[]) {
		if (args.length > 0) {
			new teacherchatinglogin(args[0]);
		} else {
			new teacherchatinglogin("localhost");
		}
	}

}