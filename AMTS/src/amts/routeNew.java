package amts;

import diu.swe.habib.JavaToast.JToast;
import java.awt.Color;

public class routeNew extends javax.swing.JFrame {
    
    private Database1 db1;
      private final Color white = new Color(255,64,129);
     private final Color blue = new Color(255,255,255);
    private final Color pnk = new Color(68,129,255);
    public routeNew() {
        super("new bus route entry");
        initComponents();
        db1 = new Database1();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        TF_rootNo1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TF_busNo2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TF_startTime = new javax.swing.JTextField();
        BTN_submit2 = new javax.swing.JToggleButton();
        BTN_close2 = new javax.swing.JToggleButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
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
        jPanel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Bus Routes");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 64, 129), 2));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 64, 129));
        jLabel2.setText("Enter Bus Number ");

        TF_rootNo.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        TF_rootNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 129, 255)));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 64, 129));
        jLabel3.setText("Enter Route Number ");

        TF_busNo1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        TF_busNo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 129, 255)));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 64, 129));
        jLabel4.setText("Enter Start Place");

        TF_startPlace.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        TF_startPlace.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 129, 255)));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 64, 129));
        jLabel5.setText("Enter End Place");

        TF_endPlace.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        TF_endPlace.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 129, 255)));

        BTN_submit1.setBackground(new java.awt.Color(68, 129, 255));
        BTN_submit1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BTN_submit1.setForeground(new java.awt.Color(255, 255, 255));
        BTN_submit1.setText("Submit");
        BTN_submit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_submit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_submit1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_submit1MouseExited(evt);
            }
        });
        BTN_submit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_submit1ActionPerformed(evt);
            }
        });

        BTN_close1.setBackground(new java.awt.Color(68, 129, 255));
        BTN_close1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BTN_close1.setForeground(new java.awt.Color(255, 255, 255));
        BTN_close1.setText("Reset");
        BTN_close1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_close1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_close1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_close1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_close1MouseExited(evt);
            }
        });
        BTN_close1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_close1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(68, 129, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Bus List");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel7)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TF_startPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_endPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_rootNo, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_submit1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(BTN_close1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(TF_busNo1)
                    .addGap(20, 20, 20)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TF_rootNo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TF_startPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TF_endPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_close1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_submit1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(114, 114, 114)
                    .addComponent(TF_busNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(390, Short.MAX_VALUE)))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 129, 255), 2));

        TF_rootNo1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        TF_rootNo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 64, 129)));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(68, 129, 255));
        jLabel8.setText("Enter Route Number ");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(68, 129, 255));
        jLabel9.setText("Enter Bus Number");

        TF_busNo2.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        TF_busNo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 64, 129)));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(68, 129, 255));
        jLabel10.setText("Enter Start Time");

        TF_startTime.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        TF_startTime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 64, 129)));

        BTN_submit2.setBackground(new java.awt.Color(255, 64, 129));
        BTN_submit2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BTN_submit2.setForeground(new java.awt.Color(255, 255, 255));
        BTN_submit2.setText("Submit");
        BTN_submit2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_submit2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_submit2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_submit2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_submit2MouseExited(evt);
            }
        });
        BTN_submit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_submit2ActionPerformed(evt);
            }
        });

        BTN_close2.setBackground(new java.awt.Color(255, 64, 129));
        BTN_close2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BTN_close2.setForeground(new java.awt.Color(255, 255, 255));
        BTN_close2.setText("Reset");
        BTN_close2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_close2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_close2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_close2MouseExited(evt);
            }
        });
        BTN_close2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_close2ActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 64, 129));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Bus List");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel16)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(BTN_close2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTN_submit2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(TF_startTime, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_busNo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_rootNo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TF_rootNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TF_busNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TF_startTime, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_close2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_submit2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 64, 129), 2));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 64, 129));
        jLabel12.setText("Enter route Number ");

        TF_stopNo.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        TF_stopNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 129, 255)));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 64, 129));
        jLabel13.setText("Enter Stop Number ");

        TF_routeNo3.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        TF_routeNo3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 129, 255)));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 64, 129));
        jLabel14.setText("Enter Place");

        TF_place.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        TF_place.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 129, 255)));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 64, 129));
        jLabel15.setText("Enter area code");

        TF_areaCode.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        TF_areaCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 129, 255)));

        BTN_submit3.setBackground(new java.awt.Color(68, 129, 255));
        BTN_submit3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BTN_submit3.setForeground(new java.awt.Color(255, 255, 255));
        BTN_submit3.setText("Submit");
        BTN_submit3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_submit3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_submit3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_submit3MouseExited(evt);
            }
        });
        BTN_submit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_submit3ActionPerformed(evt);
            }
        });

        BTN_close3.setBackground(new java.awt.Color(68, 129, 255));
        BTN_close3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BTN_close3.setForeground(new java.awt.Color(255, 255, 255));
        BTN_close3.setText("Reset");
        BTN_close3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_close3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_close3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_close3MouseExited(evt);
            }
        });
        BTN_close3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_close3ActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(68, 129, 255));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Bus List");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel17)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 6, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TF_place, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TF_areaCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(BTN_close3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BTN_submit3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TF_stopNo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(24, 24, 24)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TF_stopNo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TF_place, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TF_areaCode, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_close3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_submit3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(114, 114, 114)
                    .addComponent(TF_routeNo3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(390, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void BTN_close1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_close1ActionPerformed

        TF_busNo1.setText(null);
        TF_rootNo.setText(null);
        TF_startPlace.setText(null);
        TF_endPlace.setText(null);
        TF_busNo1.grabFocus();
    }//GEN-LAST:event_BTN_close1ActionPerformed

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

    private void BTN_close2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_close2ActionPerformed
        TF_rootNo1.setText(null);
        TF_busNo2.setText(null);
        TF_startTime.setText(null);
        TF_rootNo1.grabFocus();
    }//GEN-LAST:event_BTN_close2ActionPerformed

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

    private void BTN_close3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_close3ActionPerformed
        TF_routeNo3.setText(null);
        TF_stopNo.setText(null);
        TF_place.setText(null);
        TF_areaCode.setText(null);
        TF_routeNo3.grabFocus();
    }//GEN-LAST:event_BTN_close3ActionPerformed

    private void BTN_close1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_close1MouseEntered
       BTN_close1.setBackground(blue);
        BTN_close1.setForeground(pnk);
    }//GEN-LAST:event_BTN_close1MouseEntered

    private void BTN_close2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_close2MouseEntered
        BTN_close2.setBackground(blue);
        BTN_close2.setForeground(white);
    }//GEN-LAST:event_BTN_close2MouseEntered

    private void BTN_close2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_close2MouseExited
       BTN_close2.setBackground(white);
        BTN_close2.setForeground(blue);
    }//GEN-LAST:event_BTN_close2MouseExited

    private void BTN_submit2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_submit2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_submit2MouseClicked

    private void BTN_submit2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_submit2MouseEntered
       BTN_submit2.setBackground(blue);
        BTN_submit2.setForeground(white);
    }//GEN-LAST:event_BTN_submit2MouseEntered

    private void BTN_submit2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_submit2MouseExited
       BTN_submit2.setBackground(white);
        BTN_submit2.setForeground(blue);
    }//GEN-LAST:event_BTN_submit2MouseExited

    private void BTN_submit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_submit1MouseEntered
        BTN_submit1.setBackground(blue);
        BTN_submit1.setForeground(pnk);
    }//GEN-LAST:event_BTN_submit1MouseEntered

    private void BTN_submit1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_submit1MouseExited
        BTN_submit1.setBackground(white);
        BTN_submit1.setForeground(blue);
    }//GEN-LAST:event_BTN_submit1MouseExited

    private void BTN_close1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_close1MouseExited
       BTN_close1.setBackground(pnk);
        BTN_close1.setForeground(blue);
    }//GEN-LAST:event_BTN_close1MouseExited

    private void BTN_close1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_close1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_close1MouseClicked

    private void BTN_close3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_close3MouseEntered
        BTN_close3.setBackground(blue);
        BTN_close3.setForeground(pnk);
    }//GEN-LAST:event_BTN_close3MouseEntered

    private void BTN_close3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_close3MouseExited
        BTN_close3.setBackground(pnk);
        BTN_close3.setForeground(blue);
    }//GEN-LAST:event_BTN_close3MouseExited

    private void BTN_submit3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_submit3MouseEntered
        BTN_submit3.setBackground(blue);
        BTN_submit3.setForeground(pnk);
    }//GEN-LAST:event_BTN_submit3MouseEntered

    private void BTN_submit3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_submit3MouseExited
        BTN_submit3.setBackground(pnk);
        BTN_submit3.setForeground(blue);
    }//GEN-LAST:event_BTN_submit3MouseExited


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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
