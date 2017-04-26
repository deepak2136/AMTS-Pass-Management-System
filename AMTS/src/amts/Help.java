package amts;

import diu.swe.habib.JavaToast.JToast;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;

public class Help extends javax.swing.JInternalFrame {    
    
    private JScrollPane scroll ;
    
    public Help() 
    {
        initComponents();
        tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        this.setResizable(false);        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tree = new javax.swing.JTree();

        setClosable(true);
        setIconifiable(true);
        setTitle("Help Menu");
        setToolTipText("Help");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        tree.setBackground(new java.awt.Color(68, 129, 255));
        tree.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        tree.setForeground(new java.awt.Color(204, 255, 255));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Pass");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Generel pass");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Student Pass");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Seniour pass");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Renew pass");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("route");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("complain");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("admin");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Login Admin");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Pass Admin");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Complain Admin");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Login");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Profile");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Change Password");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Forget Password");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Home Screen");
        treeNode1.add(treeNode2);
        tree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        tree.setDoubleBuffered(true);
        tree.setLargeModel(true);
        tree.setRootVisible(false);
        tree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                treeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(tree);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(857, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void treeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_treeValueChanged
       
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
        
        try
        {
            this.remove(scroll);
        }
        catch( Exception e )
        {
            System.out.println(e);
        }
        
        if( node == null )
        {
            new JToast().makeToast(null, "First Select Any Help Menu", 1, JToast.type_of_notification);
            tree.grabFocus();
            return;
        }
        
        if( node.toString().equalsIgnoreCase("generel pass") )
        {
            ImageIcon icon = new ImageIcon(getClass().getResource("/amts/images/help/general_pass.PNG"));
            scroll = new JScrollPane( new JLabel(icon) ) ;
            this.getContentPane().add(scroll,BorderLayout.EAST);
        }
        
        if( node.toString().equalsIgnoreCase("Seniour pass") )
        {
            ImageIcon icon = new ImageIcon(getClass().getResource("/amts/images/help/senior.PNG"));
            scroll = new JScrollPane( new JLabel(icon) ) ;
            this.getContentPane().add(scroll,BorderLayout.EAST);
        }
        
        if( node.toString().equalsIgnoreCase("Student Pass") )
        {
            ImageIcon icon = new ImageIcon(getClass().getResource("/amts/images/help/student.PNG"));
            scroll = new JScrollPane( new JLabel(icon) ) ;
            this.getContentPane().add(scroll,BorderLayout.EAST);
        }
        
        if( node.toString().equalsIgnoreCase("route") )
        {
            ImageIcon icon = new ImageIcon(getClass().getResource("/amts/images/help/route.PNG"));
            scroll = new JScrollPane( new JLabel(icon) ) ;
            this.getContentPane().add(scroll,BorderLayout.EAST);
        }
        
        if( node.toString().equalsIgnoreCase("Renew pass") )
        {
            ImageIcon icon = new ImageIcon(getClass().getResource("/amts/images/help/Renew_password.PNG"));
            scroll = new JScrollPane( new JLabel(icon) ) ;
            this.getContentPane().add(scroll,BorderLayout.EAST);
        }
        
        if( node.toString().equalsIgnoreCase("complain") )
        {
            ImageIcon icon = new ImageIcon(getClass().getResource("/amts/images/help/complain.PNG"));
            scroll = new JScrollPane( new JLabel(icon) ) ;
            this.getContentPane().add(scroll,BorderLayout.EAST);
        }
        
        if( node.toString().equalsIgnoreCase("Home Screen") )
        {
            ImageIcon icon = new ImageIcon(getClass().getResource("/amts/images/help/home.PNG"));
            scroll = new JScrollPane( new JLabel(icon) ) ;
            this.getContentPane().add(scroll,BorderLayout.EAST);
        }
        
        if( node.toString().equalsIgnoreCase("Login Admin") )
        {
            ImageIcon icon = new ImageIcon(getClass().getResource("/amts/images/help/login_admin.PNG"));
            scroll = new JScrollPane( new JLabel(icon) ) ;
            this.getContentPane().add(scroll,BorderLayout.EAST);
        }
        
        if( node.toString().equalsIgnoreCase("Pass Admin") )
        {
            ImageIcon icon = new ImageIcon(getClass().getResource("/amts/images/help/pass_admin.PNG"));
            scroll = new JScrollPane( new JLabel(icon) ) ;
            this.getContentPane().add(scroll,BorderLayout.EAST);
        }
        
        if( node.toString().equalsIgnoreCase("Profile") )
        {
            ImageIcon icon = new ImageIcon(getClass().getResource("/amts/images/help/profile.PNG"));
            scroll = new JScrollPane( new JLabel(icon) ) ;
            this.getContentPane().add(scroll,BorderLayout.EAST);
        }
        
    }//GEN-LAST:event_treeValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree tree;
    // End of variables declaration//GEN-END:variables
}
