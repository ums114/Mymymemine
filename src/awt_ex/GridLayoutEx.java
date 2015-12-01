package awt_ex;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GridLayoutEx extends Frame {
	public Button b1, b2, b3, b4, b5;

	public GridLayoutEx() {
		b1 = new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		b4 = new Button("4");
		b5 = new Button("5");

		setLayout(new GridLayout(2, 3 , 4 , 5));

		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		
		setSize(500, 500);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String args[]) {
		new GridLayoutEx();

	}
}
