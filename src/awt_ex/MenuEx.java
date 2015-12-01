package awt_ex;

import java.awt.Canvas;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenuEx extends Frame implements ActionListener {

	public MenuBar mb;
	public Menu m;
	public Dialog dialog;
	public Canvas can;
	private MenuItem[] mi;
	public TextArea ta;

	public MenuEx() {
		dialog = new Dialog(this); // Dialog는 차일드의 개념으로만 존재 하기때문에 this로 FRAME을
									// 불러왔다.
		ta = new TextArea();
		mb = new MenuBar();
		
		add(ta);
		m = new Menu("File");
		mi = new MenuItem[5];
		mi[0] = new MenuItem("New File");
		mi[1] = new MenuItem("Open File");
		mi[2] = new MenuItem("Save File");
		mi[3] = new MenuItem("Save As");
		mi[4] = new MenuItem("EXIT");
		for (int i = 0; i < mi.length; i++) {
			m.add(mi[i]);
			mi[i].addActionListener(this);
			if (i != 2 && i != (mi.length - 1))
				m.addSeparator();
		}
		mi[1].setEnabled(false);
		mb.add(m);
		setMenuBar(mb);

		setLocation(250, 250);
		setSize(500, 500);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj.equals(mi[4])) {
			System.exit(0);
		} else if (obj.equals(mi[1])) {

			// dialog.add(can);
			// dialog.setLocation(250, 200);
			// dialog.setSize(250, 300);
			// dialog.setVisible(true);
			can = new CanvasOne();

		} else if (obj.equals(mi[0])) {
			mi[1].setEnabled(true);
		}
	}

	public static void main(String args[]) {
		new MenuEx();
	}
}
