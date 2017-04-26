package amts;

import diu.swe.habib.JavaToast.JToast;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class RootMaster extends javax.swing.JInternalFrame
{
    
    private Object[][] data1;
    private Object[][] data2;
    private Object[][] data3;
    private Database1 db1;
    private final String[] cols1 = { "bus_no","root_no","Start_place","End_place" };
    private final String[] cols2 = { "record_no","root_no","bus_no","start_time"};
    private final String[] cols3 = { "root_no","stop_no","place","area_code" };
    private String table;
    private String column;
    private final Color white = new Color(255,255,255);
     private final Color blue = new Color(0,102,153);
     private Dimension fSize;
     private routeNew nr;
    
    public RootMaster()
    {
        initComponents();
        db1 = new Database1();
        fSize = Toolkit.getDefaultToolkit().getScreenSize();
        
        data1 = db1.getData(cols1, "bus_list", "", "");
        data2 = db1.getData(cols2, "bus_shedule", "", "");
        data3 = db1.getData(cols3, "bus_stop", "", "");
        
        tableList.setModel(new DefaultTableModel(data1,cols1));
        tableShedule.setModel(new DefaultTableModel(data2,cols2));
        tableStand.setModel(new DefaultTableModel(data3,cols3));
        
        tableList.add(pop1);
        tableShedule.add(pop1);
        tableStand.add(pop1);
        
        tableList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tableShedule.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tableStand.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
    }//constructor

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pop1 = new javax.swing.JPopupMenu();
        update = new javax.swing.JMenuItem();
        delete = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableList = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableStand = new javax.swing.JTable();
        BTN_refresh = new javax.swing.JToggleButton();
        BTN_root = new javax.swing.JToggleButton();
        BTN_bus = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BTN_stop = new javax.swing.JToggleButton();
        TF_bus = new javax.swing.JTextField();
        TF_root = new javax.swing.JTextField();
        TF_stop = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableShedule = new javax.swing.JTable();
        BTN_new = new javax.swing.JToggleButton();

        update.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        update.setText("Update value");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        pop1.add(update);

        delete.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        delete.setText("Delete raw");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        pop1.add(delete);

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Root Master");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableList.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        tableList.setModel(new javax.swing.table.DefaultTableModel(
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
        tableList.setRowHeight(22);
        tableList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableList);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 540, 350));

        tableStand.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        tableStand.setModel(new javax.swing.table.DefaultTableModel(
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
        tableStand.setRowHeight(20);
        tableStand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableStandMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableStand);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 494, 218));

        BTN_refresh.setBackground(new java.awt.Color(255, 255, 255));
        BTN_refresh.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        BTN_refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amts/images/ic_refresh_black_24dp_2x.png"))); // NOI18N
        BTN_refresh.setText("Refresh");
        BTN_refresh.setContentAreaFilled(false);
        BTN_refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_refreshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_refreshMouseExited(evt);
            }
        });
        BTN_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_refreshActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 150, 37));

        BTN_root.setBackground(new java.awt.Color(255, 255, 255));
        BTN_root.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        BTN_root.setForeground(new java.awt.Color(0, 102, 153));
        BTN_root.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amts/images/ic_send_black_18dp_2x.png"))); // NOI18N
        BTN_root.setContentAreaFilled(false);
        BTN_root.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_root.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_rootMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_rootMouseExited(evt);
            }
        });
        BTN_root.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_rootActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_root, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 90, 37));

        BTN_bus.setBackground(new java.awt.Color(255, 255, 255));
        BTN_bus.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        BTN_bus.setForeground(new java.awt.Color(0, 102, 153));
        BTN_bus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amts/images/ic_send_black_18dp_2x.png"))); // NOI18N
        BTN_bus.setContentAreaFilled(false);
        BTN_bus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_bus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_busMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_busMouseExited(evt);
            }
        });
        BTN_bus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_busActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_bus, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 90, 37));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 64, 129));
        jLabel2.setText("Enter Bus_no :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 114, 135, 37));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 64, 129));
        jLabel3.setText("Enter Root No :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 59, 137, 37));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 64, 129));
        jLabel4.setText("Enter Bus Stop :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 162, 135, 37));

        BTN_stop.setBackground(new java.awt.Color(255, 255, 255));
        BTN_stop.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        BTN_stop.setForeground(new java.awt.Color(0, 102, 153));
        BTN_stop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amts/images/ic_send_black_18dp_2x.png"))); // NOI18N
        BTN_stop.setContentAreaFilled(false);
        BTN_stop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_stop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_stopMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_stopMouseExited(evt);
            }
        });
        BTN_stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_stopActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_stop, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 90, 37));

        TF_bus.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        TF_bus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 129, 255)));
        getContentPane().add(TF_bus, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 118, 275, -1));

        TF_root.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        TF_root.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 129, 255)));
        getContentPane().add(TF_root, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 63, 275, -1));

        TF_stop.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        TF_stop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 129, 255)));
        getContentPane().add(TF_stop, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 166, 275, -1));

        tableShedule.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        tableShedule.setModel(new javax.swing.table.DefaultTableModel(
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
        tableShedule.setRowHeight(22);
        tableShedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSheduleMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableShedule);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 494, 350));

        BTN_new.setBackground(new java.awt.Color(255, 255, 255));
        BTN_new.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        BTN_new.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amts/images/ic_create_new_folder_black_24dp_2x.png"))); // NOI18N
        BTN_new.setText("New");
        BTN_new.setContentAreaFilled(false);
        BTN_new.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_new.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_newMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_newMouseExited(evt);
            }
        });
        BTN_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_newActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_new, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 130, 37));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableStandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableStandMouseClicked
        if( evt.getButton()==MouseEvent.BUTTON3 )
            pop1.show(tableStand, evt.getX(), evt.getY());
        
        table = "bus_stop";
    }//GEN-LAST:event_tableStandMouseClicked

    private void tableListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableListMouseClicked
        if( evt.getButton()==MouseEvent.BUTTON3 )
            pop1.show(tableList, evt.getX(), evt.getY());
        
        table = "bus_list";
    }//GEN-LAST:event_tableListMouseClicked

    private void tableSheduleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSheduleMouseClicked
        if( evt.getButton()==MouseEvent.BUTTON3 )
            pop1.show(tableShedule, evt.getX(), evt.getY());
        
        table = "bus_shedule";
    }//GEN-LAST:event_tableSheduleMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        
        String val;
        int raw;
        int col;
        
        if( table.equalsIgnoreCase("bus_list") )
        {
            if( tableList.getSelectedRowCount() < 1 )
            {
                new JToast().makeToast(null, " Please select any record from BusList table First", 2, JToast.type_of_info);
                tableList.grabFocus();
                return;
            }//if
            
            raw = tableList.getSelectedRow();
            col = tableList.getSelectedColumn();
            val = JOptionPane.showInputDialog(null, "Enter New Data", "Update", JOptionPane.OK_CANCEL_OPTION);
            String comp = (String) tableList.getValueAt(raw, col);
            
            if( db1.updateData("bus_list", cols1[col], val , "bus_no", comp) )
            {
                new JToast().makeToast(null, " Successfully updated !", 1, JToast.type_of_succes);
                this.BTN_refreshActionPerformed(null);
                return;
            }
            else
            {
                new JToast().makeToast(null, " Can't Update ! !", 1, JToast.type_of_error);
                this.BTN_refreshActionPerformed(null);
                return;
            }           
        }//if
        else if( table.equalsIgnoreCase("bus_shedule") )
        {
            if( tableShedule.getSelectedRowCount() < 1)
            {
                new JToast().makeToast(null, " Please select any record from BusShedule table First", 2, JToast.type_of_info);
                tableShedule.grabFocus();
                return;
            }//if
            
            raw = tableShedule.getSelectedRow();
            col = tableShedule.getSelectedColumn();
            
            if( col == 0 )
            {
                new JToast().makeToast(null, " Record Number Can't be Updated !", 1, JToast.type_of_info);
                tableShedule.grabFocus();
                return;
            }//if
            
            val = JOptionPane.showInputDialog(null, "Enter New Data", "Update", JOptionPane.OK_CANCEL_OPTION);
            String val1 = (String) tableShedule.getValueAt(raw,0 );          
            
            if( db1.updateData("bus_shedule", cols2[col], val, "record_no", val1) )
            {
                new JToast().makeToast(null, "Record Successfully Updated", 1, JToast.type_of_succes);
                this.BTN_refreshActionPerformed(null);
                return;
            }//if
            else
            {
                new JToast().makeToast(null, " Record Can't be Updated !", 1, JToast.type_of_succes);
                this.BTN_refreshActionPerformed(null);
                return;
            }
            
        }//els if
        else
        {
            if( tableStand.getSelectedRowCount() < 1 )
            {
                new JToast().makeToast(null, " Please select any record from BusStop table First", 2, JToast.type_of_info);
                tableStand.grabFocus();
                return;
            }//if
            
            raw = tableStand.getSelectedRow();
            col = tableStand.getSelectedColumn();
            val = JOptionPane.showInputDialog(null, "Enter New Data", "Update", JOptionPane.OK_CANCEL_OPTION);
            String cmp = (String) tableStand.getValueAt(raw, 1);
            
            if( db1.updateData("bus_stop", cols3[col], val, "stop_no", cmp) )
            {
                new JToast().makeToast(null, " Successfully Updated", 1, JToast.type_of_succes);
                this.BTN_refreshActionPerformed(null);
                return;
            }
            else
            {
                new JToast().makeToast(null, " Can't Updated", 1, JToast.type_of_error);
                this.BTN_refreshActionPerformed(null);
                return;
            }
            
        }//else
    }//GEN-LAST:event_updateActionPerformed

    private void BTN_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_refreshActionPerformed
        data1 = db1.getData(cols1, "bus_list", "", "");
        data2 = db1.getData(cols2, "bus_shedule", "", "");
        data3 = db1.getData(cols3, "bus_stop", "", "");
        
        tableList.setModel(new DefaultTableModel(data1,cols1));
        tableShedule.setModel(new DefaultTableModel(data2,cols2));
        tableStand.setModel(new DefaultTableModel(data3,cols3));
    }//GEN-LAST:event_BTN_refreshActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int raw;
        int col;

        if( !Home1.admin_state )
        {
            new JToast().makeToast(null, "You haven't Permission To Delete \n Inform to Higher Authority", 2, JToast.type_of_info);
            return;
        }
        
        if( table.equalsIgnoreCase("bus_stop") )
        {
            if( tableStand.getSelectedRowCount() < 1 )
            {
                 new JToast().makeToast(null, " First Select Any Record in Third Table ", 1, JToast.type_of_info);
                return;
            }//
                   
            col = tableStand.getSelectedColumn();
            raw = tableStand.getSelectedRow();
            String val = (String) tableStand.getValueAt(raw, 1);
                   
            if( db1.deleteData("Bus_stop", "stop_no", val) )
            {
                new JToast().makeToast(null, " Deleted Successflly ", 1, JToast.type_of_info);
                data3 = db1.getData(cols3, "bus_stop","" , "");
                tableStand.setModel(new DefaultTableModel(data3,cols3));
                return;
            }//
            else
            {
                new JToast().makeToast(null, " Deleted Not Successflly \n Try With Valid options ", 1, JToast.type_of_info);
                return;
            }//
        }//if
        else if( table.equalsIgnoreCase("bus_Shedule") )
        {
            if( tableShedule.getSelectedRowCount() < 0 )
            {
                new JToast().makeToast(null, " First Select Any Record in Seocond Table ", 1, JToast.type_of_info);
                return;
            }//
            
            col = tableShedule.getSelectedColumn();
            raw = tableShedule.getSelectedRow();
            String val = (String) tableShedule.getValueAt(raw, 0);
                   
            if( db1.deleteData("bus_shedule", "record_no", val ) )
            {
                new JToast().makeToast(null, " Deleted Successflly ", 1, JToast.type_of_info);
                data2 = db1.getData(cols2, "bus_shedule","" , "");
                tableShedule.setModel(new DefaultTableModel(data2,cols2));
                return;
            }//
            else
            {
                new JToast().makeToast(null, " Deleted Not Successflly \n Try With Valid options ", 1, JToast.type_of_info);
                return;
            }//
        }//else if
        else
        {
            if( tableList.getSelectedRowCount() < 0 )
            {
                new JToast().makeToast(null, " First Select Any Record in First Table ", 1, JToast.type_of_info);
                return;
             }//
                   
            col = tableList.getSelectedColumn();
            raw = tableList.getSelectedRow();
            String val = (String) tableList.getValueAt(raw, 0);
                   
            int n = JOptionPane.showConfirmDialog(null,"Are yous sure you Delete This record \n It will deletes"
                + " Affected records also so please Confirm !","confirm",JOptionPane.YES_NO_OPTION);
                  
            if( n == JOptionPane.NO_OPTION )
                return;
                  
            val = (String) data1[raw][0];
            if( db1.deleteData("bus_shedule", "bus_no", val) )
            {
                new JToast().makeToast(null, " Records Successfully Deleted From Bus_Shedule Table ", 1, JToast.type_of_succes);
                data2 = db1.getData(cols2, "bus_shedule","" , "");
                tableShedule.setModel(new DefaultTableModel(data2,cols2));                      
            }//if
                  
            val = (String) data1[raw][1];
            if( db1.deleteData("bus_stop", "root_no", val) )
            {                      
                new JToast().makeToast(null, " Records Successfully Deleted From Bus_Stop Table ", 1, JToast.type_of_succes); 
                data3 = db1.getData(cols3, "bus_stop","" , "");
                tableStand.setModel(new DefaultTableModel(data3,cols3));
            }//if
                  
            val = (String) data1[raw][0];
            if( db1.deleteData("bus_list", "bus_no", val))
            {
                new JToast().makeToast(null, " Deleted Successflly ", 1, JToast.type_of_info);                       
                data1 = db1.getData(cols1, "bus_list", "", "");
                tableList.setModel(new DefaultTableModel(data1,cols1));                       
            }//if
        }//else
    }//GEN-LAST:event_deleteActionPerformed

    private void BTN_rootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_rootActionPerformed
        if( TF_root.getText().isEmpty() )
        {
            new JToast().makeToast(null, " Please Enter Root First", 1, JToast.type_of_notification);
            TF_root.grabFocus();
            return;
        }
        
        try
        {
            data1 = db1.getData(cols1, "bus_list", "root_no", TF_root.getText());            
            if( data1.length < 1 || data1 == null)
            {
                new JToast().makeToast(null, " Please Enter valid Root number First", 1, JToast.type_of_notification);
                TF_root.setText(null);
                TF_root.grabFocus();
                return;
            }            
            
            data2 = db1.getData(cols2, "bus_shedule", "root_no",TF_root.getText() );            
            data3 = db1.getData(cols3, "bus_stop", "root_no",TF_root.getText() );
        
            tableList.setModel(new DefaultTableModel(data1,cols1));
            tableShedule.setModel(new DefaultTableModel(data2,cols2));
            tableStand.setModel(new DefaultTableModel(data3,cols3));
        }
        catch( Exception e )
        {
            new JToast().makeToast(null, " Please Enter proper details", 1, JToast.type_of_info);
            TF_root.setText(null);
            TF_root.grabFocus();
            return;
        }
        
        TF_root.setText(null);
    }//GEN-LAST:event_BTN_rootActionPerformed

    private void BTN_busActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_busActionPerformed
        
        if( TF_bus.getText().isEmpty() )
        {
            new JToast().makeToast(null, " Please Enter Bus No First", 1, JToast.type_of_notification);
            TF_bus.setText(null);
            TF_bus.grabFocus();
            return;
        }
        
        data1 = db1.getData(cols1, "bus_list", "bus_no", TF_bus.getText());
        if( data1.length < 1 || data1 == null)
        {
            new JToast().makeToast(null, " Please Enter valid bus number First", 1, JToast.type_of_notification);
            TF_bus.setText(null);
            TF_bus.grabFocus();
            return;
        }    
        
        data2 = db1.getData(cols2, "bus_shedule", "bus_no",TF_bus.getText() );
        String val = db1.getValue("root_no", "bus_list", "bus_no", TF_bus.getText());
        data3 = db1.getData(cols3, "bus_stop", "root_no", val);
        
        tableList.setModel(new DefaultTableModel(data1,cols1));
        tableShedule.setModel(new DefaultTableModel(data2,cols2));
        tableStand.setModel(new DefaultTableModel(data3,cols3));
        
        TF_bus.setText(null);
    }//GEN-LAST:event_BTN_busActionPerformed

    private void BTN_stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_stopActionPerformed
        if( TF_stop.getText().isEmpty() )
        {
            new JToast().makeToast(null, " Please Enter Bus Stand Name First", 1, JToast.type_of_notification);
            TF_stop.setText(null);
            TF_stop.grabFocus();
            return;
        }
        try
        {
            
            try
            {
                int n = Integer.valueOf(TF_stop.getText());
                String[] val = db1.getData("root_no", "bus_stop", "area_code", TF_stop.getText());
                if( val.length <1 || val == null )
                {
                    new JToast().makeToast(null, " Enter Valid Bus_stand Name first ", 1, JToast.type_of_info);
                    TF_stop.setText(null);
                    TF_stop.grabFocus();
                    return;
                }
           
                data1 = db1.getData(cols1, "bus_list", "root_no", val);
                data2 = db1.getData(cols2, "bus_shedule", "root_no", val);           
                data3 = db1.getData(cols3, "bus_stop", "area_code", TF_stop.getText());
           
                tableList.setModel(new DefaultTableModel(data1,cols1));
                tableShedule.setModel(new DefaultTableModel(data2,cols2));
                tableStand.setModel(new DefaultTableModel(data3,cols3));
                TF_stop.setText(null);
            }
            catch( Exception e1)
            {
                String[] val = db1.getData("root_no", "bus_stop", "place", TF_stop.getText());
                if( val.length <1 || val == null )
                {
                    new JToast().makeToast(null, " Enter Valid Bus_stand Name first ", 1, JToast.type_of_info);
                    TF_stop.setText(null);
                    TF_stop.grabFocus();
                    return;
                }
           
                data1 = db1.getData(cols1, "bus_list", "root_no", val);
                data2 = db1.getData(cols2, "bus_shedule", "root_no", val);           
                data3 = db1.getData(cols3, "bus_stop", "place", TF_stop.getText());
           
                tableList.setModel(new DefaultTableModel(data1,cols1));
                tableShedule.setModel(new DefaultTableModel(data2,cols2));
                tableStand.setModel(new DefaultTableModel(data3,cols3));
                TF_stop.setText(null);
            }
       
        }
        catch( Exception e )
        {
            System.out.println( e );
            new JToast().makeToast(null, " Entet valid Details", 1, JToast.type_of_notification);
            TF_stop.setText(null);
            TF_stop.grabFocus();
        }
        
        TF_stop.setText(null);
    }//GEN-LAST:event_BTN_stopActionPerformed

    private void BTN_refreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_refreshMouseEntered
        BTN_refresh.setBackground(blue);
        BTN_refresh.setForeground(white);
    }//GEN-LAST:event_BTN_refreshMouseEntered

    private void BTN_rootMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_rootMouseEntered
       BTN_root.setBackground(blue);
       BTN_root.setForeground(white);
    }//GEN-LAST:event_BTN_rootMouseEntered

    private void BTN_busMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_busMouseEntered
        BTN_bus.setBackground(blue);
        BTN_bus.setForeground(white);
    }//GEN-LAST:event_BTN_busMouseEntered

    private void BTN_stopMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_stopMouseEntered
         BTN_stop.setBackground(blue);
        BTN_stop.setForeground(white);
    }//GEN-LAST:event_BTN_stopMouseEntered

    private void BTN_refreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_refreshMouseExited
        BTN_refresh.setBackground(white);
        BTN_refresh.setForeground(blue);
    }//GEN-LAST:event_BTN_refreshMouseExited

    private void BTN_rootMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_rootMouseExited
        BTN_root.setBackground(white);
        BTN_root.setForeground(blue);
    }//GEN-LAST:event_BTN_rootMouseExited

    private void BTN_busMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_busMouseExited
        BTN_bus.setBackground(white);
       BTN_bus.setForeground(blue);
    }//GEN-LAST:event_BTN_busMouseExited

    private void BTN_stopMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_stopMouseExited
        BTN_stop.setBackground(white);
        BTN_stop.setForeground(blue);
    }//GEN-LAST:event_BTN_stopMouseExited

    private void BTN_newMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_newMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_newMouseEntered

    private void BTN_newMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_newMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_newMouseExited

    private void BTN_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_newActionPerformed
        nr = new routeNew();
        nr.setVisible(true);
        nr.setResizable(false);
        nr.setLocation((int)((fSize.getWidth()-nr.getWidth())/2), (int)((fSize.getHeight()-nr.getHeight())/2-10));
    }//GEN-LAST:event_BTN_newActionPerformed

    protected void finalize() throws Throwable
    {
        try {
            nr.dispose();
        } finally {
            super.finalize();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BTN_bus;
    private javax.swing.JToggleButton BTN_new;
    private javax.swing.JToggleButton BTN_refresh;
    private javax.swing.JToggleButton BTN_root;
    private javax.swing.JToggleButton BTN_stop;
    private javax.swing.JTextField TF_bus;
    private javax.swing.JTextField TF_root;
    private javax.swing.JTextField TF_stop;
    private javax.swing.JMenuItem delete;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu pop1;
    private javax.swing.JTable tableList;
    private javax.swing.JTable tableShedule;
    private javax.swing.JTable tableStand;
    private javax.swing.JMenuItem update;
    // End of variables declaration//GEN-END:variables
}
