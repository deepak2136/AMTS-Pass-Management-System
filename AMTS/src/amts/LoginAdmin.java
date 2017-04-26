package amts;

import diu.swe.habib.JavaToast.JToast;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class LoginAdmin {
    
    private JTable table;
    private Database1 db1;
    private Object[][] data;
    private Font f1;
    private Dimension fSize;
    private final String cols[] = {"login_id","proof_id","id_no","type","status","join_date","designation","contact_no","email" }; 
    private JPopupMenu pop1;
    
    
    public LoginAdmin()
    {
        db1 = new Database1();
        this.loadData();
    }

    private void loadData() {
        
        fSize = Toolkit.getDefaultToolkit().getScreenSize();
        db1 = new Database1();
        try{ UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");}catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e){ System.out.println(e.getMessage());  }
        f1 = new Font("Rockwell",Font.PLAIN,16);
        
        data = db1.getData(cols, "login", "", "");   
        table = new JTable(new DefaultTableModel(data,cols));
        pop1 = new JPopupMenu();
        
        JFrame f = new JFrame();
        f.setLayout(new BorderLayout());
        
        JMenuItem update = new JMenuItem("Update Selected cell ");
        pop1.add(update);
        
        JMenuItem delete = new JMenuItem("Delete Record (row) ");
        pop1.add(delete);
        
        update.setFont(f1);
        delete.setFont(f1);
        
       JButton newEntry = new JButton("Add New Entry");
       newEntry.setFont(f1);
       f.add(newEntry,BorderLayout.SOUTH);
       
       JButton rfresh = new JButton("Refresh Data");
       rfresh.setFont(f1);
       f.add(rfresh,BorderLayout.NORTH);
       
       table.setBackground(new Color(230,255,255));
       table.setFont(f1);
       table.add(pop1);

       JScrollPane scroll1 = new JScrollPane(table);
       f.add(scroll1,BorderLayout.CENTER);
       
       table.addMouseListener( new MouseAdapter(){ 
          
           public void mouseClicked( MouseEvent m )
           {
            
                 if( m.getButton() == MouseEvent.BUTTON1 )
                   {
                       pop1.show(table, m.getX(), m.getY());
                   }
           }           
       });
       
     delete.addActionListener(new ActionListener(){ 
         
         @Override
            public void actionPerformed(ActionEvent e) {
                
                int raw = table.getSelectedRow();
                String s = (String) data[raw][0];
                if( db1.deleteData("login", "login_id", s) )
                {
                    new JToast().makeToast(null, "Successfully Deleted", 1, JToast.type_of_succes);
                    f.dispose();
                    new LoginAdmin();
                }//if                
            }//method           
     });//delete events
     
     
     update.addActionListener(new ActionListener(){ 

            @Override
            public void actionPerformed(ActionEvent e) {
              
                int col = table.getSelectedColumn();
                int row = table.getSelectedRow();
               
                String ch = JOptionPane.showInputDialog(null, "Enter New Data", "Update", JOptionPane.OK_CANCEL_OPTION);
                if( ch.isEmpty() || ch.equals(null) )
                {
                    return;
                }
               
                System.out.println(ch);
               
                String id = (String) data[row][0];               
                if( db1.updateData("login", cols[col], ch, "login_id", id) )
                {
                     data = db1.getData(cols, "login", "", "");
                     table.setModel(new DefaultTableModel(data,cols));                    
                    new JToast().makeToast(null, "Successfully Updated !", 1, JToast.type_of_succes);
                   
                }
                else
                    new JToast().makeToast(null, "Error Try with Valid Details !", 1, JToast.type_of_succes);
            }    
     });
       
       
       newEntry.addMouseListener(new MouseAdapter(){
           
           public void mouseClicked( MouseEvent m )
           {
              NewLogin nl = new NewLogin();
              nl.setVisible(true);
              nl.setLocation((int)((fSize.getWidth()-nl.getWidth())/2), (int)((fSize.getHeight()-nl.getHeight())/2-10));
              f.dispose();
           }
       });
       
       rfresh.addMouseListener(new MouseAdapter(){
           
           public void mouseClicked( MouseEvent m )
           {            
               data = db1.getData(cols, "login", "", "");
               table.setModel(new DefaultTableModel(data,cols));
             
           }
       });
       
       f.setSize(1280, 600);
       f.setVisible(true);
       f.setLocation((int)((fSize.getWidth()-f.getWidth())/2), (int)((fSize.getHeight()-f.getHeight())/2-15));
    }    
    
    
    private void refreshData()
    {
        data = db1.getData(cols, "login", "", "");  
    }
}



