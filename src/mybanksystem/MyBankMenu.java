package mybanksystem;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class MyBankMenu extends Frame implements ActionListener {
	public Panel p, p1, p2;

	public JButton mifbt, addbt, mibt, prbt, exbt, bt;
	public Image img;
	public Canvas can;
	public Label la1, la2;
	public JLabel jla1;
	public String id;

	MyBankMenu(String id) {
		this.id = id;
		ImageIcon img = new ImageIcon("c:/img/logo.jpg");
		jla1 = new JLabel(" ", img, JLabel.TRAILING);
		can = new Canvas();

		setBackground(Color.white);

		setLayout(new GridLayout(3, 1));
		setTitle("메뉴");

		la1 = new Label(
				"                                             저희 은행을 찾아주셔서 감사합니다.");
		la2 = new Label("");
		p = new Panel();
		p1 = new Panel();
		p2 = new Panel();

		mifbt = new JButton("잔액조회");
		bt = new JButton("");

		addbt = new JButton("입금");
		mibt = new JButton("출금");
		prbt = new JButton("이전화면");
		exbt = new JButton("시스템 종료");

		add(p1);
		add(p);
		add(p2);
		p1.add(jla1);
		p2.setLayout(new BorderLayout());
		p2.add(la1, BorderLayout.CENTER);
		p.setLayout(new GridLayout(3, 2, 10, 10));

		p.add(mifbt);
		p.add(bt);
		p.add(addbt);
		p.add(mibt);
		p.add(prbt);
		p.add(exbt);

		mifbt.addActionListener(this);
		addbt.addActionListener(this);
		mibt.addActionListener(this);
		prbt.addActionListener(this);
		exbt.addActionListener(this);

		setSize(500, 500);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == mifbt) {

		} else if (obj == mibt) {
			new MyBankmin(id);

		} else if (obj == addbt) {
			new MyBankadd(id);
		}

	}

	public void paint(Graphics g) {
		g.drawImage(img, 50, 50, can);

	}
	//
	// public static void main(String args[]) {
	// new MyBankMenu();
	// }

}
