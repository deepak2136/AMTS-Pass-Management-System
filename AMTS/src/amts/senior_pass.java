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
import javax.swing.ImageIcon;

public class senior_pass extends javax.swing.JInternalFrame {

    private String table;
    private String IDno;
    private Database1 db1;
    private int proof;
    private String col;
    private final String[] cols = { "f_name","m_name","l_name","dob","adress","pincode","pic","contact_no"};
    private String[][] data;        
    private String logid = login.logid;
    private final Color white = new Color(255,64,129);
     private final Color blue = new Color(255,255,255);
    private final Color pnk = new Color(204,0,102);
   
    public senior_pass() {
        initComponents();
        jPanel2.setVisible(false);
        db1 = new Database1();
        clearData();
        RBTN_cash.setSelected(true);
        RBTN_voter.setSelected(true);
        jPanel3.setVisible(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BTN_submit = new javax.swing.JButton();
        BTN_cancel = new javax.swing.JButton();
        TF_fname = new javax.swing.JTextField();
        TF_mname = new javax.swing.JTextField();
        TF_lname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA_adress = new javax.swing.JTextArea();
        TF_dob = new javax.swing.JTextField();
        CBOX_duretion = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        TF_chaqueNo = new javax.swing.JTextField();
        RBTN_cash = new javax.swing.JRadioButton();
        RBTN_chaque = new javax.swing.JRadioButton();
        LBL_pic = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        TF_id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BTN_check = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        RBTN_adhar = new javax.swing.JRadioButton();
        RBTN_voter = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Senior Citizen Pass");

        jPanel2.setBackground(new java.awt.Color(33, 150, 243));

        jLabel2.setBackground(new java.awt.Color(255, 255, 153));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First name :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Middle name :");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Last name :");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address :");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date of Birth :");

        BTN_submit.setBackground(new java.awt.Color(255, 64, 129));
        BTN_submit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BTN_submit.setForeground(new java.awt.Color(255, 255, 255));
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

        BTN_cancel.setBackground(new java.awt.Color(255, 64, 129));
        BTN_cancel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BTN_cancel.setForeground(new java.awt.Color(255, 255, 255));
        BTN_cancel.setText("Cancle");
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

