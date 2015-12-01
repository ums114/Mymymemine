package awt_ex;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


class CanvasOne extends Canvas implements ActionListener {

	public Frame f;
	public Image img, img1, img2, img3;
	public Button b, b1;
	public int x, y;
	public int w = 10, h = 10;

	public CanvasOne() {

		b = new Button("변경");
		Toolkit tool = Toolkit.getDefaultToolkit();
		img = tool.getImage("C:/img/exo.jpg");
		img1 = tool.getImage("C:/img/vic.jpg");
		img2 = tool.getImage("C:/img/duke.jpg");
		img3 = tool.getImage("C:/img/vic2.jpg");

		f = new Frame("Canvas Test");
		f.add(this, "Center");
		f.add(b, "South");
		f.setSize(500, 500);
		f.setVisible(true);

		b.addActionListener(this);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

	public void paint(Graphics g) {
		x = 10;
		y = 10;

		// g.drawRect(x, y, w, h);
		// g.setColor(Color.RED);
		// g.fillRect(x + 50, y + 50, w + 50, h + 50);
		// g.drawLine(200, 300, 50, 50);
		// g.drawString("드러운 이미지", 50, 50);
		g.drawImage(img2, x , y , this);

	}

	public void update(Graphics g) {

		paint(g);
	}

	public void actionPerformed(ActionEvent e) {

		repaint();
	}

	public static void main(String args[]) {
		new CanvasOne();
	}

}
