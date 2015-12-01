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

public class AtdNewColumn extends Frame {
	public Label colla, colnulla;
	public TextField coltf;
	public Panel colnpan, colcpan, colspan;
	public Button colokbt, colexitbt;
	public Object obj;

	AtdNewColumn() {
		setLayout(new GridLayout(3, 1));

		colla = new Label("열의 이름을 설정하세요.");
		colnulla = new Label("");
		coltf = new TextField("", 25);
		colnpan = new Panel();
		colcpan = new Panel();
		colspan = new Panel();
		colokbt = new Button("확인");
		colexitbt = new Button("취소");

		add(colnpan);
		add(colcpan);
		add(colspan);
		colnpan.add(colla);
		colcpan.add(coltf);
		colspan.add(colokbt);
		colspan.add(colnulla);
		colspan.add(colexitbt);

		setLocation(600, 400);
		setVisible(true);
		setSize(300, 150);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String args[]) {
		new AtdNewColumn();
	}

}