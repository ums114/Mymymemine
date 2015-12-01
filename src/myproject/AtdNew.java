package myproject;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class AtdNew extends JFrame implements ActionListener {
	Panel npan, span, cpan;
	DefaultTableModel dtm;
	JTable table;
	JLabel clnamela;
	JScrollPane jp;
	JButton columnaddbt, rowaddbt, rowremovebt, columnremovebt, savebt;
	public Label colla, colnulla;
	public TextField coltf;
	public Panel colnpan, colcpan, colspan;
	public Button colokbt, colexitbt;
	public String colname;
	public JFrame colf;
	public Object obj2;
	public int stnum = 1;
	public int colnum = 0;
	public int rownum = 0;
	public JScrollBar jb;
	public String clasname;
	int resultrow;
	int resultcolumn;
	String atdnum = "��";
	int row = 0;
	int column = 0;

	AtdNew() {

		clnamela = new JLabel();
		String[] str1 = { "No", "�й�", "�̸�", "", "����", "�Ἦ" };

		setLayout(new BorderLayout());

		dtm = new DefaultTableModel(str1, 0);
		table = new JTable(dtm);
		jp = new JScrollPane(table);
		table();
		jb = jp.getVerticalScrollBar();
		jb.setValue(jb.getMaximum());

		npan = new Panel();
		cpan = new Panel();
		span = new Panel();

		add(npan, "North");
		npan.add(clnamela);
		add(jp, "Center");
		add(span, "South");

		span.add(rowremovebt = new JButton("���� ������ �����մϴ�."));
		span.add(columnremovebt = new JButton("���� �����մϴ�."));
		span.add(columnaddbt = new JButton("���� �߰��մϴ�."));
		span.add(rowaddbt = new JButton("���� �߰��մϴ�."), "Right");
		span.add(savebt = new JButton("����"));

		columnaddbt.addActionListener(this);
		rowaddbt.addActionListener(this);
		rowremovebt.addActionListener(this);
		columnremovebt.addActionListener(this);

		setLocation(400, 50);
		setSize(700, 800);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		colf = new JFrame();

		colf.setLayout(new GridLayout(3, 1));

		colla = new Label("���� �̸��� �����ϼ���.");
		colnulla = new Label("");
		coltf = new TextField("", 25);
		colnpan = new Panel();
		colcpan = new Panel();
		colspan = new Panel();
		colokbt = new Button("Ȯ��");
		colexitbt = new Button("���");

		colf.add(colnpan);
		colf.add(colcpan);
		colf.add(colspan);
		colnpan.add(colla);
		colcpan.add(coltf);
		colspan.add(colokbt);
		colspan.add(colnulla);
		colspan.add(colexitbt);

		colokbt.addActionListener(this);
		colexitbt.addActionListener(this);
		savebt.addActionListener(this);

		colf.setLocation(600, 400);
		colf.setVisible(false);
		colf.setSize(300, 150);
		colname = coltf.getText();

		colf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	void table() {

		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(SwingConstants.CENTER);
		TableColumnModel tcm = table.getColumnModel();
		for (int i = 0; i < tcm.getColumnCount(); i++) {
			tcm.getColumn(i).setCellRenderer(dtcr);
			table.getColumnModel().getColumn(i).setCellRenderer(dtcr);
		} // 29~34 ���̺��� �� �����Ͱ��� �߾� ���� �ϱ� ���ؼ� �߰��� ����

		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // ���̺��� �ڵ� �������� ����� ����
		table.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);// ������ Į���� �������¡
																//

		table.getColumnModel().getColumn(0).setPreferredWidth(10);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setPreferredWidth(20);
		table.getColumnModel().getColumn(3).setPreferredWidth(30);
		table.getColumnModel().getColumn(4).setPreferredWidth(30);
		table.setRowHeight(30); // ���� ���̿� Į���� ���̸� ����
		table.setRowMargin(5);

	}

	void db_connectioncolum() {
		clasname = clnamela.getText();
		System.out.println(clasname);
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		Connection con = null;
		Statement stmt = null;

		Statement pstmt = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "hr", "hr");
			System.out.println("�����ͺ��̽� ���� ����");
			stmt = con.createStatement();

			 String sqlcolumn =
			
			 "CREATE TABLE ATD_new5(ATD1 VARCHAR(10)  , No number(5) , �й� VARCHAR(20)  , �̸� VARCHAR(20) not null ,  v varchar2(10), ���� varchar(3), �Ἦ varchar(3))";
			
			 resultcolumn = stmt.executeUpdate(sqlcolumn);

			for (int i = 0; i < table.getRowCount(); i++) {

				Object No = table.getValueAt(row, 0);

				Object stnum = table.getValueAt(row, 1);

				Object name = table.getValueAt(row, 2);

				String sqlrow = "INSERT into ATD_new5 values ('' , '" + No
						+ "',  '" + stnum + "' ,  '" + name
						+ "' ,  '' , ''  , '' )";

				resultrow = stmt.executeUpdate(sqlrow);

				row++;

			}

			String msgcolumn = resultcolumn > -1 ? "successful" : "fail";
			String msgrow = resultrow > -1 ? "successful" : "fail";
			System.out.println(msgcolumn);
			System.out.println(msgrow);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�����ͺ��̽� ���� ����!");
		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		colname = coltf.getText();

		if (obj == columnaddbt) {

			colf.setVisible(true);
		} else if (obj == colokbt) {
			colname = coltf.getText();
			dtm.addColumn(colname);
			colf.setVisible(false);
			coltf.setText(null);

		} else if (obj == rowaddbt) {

			Vector v = new Vector();
			dtm.addRow(v);
			table.setValueAt(table.getRowCount(), rownum, colnum);

			stnum++;
			rownum++;
			jb.setValue(jb.getMaximum());
			System.out.println(dtm.getDataVector());

		} else if (obj == rowremovebt) {
			// int tablerowcount = table.getRowCount();

			// dtm.removeRow(tablerowcount - 1);

		} else if (obj == columnremovebt) {
			System.out.println(table.getColumnModel().getColumn(0));

		} else if (obj == savebt) {

			db_connectioncolum();
			dtm.getDataVector();

		}

	}

	public static void main(String args[]) {
		new AtdNew();

	}
}
