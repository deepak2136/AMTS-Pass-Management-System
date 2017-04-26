package amts;

import diu.swe.habib.JavaToast.JToast;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class AdminPass extends javax.swing.JInternalFrame 
{
    private Object[][] data;
    private final Database1 db1;
    private final Dimension fSize;
    private final String cols[] = {"pass_no","fullName","adress","pincode","contactNo","start_date","end_date","price" };
    private int size;
    private int start;
    private final int cnt;
    private int page;
    private int tpage;
    
    public AdminPass() 
    {
        initComponents();
        db1 = new Database1();
        page = 1;
        tpage = 0;
        size = (int) db1.getCal("count(pass_no)", "pass");
        System.out.println( size );
        start = 0;
        cnt = 20;
        loadData();
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        fSize = Toolkit.getDefaultToolkit().getScreenSize();
        table.add(pop1);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pop1 = new javax.swing.JPopupMenu();
        print = new javax.swing.JMenuItem();
        update = new javax.swing.JMenuItem();
        delete = new javax.swing.JMenuItem();
        scroll1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        BTN_pre = new javax.swing.JToggleButton();
        LBL_pages = new javax.swing.JLabel();
        TF_pageNo = new javax.swing.JTextField();
        BTN_go = new javax.swing.JToggleButton();
        BTN_next = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TF_search = new javax.swing.JTextField();
        BTN_search = new javax.swing.JToggleButton();
        BTN_refresh = new javax.swing.JToggleButton();

        print.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        print.setText("print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        pop1.add(print);

        update.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        update.setText("Update cell");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        pop1.add(update);

        delete.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        delete.setText("Delete record");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        pop1.add(delete);

        setClosable(true);
        setIconifiable(true);
        setTitle("Pass Admin Panel");

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
        table.setRowHeight(22);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        scroll1.setViewportView(table);

        jPanel1.setBackground(new java.awt.Color(255, 64, 129));

        BTN_pre.setBackground(new java.awt.Color(0, 102, 153));
        BTN_pre.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        BTN_pre.setForeground(new java.awt.Color(255, 255, 255));
        BTN_pre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amts/images/ic_fast_rewind_white_18dp_2x.png"))); // NOI18N
        BTN_pre.setToolTipText("Backward");
        BTN_pre.setContentAreaFilled(false);
        BTN_pre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_pre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_preActionPerformed(evt);
            }
        });

        LBL_pages.setBackground(new java.awt.Color(255, 255, 255));
        LBL_pages.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N

        TF_pageNo.setToolTipText("Enter Page Number");
        TF_pageNo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TF_pageNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_pageNoKeyPressed(evt);
            }
        });

        BTN_go.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        BTN_go.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amts/images/ic_send_white_18dp_2x.png"))); // NOI18N
        BTN_go.setToolTipText("go");
        BTN_go.setContentAreaFilled(false);
        BTN_go.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_goActionPerformed(evt);
            }
        });

        BTN_next.setBackground(new java.awt.Color(0, 102, 153));
        BTN_next.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        BTN_next.setForeground(new java.awt.Color(255, 255, 255));
        BTN_next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amts/images/ic_fast_forward_white_18dp_2x.png"))); // NOI18N
        BTN_next.setToolTipText("Forward");
        BTN_next.setContentAreaFilled(false);
        BTN_next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_nextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(BTN_pre, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(LBL_pages, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TF_pageNo, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTN_go, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(BTN_next, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTN_pre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BTN_go, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TF_pageNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BTN_next, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBL_pages, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(68, 129, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter pass Number or Name :");

        TF_search.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        TF_search.setToolTipText("Enter Number or Name");

        BTN_search.setBackground(new java.awt.Color(0, 102, 153));
        BTN_search.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BTN_search.setForeground(new java.awt.Color(255, 255, 255));
        BTN_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amts/images/ic_search_white_24dp_2x.png"))); // NOI18N
        BTN_search.setToolTipText("Search");
        BTN_search.setBorder(null);
        BTN_search.setBorderPainted(false);
        BTN_search.setContentAreaFilled(false);
        BTN_search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_search.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/amts/images/Search-icon.png"))); // NOI18N
        BTN_search.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/amts/images/Search-icon.png"))); // NOI18N
        BTN_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_searchActionPerformed(evt);
            }
        });

        BTN_refresh.setBackground(new java.awt.Color(0, 102, 153));
        BTN_refresh.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BTN_refresh.setForeground(new java.awt.Color(255, 255, 255));
        BTN_refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amts/images/ic_refresh_white_24dp_2x.png"))); // NOI18N
        BTN_refresh.setToolTipText("Refresh");
        BTN_refresh.setBorder(null);
        BTN_refresh.setBorderPainted(false);
        BTN_refresh.setContentAreaFilled(false);
        BTN_refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_refresh.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/amts/images/Search-icon.png"))); // NOI18N
        BTN_refresh.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/amts/images/Search-icon.png"))); // NOI18N
        BTN_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(TF_search, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(BTN_search, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTN_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(14, Short.MAX_VALUE))
            .addComponent(BTN_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BTN_refresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scroll1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        if( evt.getButton()==MouseEvent.BUTTON3 )
         pop1.show(table, evt.getX(), evt.getY());
    }//GEN-LAST:event_tableMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        int raw = table.getSelectedRow();
        int col = table.getSelectedColumn();
        
        if(col == 0 )
        {
            new JToast().makeToast(null, "Pass number can't be Editade !", 1, JToast.type_of_info);
            return;
        }
        
        if( (col == 5 || col == 6 || col == 7) && !Home1.admin_state )
        {
            new JToast().makeToast(null, "You Haven't Permission To Edit !", 1, JToast.type_of_info);
            return;
        }
        
        String id = (String) table.getValueAt(raw, 0);
        String val = JOptionPane.showInputDialog(null, "Enter New Data", "Update", JOptionPane.OK_CANCEL_OPTION);
        String oldVal = db1.getValue(cols[col], "pass", "pass_no", id);
        
        if( val==null || val.isEmpty() )
        {
            new JToast().makeToast(null, "Enter New value first !", 1, JToast.type_of_info);
            return;
        }
        
        try {
            db1.setAutoComit(false);
        } catch (SQLException ex) {
            Logger.getLogger(AdminPass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if( db1.updateData("pass", cols[col], val, "pass_no", id) )
        {
            if( col == 7 )
            {
                if( !db1.updateData("deposit", cols[col], val, "passNo", id) )
                {
                    new JToast().makeToast(null, "Record Updated Failed !", 1, JToast.type_of_info);
                    try {
                        db1.doRollback();
                    } catch (SQLException ex) {
                        Logger.getLogger(AdminPass.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    db1.updateData("pass", cols[col], oldVal, "pass_no", id);
                    return;
                }
            }         
            new JToast().makeToast(null, "Record Successfully Updated !", 1, JToast.type_of_info);
            try {
                db1.doComit();
                db1.setAutoComit(true);
            } catch (SQLException ex) {
                Logger.getLogger(AdminPass.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            loadData();
            return;
        }
        else
        {
            new JToast().makeToast(null, "Record Updated Failed !", 1, JToast.type_of_info);
            return;
        }  
    }//GEN-LAST:event_updateActionPerformed

    private void BTN_goActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_goActionPerformed
        if( TF_pageNo.getText().isEmpty() || TF_pageNo.getText().length() < 0 )
        {
            new JToast().makeToast(null, " First Enter Page Number", 1, JToast.type_of_info);
            TF_pageNo.setText(null);
            TF_pageNo.grabFocus();
            return;
        }
        
        page = Integer.valueOf(TF_pageNo.getText());
        if( page > tpage || page < 1  )
        {
            new JToast().makeToast(null, " Enter Proper Page Number", 1, JToast.type_of_error);
            TF_pageNo.setText(null);
            TF_pageNo.grabFocus();
            return;
        }
        
        start = page * 20 - 20 ;
        System.out.println( start + "\t" + cnt );
        loadData();
    }//GEN-LAST:event_BTN_goActionPerformed

    private void TF_pageNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_pageNoKeyPressed
        if( evt.getKeyCode() < 96 || evt.getKeyCode() > 105  )
        {
            if( TF_pageNo.getText().length() == 1 )
            {
                TF_pageNo.setText(null);
                return;
            }
        
            StringBuilder s = new StringBuilder(TF_pageNo.getText());
            String s1 = s.substring(0, s.length()-1);
            TF_pageNo.setText( s1 );
        }
    }//GEN-LAST:event_TF_pageNoKeyPressed

    private void BTN_preActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_preActionPerformed
        if( page > 1 )
        {
            page --;
            start = page * 20 - 20;
            loadData();
        }
    }//GEN-LAST:event_BTN_preActionPerformed

    private void BTN_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_nextActionPerformed
        if( page < tpage )
        {
            page ++;
            start = page * 20 - 20;
            loadData();
        }
    }//GEN-LAST:event_BTN_nextActionPerformed

    private void BTN_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_refreshActionPerformed
        page = 1;
        start = page * 20 - 20;
        loadData();
    }//GEN-LAST:event_BTN_refreshActionPerformed

    private void BTN_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_searchActionPerformed
        if( TF_search.getText().length() < 1 || TF_search.getText().isEmpty() )
        {
            new JToast().makeToast(null, "Enter Valid Name or Number First", 1, JToast.type_of_info);
            TF_search.setText(null);
            TF_search.grabFocus();
            return;
        }
        
        try
        {
            int n = Integer.valueOf(TF_search.getText());
            
            try
            {
                data = db1.getData(cols, "pass", "pass_no", TF_search.getText());
                if( data[0][0] == null || data[0][0].toString().isEmpty() )
                    throw new Exception();
                 table.setModel(new DefaultTableModel(data,cols));
                TF_search.setText(null);
            }
            catch( Exception  e1 )
            {
                new JToast().makeToast(null, "Enter valid Pass_no", 1, JToast.type_of_error);
                TF_search.setText(null);
                TF_search.grabFocus();
                return;
            }
        }
        catch( Exception e )
        {
            try
            {
                data = db1.getData(cols, "pass", "fullName", TF_search.getText());
                if( data[0][0] == null || data[0][0].toString().isEmpty() )
                    throw new Exception();
                 table.setModel(new DefaultTableModel(data,cols));
                TF_search.setText(null);
            }
            catch( Exception  e1 )
            {
                new JToast().makeToast(null, "Enter valid Name", 1, JToast.type_of_error);
                TF_search.setText(null);
                TF_search.grabFocus();
                return;
            }
        }
    }//GEN-LAST:event_BTN_searchActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        int raw = table.getSelectedRow();
        String cmp = (String) table.getValueAt(raw, 0);
        
        PassPDF pf = new PassPDF(cmp);
            pf = new PassPDF(cmp);
    }//GEN-LAST:event_printActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        if( !Home1.admin_state )
        {
            new JToast().makeToast(null, " You haven't Permission To Delete", 1, JToast.type_of_info);
            table.grabFocus();
            return;
        }
        
        int raw = table.getSelectedRow();
        String cmp = (String) table.getValueAt(raw, 0);
        
        if( db1.deleteData("deposit", "passNo", cmp) )
        {
            if( db1.deleteData("pass", "pass_no", cmp) )
            {
                new JToast().makeToast(null, " Succesfully Deleted", 1, JToast.type_of_ok);
                this.BTN_refreshActionPerformed(null);
            }
        }
    }//GEN-LAST:event_deleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BTN_go;
    private javax.swing.JToggleButton BTN_next;
    private javax.swing.JToggleButton BTN_pre;
    private javax.swing.JToggleButton BTN_refresh;
    private javax.swing.JToggleButton BTN_search;
    private javax.swing.JLabel LBL_pages;
    private javax.swing.JTextField TF_pageNo;
    private javax.swing.JTextField TF_search;
    private javax.swing.JMenuItem delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu pop1;
    private javax.swing.JMenuItem print;
    private javax.swing.JScrollPane scroll1;
    private javax.swing.JTable table;
    private javax.swing.JMenuItem update;
    // End of variables declaration//GEN-END:variables

    private void loadData() 
    {
        size = (int) db1.getCal("count(pass_no)", "pass");
        tpage = size / 20 + 1;
        LBL_pages.setText( page + " out of " + tpage );
        LBL_pages.setEnabled(false);
        data = db1.getData(cols, "pass", "", "",start,cnt);
        table.setModel(new DefaultTableModel(data,cols));
    }
}
