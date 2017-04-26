package amts;

import diu.swe.habib.JavaToast.JToast;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.OK_OPTION;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class login extends javax.swing.JFrame {   

   // private DataBase_Login db = null;
    private Database1 db1;
    private static boolean loginState = false;
    private Home1 h1 = null;
    private Forget_Password fp = null;
    private FileWriter fout = null;
    public static String logid = null;
    private final Color white = new Color(255,255,255);
      private final Color blue = new Color(33,150,243);
    
    public login() {
        super("Login");
        initComponents();
        try{ UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");}catch(ClassNotFoundException | 
                InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e){ System.out.println(
                e.getMessage());  }
        
        loginState = false;
        //db = new DataBase_Login();
        db1 = new Database1();
        h1 = new Home1();

        try
        {
            fout = new FileWriter("Setting.txt");            
        }
        catch(Exception e )
        {
            System.out.println( e.getMessage() );
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        LBL_userID = new javax.swing.JLabel();
        TF_loginID = new javax.swing.JTextField();
        LBL_password = new javax.swing.JLabel();
        BTN_signIN = new javax.swing.JButton();
        BTN_cancel = new javax.swing.JButton();
        LBL_forgetpassword = new javax.swing.JLabel();
        PF_password = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        LBL_loginTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("FRM_login"); // NOI18N
        setResizable(false);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel6KeyPressed(evt);
            }
        });

        LBL_userID.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        LBL_userID.setForeground(new java.awt.Color(255, 64, 129));
        LBL_userID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amts/images/ic_perm_identity_black_18dp_2x.png"))); // NOI18N
        LBL_userID.setText("  User id  :");

        TF_loginID.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        TF_loginID.setToolTipText("Enter your user_id ...");
        TF_loginID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 138, 255)));
        TF_loginID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TF_loginID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_loginIDActionPerformed(evt);
            }
        });
        TF_loginID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_loginIDKeyPressed(evt);
            }
        });

        LBL_password.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        LBL_password.setForeground(new java.awt.Color(255, 64, 129));
        LBL_password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amts/images/ic_lock_outline_black_18dp_2x.png"))); // NOI18N
        LBL_password.setText("  Password :");

        BTN_signIN.setBackground(new java.awt.Color(255, 255, 255));
        BTN_signIN.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        BTN_signIN.setForeground(new java.awt.Color(0, 153, 153));
        BTN_signIN.setText("Sign in");
        BTN_signIN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_signIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_signINMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_signINMouseExited(evt);
            }
        });
        BTN_signIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_signINActionPerformed(evt);
            }
        });
        BTN_signIN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BTN_signINKeyPressed(evt);
            }
        });

        BTN_cancel.setBackground(new java.awt.Color(255, 255, 255));
        BTN_cancel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        BTN_cancel.setForeground(new java.awt.Color(0, 153, 153));
        BTN_cancel.setText("Cancel");
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

        LBL_forgetpassword.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LBL_forgetpassword.setForeground(new java.awt.Color(51, 204, 0));
        LBL_forgetpassword.setText("Forget password??");
        LBL_forgetpassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LBL_forgetpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBL_forgetpasswordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LBL_forgetpasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LBL_forgetpasswordMouseExited(evt);
            }
        });

        PF_password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PF_password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 138, 255)));
        PF_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PF_passwordKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(33, 150, 243));

        LBL_loginTitle.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        LBL_loginTitle.setForeground(new java.awt.Color(255, 255, 255));
        LBL_loginTitle.setText("Login ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LBL_loginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LBL_loginTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBL_password)
                    .addComponent(LBL_userID))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 38, Short.MAX_VALUE)
                        .addComponent(BTN_signIN)
                        .addGap(18, 18, 18)
                        .addComponent(BTN_cancel)
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TF_loginID, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PF_password, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LBL_forgetpassword))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBL_userID)
                            .addComponent(TF_loginID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LBL_password)
                        .addComponent(PF_password, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LBL_forgetpassword)
                .addGap(13, 13, 13)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_cancel)
                    .addComponent(BTN_signIN))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LBL_forgetpasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBL_forgetpasswordMouseClicked
        fp = new Forget_Password();
        fp.setVisible(true);      
        Dimension fSize = Toolkit.getDefaultToolkit().getScreenSize();
        fp.setLocation((int)(fSize.getWidth()-fp.getWidth())/2, (int)(fSize.getHeight()-fp.getHeight())/2);
        fp.setResizable(false);
    }//GEN-LAST:event_LBL_forgetpasswordMouseClicked

    private void BTN_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_cancelActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_BTN_cancelActionPerformed

    private void BTN_signINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_signINActionPerformed
      
     try
     {
        Dimension fSize = Toolkit.getDefaultToolkit().getScreenSize();
        
        if( TF_loginID.getText().length()<1 )
        {
            TF_loginID.setText(null);
            JOptionPane.showMessageDialog(null,"Enter Valid Login ID","Login ID",OK_OPTION);
            TF_loginID.grabFocus();
            return;
        }
        
        if( PF_password.getPassword().length < 1 )
        {
            PF_password.setText(null);
            JOptionPane.showMessageDialog(null,"Enter Valid Password","Password",OK_OPTION);
            PF_password.grabFocus();
            return;
        }
       
        String spw = db1.getValue("password", "login", "login_id", TF_loginID.getText());
       
        if( spw.isEmpty() )
        {
            TF_loginID.setText(null);
            TF_loginID.grabFocus();
            return;
        }
        
        if( (db1.getValue("status", "login", "login_id", TF_loginID.getText())).equalsIgnoreCase("ac") )
        {
            if( spw.equals(new String( PF_password.getPassword()) ))
            {
                //JOptionPane.showMessageDialog(null,"Login Succesfully", "Login", OK_OPTION);
                new JToast().makeToast(fp, " Login Succesfully", 1, JToast.type_of_succes);
                Home1.state=true;
                Home1.loginID = TF_loginID.getText();
                loginState = true;
                login.logid = TF_loginID.getText();
                
                try
                {
                    if( db1.getValue("type", "login", "login_id", TF_loginID.getText()).equalsIgnoreCase("admin") )
                        Home1.admin_state = true;
                    else
                        Home1.admin_state = false;
                }
                catch( Exception e )
                {
                    Home1.admin_state = false;
                }                
                            
                try
                {
                    fout.write(TF_loginID.getText());
                    fout.close();
                }
                catch( Exception e )
                {
                    System.out.println(e.getMessage());
                }
                 
                TF_loginID.setText(null);
                PF_password.setText(null);
                
                TF_loginID.setEnabled(false);
                PF_password.setEditable(false);                
                
                this.dispose();
                
                System.out.println("hey");
                 h1 = new Home1();  
                 
                 h1.setVisible(true); 
            }
            else
            {
                //JOptionPane.showMessageDialog(null,"Enter Proper Password", "Login", OK_OPTION);
                new JToast().makeToast(fp, " Invalid Password", 1, JToast.type_of_notification);
                PF_password.setText(null);
                PF_password.grabFocus();
            }
        }
        else
        {
            new JToast().makeToast(fp, " Your Account Is Deactive now", 1, JToast.type_of_notification);
            return;
        }
     }
     catch( Exception e )
     {
         System.out.println(e);
         new JToast().makeToast(this, "  Enter valid Details ", 2, JToast.type_of_error);
         TF_loginID.setText(null);
         PF_password.setText(null);
         TF_loginID.grabFocus();
     }
       
    }//GEN-LAST:event_BTN_signINActionPerformed

    private void jPanel6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel6KeyPressed
       if( evt.getKeyCode() == 13 || evt.getKeyChar()=='\n')
       {
           this.BTN_signINActionPerformed(null);
        }
    }//GEN-LAST:event_jPanel6KeyPressed

    private void TF_loginIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_loginIDActionPerformed

    }//GEN-LAST:event_TF_loginIDActionPerformed

    private void TF_loginIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_loginIDKeyPressed
       if( evt.getKeyCode() == 13 || evt.getKeyChar()=='\n')
       {
           this.BTN_signINActionPerformed(null);
        }
    }//GEN-LAST:event_TF_loginIDKeyPressed

    private void LBL_forgetpasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBL_forgetpasswordMouseEntered
       LBL_forgetpassword.setForeground(new Color(255,64,129));
    }//GEN-LAST:event_LBL_forgetpasswordMouseEntered

    private void LBL_forgetpasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBL_forgetpasswordMouseExited
        LBL_forgetpassword.setForeground(new Color(51,204,0));
    }//GEN-LAST:event_LBL_forgetpasswordMouseExited

    private void BTN_signINKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BTN_signINKeyPressed
        if( evt.getKeyCode() == 13 || evt.getKeyChar()=='\n')
        {
           this.BTN_signINActionPerformed(null);
        }
    }//GEN-LAST:event_BTN_signINKeyPressed

    private void PF_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PF_passwordKeyPressed
        if( evt.getKeyCode() == 13 || evt.getKeyChar()=='\n')
        {
           this.BTN_signINActionPerformed(null);
        }
    }//GEN-LAST:event_PF_passwordKeyPressed

    private void BTN_signINMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_signINMouseEntered
        BTN_signIN.setBackground(blue);
        BTN_signIN.setForeground(white);
    }//GEN-LAST:event_BTN_signINMouseEntered

    private void BTN_cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_cancelMouseEntered
       BTN_cancel.setBackground(blue);
       BTN_cancel.setForeground(white);
    }//GEN-LAST:event_BTN_cancelMouseEntered

    private void BTN_signINMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_signINMouseExited
       BTN_signIN.setBackground(white);
        BTN_signIN.setForeground(blue);
    }//GEN-LAST:event_BTN_signINMouseExited

    private void BTN_cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_cancelMouseExited
        BTN_cancel.setBackground(white);
       BTN_cancel.setForeground(blue);
    }//GEN-LAST:event_BTN_cancelMouseExited
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_cancel;
    private javax.swing.JButton BTN_signIN;
    private javax.swing.JLabel LBL_forgetpassword;
    private javax.swing.JLabel LBL_loginTitle;
    private javax.swing.JLabel LBL_password;
    private javax.swing.JLabel LBL_userID;
    private javax.swing.JPasswordField PF_password;
    private javax.swing.JTextField TF_loginID;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
