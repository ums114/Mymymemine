import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;

public class aplbuton extends Frame {
	public Panel p1, p2;
	public Image duke;
	public Button b1, b2, b3, b4;
	public Label la1, la2;

	aplbuton() {

		b1 = new Button("¡ã");
		b2 = new Button("¢¸");
		b3 = new Button("¡å");
		b4 = new Button("¢º");
		p1 = new Panel();
		p2 = new Panel();
		la1 = new Label("");
		la2 = new Label("");

		setLayout(new BorderLayout());
		add(p1);
		add(p2, BorderLayout.SOUTH);
		p2.setLayout(new GridLayout(2, 3));
		p2.add(la1);
		p2.add(b1);
		p2.add(la2);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
	}

	public static void main(String args[]) {
		new aplbuton();

	}
}
