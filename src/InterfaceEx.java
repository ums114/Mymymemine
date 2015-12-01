import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InterfaceEx extends Frame {

	public InterfaceEx() {

		setSize(1000, 1000);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

	public static void main(String args[]) {
		new InterfaceEx();

	}

	public void windowActivated(WindowEvent e) {

	}

	public void windowClosed(WindowEvent e) {
	}

	public void windowDeactivated(WindowEvent e) {
	}

	public void windowDeiconified(WindowEvent e) {
	}

	public void windowIconified(WindowEvent e) {
	}

	public void windowOpened(WindowEvent e) {
	}

}
