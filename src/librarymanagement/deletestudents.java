/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package librarymanagement;

import java.awt.Font;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.KeyEvent;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author win 07
 */
public class deletestudents extends javax.swing.JDialog {

    /**
     * Creates new form deletebooks
     */
    public deletestudents(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        search = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(null);

        search.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        search.setToolTipText("search");
        jPanel1.add(search);
        search.setBounds(0, 60, 210, 26);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("search");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(240, 60, 46, 20);

        jScrollPane2.setBorder(null);
        jScrollPane2.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        table1.setName(""); // NOI18N
        table1.getTableHeader().setResizingAllowed(false);
        table1.getTableHeader().setReorderingAllowed(false);
        table1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                table1FocusGained(evt);
            }
        });
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        table1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                table1KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(table1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(0, 100, 1169, 121);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(190, 240, 441, 26);

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel1.add(jTextField2);
        jTextField2.setBounds(190, 280, 441, 26);

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel1.add(jTextField3);
        jTextField3.setBounds(190, 320, 441, 26);

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel1.add(jTextField4);
        jTextField4.setBounds(800, 240, 330, 26);

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel1.add(jTextField5);
        jTextField5.setBounds(800, 290, 340, 26);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton1.setText("delete students");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(460, 380, 220, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("id");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 240, 72, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Student name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 280, 140, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("class");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 320, 33, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("contact");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(660, 240, 80, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Library card no");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(650, 290, 130, 20);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton2.setText("back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(750, 380, 120, 29);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Delete Students");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 0, 1170, 58);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/images/delete books.jpg"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 0, 1170, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1169, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    void tablecreation()
{
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
        table1.setModel(md);
        
         DefaultTableCellRenderer cell = new DefaultTableCellRenderer();
    cell.setHorizontalAlignment(SwingConstants.CENTER);
        this.table1.getColumn("id").setCellRenderer(cell);
        this.table1.getColumn("Student name").setCellRenderer(cell);
       this.table1.getColumn("class").setCellRenderer(cell);
        this.table1.getColumn("mobile no").setCellRenderer(cell);
        this.table1.getColumn("libray card no").setCellRenderer(cell);
        this.table1.setRowHeight(30);
        table1.setFont(new Font("",0,16));
        table1.setColumnSelectionAllowed(false);
        table1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table1.getTableHeader().setDefaultRenderer(cell);
        table1.setShowGrid(true);
        gs.close();
        stmt.close();
        c.close();
        
  
         TableRowSorter sorter = new TableRowSorter(md);
        
        table1.setRowSorter(sorter);
     sorter.setComparator(0, new IntComparator());
         sorter.setComparator(4, new IntComparator());
         table1.getTableHeader().setReorderingAllowed(false);
        search.getDocument().addDocumentListener(new DocumentListener(){

            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = search.getText();

                if (text.trim().length() == 0) {
                    sorter.setRowFilter(null);
                } else {
                    sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = search.getText();

                if (text.trim().length() == 0) {
                    sorter.setRowFilter(null);
                } else {
                    sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            


        });
        
        table1.putClientProperty("terminateEditOnFocusLost", true);
   
        }
        catch(Exception e){}
  
}
    
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    
        
         tablecreation();
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if("".equals(jTextField5.getText()))
{
    JOptionPane.showMessageDialog(this, "please select value from tablr to delete", "select value from table" ,JOptionPane.ERROR_MESSAGE);
}
       else
       {
           try{
             Connection ct=DriverManager.getConnection("jdbc:sqlite:books1.db");
                                Statement  stmt = ct.createStatement();
                                PreparedStatement ps = ct.prepareStatement("delete from students where librarycardno = "+jTextField5.getText()+";");
                                ps.executeUpdate();
           }
           catch(Exception e)
           {
               e.printStackTrace();
           }           
        Thread t = new Thread() {
 
            @Override
            public void run() {
                 remove(table1);
                 JTable table1 = new JTable();
        jScrollPane2.add(table1);
        tablecreation();
            }
        };
        t.start();
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
       
    }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void table1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_table1FocusGained
       
    }//GEN-LAST:event_table1FocusGained

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
 int row = table1.getSelectedRow(); int col = 0;
    String str =String.valueOf(table1.getValueAt(row,col));
        jTextField1.setText(str);
         row = table1.getSelectedRow();  col = 1;
     str =String.valueOf(table1.getValueAt(row,col));
        jTextField2.setText(str);
        row = table1.getSelectedRow();  col = 2;
     str =String.valueOf(table1.getValueAt(row,col));
        jTextField3.setText(str);
        row = table1.getSelectedRow();  col = 3;
     str =String.valueOf(table1.getValueAt(row,col));
        jTextField4.setText(str);
        row = table1.getSelectedRow();  col = 4;
     str =String.valueOf(table1.getValueAt(row,col));
        jTextField5.setText(str);
        
    
        
    }//GEN-LAST:event_table1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
           if(evt.getKeyCode() == KeyEvent.VK_ENTER )
           {
               if("".equals(jTextField5.getText()))
{
    JOptionPane.showMessageDialog(this, "please select value from tablr to delete", "select value from table" ,JOptionPane.ERROR_MESSAGE);
}
       else
       {
           try{
             Connection ct=DriverManager.getConnection("jdbc:sqlite:books1.db");
                                Statement  stmt = ct.createStatement();
                                PreparedStatement ps = ct.prepareStatement("delete from librarycardno where librarycardno = "+jTextField5.getText()+";");
                                ps.executeUpdate();
           }
           catch(Exception e)
           {
               e.printStackTrace();
           }           
        Thread t = new Thread() {
 
            @Override
            public void run() {
                 remove(table1);
                 JTable table1 = new JTable();
        jScrollPane2.add(table1);
        tablecreation();
            }
        };
        t.start();
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
       
    }
    
           }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER )
         {
             this.dispose();
         }
    }//GEN-LAST:event_jButton2KeyPressed

    private void table1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table1KeyReleased
        table1MouseClicked(null);
    }//GEN-LAST:event_table1KeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(deletestudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deletestudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deletestudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deletestudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                deletestudents dialog = new deletestudents(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField search;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}
