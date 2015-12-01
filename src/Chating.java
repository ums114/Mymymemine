import java.awt.BorderLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Chating extends JFrame implements KeyListener, Runnable {
	TextArea tout, tin;
	List clli;
	Panel p;
	JButton button;
	private Thread listener;
	private BufferedReader i;
	private PrintWriter o;

	Chating() {
		listener = new Thread(this);
		listener.start();

		setLayout(new BorderLayout());

		String[] client = new String[10];
		p = new Panel();
		tout = new TextArea("mhbvjhvbh");
		tin = new TextArea();
		button = new JButton("보내기");
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

	public void run() {
		try {
			Socket s = new Socket("192.168.0.39", 9830);
			InputStream ins = s.getInputStream();
			OutputStream os = s.getOutputStream();
			i = new BufferedReader(new InputStreamReader(ins));
			o = new PrintWriter(new OutputStreamWriter(os), true);
			while (true) {
				String line = i.readLine();
				tout.append(line + "\n");
				// jb.setValue(jb.getMaximum());
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyChar() == KeyEvent.VK_ENTER) {
			// String msg = tin.getText();
			// tout.setText(msg);
			//
			Object c = e.getSource();
			// if (c == tin) {
			// label.setText("메시지");
			o.println(tin.getText());
			tin.setText("");
			// }

		}

	}

	public void keyReleased(KeyEvent e) {
	}

	public void keyTyped(KeyEvent e) {
	}

	public static void main(String args[]) {
		new Chating();
	}

}
