package myproject;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AtdNew1 extends Frame implements ActionListener {
	public Label la, nulla;
	public TextField tf;
	public Panel npan, cpan, span;
	public Button okbt, exitbt;
	public String clname;

	
	
	AtdNew1() {
		setLayout(new GridLayout(3, 1));

		la = new Label("클래스 이름을 설정하세요");
		nulla = new Label("");
		tf = new TextField("", 25);
		npan = new Panel();
		cpan = new Panel();
		span = new Panel();
		okbt = new Button("확인");
		exitbt = new Button("취소");

		add(npan);
		add(cpan);
		add(span);
		npan.add(la);
		cpan.add(tf);
		span.add(okbt);
		span.add(nulla);
		span.add(exitbt);

		okbt.addActionListener(this);
		exitbt.addActionListener(this);

		setLocation(600, 400);
		setVisible(true);
		setSize(300, 150);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == okbt) {
			clname = tf.getText();
			AtdNew atn = new AtdNew();
			atn.clnamela.setText(clname);
//			atn.clasname = clname;
			this.setVisible(false);

		} else if (obj == exitbt) {
			AtdMenu atm = new AtdMenu();
			this.setVisible(false);

		}
	}

	public static void main(String args[]) {
		new AtdNew1();
	}

}
