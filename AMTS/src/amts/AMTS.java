package amts;

import java.awt.Dimension;
import java.awt.Toolkit;

public class AMTS {
    
    private Home1 h1 = null;
    login l1 = null;
    boolean b = false;

    public static void main(String[] args) 
    {
        Dimension fSize = Toolkit.getDefaultToolkit().getScreenSize();
        
        AMTS obj1 = new AMTS();
        obj1.l1 = new login();
        obj1.l1.setVisible(true);
        obj1.l1.pack();


    }    
}
