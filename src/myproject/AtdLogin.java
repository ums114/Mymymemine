package myproject;

import java.awt.CardLayout;
import java.awt.Color;
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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import mybanksystem.MyBankLogin;

public class AtdLogin extends Frame implements ActionListener {
	public Panel p1, p2, p3;
	public Label laid, lapw, la3, la4, la5, la6, la7, la8, la9, la10;
	public Label la11, la12, la13, la14, la15, la16, la17;
	public TextField tf1, tf2;
	public Image img;
	public Frame f;
	public JButton lgbt, joinbt;
	public JLabel jla1;

	AtdLogin() {

		ImageIcon img = new ImageIcon("c:/img/atten.jpg");
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

		f = new Frame("로그인");

		p1 = new Panel();
		p2 = new Panel();

		//
		// add(f);

		setLayout(new GridLayout(3, 1));
		add(jla1);
		add(p1);
		add(p2);

		p1.setLayout(new GridLayout(4, 4));
		// p1.setBackground(new Color(170, 195, 190, 200));
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

		setLocation(500, 200);
		setSize(500, 500);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

	public void actionPerformed(ActionEvent e) {
		Object object = e.getSource();
		String id = (String) object;
		String name = (String) object;

	}

	public static void main(String args[]) {

		new AtdLogin();

	}
}
