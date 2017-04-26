package amts;

import diu.swe.habib.JavaToast.JToast;
import java.awt.Color;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Renew extends javax.swing.JInternalFrame {
    
    private Database1 db1;
    private String old;
    private final String[] cols = { "fullName","dob","pic","adress","pincode","contactNo","pass_id","proof_id","id_no" };
    private String[][] data;
    private Date date;      
    private String logid = login.logid;
    private final Color white = new Color(255,255,255);
      private final Color blue = new Color(255,64,129);
      private final Color pnk = new Color(204,0,102);

    public Renew() {
        initComponents();
        db1 = new Database1();
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        RBTN_cash.setSelected(true);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CBOX_duretion = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        RBTN_cash = new javax.swing.JRadioButton();
        RBTN_chaque = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        BTN_submit = new javax.swing.JButton();
        BTN_close = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        TF_chkNo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TF_oldPass = new javax.swing.JTextField();
        BTN_check = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 64, 129));
        setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createEtchedBorder()));
        setClosable(true);
        setIconifiable(true);
        setTitle("Renew pass");

        jPanel1.setBackground(new java.awt.Color(255, 64, 129));

        jPanel2.setBackground(new java.awt.Color(68, 129, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select duretion : ");

        CBOX_duretion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CBOX_duretion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 Month", "2 Months", "3 Months", "4 Months", "5 Months", "6 Months" }));
        CBOX_duretion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOX_duretionActionPerformed(evt);
            }
        });
        CBOX_duretion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CBOX_duretionKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select Payment Method :");

        RBTN_cash.setBackground(new java.awt.Color(0, 102, 153));
        buttonGroup1.add(RBTN_cash);
        RBTN_cash.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        RBTN_cash.setForeground(new java.awt.Color(255, 255, 255));
        RBTN_cash.setText("Cash");
        RBTN_cash.setContentAreaFilled(false);

        RBTN_chaque.setBackground(new java.awt.Color(0, 102, 153));
        buttonGroup1.add(RBTN_chaque);
        RBTN_chaque.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        RBTN_chaque.setForeground(new java.awt.Color(255, 255, 255));
        RBTN_chaque.setText("Chaque");
        RBTN_chaque.setContentAreaFilled(false);
        RBTN_chaque.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RBTN_chaqueItemStateChanged(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(68, 129, 255));

        BTN_submit.setBackground(new java.awt.Color(255, 64, 129));
        BTN_submit.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BTN_submit.setForeground(new java.awt.Color(255, 255, 255));
        BTN_submit.setText("Submit");
        BTN_submit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        BTN_submit.setBorderPainted(false);
        BTN_submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_submitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_submitMouseExited(evt);
            }
        });
        BTN_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_submitActionPerformed(evt);
            }
        });

        BTN_close.setBackground(new java.awt.Color(255, 64, 129));
        BTN_close.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BTN_close.setForeground(new java.awt.Color(255, 255, 255));
        BTN_close.setText("Close");
        BTN_close.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        BTN_close.setBorderPainted(false);
        BTN_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_closeMouseEntered(evt);
            }
        });
        BTN_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(315, Short.MAX_VALUE)
                .addComponent(BTN_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(BTN_close, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_close, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enter Chaque Number :");

        TF_chkNo.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        TF_chkNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_chkNoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TF_chkNo, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(RBTN_cash)
                                .addGap(52, 52, 52)
                                .addComponent(RBTN_chaque))
                            .addComponent(CBOX_duretion, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CBOX_duretion))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RBTN_cash)
                    .addComponent(RBTN_chaque))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TF_chkNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter old Pass No : ");

        TF_oldPass.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        TF_oldPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_oldPassKeyPressed(evt);
            }
        });

        BTN_check.setBackground(new java.awt.Color(255, 255, 255));
        BTN_check.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        BTN_check.setForeground(new java.awt.Color(204, 0, 102));
        BTN_check.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amts/images/ic_send_white_18dp_2x.png"))); // NOI18N
        BTN_check.setContentAreaFilled(false);
        BTN_check.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_check.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_checkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_checkMouseExited(evt);
            }
        });
        BTN_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_checkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(TF_oldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTN_check))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TF_oldPass)
                        .addComponent(jLabel1))
                    .addComponent(BTN_check, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_checkActionPerformed
        System.out.println("bbb2");
        
        if( TF_oldPass.getText().isEmpty() )
        {
            new JToast().makeToast(null, " Enter proper Pass Number First", 1, JToast.type_of_info);
            TF_oldPass.setText(null);
            TF_oldPass.grabFocus();
            return;
        }//if
        
        try
        {
            data = db1.getData(cols, "pass", "pass_no", TF_oldPass.getText());
            System.out.println( data[0][0].length() );
            if ( data == null || data[0][0].length() < 1 )
            {
                new JToast().makeToast(null, " Enter proper Pass Number First", 1, JToast.type_of_info);
                TF_oldPass.setText(null);
                TF_oldPass.grabFocus();
                return;
            }//if
            
            jPanel2.setVisible(true);
        }//try
        catch( Exception e )
        {
             new JToast().makeToast(null, " Enter proper Pass Number First", 1, JToast.type_of_info);
                TF_oldPass.setText(null);
                TF_oldPass.grabFocus();
                return;
        }//catch
    }//GEN-LAST:event_BTN_checkActionPerformed

    private void BTN_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_closeActionPerformed
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        TF_oldPass.setText(null);
        TF_oldPass.grabFocus();
    }//GEN-LAST:event_BTN_closeActionPerformed

    private void BTN_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_submitActionPerformed
        
        try
        {
            old = TF_oldPass.getText();
            int costPMonth = Integer.valueOf(db1.getValue("cost_per_month", "pass_mast", "pass_id", data[0][6]));
            float price = 0;
            int duretion = 0;
            switch( (String) CBOX_duretion.getSelectedItem() )
            {
                case "1 Month":     
                    duretion = 1;
                    break;
                case "2 Months":     
                    duretion = 2;
                    break;
                case "3 Months":     
                    duretion = 3;
                    break;
                case "4 Months":     
                    duretion = 4;
                    break;
                case "5 Months":     
                    duretion = 5;
                    break;
                case "6 Months":
                    duretion = 6;
                    break;
                default:
                    new JToast().makeToast(null, " First Select Duretion ", 1, JToast.type_of_info);
                    CBOX_duretion.grabFocus();
                    return;                
            }//switch
            
            price = duretion * costPMonth + 50;
            DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
            Date date = new Date();      
        
            Calendar c1 = Calendar.getInstance() ;
            c1.setTime(date);
            c1.add(Calendar.MONTH, duretion);
        
            int days = Integer.valueOf( c1.getTime().toString().substring(8, 10) );        
            c1.add( Calendar.DATE , -days);
            Date endDate = c1.getTime();
            
            DateFormat df1 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
            int passNo = (int) db1.getCal("max(pass_no)", "pass");
            passNo++;
       
            String payBy;
            String chkNo;
            if( RBTN_cash.isSelected() )
            {
                 payBy = "cash";
                 chkNo = "";
            }           
            else
            {
                payBy = "chaque";
                if( TF_chkNo.getText().length() < 7)
                {
                    new JToast().makeToast(null, " First Enter Chaque Number ", 2, JToast.type_of_info);
                    TF_chkNo.grabFocus();
                    return;
                }//if
                chkNo = TF_chkNo.getText();
            }//else           
           
            try {
                db1.setAutoComit(false);
            } catch (SQLException ex) {
                Logger.getLogger(general_pass.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if( db1.insertPass(passNo, data[0][0], data[0][1], data[0][2], data[0][3], Integer.valueOf(data[0][4]), data[0][5],
                    Integer.valueOf(data[0][6]), Integer.valueOf(data[0][7]), data[0][8], df.format(date).toString(),
                    df1.format(endDate).toString(), price, Integer.valueOf(old)) )
            {
           
                 if( db1.insertDeposit(passNo, logid, price, df1.format(date).toString(), payBy , chkNo) )
                {
                    new JToast().makeToast(null, " SuccessFully created ", 1, JToast.type_of_succes);
                    jPanel2.setVisible(false);
                    jPanel3.setVisible(false);
                    TF_oldPass.setText(null);
                    TF_oldPass.grabFocus();
                    
                    try {
                        db1.doComit();
                        db1.setAutoComit(true);
                    } catch (SQLException ex) {
                        Logger.getLogger(general_pass.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    PassPDF pf = new PassPDF(String.valueOf(passNo));
                        pf = new PassPDF(String.valueOf(passNo));
                    
                    return;
                }//if            
            }//if
            else
            {
                new JToast().makeToast(null, " Error \n Enter Proper Details ", 1, JToast.type_of_error);
                
                try {
                    db1.doRollback();
                    db1.setAutoComit(true);
                } catch (SQLException ex) {
                    Logger.getLogger(general_pass.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                jPanel2.setVisible(false);
                    jPanel3.setVisible(false);
                    TF_oldPass.setText(null);
                    TF_oldPass.grabFocus();
            }//else
            
        }//try
        catch( Exception e )
        {
            jPanel2.setVisible(false);
            jPanel3.setVisible(false);
            TF_oldPass.setText(null);
            TF_oldPass.grabFocus();
        }//catch
        
    }//GEN-LAST:event_BTN_submitActionPerformed

    private void RBTN_chaqueItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RBTN_chaqueItemStateChanged
        if( RBTN_chaque.isSelected() )
            jPanel3.setVisible(true);
        else
            jPanel3.setVisible(false);
    }//GEN-LAST:event_RBTN_chaqueItemStateChanged

    private void TF_oldPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_oldPassKeyPressed
        if( evt.getKeyCode() == 13 || evt.getKeyChar() == '\n' )
            this.BTN_checkActionPerformed(null);  
    }//GEN-LAST:event_TF_oldPassKeyPressed

    private void CBOX_duretionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CBOX_duretionKeyPressed
        if( evt.getKeyCode() == 13 || evt.getKeyChar() == '\n' )
            this.BTN_submitActionPerformed(null);  
    }//GEN-LAST:event_CBOX_duretionKeyPressed

    private void TF_chkNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_chkNoKeyPressed
        if( evt.getKeyCode() == 13 || evt.getKeyChar() == '\n' )
            this.BTN_submitActionPerformed(null);  
    }//GEN-LAST:event_TF_chkNoKeyPressed

    private void CBOX_duretionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOX_duretionActionPerformed

    }//GEN-LAST:event_CBOX_duretionActionPerformed

    private void BTN_submitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_submitMouseEntered
        BTN_submit.setBackground(white);
        BTN_submit.setForeground(blue);
    }//GEN-LAST:event_BTN_submitMouseEntered

    private void BTN_submitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_submitMouseExited
       BTN_submit.setBackground(blue);
        BTN_submit.setForeground(white);
    }//GEN-LAST:event_BTN_submitMouseExited

    private void BTN_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_closeMouseEntered
          BTN_close.setBackground(white);
          BTN_close.setForeground(blue);
    }//GEN-LAST:event_BTN_closeMouseEntered

    private void BTN_checkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_checkMouseEntered
        BTN_submit.setBackground(pnk);
        BTN_submit.setForeground(white);
    }//GEN-LAST:event_BTN_checkMouseEntered

    private void BTN_checkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_checkMouseExited
        BTN_submit.setBackground(white);
        BTN_submit.setForeground(pnk);
    }//GEN-LAST:event_BTN_checkMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_check;
    private javax.swing.JButton BTN_close;
    private javax.swing.JButton BTN_submit;
    private javax.swing.JComboBox CBOX_duretion;
    private javax.swing.JRadioButton RBTN_cash;
    private javax.swing.JRadioButton RBTN_chaque;
    private javax.swing.JTextField TF_chkNo;
    private javax.swing.JTextField TF_oldPass;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
