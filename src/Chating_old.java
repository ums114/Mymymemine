import java.awt.BorderLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Chating_old extends JFrame implements KeyListener {
	TextArea tout, tin;
	List clli;
	Panel p;
	JButton button;

	Chating_old() {
		setLayout(new BorderLayout());

		String[] client = new String[10];
		p = new Panel();
		tout = new TextArea("mhbvjhvbh");
		tin = new TextArea();
		button = new JButton("º¸³»±â");
		button.setSize(100, 100);

		// clli = new List<String>(client); // << JLIST
		clli = new List(10);
		for (int i = 0; i < client.length; i++) {
			clli.add("");
		}
		add(p, "South");
		add(tout);
		add(clli, "East");

		p.setLayout(new BorderLayout());
		p.add(tin, "West");
		p.add(button);

		tin.addKeyListener(this);

		setSize(700, 700);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyChar() == KeyEvent.VK_ENTER) {
			String msg = tin.getText();
			tout.setText(msg);

		}

	}

	public void keyReleased(KeyEvent e) {
	}

	public void keyTyped(KeyEvent e) {
	}

	public static void main(String args[]) {
		new Chating_old();
	}

}

class EchoServer {
	private ServerSocket server;

	public EchoServer(int port) throws IOException {
		server = new ServerSocket(port);
	}

	public void service() throws IOException {
		System.out.println("EchoServer is ready.");
		Socket client = server.accept();
		InputStream is = client.getInputStream();
		OutputStream os = client.getOutputStream();
		BufferedReader in = new BufferedReader(new InputStreamReader(is));
		PrintWriter out = new PrintWriter(os, true);
		BufferedReader in2 = new BufferedReader(
				new InputStreamReader(System.in));
		while (true) {
			String msg = in.readLine();
			System.out.println(msg);
			String msgg = in2.readLine();

			if (msg.equals("bye")) {
				break;
			}
			out.println(">>>" + msgg);
		}
	}

	public void close() throws IOException {
		server.close();
	}

	public static void main(String args[]) {
		try {
			EchoServer es = new EchoServer(1289);
			es.service();
			es.close();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
