package amts;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTable;

public class PassAdmin
{
    private JTable table;
    private Database1 db1;
    private Object[][] data;
    private Font f1;
    private Dimension fSize;
    private final String cols[] = {"pass_no","fullName","adress","pincode","contactNo","start_date","end_date","price" }; 
    private JPopupMenu pop1;
    private JPanel next;
    
    PassAdmin()
    {
        db1 = new Database1();
        
        loadData();
    }//constructor

    private void loadData()
    {
        try
        {
            
        }//try
        catch( Exception e )
        {
            
        }//catch
    }//method
}//class
