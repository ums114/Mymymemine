package awt_ex;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTOne extends Frame {

	public AWTOne() {
		Panel p = new Panel();
//		p.setLayout(new BorderLayout());
		Button b = new Button("��ư");
		b.setLabel("����� ��");
		Checkbox ch1 = new Checkbox("üũ�ڽ�", true);
		Checkbox ch2 = new Checkbox("üũ�ڽ�", false);
		Checkbox ch3 = new Checkbox("üũ�ڽ�", false);

		CheckboxGroup ch = new CheckboxGroup();
		Checkbox ch4 = new Checkbox("���� ��ư", true, ch);
		Checkbox ch5 = new Checkbox("���� ��ư", true, ch);
		Checkbox ch6 = new Checkbox("���� ��ư", true, ch);
		Choice cho = new Choice();
		cho.add("�г� ����");
		cho.add("1�г�");
		cho.add("2�г�");
		cho.add("3�г�");
		Label la = new Label("�ڹ� ������");
		List ls = new List(5);
		ls.add("List 1");
		ls.add("List 2");
		ls.add("List 3");
		ls.add("List 4");
		ls.add("List 5");
		Scrollbar sb = new Scrollbar(Scrollbar.HORIZONTAL, 200, 100, 0, 255);
		TextField tf = new TextField("TextField", 50);
		TextArea ta = new TextArea("TextArea", 20, 10, 3);

		p.add(ch1);
		p.add(ch2);
		p.add(ch3);
		p.add(cho);
		p.add(ch4);
		p.add(ch5);
		p.add(ch6);
		p.add(b);
		p.add(la);
		p.add(ls);
		p.add(sb);
		p.add(tf);
		p.add(ta);
		
		
		add(p);
		setSize(500, 500);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});
	}

	public static void main(String[] args) {
		new AWTOne();

	}
}