        TF_fname.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        TF_fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_fnameKeyPressed(evt);
            }
        });

        TF_mname.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        TF_mname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_mnameKeyPressed(evt);
            }
        });

        TF_lname.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        TF_lname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_lnameKeyPressed(evt);
            }
        });

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        TA_adress.setColumns(20);
        TA_adress.setRows(5);
        TA_adress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TA_adressKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(TA_adress);

        TF_dob.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        TF_dob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_dobKeyPressed(evt);
            }
        });

        CBOX_duretion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 Month", "2 Months", "3 Months", "4 Months", "5 Months", "6 Months" }));
        CBOX_duretion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(243, 85, 92)));
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

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Duration of pass :");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Payment By");

        jPanel3.setBackground(new java.awt.Color(33, 150, 243));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("cheque No :");

        TF_chaqueNo.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        TF_chaqueNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_chaqueNoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(TF_chaqueNo, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TF_chaqueNo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        RBTN_cash.setBackground(new java.awt.Color(0, 102, 153));
        buttonGroup1.add(RBTN_cash);
        RBTN_cash.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        RBTN_cash.setForeground(new java.awt.Color(255, 255, 204));
        RBTN_cash.setText("Cash");
        RBTN_cash.setContentAreaFilled(false);

        RBTN_chaque.setBackground(new java.awt.Color(0, 102, 153));
        buttonGroup1.add(RBTN_chaque);
        RBTN_chaque.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        RBTN_chaque.setForeground(new java.awt.Color(255, 255, 204));
        RBTN_chaque.setText("Chaque");
        RBTN_chaque.setContentAreaFilled(false);
        RBTN_chaque.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RBTN_chaqueItemStateChanged(evt);
            }
        });

        LBL_pic.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 0), new java.awt.Color(51, 255, 51), new java.awt.Color(51, 255, 0), new java.awt.Color(51, 255, 51)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(LBL_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TF_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_mname, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel5)
                        .addGap(95, 95, 95)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel6)
                        .addGap(59, 59, 59)
                        .addComponent(TF_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(BTN_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(BTN_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(77, 77, 77)
                                .addComponent(RBTN_cash)
                                .addGap(38, 38, 38)
                                .addComponent(RBTN_chaque))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(30, 30, 30)
                                .addComponent(CBOX_duretion, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(36, 36, 36))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBL_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(TF_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(TF_mname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(TF_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(TF_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel9))
                    .addComponent(CBOX_duretion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(RBTN_cash)
                    .addComponent(RBTN_chaque))
                .addGap(8, 8, 8)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.setBackground(new java.awt.Color(255, 64, 129));

        TF_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_idKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter id :");

        BTN_check.setBackground(new java.awt.Color(255, 255, 255));
        BTN_check.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BTN_check.setForeground(new java.awt.Color(204, 0, 102));
        BTN_check.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amts/images/ic_send_white_18dp_2x.png"))); // NOI18N
        BTN_check.setToolTipText("Check Your ID");
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

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID Proof:");

        RBTN_adhar.setBackground(new java.awt.Color(204, 0, 102));
        buttonGroup2.add(RBTN_adhar);
        RBTN_adhar.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        RBTN_adhar.setForeground(new java.awt.Color(255, 255, 255));
        RBTN_adhar.setText("adhar_card");
        RBTN_adhar.setContentAreaFilled(false);
        RBTN_adhar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        RBTN_adhar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RBTN_adharItemStateChanged(evt);
            }
        });

        RBTN_voter.setBackground(new java.awt.Color(204, 0, 102));
        buttonGroup2.add(RBTN_voter);
        RBTN_voter.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        RBTN_voter.setForeground(new java.awt.Color(255, 255, 255));
        RBTN_voter.setText("voter_card");
        RBTN_voter.setContentAreaFilled(false);
        RBTN_voter.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        RBTN_voter.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RBTN_voterItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RBTN_adhar)
                        .addGap(18, 18, 18)
                        .addComponent(RBTN_voter))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TF_id, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTN_check, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RBTN_adhar)
                        .addComponent(RBTN_voter)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BTN_check, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TF_id, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBOX_duretionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOX_duretionActionPerformed

        jPanel2.setVisible(true);
    }//GEN-LAST:event_CBOX_duretionActionPerformed

    private void CBOX_duretionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CBOX_duretionKeyPressed
        if( evt.getKeyCode() == 13 || evt.getKeyChar()=='\n')
        {
            this.BTN_submitActionPerformed(null);
        }
    }//GEN-LAST:event_CBOX_duretionKeyPressed

    private void BTN_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_checkActionPerformed

        if( TF_id.getText().length() < 2  || TF_id.getText() == null )
        {
            new JToast().makeToast(null, "Enter Proper valid UID", 1, JToast.type_of_info);
            TF_id.setText(null);
            clearData();
            TF_id.setText(null);
            TF_id.grabFocus();
            return;
        }
        
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
            proof = 1002;
        }
        IDno = TF_id.getText();

        try
        {
            String val = db1.getValue("f_name", table, col, IDno);
            System.out.println(val);

            if( val == null || val.isEmpty() )
            {
                new JToast().makeToast(null, "Enter Valid ID", 2, JToast.type_of_info);
                jPanel2.setVisible(false);
                clearData();
                return;
            }                 
            
            jPanel1.setVisible(true);
            
            
        }
        catch(Exception e){
            System.out.println( e );
            new JToast().makeToast(null, "Enter Valid Details", 2, JToast.type_of_info);
            jPanel2.setVisible(false);
            clearData();
            return;
        }
        
        loadData();
    }//GEN-LAST:event_BTN_checkActionPerformed

    private void BTN_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_submitActionPerformed
        String id = TF_id.getText();
        data = db1.getData(cols, table, col, id);
        String temp = data[0][3].replace('-', '/');
        
        Date datec = new Date(temp);
        Date date = new Date();
        
        Calendar calc = Calendar.getInstance();
        calc.setTime(datec);
        System.out.println( calc.toString() )  ;
        
        Calendar calc1 = Calendar.getInstance();
        calc1.setTime(date);
        calc1.add(Calendar.YEAR, -60);
        
        System.out.println( calc1.toString() );
        
        if( calc1.compareTo(calc) < 0 )
        {
            new JToast().makeToast(null, " Not Eligible For Senior Citize Pass", JToast.type_of_info, 1);
            jPanel2.setVisible(false);
            clearData();
            return;
        }
       
        if( TF_fname.getText().isEmpty() || TF_fname.getText().length() < 2 )
        {
            new JToast().makeToast(null, " Enter Proper Name First ", 1, JToast.type_of_info);
            TF_fname.grabFocus();
            TF_fname.setText(null);
            return;
        }
        
        if( TF_mname.getText().isEmpty() || TF_mname.getText().length() < 2 )
        {
            new JToast().makeToast(null, " Enter Proper Name First ", 1, JToast.type_of_info);
            TF_mname.grabFocus();
            TF_mname.setText(null);
            return;
        }
        
        if( TF_lname.getText().isEmpty() || TF_lname.getText().length() < 2 )
        {
            new JToast().makeToast(null, " Enter Proper Name First ", 1, JToast.type_of_info);
            TF_lname.grabFocus();
            TF_lname.setText(null);
            return;
        }
        
        if( TF_dob.getText().isEmpty() || TF_dob.getText().length() < 2 )
        {
            new JToast().makeToast(null, " Enter Proper Date of Birth First ", 1, JToast.type_of_info);
            TF_dob.grabFocus();
            TF_dob.setText(null);
            return;
        }
        
        if( TA_adress.getText().isEmpty() || TA_adress.getText().length() < 2 )
        {
            new JToast().makeToast(null, " Enter Proper Adress First ", 1, JToast.type_of_info);
            TA_adress.grabFocus();
            TA_adress.setText(null);
            return;
        }
        
        if( CBOX_duretion.getSelectedIndex() == -1 )
        {
            new JToast().makeToast(null, "First select pass Duretion", 1, JToast.type_of_info);
            CBOX_duretion.grabFocus();
            return;
        }
        
        String fname = TF_fname.getText();
        String mname = TF_mname.getText();
        String lname = TF_lname.getText();
        String name = mname + " " +  lname.charAt(0) + " " + fname ;
        
        int costPMonth = Integer.valueOf(db1.getValue("cost_per_month", "pass_mast", "pass_id", "11002"));
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
                duretion = 0;
                break;                
        }//switch
       
        price = duretion * costPMonth + 50;
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        date = new Date();      
        
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
            if( TF_chaqueNo.getText().length() < 7)
            {
                new JToast().makeToast(null, " First Enter Chaque Number ", 2, JToast.type_of_info);
                TF_chaqueNo.grabFocus();
                return;
            }
            chkNo = TF_chaqueNo.getText();
        }
        System.out.println(df1.format(endDate));
        
        try {
            db1.setAutoComit(false);
        } catch (SQLException ex) {
            Logger.getLogger(general_pass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if( db1.insertPass(passNo, name, TF_dob.getText(), data[0][6], TA_adress.getText(), Integer.valueOf(data[0][5]), data[0][7],
                11002, proof, TF_id.getText(), df.format(date).toString(), df1.format(endDate).toString(), price,0) )
        {
           
            if( db1.insertDeposit(passNo, logid, price, df1.format(date).toString(), payBy , chkNo) )
            {
                new JToast().makeToast(null, " SuccessFully created ", 1, JToast.type_of_succes);
                clearData();
                
                try {
                    db1.doComit();
                    db1.setAutoComit(true);
                } catch (SQLException ex) {
                    Logger.getLogger(general_pass.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                PassPDF pf = new PassPDF(String.valueOf(passNo));
                        pf = new PassPDF(String.valueOf(passNo));
                
                jPanel2.setVisible(false);
                TF_id.setText(null);
            }            
        }
        else
        {
            new JToast().makeToast(null, " Error \n Enter Proper Details ", 1, JToast.type_of_error);
            
            try {
                db1.doRollback();
                db1.setAutoComit(true);
            } catch (SQLException ex) {
                Logger.getLogger(general_pass.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            clearData();
            jPanel2.setVisible(false);
        }
    }//GEN-LAST:event_BTN_submitActionPerformed

    private void RBTN_chaqueItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RBTN_chaqueItemStateChanged
       
        if( RBTN_chaque.isSelected() )
            jPanel3.setVisible(true);
        else
            jPanel3.setVisible(false);
        clearData();
    }//GEN-LAST:event_RBTN_chaqueItemStateChanged

    private void TF_fnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_fnameKeyPressed
        if( evt.getKeyCode() == 13 || evt.getKeyChar() == '\n' )
            this.BTN_submitActionPerformed(null);  
    }//GEN-LAST:event_TF_fnameKeyPressed

    private void TF_mnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_mnameKeyPressed
        if( evt.getKeyCode() == 13 || evt.getKeyChar() == '\n' )
            this.BTN_submitActionPerformed(null);  
    }//GEN-LAST:event_TF_mnameKeyPressed

    private void TF_lnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_lnameKeyPressed
        if( evt.getKeyCode() == 13 || evt.getKeyChar() == '\n' )
            this.BTN_submitActionPerformed(null);  
    }//GEN-LAST:event_TF_lnameKeyPressed

    private void TA_adressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TA_adressKeyPressed
        if( evt.getKeyCode() == 13 || evt.getKeyChar() == '\n' )
            this.BTN_submitActionPerformed(null);  
    }//GEN-LAST:event_TA_adressKeyPressed

    private void TF_dobKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_dobKeyPressed
       if( evt.getKeyCode() == 13 || evt.getKeyChar() == '\n' )
            this.BTN_submitActionPerformed(null);  
    }//GEN-LAST:event_TF_dobKeyPressed

    private void TF_chaqueNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_chaqueNoKeyPressed
        if( evt.getKeyCode() == 13 || evt.getKeyChar() == '\n' )
            this.BTN_submitActionPerformed(null);  
    }//GEN-LAST:event_TF_chaqueNoKeyPressed

    private void TF_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_idKeyPressed
        if( evt.getKeyCode() == 13 || evt.getKeyChar() == '\n' )
            this.BTN_checkActionPerformed(null);  
    }//GEN-LAST:event_TF_idKeyPressed

    private void BTN_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_cancelActionPerformed
       
        jPanel2.setVisible(false);
        clearData();
    }//GEN-LAST:event_BTN_cancelActionPerformed

    private void RBTN_adharItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RBTN_adharItemStateChanged
        clearData();
    }//GEN-LAST:event_RBTN_adharItemStateChanged

    private void RBTN_voterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RBTN_voterItemStateChanged
        clearData();
    }//GEN-LAST:event_RBTN_voterItemStateChanged

    private void BTN_checkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_checkMouseEntered
        BTN_check.setBackground(pnk);
       BTN_check.setForeground(white);
    }//GEN-LAST:event_BTN_checkMouseEntered

    private void BTN_checkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_checkMouseExited
        BTN_check.setBackground(white);
       BTN_check.setForeground(pnk);
    }//GEN-LAST:event_BTN_checkMouseExited

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
    private javax.swing.JButton BTN_check;
    private javax.swing.JButton BTN_submit;
    private javax.swing.JComboBox CBOX_duretion;
    private javax.swing.JLabel LBL_pic;
    private javax.swing.JRadioButton RBTN_adhar;
    private javax.swing.JRadioButton RBTN_cash;
    private javax.swing.JRadioButton RBTN_chaque;
    private javax.swing.JRadioButton RBTN_voter;
    private javax.swing.JTextArea TA_adress;
    private javax.swing.JTextField TF_chaqueNo;
    private javax.swing.JTextField TF_dob;
    private javax.swing.JTextField TF_fname;
    private javax.swing.JTextField TF_id;
    private javax.swing.JTextField TF_lname;
    private javax.swing.JTextField TF_mname;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        try
        {
            data = db1.getData(cols, table,col,TF_id.getText());
        
            TF_fname.setText( data[0][0] );
            TF_mname.setText( data[0][1] );
            TF_lname.setText( data[0][2] );
            TA_adress.setText( data[0][4] );
            TF_dob.setText( data[0][3] );
            LBL_pic.setIcon(new ImageIcon( getClass().getResource( data[0][6] ) ));
            jPanel2.setEnabled(true);
            jPanel2.setVisible(true);
        }
        catch( Exception e )
        {
             new JToast().makeToast(null, " Enter proper Identity ", 2, JToast.type_of_info);
             TF_id.setText(null);
        }
    }

    private void clearData() {
        TF_fname.setText(null);
        TF_mname.setText(null);
        TF_lname.setText(null);
        TA_adress.setText(null);
        TF_dob.setText(null);
        LBL_pic.setIcon(null);
    }
}
