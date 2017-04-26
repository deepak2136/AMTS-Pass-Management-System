package amts;

import diu.swe.habib.JavaToast.JToast;
import java.awt.Color;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.OK_OPTION;

public class ChangePassword extends javax.swing.JFrame {

    private DataBase_Login db = null;
    private String logID = login.logid;
    private Database1 db1;
    private final Color white = new Color(255,255,255);
    private final Color blu= new Color(68,129,255);
     
    public ChangePassword() {
        super("Chnage Password");
        initComponents();
        db = new DataBase_Login();
        db1 = new Database1();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BTN_change = new javax.swing.JButton();
        BTN_cancel = new javax.swing.JButton();
        TF_oldpw = new javax.swing.JTextField();
        TF_newpw = new javax.swing.JTextField();
        TF_renewpw = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Change password");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 0));
        jLabel2.setText("Enter old password :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 64, 129));
        jLabel3.setText("Enter new password :");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 64, 129));
        jLabel4.setText("Re-Enter new password :");

        BTN_change.setBackground(new java.awt.Color(68, 129, 255));
        BTN_change.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        BTN_change.setForeground(new java.awt.Color(255, 255, 255));
        BTN_change.setText("Change");
        BTN_change.setToolTipText("Change password to click here");
        BTN_change.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        BTN_change.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_change.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_changeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_changeMouseExited(evt);
            }
        });
        BTN_change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_changeActionPerformed(evt);
            }
        });

        BTN_cancel.setBackground(new java.awt.Color(68, 129, 255));
        BTN_cancel.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        BTN_cancel.setForeground(new java.awt.Color(255, 255, 255));
        BTN_cancel.setText("Cancel");
        BTN_cancel.setToolTipText("cancel");
        BTN_cancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        BTN_cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        TF_oldpw.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        TF_oldpw.setToolTipText("Enter old password");
        TF_oldpw.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 129, 255)));

        TF_newpw.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        TF_newpw.setToolTipText("Enter new password");
        TF_newpw.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 129, 255)));

        TF_renewpw.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        TF_renewpw.setToolTipText("Re-enter password");
        TF_renewpw.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 129, 255)));
        TF_renewpw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_renewpwActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(68, 129, 255));
        jPanel1.setForeground(new java.awt.Color(68, 129, 255));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Change Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTN_change, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(BTN_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TF_newpw, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_oldpw, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_renewpw, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 27, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(TF_oldpw)
                        .addGap(20, 20, 20)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_newpw, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_renewpw, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_change, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_changeActionPerformed
      
        if( TF_oldpw.getText().length() < 1 )
        {
            JOptionPane.showMessageDialog(null,"Enter Old Password First","old Password",OK_OPTION);
            TF_oldpw.setText(null);
            TF_oldpw.grabFocus();
            return;
        }

        if( TF_newpw.getText().length() < 1 )
        {
            JOptionPane.showMessageDialog(null,"Enter New Password First","old Password",OK_OPTION);
            TF_newpw.setText(null);
            TF_newpw.grabFocus();
            return;
        }

        if( TF_renewpw.getText().length() < 1 )
        {
            JOptionPane.showMessageDialog(null,"Re-Enter New Password First","old Password",OK_OPTION);
            TF_renewpw.setText(null);
            TF_renewpw.grabFocus();
            return;
        }

        if( ! TF_newpw.getText().equals(TF_renewpw.getText()) )
        {
            JOptionPane.showMessageDialog(null,"New Password Not Match","old Password",OK_OPTION);
            TF_renewpw.setText(null);
            TF_newpw.setText(null);
            TF_newpw.grabFocus();
            return;
        }

        logID = login.logid;
        String pw = TF_newpw.getText();
        
        if( TF_oldpw.getText().equals( db1.getValue("password", "login", "login_id", logID) ) )
        {
            
            if( db1.updateData("login", "password", pw, "login_id", logID)  )
            {
                JOptionPane.showMessageDialog(null,"Password Succesfully Updated !","Password update",OK_OPTION);

                TF_oldpw.setText(null);
                TF_newpw.setText(null);
                TF_renewpw.setText(null);
                
                new JToast().makeToast(this, "  Password Updated Successfully !! ", 1, JToast.type_of_succes);
                this.setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Password not Succesfully Updated !","Password update",OK_OPTION);
                TF_oldpw.setText(null);
                TF_newpw.setText(null);
                TF_renewpw.setText(null);
                TF_oldpw.grabFocus();
                return;
            }//if else
        }//if
        else
        {
            JOptionPane.showMessageDialog(null,"Old password Not Match!","Password update",OK_OPTION);
            TF_oldpw.setText(null);
            TF_oldpw.grabFocus();
            return;
        }

    }//GEN-LAST:event_BTN_changeActionPerformed

    private void BTN_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_cancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_BTN_cancelActionPerformed

    private void TF_renewpwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_renewpwActionPerformed

    }//GEN-LAST:event_TF_renewpwActionPerformed

    private void BTN_changeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_changeMouseEntered
        BTN_change.setBackground(white);
        BTN_change.setForeground(blu);
    }//GEN-LAST:event_BTN_changeMouseEntered

    private void BTN_changeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_changeMouseExited
       BTN_change.setBackground(blu);
       BTN_change.setForeground(white);
    }//GEN-LAST:event_BTN_changeMouseExited

    private void BTN_cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_cancelMouseExited
       BTN_cancel.setBackground(blu);
       BTN_cancel.setForeground(white);
    }//GEN-LAST:event_BTN_cancelMouseExited

    private void BTN_cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_cancelMouseEntered
         BTN_cancel.setBackground(white);
         BTN_cancel.setForeground(blu);
    }//GEN-LAST:event_BTN_cancelMouseEntered
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_cancel;
    private javax.swing.JButton BTN_change;
    private javax.swing.JTextField TF_newpw;
    private javax.swing.JTextField TF_oldpw;
    private javax.swing.JTextField TF_renewpw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
