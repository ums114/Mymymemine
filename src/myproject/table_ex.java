package myproject;

import java.awt.Component;
import java.util.EventObject;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.CellEditorListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumnModel;

public class table_ex {

	table_ex() {

		String[] str1 = { "1번", "2번", "3번", "4번", "5번" };

		dtm = new DefaultTableModel(str1, 10);

		table = new JTable(dtm);
		table.setRowHeight(100);

		TableCellEditor tce = new TableCellEditor() {

			@Override
			public boolean stopCellEditing() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean shouldSelectCell(EventObject arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void removeCellEditorListener(CellEditorListener arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public boolean isCellEditable(EventObject arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Object getCellEditorValue() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void cancelCellEditing() {
				// TODO Auto-generated method stub

			}

			@Override
			public void addCellEditorListener(CellEditorListener arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public Component getTableCellEditorComponent(JTable arg0,
					Object arg1, boolean arg2, int arg3, int arg4) {
				TableColumnModel cm = arg0.getColumnModel();
				arg0.setColumnModel(cm);
				arg0.setRowHeight(100);
				// arg0.set
				c2 = new JScrollPane(arg0);
				return arg0;
			}
		};
		table.setCellEditor(tce);
		JTable t = (JTable) tce.getTableCellEditorComponent(table, null, true,
				5, 5);
		// JTableHeader th = table.getTableHeader();
		// th.setTable(table);
		// table.setTableHeader(th);

		// table.setIntercellSpacin();
	}
}
