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

public class student_pass extends javax.swing.JInternalFrame {

    private DataBase_Login db = null;
    private Database1 db1 = null;
    private Date date;   
    private String[][] data = null;
    private final int passID = 11001;
    private String id = null;
    private final int proofID = 1008;       
    private String logid = login.logid;
    private final String[] cols = { "f_name","m_name","l_name","dob","adress","pincode","pic","contact_no"};
    private final Color white = new Color(255,64,129);
     private final Color blue = new Color(255,255,255);
    private final Color pnk = new Color(204,0,102);
    
    public student_pass() {
        initComponents();
        
        this.clearData();        
        jPanel2.setVisible(false);
        db = new DataBase_Login();
        db1 = new Database1();
        RBTN_cash.setSelected(true);
        jPanel3.setVisible(false);
    }

    private void loadData( String  id )
    {
        try
        {
            data = db1.getData(cols, "student","GRNO",id);
            
            TF_fname.setText( data[0][0] );
            TF_mname.setText( data[0][1] );
            TF_lname.setText( data[0][2] );
            TA_adress.setText( data[0][4] );
            TF_dob.setText( data[0][3] );
            System.out.println(data[0][6]);
            LBL_pic.setIcon(new ImageIcon( getClass().getResource( data[0][6] ) ));
            jPanel2.setEnabled(true);
            jPanel3.setVisible(true);
            jPanel3.setEnabled(true);
            jPanel2.setVisible(true);
            System.out.println(data[0][6]);
            RBTN_cash.setVisible(true);
            RBTN_chaque.setVisible(true);
        }
        catch( Exception e )
        {
             new JToast().makeToast(null, " Enter proper GRNO ", 2, JToast.type_of_info);
             TF_id.setText(null);
        }
    }
    
