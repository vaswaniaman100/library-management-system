/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package librarymanagement;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import sun.awt.resources.awt;

/**
 *
 * @author win 07
 */
public class printstudentlist {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




    public printstudentlist() throws ClassNotFoundException, SQLException
         {
             JFrame frame = new JFrame();
        frame.setVisible(true);
        
    frame.setExtendedState(MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        
        JTextField search = new JTextField();
         search.setBounds(50,5,90,30);
         search.setVisible(true);
       
  
   
    
    
    
    
    
    
    
    try{
    
    Class.forName("org.sqlite.JDBC");
                Connection c=DriverManager.getConnection("jdbc:sqlite:books1.db");
          Statement  stmt = c.createStatement();
            ResultSet rs=stmt.executeQuery("select * from students ;");
            
            int q=0;
            while(rs.next())
            {
                q++;
            }
            rs.close();
            
        Object[][] data = new Object[q][5]; 
      
    ResultSet gs=stmt.executeQuery("select * from students order by id asc ;");

    int i=0;
   
    while(gs.next())
    {
        
        data[i][0]= rs.getInt(1);
        data[i][1]=rs.getString(2);
        data[i][2]=rs.getString(3);
        data[i][3]=rs.getString(4);
        data[i][4]=rs.getInt(5);
      
   i++;
    }
         String column[] = {"id", "Student name", "class", "mobile no", "libray card no"};
         DefaultTableModel md = new DefaultTableModel(data, column)
    {

        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
     
    };
          JTable table1 = new JTable(data, column);
        
 
    
        table1.setModel(md);
        
         DefaultTableCellRenderer cell = new DefaultTableCellRenderer();
    cell.setHorizontalAlignment(SwingConstants.CENTER);
        table1.getColumn("id").setCellRenderer(cell);
        table1.getColumn("Student name").setCellRenderer(cell);
       table1.getColumn("class").setCellRenderer(cell);
       table1.getColumn("mobile no").setCellRenderer(cell);
       table1.getColumn("libray card no").setCellRenderer(cell);
       table1.setRowHeight(30);
          table1.setFont(new Font("",0,16));
        table1.setColumnSelectionAllowed(false);
        table1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table1.getTableHeader().setDefaultRenderer(cell);
        table1.setShowGrid(true);
        table1.setBackground(Color.WHITE);
        gs.close();
        stmt.close();
        c.close();
         JScrollPane sp=new JScrollPane(table1);    
       
        JPanel pane = new JPanel();
        pane.setLayout(null);
        frame.add(pane);
        pane.add(sp);
    sp.setBounds(0, 40, 651, 200);
 
    
                            Thread t = new Thread() {
 
            public void run() {
                try {
                    frame.setVisible(false);
                    MessageFormat f = new MessageFormat("Available Books in Library");
                    Printable printable = table1.getPrintable(
                            JTable.PrintMode.NORMAL,
                            new MessageFormat("Student List"),
                            null);
                    PrinterJob job = PrinterJob.getPrinterJob();
                    PageFormat u = new PageFormat();
                  

                    u.setOrientation(PageFormat.LANDSCAPE);
                    job.setPrintable(printable, u);
                    
                   
                            job.print();
                      
                    
                    
                    frame.dispose();
                } catch (Exception ex) {
                   
                }
                            
            }
        };
                            t.start();
                          
         
    
    
}catch(Exception e)
        {}
    
    
    
    
    
    
         }
         
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        new printstudentlist();
    }
}


