package awt_ex;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CardLayoutEx extends Frame implements MouseListener {
	private Panel p1, p2, p3, p4;
	private Label lb1, lb2, lb3, lb4;
	private CardLayout cards;
	private Frame f;

	public CardLayoutEx() {

		setTitle("Card Test");
		cards = new CardLayout();
		setLayout(cards);

		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		p4 = new Panel();

		lb1 = new Label("i");
		p1.setBackground(Color.yellow);
		p1.add(lb1);

		lb2 = new Label("I love");
		p2.setBackground(Color.green);
		p2.add(lb2);

		lb3 = new Label("I love Java");
		p3.setBackground(Color.magenta);
		p3.add(lb3);

		lb4 = new Label("I love JavaBible.");
		p4.setBackground(Color.white);
		p4.add(lb4);

		p1.addMouseListener(this);
		p2.addMouseListener(this);
		p3.addMouseListener(this);
		p4.addMouseListener(this);

		add(p1, "p1");
		add(p2, "p2");
		add(p3, "p3");
		add(p4, "p4");

		cards.show(this, "frame");
		setSize(200, 200);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}

		});

	}

	public void mousePressed(MouseEvent e) {
//		 cards.next(this);
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseClicked(MouseEvent e) {
		cards.next(this);
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public static void main(String args[]) {
		new CardLayoutEx();

	}

}
