package amts;

import diu.swe.habib.JavaToast.JToast;

public class NewRoute extends javax.swing.JInternalFrame {

    private Database1 db1;
    
    public NewRoute() {
        initComponents();
        db1 = new Database1();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TF_rootNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TF_busNo1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TF_startPlace = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TF_endPlace = new javax.swing.JTextField();
        BTN_submit1 = new javax.swing.JToggleButton();
        BTN_close1 = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        TF_rootNo1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TF_busNo2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TF_startTime = new javax.swing.JTextField();
        BTN_submit2 = new javax.swing.JToggleButton();
        BTN_close2 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TF_stopNo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TF_routeNo3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        TF_place = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        TF_areaCode = new javax.swing.JTextField();
        BTN_submit3 = new javax.swing.JToggleButton();
        BTN_close3 = new javax.swing.JToggleButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setTitle("New Entry Route");
        setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setText("Bus List");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel2.setText("Enter Bus Number ");

        TF_rootNo.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel3.setText("Enter Route Number ");

        TF_busNo1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel4.setText("Enter Start Place");

        TF_startPlace.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel5.setText("Enter End Place");

        TF_endPlace.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        BTN_submit1.setText("Submit");
        BTN_submit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_submit1ActionPerformed(evt);
            }
        });

        BTN_close1.setText("clean");
        BTN_close1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_close1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(TF_startPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(TF_rootNo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)))
                        .addComponent(TF_endPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BTN_close1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(BTN_submit1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(TF_busNo1)
                    .addGap(20, 20, 20)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TF_rootNo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TF_startPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TF_endPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_close1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(BTN_submit1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(114, 114, 114)
                    .addComponent(TF_busNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(346, Short.MAX_VALUE)))
        );

        jPanel4.setBackground(new java.awt.Color(153, 255, 255));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel6.setText(" Bus Shedule");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        TF_rootNo1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel8.setText("Enter Route Number ");

        jLabel9.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel9.setText("Enter Bus Number");

        TF_busNo2.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel10.setText("Enter Start Time");

        TF_startTime.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        BTN_submit2.setText("Submit");
        BTN_submit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_submit2ActionPerformed(evt);
            }
        });

        BTN_close2.setText("clean");
        BTN_close2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_close2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(TF_busNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(TF_rootNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9)))
                        .addComponent(TF_startTime, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(BTN_close2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(BTN_submit2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TF_rootNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TF_busNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TF_startTime, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_close2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(BTN_submit2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        jLabel11.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel11.setText("Bus Stop");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel12.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel12.setText("Enter route Number ");

        TF_stopNo.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel13.setText("Enter Stop Number ");

        TF_routeNo3.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel14.setText("Enter Place");

        TF_place.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel15.setText("Enter area code");

        TF_areaCode.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        BTN_submit3.setText("Submit");
        BTN_submit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_submit3ActionPerformed(evt);
            }
        });

        BTN_close3.setText("clean");
        BTN_close3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_close3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(TF_place, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(TF_stopNo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel14)))
                        .addComponent(TF_areaCode, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(BTN_close3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(BTN_submit3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(TF_routeNo3)
                    .addGap(20, 20, 20)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TF_stopNo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TF_place, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TF_areaCode, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_close3, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(BTN_submit3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(114, 114, 114)
                    .addComponent(TF_routeNo3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(346, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_close1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_close1ActionPerformed

        TF_busNo1.setText(null);
        TF_rootNo.setText(null);
        TF_startPlace.setText(null);
        TF_endPlace.setText(null);
        TF_busNo1.grabFocus();
    }//GEN-LAST:event_BTN_close1ActionPerformed

    private void BTN_close2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_close2ActionPerformed
        TF_rootNo1.setText(null);
        TF_busNo2.setText(null);
        TF_startTime.setText(null);
        TF_rootNo1.grabFocus();
    }//GEN-LAST:event_BTN_close2ActionPerformed

    private void BTN_close3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_close3ActionPerformed
        TF_routeNo3.setText(null);
        TF_stopNo.setText(null);
        TF_place.setText(null);
        TF_areaCode.setText(null);
        TF_routeNo3.grabFocus();
    }//GEN-LAST:event_BTN_close3ActionPerformed

    private void BTN_submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_submit1ActionPerformed
        if(  TF_busNo1.getText().isEmpty())
        {
            new JToast().makeToast(null, "Please Enter Bus Number First", 1, JToast.type_of_notification);
            TF_busNo1.grabFocus();
            return;
        }

        if( TF_rootNo.getText().isEmpty() )
        {
            new JToast().makeToast(null, "Please Enter Route Number First", 1, JToast.type_of_notification);
            TF_rootNo.grabFocus();
            return;
        }

        if( TF_startPlace.getText().isEmpty() )
        {
            new JToast().makeToast(null, "Please Enter Start Place First", 1, JToast.type_of_notification);
            TF_startPlace.grabFocus();
            return;
        }

        if( TF_endPlace.getText().isEmpty() )
        {
            new JToast().makeToast(null, "Please Enter End Place First", 1, JToast.type_of_notification);
            TF_endPlace.grabFocus();
            return;
        }

        String cols[] = new String[4];

        cols[0] = TF_busNo1.getText();
        cols[1] = TF_rootNo.getText();
        cols[2] = TF_startPlace.getText();
        cols[3] = TF_endPlace.getText();

        if( db1.insertData("bus_list",cols) )
        {
            new JToast().makeToast(null, "Successfull", 1, JToast.type_of_succes);
            this.BTN_close1ActionPerformed(null);
            return;
        }
        else
        {
            new JToast().makeToast(null, "Failed", 1, JToast.type_of_info);
            this.BTN_close1ActionPerformed(null);
            return;
        }
    }//GEN-LAST:event_BTN_submit1ActionPerformed

    private void BTN_submit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_submit2ActionPerformed
        if(  TF_busNo2.getText().isEmpty())
        {
            new JToast().makeToast(null, "Please Enter Bus Number First", 1, JToast.type_of_notification);
            TF_busNo2.grabFocus();
            return;
        }

        if( TF_rootNo1.getText().isEmpty() )
        {
            new JToast().makeToast(null, "Please Enter Route Number First", 1, JToast.type_of_notification);
            TF_rootNo1.grabFocus();
            return;
        }

        if( TF_startTime.getText().isEmpty() )
        {
            new JToast().makeToast(null, "Please Enter Start Time First", 1, JToast.type_of_notification);
            TF_startTime.grabFocus();
            return;
        }

        String cols[] = new String[4];

        cols[0] = null;
        cols[1] = TF_rootNo1.getText();
        cols[2] = TF_busNo2.getText();
        cols[3] = TF_startTime.getText();

        if( db1.insertData("bus_shedule",cols) )
        {
            new JToast().makeToast(null, "Successfull", 1, JToast.type_of_succes);
            this.BTN_close2ActionPerformed(null);
            return;
        }
        else
        {
            new JToast().makeToast(null, "Failed", 1, JToast.type_of_info);
            this.BTN_close2ActionPerformed(null);
            return;
        }
    }//GEN-LAST:event_BTN_submit2ActionPerformed

    private void BTN_submit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_submit3ActionPerformed
        if(  TF_stopNo.getText().isEmpty())
        {
            new JToast().makeToast(null, "Please Enter Stop Number First", 1, JToast.type_of_notification);
            TF_busNo1.grabFocus();
            return;
        }

        if( TF_routeNo3.getText().isEmpty() )
        {
            new JToast().makeToast(null, "Please Enter Route Number First", 1, JToast.type_of_notification);
            TF_routeNo3.grabFocus();
            return;
        }

        if( TF_place.getText().isEmpty() )
        {
            new JToast().makeToast(null, "Please Enter Place Name First", 1, JToast.type_of_notification);
            TF_place.grabFocus();
            return;
        }

        if( TF_areaCode.getText().isEmpty() )
        {
            new JToast().makeToast(null, "Please Enter Area Pincode First", 1, JToast.type_of_notification);
            TF_areaCode.grabFocus();
            return;
        }

        String cols[] = new String[4];

        cols[0] = TF_routeNo3.getText();
        cols[1] = TF_stopNo.getText();
        cols[2] = TF_place.getText();
        cols[3] = TF_areaCode.getText();

        if( db1.insertData("bus_stop",cols) )
        {
            new JToast().makeToast(null, "Successfull", 1, JToast.type_of_succes);
            this.BTN_close1ActionPerformed(null);
            return;
        }
        else
        {
            new JToast().makeToast(null, "Failed", 1, JToast.type_of_info);
            this.BTN_close1ActionPerformed(null);
            return;
        }
    }//GEN-LAST:event_BTN_submit3ActionPerformed

    private void BTN_close5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_close5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_close5ActionPerformed

    private void BTN_submit6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_submit6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_submit6ActionPerformed

    private void BTN_close6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_close6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_close6ActionPerformed

    private void BTN_submit7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_submit7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_submit7ActionPerformed

    private void BTN_close7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_close7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_close7ActionPerformed

    private void BTN_submit8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_submit8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_submit8ActionPerformed

    private void BTN_close8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_close8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_close8ActionPerformed

    private void BTN_submit9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_submit9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_submit9ActionPerformed

    private void BTN_submit10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_submit10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_submit10ActionPerformed

    private void BTN_close9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_close9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_close9ActionPerformed

    private void BTN_submit11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_submit11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_submit11ActionPerformed

    private void BTN_close10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_close10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_close10ActionPerformed

    private void BTN_submit12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_submit12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_submit12ActionPerformed

    private void BTN_close11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_close11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_close11ActionPerformed

    private void BTN_submit13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_submit13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_submit13ActionPerformed

    private void BTN_close12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_close12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_close12ActionPerformed

    private void BTN_submit14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_submit14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_submit14ActionPerformed

    private void BTN_close13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_close13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_close13ActionPerformed

    private void BTN_submit15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_submit15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_submit15ActionPerformed

    private void BTN_close14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_close14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_close14ActionPerformed

    private void BTN_submit16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_submit16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_submit16ActionPerformed

    private void BTN_close15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_close15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_close15ActionPerformed

    private void BTN_submit17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_submit17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_submit17ActionPerformed

    private void BTN_close16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_close16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_close16ActionPerformed

    private void BTN_submit18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_submit18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_submit18ActionPerformed

    private void BTN_close17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_close17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_close17ActionPerformed

    private void BTN_submit19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_submit19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_submit19ActionPerformed

    private void BTN_close18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_close18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_close18ActionPerformed

    private void BTN_submit20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_submit20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_submit20ActionPerformed

    private void BTN_close19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_close19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_close19ActionPerformed

    private void BTN_submit21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_submit21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_submit21ActionPerformed

    private void BTN_close20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_close20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_close20ActionPerformed

    private void BTN_submit22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_submit22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_submit22ActionPerformed

    private void BTN_close21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_close21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_close21ActionPerformed

    private void BTN_submit23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_submit23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_submit23ActionPerformed

    private void BTN_submit24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_submit24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_submit24ActionPerformed

    private void BTN_close22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_close22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_close22ActionPerformed

    private void BTN_submit25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_submit25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_submit25ActionPerformed

    private void BTN_close23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_close23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_close23ActionPerformed

    private void BTN_submit26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_submit26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_submit26ActionPerformed

    private void BTN_close24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_close24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_close24ActionPerformed

    private void BTN_submit27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_submit27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_submit27ActionPerformed

    private void BTN_close25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_close25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_close25ActionPerformed

    private void BTN_submit28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_submit28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_submit28ActionPerformed

    private void BTN_close26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_close26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_close26ActionPerformed

    private void BTN_submit29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_submit29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_submit29ActionPerformed

    private void BTN_close27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_close27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_close27ActionPerformed

    private void BTN_submit30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_submit30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_submit30ActionPerformed

    private void BTN_close28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_close28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_close28ActionPerformed

    private void BTN_submit31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_submit31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_submit31ActionPerformed

    private void BTN_close29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_close29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_close29ActionPerformed

    private void BTN_submit32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_submit32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_submit32ActionPerformed

    private void BTN_close30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_close30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_close30ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BTN_close1;
    private javax.swing.JToggleButton BTN_close2;
    private javax.swing.JToggleButton BTN_close3;
    private javax.swing.JToggleButton BTN_submit1;
    private javax.swing.JToggleButton BTN_submit2;
    private javax.swing.JToggleButton BTN_submit3;
    private javax.swing.JTextField TF_areaCode;
    private javax.swing.JTextField TF_busNo1;
    private javax.swing.JTextField TF_busNo2;
    private javax.swing.JTextField TF_endPlace;
    private javax.swing.JTextField TF_place;
    private javax.swing.JTextField TF_rootNo;
    private javax.swing.JTextField TF_rootNo1;
    private javax.swing.JTextField TF_routeNo3;
    private javax.swing.JTextField TF_startPlace;
    private javax.swing.JTextField TF_startTime;
    private javax.swing.JTextField TF_stopNo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
