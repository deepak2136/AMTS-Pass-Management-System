package amts;

import diu.swe.habib.JavaToast.JToast;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class LoginALL extends javax.swing.JInternalFrame {

    private Database1 db1;
    private Object[][] data;
    private Font f1;
    private Dimension fSize;
    private final String cols[] = {"login_id","proof_id","id_no","type","status","join_date","designation","contact_no","email" };
      private final Color green= new Color(255,64,129);
    private final Color orange= new Color(255,255,255);
    private final Color black= new Color(68,129,255);
    private NewLogin nl;
    
    public LoginALL() 
    {
        initComponents();
        db1 = new Database1();
        data = db1.getData(cols, "login", "", "");
        table.setModel(new DefaultTableModel(data,cols));
        this.loadData();
        table.add(pop1);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pop1 = new javax.swing.JPopupMenu();
        update = new javax.swing.JMenuItem();
        delete = new javax.swing.JMenuItem();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        newEntry = new javax.swing.JToggleButton();
        BTN_update = new javax.swing.JToggleButton();
        rfresh = new javax.swing.JToggleButton();

        update.setBackground(new java.awt.Color(51, 255, 204));
        update.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        update.setForeground(new java.awt.Color(51, 204, 0));
        update.setText("Update Selected Cell");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        pop1.add(update);

        delete.setBackground(new java.awt.Color(51, 255, 204));
        delete.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        delete.setForeground(new java.awt.Color(51, 204, 0));
        delete.setText("Delete Entire Raw");
        delete.setDoubleBuffered(true);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        pop1.add(delete);

        setBackground(new java.awt.Color(0, 0, 0));
        setClosable(true);
        setIconifiable(true);
        setTitle("Login Master");
        setToolTipText("Login Admin");
        setFont(new java.awt.Font("Rockwell", 2, 18)); // NOI18N
        setVisible(true);

        table.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.setDoubleBuffered(true);
        table.setInheritsPopupMenu(true);
        table.setOpaque(false);
        table.setRowHeight(24);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        newEntry.setBackground(new java.awt.Color(68, 129, 255));
        newEntry.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        newEntry.setForeground(new java.awt.Color(255, 255, 255));
        newEntry.setText("New");
        newEntry.setToolTipText("Click to add new Employee..");
        newEntry.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 3, true));
        newEntry.setBorderPainted(false);
        newEntry.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newEntry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                newEntryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                newEntryMouseExited(evt);
            }
        });
        newEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newEntryActionPerformed(evt);
            }
        });

        BTN_update.setBackground(new java.awt.Color(255, 64, 129));
        BTN_update.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        BTN_update.setForeground(new java.awt.Color(255, 255, 255));
        BTN_update.setText("Update");
        BTN_update.setToolTipText("Click to Update Employee Details..");
        BTN_update.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 204, 0), 3, true));
        BTN_update.setBorderPainted(false);
        BTN_update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_updateMouseExited(evt);
            }
        });
        BTN_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_updateActionPerformed(evt);
            }
        });

        rfresh.setBackground(new java.awt.Color(68, 129, 255));
        rfresh.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        rfresh.setForeground(new java.awt.Color(255, 255, 255));
        rfresh.setText("Refresh");
        rfresh.setToolTipText("Click to Refresh data..");
        rfresh.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 3, true));
        rfresh.setBorderPainted(false);
        rfresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rfresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rfreshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rfreshMouseExited(evt);
            }
        });
        rfresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(newEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(BTN_update, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(rfresh, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTN_update, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(newEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rfresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int raw = table.getSelectedRow();
        String s = (String) data[raw][0];
        
        if( db1.deleteData("login", "login_id", s) )
        {
            new JToast().makeToast(null, "Successfully Deleted", 1, JToast.type_of_succes);
            data = db1.getData(cols, "login", "", "");   
            table.setModel(new DefaultTableModel(data,cols));                    
        }//if    
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        int col = table.getSelectedColumn();
        int row = table.getSelectedRow();
               
        String ch = JOptionPane.showInputDialog(null, "Enter New Data", "Update", JOptionPane.OK_CANCEL_OPTION);
        if( ch.isEmpty() || ch.equals(null) )
              return;
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
    }//GEN-LAST:event_updateActionPerformed

    private void newEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEntryActionPerformed
        nl = new NewLogin();
        nl.setVisible(true);
        nl.setLocation((int)((fSize.getWidth()-nl.getWidth())/2), (int)((fSize.getHeight()-nl.getHeight())/2-10));
    }//GEN-LAST:event_newEntryActionPerformed

    private void rfreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfreshActionPerformed
        data = db1.getData(cols, "login", "", "");
        System.out.println(data.length + "\t" + data[0].length);
        table.setModel(new DefaultTableModel(data,cols));
    }//GEN-LAST:event_rfreshActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        if( evt.getButton()==MouseEvent.BUTTON3 )
            pop1.show(table, evt.getX(), evt.getY());
        else
        {
           
        }
    }//GEN-LAST:event_tableMouseClicked

    private void BTN_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_updateActionPerformed
        int col = table.getSelectedColumn();
        int row = table.getSelectedRow();
               
        if( table.getSelectedRowCount() < 1 || table.getColumnCount() < 1 )
        {
            new JToast().makeToast(null, "Please Select any Cell First", 1, JToast.type_of_notification);
            return;
        }
        
        String ch = JOptionPane.showInputDialog(null, "Enter New Data", "Update", JOptionPane.OK_CANCEL_OPTION);
        if( ch.isEmpty() || ch.equals(null) )
              return;
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
    }//GEN-LAST:event_BTN_updateActionPerformed

    private void newEntryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newEntryMouseEntered
       newEntry.setBackground(orange);
       newEntry.setForeground(black);
    }//GEN-LAST:event_newEntryMouseEntered

    private void newEntryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newEntryMouseExited
       newEntry.setBackground(black);
       newEntry.setForeground(orange);
    }//GEN-LAST:event_newEntryMouseExited

    private void BTN_updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_updateMouseEntered
        BTN_update.setBackground(orange);
        BTN_update.setForeground(green);
    }//GEN-LAST:event_BTN_updateMouseEntered

    private void BTN_updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_updateMouseExited
       BTN_update.setBackground(green);
       BTN_update.setForeground(orange);
    }//GEN-LAST:event_BTN_updateMouseExited

    private void rfreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rfreshMouseEntered
        rfresh.setBackground(orange);
        rfresh.setForeground(black);
    }//GEN-LAST:event_rfreshMouseEntered

    private void rfreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rfreshMouseExited
        rfresh.setBackground(black);
        rfresh.setForeground(orange);
    }//GEN-LAST:event_rfreshMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BTN_update;
    private javax.swing.JMenuItem delete;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton newEntry;
    private javax.swing.JPopupMenu pop1;
    private javax.swing.JToggleButton rfresh;
    private javax.swing.JTable table;
    private javax.swing.JMenuItem update;
    // End of variables declaration//GEN-END:variables

    private void loadData()
    {
        fSize = Toolkit.getDefaultToolkit().getScreenSize();
        db1 = new Database1();        
        data = db1.getData(cols, "login", "", "");   
        table.setModel(new DefaultTableModel(data,cols));        
        table.add(pop1);
    }//method
    
    protected void finalize() throws Throwable
    {
        try {
            nl.dispose();
            nl.setVisible(false);
        } finally {
            super.finalize();
        }
    }
}//class
