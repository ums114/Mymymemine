import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseListenerOne extends Frame implements MouseListener,
		MouseMotionListener, MouseWheelListener {

	public MouseListenerOne() {
		setSize(250, 250);
		setVisible(true);

		addMouseWheelListener(this);
		addMouseMotionListener(this);
		addMouseListener(this);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public void mouseClicked(MouseEvent e) {
		System.out.println("Ŭ��");
	}

	public void mouseEntered(MouseEvent e) {
		System.out.println("����");
	}

	public void mouseExited(MouseEvent e) {
		System.out.println("����");
	}

	public void mousePressed(MouseEvent e) {
		System.out.println("����");
	}

	public void mouseReleased(MouseEvent e) {
		System.out.println("��");
	}

	public void mouseDragged(MouseEvent e) {
		System.out.println("�巡��");
		}

	public void mouseMoved(MouseEvent e) {
		System.out.println("������");
	}

	public void mouseWheelMoved(MouseWheelEvent e) {
		System.out.println("��");
	}

	public static void main(String args[]) {
		new MouseListenerOne();
	}

}
