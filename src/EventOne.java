import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EventOne extends Frame implements ActionListener {

	public Button b1, b2, b3;

	public EventOne() {

		b1 = new Button("��ư1");
		b2 = new Button("��ư2");
		b3 = new Button("��ư3");

		setLayout(new GridLayout(1, 3));
		add(b1);
		add(b2);
		add(b3);
		setSize(500, 500);
		setVisible(true);

		b1.addActionListener(this);
		addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0);

			}
		});

	}

	public void actionPerformed(ActionEvent e) {

		Object obj = e.getSource();
		Button b = (Button) obj;
		String b_label = b.getLabel();
		System.out.println(b_label + "���������ϴ�.");

	}

	public static void main(String args[]) {
		new EventOne();

	}
}
