package awt_ex;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ScrollbarEx extends Frame implements AdjustmentListener {

	public Panel p1, p2;
	public Scrollbar s1, s2, s3, s4;
	public TextArea t1;
	public TextField t2;

	public Label l1, l2, l3, l4, l5, l6;

	// public Frame f;

	public ScrollbarEx() {
		setLayout(new GridLayout(1, 2));
		p1 = new Panel();
		p2 = new Panel();
		t1 = new TextArea("", 100, 25, 1);
		t2 = new TextField(200);
		l1 = new Label("");
		l2 = new Label("");
		l3 = new Label("");
		l4 = new Label("");
		l5 = new Label("");
		l6 = new Label("현재색상");

		p1.setLayout(new GridLayout(10, 1));
		p2.setLayout(new BorderLayout());

		s1 = new Scrollbar(0, 0, 10, 0, 256);
		s2 = new Scrollbar(0, 0, 10, 0, 256);
		s3 = new Scrollbar(0, 0, 10, 0, 256);

		p1.add(l1);
		p1.add(s1);
		p1.add(l2);
		p1.add(s2);
		p1.add(l3);
		p1.add(s3);
		p1.add(l4);
		p1.add(l6);
		p1.add(t2);
		p1.add(l5);

		p2.add(t1, BorderLayout.CENTER);
		s4 = new Scrollbar(1, 0, 10, 0, 256);

		add(p1);
		add(p2);

		s1.addAdjustmentListener(this);
		s2.addAdjustmentListener(this);
		s3.addAdjustmentListener(this);

		setSize(500, 500);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

	public void adjustmentValueChanged(AdjustmentEvent e) {
		int sb_r = s1.getValue();
		int sb_g = s2.getValue();
		int sb_b = s3.getValue();

		Color color = new Color(sb_r, sb_g, sb_b);
		t1.setBackground(color);
		t2.setText("레드 : " + sb_r + " 그린 :" + sb_g + " 블루 : " + sb_b);

	}

	public static void main(String args[]) {
		new ScrollbarEx();
	}

}
