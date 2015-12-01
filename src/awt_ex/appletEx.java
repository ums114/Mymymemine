package awt_ex;
import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class appletEx extends Applet implements ActionListener {
	public Panel p1, p2;
	public Image duke;
	public Button left, right, up, down;
	public Label la1, la2;
	// public Canvas myCanvas;
	public int x, y;

	public appletEx() {
		//
		// Toolkit tool = Toolkit.getDefaultToolkit();
		// duke = tool.getImage("C:/img/duke.jpg");

		// Canvas myCanvas = new Canvas();

		up = new Button("¡ã");
		left = new Button("¢¸");
		down = new Button("¡å");
		right = new Button("¢º");
		p1 = new Panel();
		p2 = new Panel();
		la1 = new Label("");
		la2 = new Label("");

		setLayout(new BorderLayout());
		// add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.SOUTH);

		p2.setLayout(new GridLayout(2, 3));

		up.addActionListener(this);
		left.addActionListener(this);
		right.addActionListener(this);
		down.addActionListener(this);

		p2.add(la1);
		p2.add(up);
		p2.add(la2);
		p2.add(left);
		
		p2.add(down);
		p2.add(right);

		// p1.add(myCanvas);

	}

	public void actionPerformed(ActionEvent e) {

		Object obj = e.getSource();
		Button b = (Button) obj;
		String b_label = b.getLabel();

		if (b.equals(left)) {
			x -= 10;

		} else if (b.equals(right)) {
			x += 10;
		}

		else if (b.equals(up)) {
			y -= 10;
		} else if (b.equals(down)) {
			y += 10;
		}

		System.out.println("ddd");
		repaint();
	}

	public void init() {

		setSize(500, 500);

		duke = getImage(getDocumentBase(), "duke.jpg");
		System.out.println("init");
	}

	public void start() {
		System.out.println("start");
	}

	public void stop() {
		System.out.println("stop");

	}

	public void destroy() {
		System.out.println("destroy");
	}

	public void paint(Graphics g) {

		g.drawImage(duke, x, y, this);
	}
}
