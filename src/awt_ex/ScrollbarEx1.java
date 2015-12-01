package awt_ex;
import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ScrollbarEx1 extends Frame implements ItemListener {
	Panel p = new Panel();
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Choice cho;
	TextArea ta;
	CheckboxGroup ch;
	Checkbox ch1, ch2, ch3, ch4, ch5, ch6;

	ScrollbarEx1() {
		ch = new CheckboxGroup();
		ch1 = new Checkbox("��ħ", true, ch);
		ch2 = new Checkbox("����", false, ch);
		ch3 = new Checkbox("����", false, ch);

		ch4 = new Checkbox("���", false);
		ch5 = new Checkbox("����", false);
		ch6 = new Checkbox("��", false);

		Label l1 = new Label("");
		Label l2 = new Label("");
		Label l3 = new Label("");
		Label l4 = new Label("");
		Label l5 = new Label("");
		Label l6 = new Label("");
		Label l7 = new Label("");
		Label l8 = new Label("");
		Label l9 = new Label("");
		Label l10 = new Label("");
		Label l11 = new Label("");
		Label l12 = new Label("");
		Label l13 = new Label("");

		ta = new TextArea("", 15, 50, 3);

		cho = new Choice();
		cho.add("��ħ");
		cho.add("����");
		cho.add("����");

		p.setLayout(new GridLayout(3, 4));

		p.add(l1);
		p.add(ch1);
		p.add(ch2);
		p.add(ch3);
		p.add(l2);
		p.add(ch4);
		p.add(ch5);
		p.add(ch6);
		p.add(l10);
		p.add(l11);
		p.add(l12);
		p.add(l13);

		p1.setLayout(new BorderLayout());
		p1.add(ta, BorderLayout.CENTER);
		p1.add(l7, BorderLayout.SOUTH);
		p1.add(l8, BorderLayout.WEST);
		p1.add(l9, BorderLayout.EAST);

		p2.setLayout(new BorderLayout());
		p2.add(cho, BorderLayout.CENTER);
		p2.add(l3, BorderLayout.SOUTH);
		p2.add(l4, BorderLayout.SOUTH);

		add(p, BorderLayout.NORTH);
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);

		setSize(500, 500);
		setVisible(true);

		ch1.addItemListener(this);
		ch2.addItemListener(this);
		ch3.addItemListener(this);

		ch4.addItemListener(this);
		ch5.addItemListener(this);
		ch6.addItemListener(this);

		cho.addItemListener(this);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});

	}

	public void itemStateChanged(ItemEvent e) {
		Object obj = e.getSource();

		if (obj == cho) {
			String str = cho.getSelectedItem();
			if (str.equals("��ħ")) {
				ch1.setState(true);
			} else if (str.equals("����")) {
				ch2.setState(true);
			} else if (str.equals("����")) {
				ch3.setState(true);
			}

		}
		Checkbox temp = ch.getSelectedCheckbox();

		ta.setText("   <<" + temp.getLabel() + " >> \n\n");

		ta.append("1.���  :" + ch4.getState() + "\n");
		ta.append("2.����  :" + ch5.getState() + "\n");
		ta.append("3.��    :" + ch6.getState() + "\n");

		cho.select(temp.getLabel());

	}

	public static void main(String args[]) {
		new ScrollbarEx1();
	}

}
