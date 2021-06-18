/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package librarymanagement;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author win 07
 */
class MyTableModel extends AbstractTableModel{
private Object[][] data;
private String[] column;
    public MyTableModel(Object[][] d, String[] cn) {
        data = d;
        column = cn;
    }
    public boolean isCellEditable(int row, int col) {
        return false;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }
 
    public Object getValueAt(int row, int col) {
        return data[row][col];
    }
 
    public int getColumnCount() {
        return column.length;
    }
 
    public int getRowCount() {
        return data.length;
    }
 
    public String getColumnName(int col) {
        return column[col];
    }
}
