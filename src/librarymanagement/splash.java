/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package librarymanagement;

import static java.awt.Frame.MAXIMIZED_BOTH;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author win 07
 */
public class splash {
    splash()
    {
        loading g = new loading();
        g.setVisible(true);
             
        Thread t = new Thread() {
 
            public void run() {
                for(int i=0;i<=101;i++)
              {
                  if(i<101)
                  {   
                      try {
                          sleep(100);
                      } catch (InterruptedException ex) {
                          Logger.getLogger(splash.class.getName()).log(Level.SEVERE, null, ex);
                      }
                    g.jProgressBar1.setValue(i);
                    
                  }
                  else
                  {
                      g.dispose();
                    
               
                  }
                }
                
                 Thread g = new Thread() {
 
            public void run() {
                 opening gt = new opening();
                 gt.setVisible(true);
            }};
                 g.start();
            
            
            
            
            
            }
        };
        t.start();
        
    }
    
    public static void main(String args[])
    {
        
              new splash();
    }
    
}
