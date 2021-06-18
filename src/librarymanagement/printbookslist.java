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

/**
 *
 * @author win 07
 */
public class printbookslist {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




    public printbookslist() throws ClassNotFoundException, SQLException
         {
             JFrame frame = new JFrame();
        frame.setVisible(true);
        
    frame.setExtendedState(MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
       
  
    
    
    Class.forName("org.sqlite.JDBC");
                Connection c=DriverManager.getConnection("jdbc:sqlite:books1.db");
          Statement  stmt = c.createStatement();

        
       
            ResultSet rs=stmt.executeQuery("select * from books2");
            
            int q=0;
            while(rs.next())
            {
                q++;
            }
             
            rs.close();
        Object[][] data = new Object[q][7]; 
    ResultSet gs=stmt.executeQuery("select * from books2");
    int i=0;
   
    while(gs.next())
    {
        
        data[i][0]= rs.getInt(1);
        data[i][1]=rs.getInt(2);
        data[i][2]=rs.getString(3);
        data[i][3]=rs.getString(4);
        data[i][4]=rs.getString(5);
        data[i][5]=rs.getString(6);
        data[i][6]=rs.getString(7);
   i++;
    }
    gs.close();
    
    
    String column[] = {"id", "Book no", "Books name", "stream", "author", "publicaton", "rack"};
    DefaultTableModel md = new DefaultTableModel(data,column)
    {
         
    };

    JTable table1 = new JTable(data, column);
        
    
    
    System.out.println(table1.getColumnClass(0));
    DefaultTableCellRenderer cell = new DefaultTableCellRenderer();
    cell.setHorizontalAlignment(SwingConstants.CENTER);
          table1.getColumn("id").setCellRenderer(cell);
       table1.getColumn("Book no").setCellRenderer(cell);
      table1.getColumn("Books name").setCellRenderer(cell);
        table1.getColumn("stream").setCellRenderer(cell);
        table1.getColumn("author").setCellRenderer(cell);
        table1.getColumn("publicaton").setCellRenderer(cell);
        table1.getColumn("rack").setCellRenderer(cell);
        table1.setRowHeight(30);
       table1.setFont(new Font("",0,16));
        table1.setColumnSelectionAllowed(false);
        table1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table1.getTableHeader().setDefaultRenderer(cell);
        table1.setShowGrid(true);    
        table1.setBackground(Color.WHITE);
               
        JScrollPane sp=new JScrollPane(table1);    
       
        JPanel pane = new JPanel();
        pane.setLayout(null);
        frame.add(pane);
        pane.add(sp);
    sp.setBounds(0, 40, 650, 200);
 
    
    rs.close();
    stmt.close();
 
         c.close();
          
                            Thread t = new Thread() {
 
            public void run() {
                try {
                    frame.setVisible(false);
                    MessageFormat f = new MessageFormat("Available Books in Library");
                    Printable printable = table1.getPrintable(
                            JTable.PrintMode.NORMAL,
                            new MessageFormat("Books List "),
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
                          
         
         }
         
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        new printbookslist();
    }
}


