package amts;

import diu.swe.habib.JavaToast.JToast;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class complain extends javax.swing.JInternalFrame {

    private final Color white = new Color(255,255,255);
     private final Color blue = new Color(0,102,153);
     
    private Database1 db1;
     
    public complain() {
        initComponents();
        db1 = new Database1();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TF_name = new javax.swing.JTextField();
        TF_email = new javax.swing.JTextField();
        TF_contact = new javax.swing.JTextField();
        BTN_submit = new javax.swing.JButton();
        BTN_cancel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA_complain = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setTitle("Complain");

        jPanel1.setBackground(new java.awt.Color(68, 129, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Full name :");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Complain :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("E-mail id:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contact no :");

        BTN_submit.setBackground(new java.awt.Color(255, 255, 255));
        BTN_submit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BTN_submit.setForeground(new java.awt.Color(0, 102, 153));
        BTN_submit.setText("Submit");
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

        BTN_cancel.setBackground(new java.awt.Color(255, 255, 255));
        BTN_cancel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BTN_cancel.setForeground(new java.awt.Color(0, 102, 153));
        BTN_cancel.setText("Close");
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

        jPanel2.setBackground(new java.awt.Color(255, 64, 129));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Complain");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel5)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TA_complain.setColumns(20);
        TA_complain.setRows(5);
        jScrollPane1.setViewportView(TA_complain);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TF_contact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(TF_name, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(BTN_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(BTN_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TF_email, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TF_name, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_email, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(TF_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_cancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_BTN_cancelActionPerformed

    private void BTN_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_submitActionPerformed
       
        if( TF_name.getText().isEmpty() )
        {
            new JToast().makeToast(null, "First Enter Proper Name", 1, JToast.type_of_info);
            TF_name.setText(null);
            TF_name.grabFocus();
            return;
        }
        
        if( TF_contact.getText().isEmpty() )
        {
            new JToast().makeToast(null, "First Enter Proper Contact Number", 1, JToast.type_of_info);
            TF_contact.setText(null);
            TF_contact.grabFocus();
            return;
        }
        
        if( TF_email.getText().isEmpty() )
        {
            new JToast().makeToast(null, "First Enter Proper Email ID", 1, JToast.type_of_info);
            TF_email.setText(null);
            TF_email.grabFocus();
            return;
        }
        
        if( TA_complain.getText().isEmpty() )
        {
            new JToast().makeToast(null, "First Enter Proper Complaain", 1, JToast.type_of_info);
            TA_complain.setText(null);
            TA_complain.grabFocus();
            return;
        }
        
        Date date = new Date();
        DateFormat df1 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        
        int cpNo = (int) db1.getCal("max(complain_no)", "complain");
        cpNo++;
        
        String[] data = new String[7];
        data[0] = String.valueOf(cpNo);
        data[1] = TF_name.getText();
        data[2] = df1.format(date).toString();
        data[3] = TA_complain.getText();
        data[4] = "";
        data[5] = TF_contact.getText();
        data[6] = TF_email.getText();
        
        if( db1.insertData("complain",data) )
        {
            new JToast().makeToast(null, "Successfully post", 1, JToast.type_of_notification);
            clearData();
        }
        else
        {
            new JToast().makeToast(null, "Can't Successfully post", 1, JToast.type_of_notification);
            clearData();
        }
    }//GEN-LAST:event_BTN_submitActionPerformed

    private void BTN_submitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_submitMouseEntered
        BTN_submit.setBackground(blue);
        BTN_submit.setForeground(white);
    }//GEN-LAST:event_BTN_submitMouseEntered

    private void BTN_submitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_submitMouseExited
         BTN_submit.setBackground(white);
         BTN_submit.setForeground(blue);
    }//GEN-LAST:event_BTN_submitMouseExited

    private void BTN_cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_cancelMouseEntered
        BTN_cancel.setBackground(blue);
        BTN_cancel.setForeground(white);
    }//GEN-LAST:event_BTN_cancelMouseEntered

    private void BTN_cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_cancelMouseExited
         BTN_cancel.setBackground(white);
         BTN_cancel.setForeground(blue);
    }//GEN-LAST:event_BTN_cancelMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_cancel;
    private javax.swing.JButton BTN_submit;
    private javax.swing.JTextArea TA_complain;
    private javax.swing.JTextField TF_contact;
    private javax.swing.JTextField TF_email;
    private javax.swing.JTextField TF_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void clearData() {
        TF_name.setText(null);
        TA_complain.setText(null);
        TF_contact.setText(null);
        TF_email.setText(null);
    }
}
