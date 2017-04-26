package amts;

import diu.swe.habib.JavaToast.JToast;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class AnsComplain extends javax.swing.JInternalFrame {

    private Object[][] data;
    private Database1 db1 ;
    private final String[] cols = { "complain_no","complainer_name","date","question" };
    private final String[] cols1 = { "complain_no","complainer_name","date","question","answers" };
    private final Color white = new Color(255,255,255);
    private final Color blu= new Color(0,102,153);
    
    public AnsComplain()
    {
        initComponents();
        db1 = new Database1();
        loadData();
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.add(pop);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pop = new javax.swing.JPopupMenu();
        PMI_ans = new javax.swing.JMenuItem();
        PMI_que = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        BTN_history = new javax.swing.JToggleButton();
        BTN_refresh = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        PMI_ans.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        PMI_ans.setText("Give Answer");
        PMI_ans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PMI_ansActionPerformed(evt);
            }
        });
        pop.add(PMI_ans);

        PMI_que.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        PMI_que.setText("Show Full Question");
        PMI_que.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PMI_queActionPerformed(evt);
            }
        });
        pop.add(PMI_que);

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setIconifiable(true);
        setTitle("Complain");

        table.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        table.setRowHeight(28);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel1.setBackground(new java.awt.Color(68, 129, 255));

        BTN_history.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BTN_history.setForeground(new java.awt.Color(255, 255, 255));
        BTN_history.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amts/images/ic_history_white_36dp_2x.png"))); // NOI18N
        BTN_history.setToolTipText("History");
        BTN_history.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        BTN_history.setBorderPainted(false);
        BTN_history.setComponentPopupMenu(pop);
        BTN_history.setContentAreaFilled(false);
        BTN_history.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_history.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_historyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_historyMouseExited(evt);
            }
        });
        BTN_history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_historyActionPerformed(evt);
            }
        });

        BTN_refresh.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BTN_refresh.setForeground(new java.awt.Color(255, 255, 255));
        BTN_refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amts/images/ic_refresh_white_36dp_2x.png"))); // NOI18N
        BTN_refresh.setToolTipText("Refresh");
        BTN_refresh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        BTN_refresh.setBorderPainted(false);
        BTN_refresh.setComponentPopupMenu(pop);
        BTN_refresh.setContentAreaFilled(false);
        BTN_refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_refreshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_refreshMouseExited(evt);
            }
        });
        BTN_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_refreshActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Complain");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTN_history, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTN_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BTN_refresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BTN_history, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_refreshActionPerformed
        loadData();
    }//GEN-LAST:event_BTN_refreshActionPerformed

    private void BTN_historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_historyActionPerformed
        loadData1();
    }//GEN-LAST:event_BTN_historyActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        
        int raw = table.getSelectedRow();
        int col = table.getSelectedColumn();
        String cmp = (String) table.getValueAt(raw, col);
        
        if( evt.getClickCount() == 2 )
        {
            String val = JOptionPane.showInputDialog(null, "Enter answer for complain", "Complain", JOptionPane.OK_CANCEL_OPTION); 
            if( val == null || val.isEmpty() )
            {
                if( db1.updateData("complain", "answers", val, "complain_no", cmp) )
                {
                    new JToast().makeToast(null, "Successfully Updated", 1, JToast.type_of_notification);
                    String mail = db1.getValue("email", "complain", "complain_no", cmp);
                    try {
                        new SendMail(mail,"Solution","val");
                    } catch (MessagingException ex) {
                        Logger.getLogger(AnsComplain.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    loadData();
                }
                else
                {
                    new JToast().makeToast(null, "Can't Successfully Updated", 1, JToast.type_of_notification);
                    loadData();
                }
            }
        }
        
        
        if( evt.getButton() == MouseEvent.BUTTON3 )
        {
            pop.show(table, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tableMouseClicked

    private void PMI_queActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PMI_queActionPerformed
       
        if( table.getSelectedRowCount() < 1 )
        {
            new JToast().makeToast(null, " Please Select any record first", 1, JToast.type_of_info);
            table.grabFocus();
            return;
        }
        
        int raw = table.getSelectedRow();
        String val = (String) table.getValueAt(raw, 3);
        
        JOptionPane.showMessageDialog(null, val, "Question", JOptionPane.PLAIN_MESSAGE);
        
    }//GEN-LAST:event_PMI_queActionPerformed

    private void PMI_ansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PMI_ansActionPerformed
       
        int raw = table.getSelectedRow();
        int col = table.getSelectedColumn();
        String cmp = (String) table.getValueAt(raw, 0);
        
        String val = JOptionPane.showInputDialog(null, "Enter answer for complain", "Complain", JOptionPane.OK_CANCEL_OPTION);
        System.out.println(val);
        
        try {
            db1.doComit();
            db1.setAutoComit(false);
        } catch (SQLException ex) {
            Logger.getLogger(AnsComplain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            if( val != null || !val.isEmpty() )
            {
                System.out.println();
                if( db1.updateData("complain", "answers", val, "complain_no", cmp) )
                {
                    System.out.println(val);
                    new JToast().makeToast(null, "Successfully Updated", 1, JToast.type_of_notification);
                    
                    try {
                        db1.doComit();
                        db1.setAutoComit(true);
                    } catch (SQLException ex) {
                        Logger.getLogger(AnsComplain.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    String mail = db1.getValue("email", "complain", "complain_no", cmp);
                    try {
                        new SendMail(mail,"Solution","val");
                    } catch (MessagingException ex) {
                        Logger.getLogger(AnsComplain.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    loadData();
                }
                else
                {
                    new JToast().makeToast(null, "Can't Successfully Updated", 1, JToast.type_of_notification);
                    
                    try {
                        db1.doRollback();
                        db1.setAutoComit(true);
                    } catch (SQLException ex) {
                        Logger.getLogger(AnsComplain.class.getName()).log(Level.SEVERE, null, ex);
                    }                
                    
                    loadData();
                }
            }
            else
            {
                new JToast().makeToast(null, "Please give valid Input as asnswer", 1, JToast.type_of_notification);
                loadData();
            }
    }//GEN-LAST:event_PMI_ansActionPerformed

    private void BTN_historyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_historyMouseExited
            BTN_history.setBackground(blu);
            BTN_history.setForeground(white);
    }//GEN-LAST:event_BTN_historyMouseExited

    private void BTN_historyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_historyMouseEntered
 
        BTN_history.setBackground(white);
        BTN_history.setForeground(blu);  
    }//GEN-LAST:event_BTN_historyMouseEntered

    private void BTN_refreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_refreshMouseEntered
            BTN_refresh.setBackground(white);
            BTN_refresh.setForeground(blu);
    }//GEN-LAST:event_BTN_refreshMouseEntered

    private void BTN_refreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_refreshMouseExited
             BTN_refresh.setBackground(blu);
            BTN_refresh.setForeground(white);
    }//GEN-LAST:event_BTN_refreshMouseExited

    class SendMail
    {
        private String USER = "darshanpattelb.26@gmail.com";
        private String PASS = "darshan.patel";
        
        SendMail(String to,String sub,String msg) throws MessagingException
        {
            Properties prop = new Properties();
            prop.put("mail.smtp.ssl.trust","smtp.gmail.com");
            prop.put("mail.smtp.auth",true);
            prop.put("mail.smtp.starttls.enable", true);
            prop.put("mail.smtp.host", "smtp.gmail.com");
            prop.put("mail.smtp.port", "587");
            
            Session s1 = Session.getInstance(prop,new javax.mail.Authenticator(){
            
                protected javax.mail.PasswordAuthentication getPasswordAuthentication()
                {
                    return new javax.mail.PasswordAuthentication(USER, PASS);
                }                
            });
            
            try
            {
                Message m1 = new MimeMessage(s1);
                m1.setFrom(new InternetAddress("darshanpattelb.26@gmail.com"));
                m1.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(to, false));
                m1.setSubject(sub);
                m1.setText(msg);
                
                Transport.send(m1);
            }
            catch(Exception e)
            {
                
            }
        
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BTN_history;
    private javax.swing.JToggleButton BTN_refresh;
    private javax.swing.JMenuItem PMI_ans;
    private javax.swing.JMenuItem PMI_que;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu pop;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    private void loadData() 
    {
       try
       {
            data = db1.getData(cols, "complain", "answers", "no");
            System.out.println(data.length + "    " + data[0].length);
            table.setModel(new DefaultTableModel(data,cols));
       }
       catch(NullPointerException e1)
       {
           System.out.println(e1);
       }
       catch( Exception e )
       {
           System.out.println(e);
       }
    }
    
    private void loadData1() 
    {
       try
       {
            data = db1.getData(cols1, "complain", "", "");
            System.out.println(data.length + "    " + data[0].length);
            table.setModel(new DefaultTableModel(data,cols));
       }
       catch(NullPointerException e1)
       {
           System.out.println(e1);
       }
       catch( Exception e )
       {
           System.out.println(e);
       }
    }
}
