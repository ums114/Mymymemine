package myproject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class AtdMenu extends Frame implements ActionListener {
	public Panel p, p1, p2;

	public JButton newbt, todaybt, datebt, prbt, exbt, resultbt;

	AtdMenu() {

		ImageIcon img = new ImageIcon("c:/img/atten.jpg");
		JLabel jla1 = new JLabel(img, (int) CENTER_ALIGNMENT);
		setBackground(Color.white);
		setTitle("메뉴");

		p = new Panel();
		p1 = new Panel();
		p2 = new Panel();

		newbt = new JButton("새로운 출석부");

		todaybt = new JButton("오늘의 출결");
		datebt = new JButton("날짜별 출결 관리");
		resultbt = new JButton("최종 결과");

		setLayout(new GridLayout(3, 1));

		add(p1);
		p1.setLayout(new BorderLayout());
		p1.add(jla1, "Center");
		p1.add(new Label(), "West");
		p1.add(new Label(), "East");

		add(p);
		add(p2);

		p.setLayout(new GridLayout(2, 2, 10, 10));

		p.add(newbt);
		p.add(todaybt);
		p.add(datebt);
		p.add(resultbt);

		newbt.addActionListener(this);

		// setLocation(500, 200);
		setSize(500, 500);

		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		Dimension d = getSize();

		setLocation(screenSize.width / 2 - (d.width / 2), screenSize.height / 2
				- (d.height / 2));

		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == newbt) {
			AtdNew1 atn = new AtdNew1();

			this.setVisible(false);

		}

	}

	public static void main(String args[]) {
		new AtdMenu();

	}

}