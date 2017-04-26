package amts;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class TableLogin {
    
    private String data[][];
    private Database1 db1 = null;
    JTable table = null;
    
    TableLogin()
    {
        loadTable();
        db1 = new Database1();
    }

    private void loadTable() {
       String cols[] = {"login_id","status","join_date","contact_no","email" };
       data = db1.getData(cols, "login", "", "");
       
       table = new JTable(data,cols);
       
       ListSelectionModel selectionModel = table.getSelectionModel();		
       selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);		
       selectionModel.addListSelectionListener(new RowListener(this));
       
       JFrame f = new JFrame();
		
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(new JScrollPane(table));    
        f.setSize(400,400);
        f.setLocation(200,200);
        f.setVisible(true);
    }
    
}

class RowListener implements ListSelectionListener
{
    TableLogin readRow;
    JTable table;
  
    public RowListener(TableLogin rar)
    {
        readRow = rar;
        table = readRow.table;
    }
  
    public void valueChanged(ListSelectionEvent e)
    {
        if(!e.getValueIsAdjusting())
        {
            ListSelectionModel model = table.getSelectionModel();
            int lead = model.getLeadSelectionIndex();
            displayRowValues(lead);
        }
    }
  
    private void displayRowValues(int rowIndex)
    {
        int columns = table.getColumnCount();
        String s = "";
        for(int col = 0; col < columns; col++)
        {
            Object o = table.getValueAt(rowIndex, col);
            s += o.toString();
            
            if(col < columns - 1)
                s += ", ";
        }
        
    }
}

