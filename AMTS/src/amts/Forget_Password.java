package amts;

import diu.swe.habib.JavaToast.JToast;
import java.awt.Color;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.OK_OPTION;

public class Forget_Password extends javax.swing.JFrame {

    private String logid = null;
    private Database1 db1;
    private final Color white = new Color(255,255,255);
     private final Color blu = new Color(68,129,255);

    
    public Forget_Password() {
        initComponents();
        db1 = new Database1();
        jPanel3.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    
    private void loadQueAns() {
        
        LBL_que1.setText( db1.getValue("security_q1", "login", "login_id", logid) );
        LBL_que2.setText( db1.getValue("security_q2", "login", "login_id", logid) );
        TF_ans1.setText(null);
        TF_ans2.setText(null);
        TF_ans1.grabFocus(); 
        TF_logID.setEnabled(false);
        BTN_check.setEnabled(true);
    }
    
    private void disableContenet()
    {
        TF_ans1.setEnabled(false);
        TF_ans2.setEnabled(false);
        BTN_update.setEnabled(false);
        BTN_cancel.setEnabled(false);
        TF_ans1.setText(null);
        TF_ans2.setText(null);
        TF_logID.setEnabled(true);
        TF_logID.setText(null);
        BTN_check.setEnabled(false);
    }
    
    private void enableContenet()
    {
        TF_ans1.setEnabled(true);
        TF_ans2.setEnabled(true);
       // BTN_update.setEnabled(true);
        BTN_cancel.setEnabled(true);
        TF_logID.setEnabled(false);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TF_logID = new javax.swing.JTextField();
        LBL_logID = new javax.swing.JLabel();
        BTN_click = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TF_ans1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TF_ans2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TF_newpassword = new javax.swing.JTextField();
        BTN_update = new javax.swing.JButton();
        BTN_cancel = new javax.swing.JButton();
        LBL_que1 = new javax.swing.JLabel();
        LBL_que2 = new javax.swing.JLabel();
        BTN_check = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Forget Password");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(68, 129, 255));

        LBL_logID.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LBL_logID.setForeground(new java.awt.Color(255, 255, 255));
        LBL_logID.setText("Enter Login id :");

        BTN_click.setBackground(new java.awt.Color(255, 255, 255));
        BTN_click.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BTN_click.setForeground(new java.awt.Color(204, 0, 102));
        BTN_click.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amts/images/ic_send_white_18dp_2x.png"))); // NOI18N
        BTN_click.setToolTipText("check login id");
        BTN_click.setContentAreaFilled(false);
        BTN_click.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_click.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_clickMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_clickMouseExited(evt);
            }
        });
        BTN_click.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_clickActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(LBL_logID)
                .addGap(32, 32, 32)
                .addComponent(TF_logID, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTN_click)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TF_logID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LBL_logID)
                        .addComponent(BTN_click, javax.swing.GroupLayout.PREFERRED_SIZE, 35, Short.MAX_VALUE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 64, 129));
        jLabel2.setText("Security Qustion 1 :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 64, 129));
        jLabel3.setText("Security Qustion 2 :");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 51));
        jLabel4.setText("Answer :");

        TF_ans1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        TF_ans1.setToolTipText("Enter 1st Qustion's answer");
        TF_ans1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 129, 255)));
        TF_ans1.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 51));
        jLabel5.setText("Answer :");

        TF_ans2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        TF_ans2.setToolTipText("Enter 2st Qustion's answer");
        TF_ans2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 129, 255)));
        TF_ans2.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 64, 129));
        jLabel6.setText("Enter New password :");

        TF_newpassword.setBackground(new java.awt.Color(240, 240, 240));
        TF_newpassword.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        TF_newpassword.setToolTipText("Enter new password");
        TF_newpassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 129, 255)));
        TF_newpassword.setEnabled(false);
        TF_newpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_newpasswordActionPerformed(evt);
            }
        });

        BTN_update.setBackground(new java.awt.Color(68, 129, 255));
        BTN_update.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BTN_update.setForeground(new java.awt.Color(255, 255, 255));
        BTN_update.setText("Submit");
        BTN_update.setToolTipText("submit");
        BTN_update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTN_update.setBorderPainted(false);
        BTN_update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_update.setEnabled(false);
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

        BTN_cancel.setBackground(new java.awt.Color(68, 129, 255));
        BTN_cancel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BTN_cancel.setForeground(new java.awt.Color(255, 255, 255));
        BTN_cancel.setText("Cancel");
        BTN_cancel.setToolTipText("cancel");
        BTN_cancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTN_cancel.setBorderPainted(false);
        BTN_cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_cancel.setEnabled(false);
        BTN_cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_cancelMouseExited(evt);
            }
        });
        BTN_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_cancelActionPerformed(evt);
            }
        });

        LBL_que1.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N

        LBL_que2.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        LBL_que2.setText("222");

        BTN_check.setBackground(new java.awt.Color(255, 255, 255));
        BTN_check.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BTN_check.setForeground(new java.awt.Color(0, 102, 153));
        BTN_check.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amts/images/ic_send_black_18dp_2x.png"))); // NOI18N
        BTN_check.setToolTipText("Click to check your id is correcr or not !!");
        BTN_check.setContentAreaFilled(false);
        BTN_check.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_check.setEnabled(false);
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Check");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBL_que2, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                            .addComponent(TF_ans2)
                            .addComponent(TF_ans1)
                            .addComponent(LBL_que1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(49, 49, 49)
                        .addComponent(TF_newpassword))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_check, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BTN_update, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(BTN_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(LBL_que1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TF_ans1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(LBL_que2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TF_ans2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(BTN_check, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_newpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_update, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_clickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_clickActionPerformed
   
        try
        {
            if( db1.getValue("status", "login", "login_id", TF_logID.getText()).equalsIgnoreCase("ac") )
            {
                jPanel3.setVisible(true);
                enableContenet();
                logid = TF_logID.getText();
                loadQueAns();
            }
            else
            {
                //JOptionPane.showMessageDialog(null,"Enter Valid Login ID","Warnning",OK_OPTION);
                new JToast().makeToast(this, " enter valid login id ", 2, JToast.type_of_error);
                TF_logID.setText(null);
                return;
            }
        }
        catch( Exception e )
        {
            new JToast().makeToast(this, " enter valid login id ", 2, JToast.type_of_error);
            TF_logID.setText(null);
            return;
        }        
    }//GEN-LAST:event_BTN_clickActionPerformed

    private void BTN_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_cancelActionPerformed
        disableContenet();
        jPanel3.setVisible(false);
    }//GEN-LAST:event_BTN_cancelActionPerformed

    private void BTN_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_updateActionPerformed
        if( TF_newpassword.getText().length() < 4 )
        {
            JOptionPane.showMessageDialog(null,"Enter Minimum 4 digit password","password",OK_OPTION);
            TF_newpassword.setText(null);
            TF_newpassword.grabFocus();
            return;
        }
        else
        {
            if( db1.updateData("login", "password", TF_newpassword.getText(), "login_id", logid) )
            {
                JOptionPane.showMessageDialog(null,"Password Update Successfully","Password",OK_OPTION);
                disableContenet();
                jPanel3.setVisible(false);
                this.setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Password Not Updated","Password",OK_OPTION);
                disableContenet();;
            }
        }
    }                                          

    private void TF_ans2FocusLost(java.awt.event.FocusEvent evt) {                                  
    }//GEN-LAST:event_BTN_updateActionPerformed

    private void TF_newpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_newpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_newpasswordActionPerformed

    private void BTN_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_checkActionPerformed
        
        System.out.println(logid);
        System.out.println(db1.getValue("ans_1", "login", "login_id", logid));
        System.out.println(db1.getValue("ans_2", "login", "login_id", logid));
        if( TF_ans1.getText().equalsIgnoreCase( db1.getValue("ans_1", "login", "login_id", logid) ) && TF_ans2.getText().equalsIgnoreCase( db1.getValue("ans_2", "login", "login_id", logid) )  )
        {
            TF_newpassword.setText(null);
            TF_newpassword.setEnabled(true);
            TF_newpassword.setVisible(true);
            TF_newpassword.grabFocus();
            BTN_check.setEnabled(false);
            BTN_update.setEnabled(true);
            TF_ans1.setEnabled(false);
            TF_ans2.setEnabled(false);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Answers Not Matched !","forget password",OK_OPTION);
            TF_ans1.setText(null);
            TF_ans2.setText(null);
            TF_ans1.grabFocus();
        }
    }//GEN-LAST:event_BTN_checkActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
         disableContenet();
        jPanel3.setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    private void BTN_checkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_checkMouseEntered
       BTN_check.setBackground(white);
       BTN_check.setForeground(blu);
    }//GEN-LAST:event_BTN_checkMouseEntered

    private void BTN_checkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_checkMouseExited
       BTN_check.setBackground(blu);
        BTN_check.setForeground(white);
    }//GEN-LAST:event_BTN_checkMouseExited

    private void BTN_updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_updateMouseEntered
       BTN_update.setBackground(white);
        BTN_update.setForeground(blu);
    }//GEN-LAST:event_BTN_updateMouseEntered

    private void BTN_updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_updateMouseExited
         BTN_update.setBackground(blu);
        BTN_update.setForeground(white);
    }//GEN-LAST:event_BTN_updateMouseExited

    private void BTN_clickMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_clickMouseEntered
     
    }//GEN-LAST:event_BTN_clickMouseEntered

    private void BTN_clickMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_clickMouseExited
         
    }//GEN-LAST:event_BTN_clickMouseExited

    private void BTN_cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_cancelMouseEntered
        BTN_cancel.setBackground(white);
        BTN_cancel.setForeground(blu);
    }//GEN-LAST:event_BTN_cancelMouseEntered

    private void BTN_cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_cancelMouseExited
        BTN_cancel.setBackground(blu);
        BTN_cancel.setForeground(white);
    }//GEN-LAST:event_BTN_cancelMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_cancel;
    private javax.swing.JButton BTN_check;
    private javax.swing.JButton BTN_click;
    private javax.swing.JButton BTN_update;
    private javax.swing.JLabel LBL_logID;
    private javax.swing.JLabel LBL_que1;
    private javax.swing.JLabel LBL_que2;
    private javax.swing.JTextField TF_ans1;
    private javax.swing.JTextField TF_ans2;
    private javax.swing.JTextField TF_logID;
    private javax.swing.JTextField TF_newpassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