    private void clearData()
    {
        TF_fname.setText( null );
        TF_mname.setText( null );
        TF_lname.setText( null );
        TA_adress.setText( null );
        TF_dob.setText( null );
        CBOX_duretion.setSelectedIndex(1);
        jPanel2.setEnabled(false);
        jPanel2.setVisible(false);
        TF_id.setText(null);
        id  = null;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        TF_id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BTN_check = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BTN_submit = new javax.swing.JButton();
        BTN_cancel = new javax.swing.JButton();
        CBOX_duretion = new javax.swing.JComboBox();
        TF_dob = new javax.swing.JTextField();
        TF_fname = new javax.swing.JTextField();
        TF_mname = new javax.swing.JTextField();
        TF_lname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA_adress = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        RBTN_cash = new javax.swing.JRadioButton();
        RBTN_chaque = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        TF_chaqueNo = new javax.swing.JTextField();
        LBL_pic = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Studenet password");

        jPanel1.setBackground(new java.awt.Color(255, 64, 129));

        TF_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_idKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TF_idKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter id :");

        BTN_check.setBackground(new java.awt.Color(255, 255, 255));
        BTN_check.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BTN_check.setForeground(new java.awt.Color(204, 0, 102));
        BTN_check.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amts/images/ic_send_white_18dp_2x.png"))); // NOI18N
        BTN_check.setToolTipText("CHeck Your ID");
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
        BTN_check.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BTN_checkKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(TF_id, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTN_check, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BTN_check, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TF_id, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(33, 150, 243));
        jPanel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel2KeyPressed(evt);
            }
        });

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

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Duration of pass :");

        BTN_submit.setBackground(new java.awt.Color(255, 64, 129));
        BTN_submit.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
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
        BTN_cancel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
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

        TF_dob.setEnabled(false);
        TF_dob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_dobKeyPressed(evt);
            }
        });

        TF_fname.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        TF_fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_fnameKeyPressed(evt);
            }
        });

        TF_mname.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        TF_mname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_mnameKeyPressed(evt);
            }
        });

        TF_lname.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        TF_lname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_lnameKeyPressed(evt);
            }
        });

        jScrollPane1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        TA_adress.setColumns(20);
        TA_adress.setRows(5);
        TA_adress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TA_adressKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(TA_adress);

        jPanel3.setBackground(new java.awt.Color(33, 150, 243));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Payment By :");

        RBTN_cash.setBackground(new java.awt.Color(0, 102, 153));
        buttonGroup1.add(RBTN_cash);
        RBTN_cash.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        RBTN_cash.setForeground(new java.awt.Color(255, 255, 204));
        RBTN_cash.setText("Cash");
        RBTN_cash.setContentAreaFilled(false);

        RBTN_chaque.setBackground(new java.awt.Color(0, 102, 153));
        buttonGroup1.add(RBTN_chaque);
        RBTN_chaque.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        RBTN_chaque.setForeground(new java.awt.Color(255, 255, 204));
        RBTN_chaque.setText("Chaque");
        RBTN_chaque.setContentAreaFilled(false);
        RBTN_chaque.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RBTN_chaqueItemStateChanged(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Chaeue Number :");

        TF_chaqueNo.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(92, 92, 92)
                        .addComponent(RBTN_cash)
                        .addGap(63, 63, 63)
                        .addComponent(RBTN_chaque))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(35, 35, 35)
                        .addComponent(TF_chaqueNo, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBTN_cash)
                    .addComponent(RBTN_chaque)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_chaqueNo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LBL_pic.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 0), new java.awt.Color(51, 255, 51), new java.awt.Color(51, 255, 0), new java.awt.Color(51, 255, 51)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LBL_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(28, 28, 28))
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))
                            .addComponent(jLabel6))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_lname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_mname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_fname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CBOX_duretion, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTN_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(BTN_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel3)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel4))
                            .addComponent(LBL_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(99, 99, 99)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(TF_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(TF_mname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TF_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(TF_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CBOX_duretion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBOX_duretionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOX_duretionActionPerformed
   
    }//GEN-LAST:event_CBOX_duretionActionPerformed

    private void BTN_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_checkActionPerformed
        
        if( TF_id.getText().length() < 2  || TF_id.getText() == null )
        {
            new JToast().makeToast(null, "Enter Proper valid UID", 1, JToast.type_of_info);
            TF_id.setText(null);
            TF_id.grabFocus();
            clearData();
            return;
        }
        
        try
        {
            String temp = db1.getValue("dob", "student", "GRNO", TF_id.getText());
            System.out.println("temp    "+ temp);
            if( temp.isEmpty() || temp == null )
            {
                new JToast().makeToast(null, "Enter Proper GRNO", 1, JToast.type_of_info);
                System.out.println("in try");
                return;
            }
                
        }
        catch( Exception e )
        {
            new JToast().makeToast(null, "Enter Proper Details", 2, JToast.type_of_info);
            id = null;
            clearData();
            System.out.println("EnterProper Ragisterd number");
            return;
        }
        System.out.println("out try");
        id = TF_id.getText();
        loadData(id);
    }//GEN-LAST:event_BTN_checkActionPerformed

    private void BTN_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_cancelActionPerformed
        this.clearData();
    }//GEN-LAST:event_BTN_cancelActionPerformed

    private void BTN_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_submitActionPerformed

        String id = TF_id.getText();
        data = db1.getData(cols, "student", "GRNO", id);
        
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
        
        int costPMonth = Integer.valueOf(db1.getValue("cost_per_month", "pass_mast", "pass_id", "11001"));
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
        Date date = new Date();      
        
        Calendar c1 = Calendar.getInstance() ;
        c1.setTime(date);
        c1.add(Calendar.MONTH, duretion);
        
        int days = Integer.valueOf( c1.getTime().toString().substring(8, 10) );        
        c1.add( Calendar.DATE , -days);
        Date endDate = c1.getTime();
        String fullName = data[0][1] + " " + data[0][2].charAt(0) + " " + data[0][0];
        
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
        
        try {
            db1.setAutoComit(false);
        } catch (SQLException ex) {
            Logger.getLogger(general_pass.class.getName()).log(Level.SEVERE, null, ex);
        }        
     
        if( db1.insertPass(passNo, name, TF_dob.getText(), data[0][6], TA_adress.getText(), Integer.valueOf(data[0][5]), data[0][7],
                11001, 1008, TF_id.getText(), df.format(date).toString(), df1.format(endDate).toString(), price, 0) )
        {
           
            if( db1.insertDeposit(passNo, logid, price, df1.format(date).toString(), payBy , chkNo) )
            {
                new JToast().makeToast(null, " SuccessFully created ", 1, JToast.type_of_succes);
                
                try {
                    db1.doComit();
                    db1.setAutoComit(true);
                } catch (SQLException ex) {
                    Logger.getLogger(general_pass.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                PassPDF pdf = new PassPDF(String.valueOf(passNo));
                 pdf = new PassPDF(String.valueOf(passNo));
               
                clearData();
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

    private void TF_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_idKeyTyped
       
    }//GEN-LAST:event_TF_idKeyTyped

    private void TF_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_idKeyPressed
        if( evt.getKeyCode() == 13 || evt.getKeyChar()=='\n')
        {
           this.BTN_checkActionPerformed(null);
        }
    }//GEN-LAST:event_TF_idKeyPressed

    private void BTN_checkKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BTN_checkKeyPressed
       if( evt.getKeyCode() == 13 || evt.getKeyChar()=='\n')
        {
           this.BTN_checkActionPerformed(null);
        }
    }//GEN-LAST:event_BTN_checkKeyPressed

    private void jPanel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel2KeyPressed
        if( evt.getKeyCode() == 13 || evt.getKeyChar()=='\n')
        {
           this.BTN_submitActionPerformed(null);
        }
    }//GEN-LAST:event_jPanel2KeyPressed

    private void TF_fnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_fnameKeyPressed
        if( evt.getKeyCode() == 13 || evt.getKeyChar()=='\n')
        {
           TF_mname.grabFocus();
        }
    }//GEN-LAST:event_TF_fnameKeyPressed

    private void TF_mnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_mnameKeyPressed
       if( evt.getKeyCode() == 13 || evt.getKeyChar()=='\n')
        {
           TF_lname.grabFocus();
        }
    }//GEN-LAST:event_TF_mnameKeyPressed

    private void TF_lnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_lnameKeyPressed
        if( evt.getKeyCode() == 13 || evt.getKeyChar()=='\n')
        {
           TA_adress.grabFocus();
        }
    }//GEN-LAST:event_TF_lnameKeyPressed

    private void TA_adressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TA_adressKeyPressed
       if( evt.getKeyCode() == 13 || evt.getKeyChar()=='\n')
        {
           TF_dob.grabFocus();
        }
    }//GEN-LAST:event_TA_adressKeyPressed

    private void TF_dobKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_dobKeyPressed
        if( evt.getKeyCode() == 13 || evt.getKeyChar()=='\n')
        {
           CBOX_duretion.grabFocus();
        }
    }//GEN-LAST:event_TF_dobKeyPressed

    private void CBOX_duretionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CBOX_duretionKeyPressed
        if( evt.getKeyCode() == 13 || evt.getKeyChar()=='\n')
        {
           this.BTN_submitActionPerformed(null);
        }
    }//GEN-LAST:event_CBOX_duretionKeyPressed

    private void RBTN_chaqueItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RBTN_chaqueItemStateChanged

        if( RBTN_chaque.isSelected() )
        jPanel3.setVisible(true);
        else
        jPanel3.setVisible(false);
    }//GEN-LAST:event_RBTN_chaqueItemStateChanged

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
    private javax.swing.JRadioButton RBTN_cash;
    private javax.swing.JRadioButton RBTN_chaque;
    private javax.swing.JTextArea TA_adress;
    private javax.swing.JTextField TF_chaqueNo;
    private javax.swing.JTextField TF_dob;
    private javax.swing.JTextField TF_fname;
    private javax.swing.JTextField TF_id;
    private javax.swing.JTextField TF_lname;
    private javax.swing.JTextField TF_mname;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
