package amts;

import diu.swe.habib.JavaToast.JToast;
import java.awt.Color;
import java.util.Date;

public class NewLogin extends javax.swing.JFrame {
    
    private String table;
    private String IDno;
    private Database1 db1;
    private int proof;
    private final Color white = new Color(255,255,255,255);
    private final Color blu = new Color(255,64,129);
    private final Color pnk = new Color(204,0,102);
    
    public NewLogin() {
        initComponents();
        db1 = new Database1();
        RBTN_adhar.setSelected(true);
        clearData();
        jPanel1.setVisible(false);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IDGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TF_loginID = new javax.swing.JTextField();
        TF_password = new javax.swing.JTextField();
        TF_type = new javax.swing.JTextField();
        TF_status = new javax.swing.JTextField();
        TF_joinDate = new javax.swing.JTextField();
        TF_desg = new javax.swing.JTextField();
        TF_email = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        TF_ans1 = new javax.swing.JTextField();
        TF_ans2 = new javax.swing.JTextField();
        BTN_submit = new javax.swing.JToggleButton();
        BTN_cancel = new javax.swing.JToggleButton();
        jLabel14 = new javax.swing.JLabel();
        TF_contact = new javax.swing.JTextField();
        CBOX_sq1 = new javax.swing.JComboBox();
        CBOX_sq2 = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        RBTN_adhar = new javax.swing.JRadioButton();
        TF_id = new javax.swing.JTextField();
        RBTN_voter = new javax.swing.JRadioButton();
        BTN_check = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Login");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(68, 129, 255));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Login ID :");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password :");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Type :");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Status :");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Joining Date :");
        jLabel7.setToolTipText("Join Date");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Designation :");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Email :");
        jLabel9.setToolTipText("Contact no");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Security Que 1 :");

        TF_loginID.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        TF_loginID.setToolTipText("Enter Login ID");

        TF_password.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        TF_type.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        TF_status.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        TF_joinDate.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        TF_desg.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        TF_email.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ans 1 :");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Security Que 2 :");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Ans 2 :");

        TF_ans1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        TF_ans2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        BTN_submit.setBackground(new java.awt.Color(255, 64, 129));
        BTN_submit.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BTN_submit.setForeground(new java.awt.Color(255, 255, 255));
        BTN_submit.setText("Submit");
        BTN_submit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
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

        BTN_cancel.setBackground(new java.awt.Color(255, 64, 129));
        BTN_cancel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BTN_cancel.setForeground(new java.awt.Color(255, 255, 255));
        BTN_cancel.setText("Cancel");
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

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Contact No :");

        TF_contact.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        CBOX_sq1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CBOX_sq1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "what is your favorite food ?", "what is your favorite game ?", "what is your favorite color?", "what is your hobby ?", "what is your nick name ?", " " }));

        CBOX_sq2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CBOX_sq2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "what is your favorite food ?", "what is your favorite game ?", "what is your favorite color?", "what is your hobby ?", "what is your nick name ?", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BTN_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(BTN_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addComponent(CBOX_sq2, 0, 306, Short.MAX_VALUE)
                    .addComponent(TF_ans1)
                    .addComponent(CBOX_sq1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TF_contact)
                    .addComponent(TF_email)
                    .addComponent(TF_desg)
                    .addComponent(TF_joinDate)
                    .addComponent(TF_status)
                    .addComponent(TF_type)
                    .addComponent(TF_password)
                    .addComponent(TF_loginID)
                    .addComponent(TF_ans2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TF_loginID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TF_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TF_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(TF_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TF_joinDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(TF_desg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TF_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TF_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBOX_sq1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TF_ans1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CBOX_sq2)
                                .addGap(1, 1, 1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_ans2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 64, 129));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Choce ID :");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID NO :");

        RBTN_adhar.setBackground(new java.awt.Color(204, 0, 102));
        IDGroup.add(RBTN_adhar);
        RBTN_adhar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        RBTN_adhar.setForeground(new java.awt.Color(255, 255, 255));
        RBTN_adhar.setText("Adhar Card");
        RBTN_adhar.setToolTipText("If you have Adhar card then click on this");
        RBTN_adhar.setContentAreaFilled(false);

        TF_id.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        TF_id.setToolTipText("Enter Adhar-card or Voter-card Number");

        RBTN_voter.setBackground(new java.awt.Color(204, 0, 102));
        IDGroup.add(RBTN_voter);
        RBTN_voter.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        RBTN_voter.setForeground(new java.awt.Color(255, 255, 255));
        RBTN_voter.setText("Voter Card");
        RBTN_voter.setToolTipText("If you have voter card then click on this");
        RBTN_voter.setContentAreaFilled(false);

        BTN_check.setBackground(new java.awt.Color(255, 255, 255));
        BTN_check.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BTN_check.setForeground(new java.awt.Color(204, 0, 102));
        BTN_check.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amts/images/ic_send_white_18dp_2x.png"))); // NOI18N
        BTN_check.setToolTipText("Check");
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(RBTN_adhar)
                        .addGap(32, 32, 32)
                        .addComponent(RBTN_voter))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(TF_id, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTN_check, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(75, 75, 75))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RBTN_adhar)
                    .addComponent(RBTN_voter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_check, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TF_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_checkActionPerformed
        
        String col;
       if( RBTN_adhar.isSelected() )
       {
           table = "adhar_card";
           col = "adhar_id";
           proof = 1001;
       }                 
       else
       {
           table = "voter_card";
           col = "voter_id";
           proof = 1003;
       }
       IDno = TF_id.getText();
       
       try
       {
            String val = db1.getValue("f_name", table, col, IDno);
            System.out.println(val);
            jPanel1.setVisible(true);
       }
       catch(Exception e){  
           System.out.println( e );
           new JToast().makeToast(null, "Enter Valid Details", 2, JToast.type_of_info);
           jPanel1.setVisible(false);
           return;
       }
    }//GEN-LAST:event_BTN_checkActionPerformed

    private void BTN_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_cancelActionPerformed
        clearData();
        this.dispose();
    }//GEN-LAST:event_BTN_cancelActionPerformed

    private void BTN_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_submitActionPerformed
        
        CBOX_sq1.setSelectedIndex(1);
        CBOX_sq2.setSelectedIndex(2);
        
        if( TF_desg.getText().length() < 4 )
        {
            new JToast().makeToast(this, " First Enter Designation", 1, JToast.type_of_info);
            TF_desg.grabFocus();
            TF_desg.setText(null);
            return;
        }
        
        if( TF_contact.getText().length() < 7 )
        {
            new JToast().makeToast(this, " First Enter Proper Contact Number", 1, JToast.type_of_info);
            TF_contact.grabFocus();
            TF_contact.setText(null);
            return;
        }
        
        if( TF_type.getText().length() < 3 )
        {
            new JToast().makeToast(this, " First Enter User Type", 1, JToast.type_of_info);
            TF_type.grabFocus();
            TF_type.setText(null);
            return;
        }
        
        if( TF_loginID.getText().length() < 6 )
        {
            new JToast().makeToast(this, " Login Id Must be minimum 6 Characters", 1, JToast.type_of_info);
            TF_loginID.grabFocus();
            TF_loginID.setText(null);
            return;
        }
        
        if( TF_password.getText().length() < 4 )
        {
            new JToast().makeToast(this, " Password Must be minimum 4 Characters", 1, JToast.type_of_info);
            TF_password.grabFocus();
            TF_password.setText(null);
            return;
        }
        
        if( TF_ans1.getText().length() < 3 )
        {
            new JToast().makeToast(this, " First give answer of first Question ", 1, JToast.type_of_info);
            TF_ans1.grabFocus();
            TF_ans1.setText(null);
            return;
        }
        
        if( TF_ans2.getText().length() < 3 )
        {
            new JToast().makeToast(this, " First give answer of Second Question ", 1, JToast.type_of_info);
            TF_ans2.grabFocus();
            TF_ans2.setText(null);
            return;
        }
        
        if( TF_joinDate.getText().length() < 3 )
        {
            TF_joinDate.setText( new Date().toString());
        }
        
        if( TF_status.getText().length() < 2 )
        {
            TF_status.setText("AC");
        }
        
        if( CBOX_sq1.getSelectedItem().toString().equalsIgnoreCase(CBOX_sq2.getSelectedItem().toString()) )
        {
            new JToast().makeToast(this, " Please Select Distinct Question", 1, JToast.type_of_info);
            CBOX_sq2.grabFocus();
            return;
        }
               
        String desg = TF_desg.getText();
        String contact = TF_contact.getText();
        String type = TF_type.getText();
        String sq1 = (String) CBOX_sq1.getSelectedItem();
        String sq2 = (String) CBOX_sq2.getSelectedItem();
        String email = TF_email.getText();
        String loginID = TF_loginID.getText();
        String password = TF_password.getText();
        String ans1 = TF_ans1.getText();
        String ans2 = TF_ans2.getText();
        String joinDate = TF_joinDate.getText();
        String status = TF_status.getText();
        long id = Long.valueOf(IDno);
        
        try
        {
            if( db1.insertLogin(loginID,proof, id, password, type, status,joinDate , desg, contact, email, sq1, sq2, ans1, ans2) )
            {
                 new JToast().makeToast(null, "Entered Successfully ", 1, JToast.type_of_succes);
                  clearData();
                  TF_id.setText(null);
            }
            else
            {
                 new JToast().makeToast(null, "Enter Proper Details ", 1, JToast.type_of_error);
                clearData();
            }
        }
        catch( Exception e )
        {
            System.out.println(e);
            new JToast().makeToast(null, "Enter Proper Details ", 1, JToast.type_of_error);
            clearData();
        }   
    }//GEN-LAST:event_BTN_submitActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
      
    }//GEN-LAST:event_formWindowClosing

    private void BTN_submitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_submitMouseEntered
        BTN_submit.setBackground(white);
        BTN_submit.setForeground(blu);
    }//GEN-LAST:event_BTN_submitMouseEntered

    private void BTN_submitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_submitMouseExited
       BTN_submit.setBackground(blu);
        BTN_submit.setForeground(white);
    }//GEN-LAST:event_BTN_submitMouseExited

    private void BTN_checkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_checkMouseEntered
        BTN_check.setBackground(pnk);
        BTN_check.setForeground(white);
    }//GEN-LAST:event_BTN_checkMouseEntered

    private void BTN_checkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_checkMouseExited
         BTN_check.setBackground(white);
        BTN_check.setForeground(pnk);
    }//GEN-LAST:event_BTN_checkMouseExited

    private void BTN_cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_cancelMouseEntered
        BTN_cancel.setBackground(white);
        BTN_cancel.setForeground(blu);
    }//GEN-LAST:event_BTN_cancelMouseEntered

    private void BTN_cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_cancelMouseExited
        BTN_cancel.setBackground(white);
        BTN_cancel.setForeground(blu);
    }//GEN-LAST:event_BTN_cancelMouseExited

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewLogin().setVisible(true);
            }
        });
    }

    private void clearData()
    {
        jPanel1.setVisible(false);
        jPanel2.setEnabled(true);
        TF_desg.setText(null);
        TF_contact.setText(null);
        TF_ans1.setText(null);
        TF_ans2.setText(null);
        TF_email.setText(null);
        TF_joinDate.setText(null);
        TF_type.setText(null);
        TF_status.setText(null);
        TF_loginID.setText(null);
        TF_password.setText(null);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BTN_cancel;
    private javax.swing.JToggleButton BTN_check;
    private javax.swing.JToggleButton BTN_submit;
    private javax.swing.JComboBox CBOX_sq1;
    private javax.swing.JComboBox CBOX_sq2;
    private javax.swing.ButtonGroup IDGroup;
    private javax.swing.JRadioButton RBTN_adhar;
    private javax.swing.JRadioButton RBTN_voter;
    private javax.swing.JTextField TF_ans1;
    private javax.swing.JTextField TF_ans2;
    private javax.swing.JTextField TF_contact;
    private javax.swing.JTextField TF_desg;
    private javax.swing.JTextField TF_email;
    private javax.swing.JTextField TF_id;
    private javax.swing.JTextField TF_joinDate;
    private javax.swing.JTextField TF_loginID;
    private javax.swing.JTextField TF_password;
    private javax.swing.JTextField TF_status;
    private javax.swing.JTextField TF_type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
