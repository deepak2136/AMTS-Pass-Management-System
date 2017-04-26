package amts;

import diu.swe.habib.JavaToast.JToast;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.OK_OPTION;

public class LoginForm extends javax.swing.JInternalFrame {

   
    private Database1 db1 = null;
    private String logid = Home1.loginID;
    private ChangePassword cp = null; 
    private login l1 = null;   
    private final String[] cols = { "login_id","proof_id","id_no","type","status","join_date","designation","contact_no","email",
        "security_q1","security_q2","ans_1","ans_2"};      
    private String[][] data;
    private final Color white = new Color(255,255,255);
    private final Color blu = new Color(255,64,129);
     
    public LoginForm() {
        initComponents();
        db1 = new Database1();
     
        loadProfile();
        disableprofile();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PNL_title = new javax.swing.JPanel();
        LBL_name = new javax.swing.JLabel();
        LBL_logid = new javax.swing.JLabel();
        LBL_dob = new javax.swing.JLabel();
        TF_name = new javax.swing.JTextField();
        TF_logid = new javax.swing.JTextField();
        TF_dob = new javax.swing.JTextField();
        LBL_desg = new javax.swing.JLabel();
        TF_desg = new javax.swing.JTextField();
        LBL_jd = new javax.swing.JLabel();
        TF_jd = new javax.swing.JTextField();
        LBL_contact = new javax.swing.JLabel();
        TF_contact = new javax.swing.JTextField();
        LBL_email = new javax.swing.JLabel();
        TF_email = new javax.swing.JTextField();
        BTN_ok = new javax.swing.JButton();
        BTN_cancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        BTN_change = new javax.swing.JToggleButton();
        BTN_edit = new javax.swing.JButton();
        LBL_pic = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setForeground(new java.awt.Color(204, 204, 204));
        setIconifiable(true);
        setResizable(true);
        setTitle("Profile");
        setToolTipText("");
        setDoubleBuffered(true);
        setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        PNL_title.setBackground(new java.awt.Color(68, 129, 255));
        PNL_title.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        LBL_name.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        LBL_name.setForeground(new java.awt.Color(255, 255, 255));
        LBL_name.setText("Name :");

        LBL_logid.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        LBL_logid.setForeground(new java.awt.Color(255, 255, 255));
        LBL_logid.setText("Login ID :");

        LBL_dob.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        LBL_dob.setForeground(new java.awt.Color(255, 255, 255));
        LBL_dob.setText("Date of Birth :");

        TF_name.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        TF_name.setToolTipText("");
        TF_name.setEnabled(false);

        TF_logid.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        TF_logid.setToolTipText("");
        TF_logid.setEnabled(false);

        TF_dob.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        TF_dob.setToolTipText("");
        TF_dob.setEnabled(false);

        LBL_desg.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        LBL_desg.setForeground(new java.awt.Color(255, 255, 255));
        LBL_desg.setText("Designation :");

        TF_desg.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        TF_desg.setEnabled(false);

        LBL_jd.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        LBL_jd.setForeground(new java.awt.Color(255, 255, 255));
        LBL_jd.setText("Joining date :");

        TF_jd.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        TF_jd.setEnabled(false);

        LBL_contact.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        LBL_contact.setForeground(new java.awt.Color(255, 255, 255));
        LBL_contact.setText("Conatct no. :");

        TF_contact.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        TF_contact.setToolTipText("If tyou change your contact number");
        TF_contact.setEnabled(false);

        LBL_email.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        LBL_email.setForeground(new java.awt.Color(255, 255, 255));
        LBL_email.setText("Email-ID :");

        TF_email.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        TF_email.setToolTipText("If you change you Email ID");
        TF_email.setEnabled(false);

        BTN_ok.setBackground(new java.awt.Color(255, 64, 129));
        BTN_ok.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        BTN_ok.setForeground(new java.awt.Color(255, 255, 255));
        BTN_ok.setText("Ok");
        BTN_ok.setToolTipText("If your information is true then click this.. ");
        BTN_ok.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_okMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_okMouseExited(evt);
            }
        });
        BTN_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_okActionPerformed(evt);
            }
        });

        BTN_cancel.setBackground(new java.awt.Color(255, 64, 129));
        BTN_cancel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        BTN_cancel.setForeground(new java.awt.Color(255, 255, 255));
        BTN_cancel.setText("Cancel");
        BTN_cancel.setToolTipText("If you can nt change in your information");
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

        jPanel1.setBackground(new java.awt.Color(255, 64, 129));

        BTN_change.setBackground(new java.awt.Color(255, 255, 255));
        BTN_change.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        BTN_change.setForeground(new java.awt.Color(0, 102, 153));
        BTN_change.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amts/images/ic_lock_open_white_36dp_2x.png"))); // NOI18N
        BTN_change.setToolTipText("Change Passeord");
        BTN_change.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        BTN_change.setBorderPainted(false);
        BTN_change.setContentAreaFilled(false);
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

        BTN_edit.setBackground(new java.awt.Color(255, 255, 255));
        BTN_edit.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        BTN_edit.setForeground(new java.awt.Color(0, 102, 153));
        BTN_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amts/images/ic_mode_edit_white_36dp_2x.png"))); // NOI18N
        BTN_edit.setToolTipText("Edit Profile");
        BTN_edit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        BTN_edit.setBorderPainted(false);
        BTN_edit.setContentAreaFilled(false);
        BTN_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_editMouseExited(evt);
            }
        });
        BTN_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_editActionPerformed(evt);
            }
        });

        LBL_pic.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 255, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_change, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBL_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(LBL_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTN_edit)
                .addGap(18, 18, 18)
                .addComponent(BTN_change, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout PNL_titleLayout = new javax.swing.GroupLayout(PNL_title);
        PNL_title.setLayout(PNL_titleLayout);
        PNL_titleLayout.setHorizontalGroup(
            PNL_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNL_titleLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(PNL_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNL_titleLayout.createSequentialGroup()
                        .addGroup(PNL_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBL_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PNL_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(LBL_email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LBL_logid, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LBL_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LBL_jd, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LBL_desg, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNL_titleLayout.createSequentialGroup()
                        .addComponent(LBL_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(PNL_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PNL_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(TF_logid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                        .addComponent(TF_name, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(TF_desg, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_jd, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_email, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PNL_titleLayout.createSequentialGroup()
                        .addComponent(BTN_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTN_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        PNL_titleLayout.setVerticalGroup(
            PNL_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNL_titleLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(PNL_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PNL_titleLayout.createSequentialGroup()
                        .addGroup(PNL_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PNL_titleLayout.createSequentialGroup()
                                .addComponent(LBL_name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48))
                            .addComponent(LBL_logid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addComponent(LBL_desg, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LBL_jd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(LBL_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(LBL_email, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PNL_titleLayout.createSequentialGroup()
                        .addGroup(PNL_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PNL_titleLayout.createSequentialGroup()
                                .addComponent(TF_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNL_titleLayout.createSequentialGroup()
                                .addComponent(TF_logid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)))
                        .addGroup(PNL_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TF_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LBL_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(TF_desg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TF_jd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(TF_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TF_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(PNL_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_ok)
                    .addComponent(BTN_cancel))
                .addContainerGap(21, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNL_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNL_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_editMouseEntered

    }//GEN-LAST:event_BTN_editMouseEntered

    private void BTN_editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_editMouseExited
       
    }//GEN-LAST:event_BTN_editMouseExited

    private void BTN_okMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_okMouseEntered
       BTN_ok.setBackground(white);
        BTN_ok.setForeground(blu);
    }//GEN-LAST:event_BTN_okMouseEntered

    private void BTN_okMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_okMouseExited
        BTN_ok.setBackground(blu);
        BTN_ok.setForeground(white);
    }//GEN-LAST:event_BTN_okMouseExited

    private void BTN_cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_cancelMouseEntered
        BTN_cancel.setBackground(white);
        BTN_cancel.setForeground(blu);
    }//GEN-LAST:event_BTN_cancelMouseEntered

    private void BTN_cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_cancelMouseExited
       BTN_cancel.setBackground(blu);
        BTN_cancel.setForeground(white);
    }//GEN-LAST:event_BTN_cancelMouseExited

    private void BTN_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_editActionPerformed
        BTN_edit.setEnabled(false);
        BTN_ok.setEnabled(true);
        BTN_cancel.setEnabled(true);
        
        TF_contact.setEnabled(true);
        TF_email.setEnabled(true);
    }//GEN-LAST:event_BTN_editActionPerformed

    private void BTN_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_okActionPerformed
        
        if( TF_contact.getText().length() < 7 || TF_contact.getText().length() >10 )
        {
            JOptionPane.showMessageDialog(null,"Enter Proper Contact Number","Conatc number",OK_OPTION);
            TF_contact.setText(null);
            TF_contact.grabFocus();
            return;
        }
        
        if( TF_email.getText().length() < 5  )
        {
            JOptionPane.showMessageDialog(null,"Enter Proper Email Id","Email ID",OK_OPTION);
            TF_email.setText(null);
            TF_email.grabFocus();
            return;
        }
        
        if( db1.updateData("login", "contact_no", TF_contact.getText(), "login_id", logid) )
        {
            if( db1.updateData("login", "email", TF_email.getText(), "login_id", logid)  )
            {
                new JToast().makeToast(null, " Successfully Updated", 1, JToast.type_of_succes);
            }
        }
        else
            new JToast().makeToast(null, "Not Successfully Updated", 1, JToast.type_of_succes);
        
        BTN_ok.setEnabled(false);
        BTN_cancel.setEnabled(false);
        TF_contact.setEnabled(false);
        TF_email.setEnabled(false);
        BTN_edit.setEnabled(true);
        
        loadProfile();
    }//GEN-LAST:event_BTN_okActionPerformed

    private void BTN_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_cancelActionPerformed
       
        BTN_ok.setEnabled(false);
        BTN_cancel.setEnabled(false);
        TF_contact.setEnabled(false);
        TF_email.setEnabled(false);
        BTN_edit.setEnabled(true);
        
        loadProfile();
        this.dispose();
    }//GEN-LAST:event_BTN_cancelActionPerformed

    private void BTN_changeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_changeMouseEntered
        
    }//GEN-LAST:event_BTN_changeMouseEntered

    private void BTN_changeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_changeMouseExited
         
    }//GEN-LAST:event_BTN_changeMouseExited

    private void BTN_changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_changeActionPerformed
        cp = new ChangePassword();
        cp.setVisible(true);
        
        Dimension fSize = Toolkit.getDefaultToolkit().getScreenSize();
        cp.setLocation((int)(fSize.getWidth()-cp.getWidth())/2, (int)(fSize.getHeight()-cp.getHeight())/2);
        cp.pack();
        cp.setResizable(false);
    }//GEN-LAST:event_BTN_changeActionPerformed

    private void disableprofile()
    {
        TF_contact.setEnabled(false);
        TF_email.setEnabled(false);
        BTN_ok.setEnabled(false);
        BTN_cancel.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_cancel;
    private javax.swing.JToggleButton BTN_change;
    private javax.swing.JButton BTN_edit;
    private javax.swing.JButton BTN_ok;
    private javax.swing.JLabel LBL_contact;
    private javax.swing.JLabel LBL_desg;
    private javax.swing.JLabel LBL_dob;
    private javax.swing.JLabel LBL_email;
    private javax.swing.JLabel LBL_jd;
    private javax.swing.JLabel LBL_logid;
    private javax.swing.JLabel LBL_name;
    private javax.swing.JLabel LBL_pic;
    private javax.swing.JPanel PNL_title;
    private javax.swing.JTextField TF_contact;
    private javax.swing.JTextField TF_desg;
    private javax.swing.JTextField TF_dob;
    private javax.swing.JTextField TF_email;
    private javax.swing.JTextField TF_jd;
    private javax.swing.JTextField TF_logid;
    private javax.swing.JTextField TF_name;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void initgui() {
        disableprofile();       
    }

    private void loadProfile() 
    {
        PNL_title.setVisible(true);
        try
        {
            data = db1.getData(cols, "login", "login_id", logid);
        
        String table;
        String colon;
        
        if( data[0][1].equalsIgnoreCase("10001") )
        {
            table = "adhar_card";
            colon = "adhar_id";
        }
        else
        {
            table = "voter_card";
            colon = "voter_id";
        }
        
        String[] cols1 = { "f_name","m_name","l_name","dob","pic"  };
        String[][] data1 = db1.getData(cols1, table, colon, data[0][2]);
        
        TF_logid.setText(logid);
        TF_name.setText( data1[0][1] + " " + data1[0][2].charAt(0) + " " + data1[0][0] );
        LBL_pic.setIcon(new ImageIcon( getClass().getResource( data1[0][4] ) ));
        TF_dob.setText(data1[0][3]);
        TF_contact.setText(data[0][7]);
        TF_email.setText(data[0][8]);
        TF_desg.setText(data[0][6]);
        TF_jd.setText( data[0][5] );
        System.out.println(logid + "init");
        System.out.println(data[0][0] + "  " + data[0][7] + "  " + data1[0][0] + "  " + data1[0][4]);
        }
        catch( Exception e )
        {
            System.out.println( e );
            return;
        }
    }

    private void unLoadProfile() {
        
        TF_logid.setText(null);
        TF_name.setText(null);
        LBL_pic.setIcon(null);
        TF_dob.setText(null);
        TF_contact.setText(null);
        TF_email.setText(null);
        TF_desg.setText(null);
        TF_jd.setText(null);
    }
 
    protected void finalize() throws Throwable
    {
        try {
            logid = null;
            cp.dispose();
        } finally {
            super.finalize();
        }
    }
}