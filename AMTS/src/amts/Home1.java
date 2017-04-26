package amts;

import diu.swe.habib.JavaToast.JToast;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;


public class Home1 extends javax.swing.JFrame implements Runnable{

    private JDesktopPane myPane = null;
    public static boolean state = false;
    public static boolean admin_state = false;
    private DataBase_Login db = null;
    private Database1 db1 ;
    private Calendar cl ;
    public static login log = null;
    public static String loginID = null;
    private Thread t1;
    private Thread t2;
    private int pic = 1;
    private student_pass stp;
    private Dimension fSize;
    private general_pass gp;
    private Renew rn;
    private complain c;
    private login l1 = null;
    private final Color blu = new Color(0,204,255);
    private final Color green = new Color(102,204,0);    
    private final Color orange= new Color(255,153,0);
    private final Color black= new Color(0,0,0);
    private final Color red= new Color(255,0,51);
    
    public Home1() {
        super("Home");
        initComponents();
        
        initgui();
        fSize = Toolkit.getDefaultToolkit().getScreenSize();
        db = new DataBase_Login();
        db1 = new Database1();
        jPanel1.setBackground(new Color(186,236,251));
        t1 = new Thread(this,"t1");
        t1.start();
        t2 = new Thread(this,"pic");
        t2.start();
        jPanel1.setBackground(new Color(0,0,0));
        checkAdmin();
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BTN_renew = new javax.swing.JButton();
        BTN_general = new javax.swing.JButton();
        BTN_senior = new javax.swing.JButton();
        BTN_student = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        BTN_route = new javax.swing.JButton();
        BTN_profile = new javax.swing.JButton();
        BTN_complain = new javax.swing.JButton();
        BTN_aboutus = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        BTN_loginadmin = new javax.swing.JButton();
        BTN_pass_admin = new javax.swing.JButton();
        BTN_help = new javax.swing.JButton();
        BTN_complain_admin = new javax.swing.JButton();
        BTN_signout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AMTS pass Registration System");
        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(1404, 755));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amts/images/home/1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1281, 279));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 0), 2), "Pass ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24), new java.awt.Color(51, 204, 0))); // NOI18N

        BTN_renew.setBackground(new java.awt.Color(0, 0, 0));
        BTN_renew.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        BTN_renew.setForeground(new java.awt.Color(102, 204, 0));
        BTN_renew.setText("Renew Pass");
        BTN_renew.setToolTipText("Click to re-new Pass");
        BTN_renew.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 0), 2));
        BTN_renew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_renew.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BTN_renewFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BTN_renewFocusLost(evt);
            }
        });
        BTN_renew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_renewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_renewMouseExited(evt);
            }
        });
        BTN_renew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_renewActionPerformed(evt);
            }
        });

        BTN_general.setBackground(new java.awt.Color(0, 0, 0));
        BTN_general.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        BTN_general.setForeground(new java.awt.Color(102, 204, 0));
        BTN_general.setText("General Pass");
        BTN_general.setToolTipText("Click to create new General pass");
        BTN_general.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 0), 2));
        BTN_general.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_general.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BTN_generalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BTN_generalFocusLost(evt);
            }
        });
        BTN_general.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_generalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_generalMouseExited(evt);
            }
        });
        BTN_general.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_generalActionPerformed(evt);
            }
        });

        BTN_senior.setBackground(new java.awt.Color(0, 0, 0));
        BTN_senior.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        BTN_senior.setForeground(new java.awt.Color(102, 204, 0));
        BTN_senior.setText("Senior Citizen Pass");
        BTN_senior.setToolTipText("Click to create new Senior Citizen pass pass");
        BTN_senior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 0), 2));
        BTN_senior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_senior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_seniorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_seniorMouseExited(evt);
            }
        });
        BTN_senior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_seniorActionPerformed(evt);
            }
        });

        BTN_student.setBackground(new java.awt.Color(0, 0, 0));
        BTN_student.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        BTN_student.setForeground(new java.awt.Color(102, 204, 0));
        BTN_student.setText("Student Pass");
        BTN_student.setToolTipText("Click to create new Student pass");
        BTN_student.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 0), 2));
        BTN_student.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_studentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_studentMouseExited(evt);
            }
        });
        BTN_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_studentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTN_renew, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTN_general, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTN_senior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTN_student, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(BTN_general, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTN_senior, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTN_student, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTN_renew, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, 329));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255), 2), "Others", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24), new java.awt.Color(0, 204, 255))); // NOI18N

        BTN_route.setBackground(new java.awt.Color(0, 0, 0));
        BTN_route.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        BTN_route.setForeground(new java.awt.Color(0, 204, 255));
        BTN_route.setText("Route Finder");
        BTN_route.setToolTipText("Click to find routes by placename , pincode,Busnumber and also enter new ROutes /bus schedules..");
        BTN_route.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        BTN_route.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_route.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_routeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_routeMouseExited(evt);
            }
        });
        BTN_route.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_routeActionPerformed(evt);
            }
        });

        BTN_profile.setBackground(new java.awt.Color(0, 0, 0));
        BTN_profile.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        BTN_profile.setForeground(new java.awt.Color(0, 204, 255));
        BTN_profile.setText("Profile");
        BTN_profile.setToolTipText("click to check yoiur profile");
        BTN_profile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        BTN_profile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_profileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_profileMouseExited(evt);
            }
        });
        BTN_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_profileActionPerformed(evt);
            }
        });

        BTN_complain.setBackground(new java.awt.Color(0, 0, 0));
        BTN_complain.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        BTN_complain.setForeground(new java.awt.Color(0, 204, 255));
        BTN_complain.setText("Complain");
        BTN_complain.setToolTipText("click here for complain");
        BTN_complain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        BTN_complain.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_complain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_complainMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_complainMouseExited(evt);
            }
        });
        BTN_complain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_complainActionPerformed(evt);
            }
        });

        BTN_aboutus.setBackground(new java.awt.Color(0, 0, 0));
        BTN_aboutus.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        BTN_aboutus.setForeground(new java.awt.Color(0, 204, 255));
        BTN_aboutus.setText("About us");
        BTN_aboutus.setToolTipText("Click to check Info of Devloper");
        BTN_aboutus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        BTN_aboutus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_aboutus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_aboutusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_aboutusMouseExited(evt);
            }
        });
        BTN_aboutus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_aboutusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_aboutus, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_route, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_complain, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTN_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTN_route, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTN_complain, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTN_aboutus, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2), "Admin", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24), new java.awt.Color(255, 153, 0))); // NOI18N

        BTN_loginadmin.setBackground(new java.awt.Color(0, 0, 0));
        BTN_loginadmin.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        BTN_loginadmin.setForeground(new java.awt.Color(255, 153, 0));
        BTN_loginadmin.setText("Login Admin");
        BTN_loginadmin.setToolTipText("Only use for admin");
        BTN_loginadmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        BTN_loginadmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_loginadmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_loginadminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_loginadminMouseExited(evt);
            }
        });
        BTN_loginadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_loginadminActionPerformed(evt);
            }
        });

        BTN_pass_admin.setBackground(new java.awt.Color(0, 0, 0));
        BTN_pass_admin.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        BTN_pass_admin.setForeground(new java.awt.Color(255, 153, 0));
        BTN_pass_admin.setText("Pass Admin");
        BTN_pass_admin.setToolTipText("click here for Update / Delete Created pass Information");
        BTN_pass_admin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        BTN_pass_admin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_pass_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_pass_adminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_pass_adminMouseExited(evt);
            }
        });
        BTN_pass_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_pass_adminActionPerformed(evt);
            }
        });

        BTN_help.setBackground(new java.awt.Color(0, 0, 0));
        BTN_help.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        BTN_help.setForeground(new java.awt.Color(255, 153, 0));
        BTN_help.setText("Help");
        BTN_help.setToolTipText("click here for getting help");
        BTN_help.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        BTN_help.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_helpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_helpMouseExited(evt);
            }
        });
        BTN_help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_helpActionPerformed(evt);
            }
        });

        BTN_complain_admin.setBackground(new java.awt.Color(0, 0, 0));
        BTN_complain_admin.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        BTN_complain_admin.setForeground(new java.awt.Color(255, 153, 0));
        BTN_complain_admin.setText("Complain Ans");
        BTN_complain_admin.setToolTipText("click here for Complains answer");
        BTN_complain_admin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        BTN_complain_admin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_complain_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_complain_adminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_complain_adminMouseExited(evt);
            }
        });
        BTN_complain_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_complain_adminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BTN_pass_admin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTN_loginadmin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTN_help, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTN_complain_admin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(BTN_loginadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTN_pass_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTN_complain_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTN_help, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 320, -1, -1));

        BTN_signout.setBackground(new java.awt.Color(0, 0, 0));
        BTN_signout.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_signout.setForeground(new java.awt.Color(255, 0, 51));
        BTN_signout.setText("Sign out");
        BTN_signout.setToolTipText("Signout  from application");
        BTN_signout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        BTN_signout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_signout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_signoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_signoutMouseExited(evt);
            }
        });
        BTN_signout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_signoutActionPerformed(evt);
            }
        });
        jPanel1.add(BTN_signout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 290, 118, 34));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        desktop.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );

        setSize(new java.awt.Dimension(1300, 744));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //JOptionPane.showMessageDialog(null,"Thanks for use our application","MY APP",OK_OPTION); 
        new JToast().makeToast(null, "Thanks for use our application", 1, JToast.type_of_notification);
        state = false;
        admin_state = false;     
        Home1.loginID = null;
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
       
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved

    }//GEN-LAST:event_jPanel1MouseMoved

    private void BTN_helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_helpActionPerformed

        Help h1 = new Help();
        desktop.add(h1);
        h1.setLocation((int) ((fSize.getWidth()-h1.getWidth())/2), (int)((fSize.getHeight()-h1.getHeight())/2 -10));
        h1.setVisible(true);h1.toFront();
       
    }//GEN-LAST:event_BTN_helpActionPerformed

    private void BTN_helpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_helpMouseExited
      BTN_help.setBackground(black);
       BTN_help.setForeground(orange);
    }//GEN-LAST:event_BTN_helpMouseExited

    private void BTN_helpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_helpMouseEntered
       BTN_help.setBackground(orange);
       BTN_help.setForeground(black);
    }//GEN-LAST:event_BTN_helpMouseEntered

    private void BTN_pass_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_pass_adminActionPerformed
        AdminPass ap = new AdminPass();
        desktop.add(ap);
        ap.grabFocus();
        ap.setVisible(true);
        ap.toFront();
        ap.setLocation((int)((fSize.getWidth()-ap.getWidth())/2), (int)((fSize.getHeight()-ap.getHeight())/2-10));
    }//GEN-LAST:event_BTN_pass_adminActionPerformed

    private void BTN_pass_adminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_pass_adminMouseExited
         BTN_pass_admin.setBackground(black);
         BTN_pass_admin.setForeground(orange);
    }//GEN-LAST:event_BTN_pass_adminMouseExited

    private void BTN_pass_adminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_pass_adminMouseEntered
        BTN_pass_admin.setBackground(orange);
        BTN_pass_admin.setForeground(black);
    }//GEN-LAST:event_BTN_pass_adminMouseEntered

    private void BTN_loginadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_loginadminActionPerformed
        LoginALL la = new LoginALL();
        desktop.add(la);
        la.pack();
        la.setVisible(true);
        la.setResizable(false);
        la.setFocusable(true);
        la.grabFocus();
        la.toFront();
        la.setLocation((int)((fSize.getWidth()-la.getWidth())/2), (int)((fSize.getHeight()-la.getHeight())/2));
    }//GEN-LAST:event_BTN_loginadminActionPerformed

    private void BTN_loginadminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_loginadminMouseExited
       BTN_loginadmin.setBackground(black);
       BTN_loginadmin.setForeground(orange);
    }//GEN-LAST:event_BTN_loginadminMouseExited

    private void BTN_loginadminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_loginadminMouseEntered
       BTN_loginadmin.setBackground(orange);
       BTN_loginadmin.setForeground(black);
    }//GEN-LAST:event_BTN_loginadminMouseEntered

    private void BTN_complainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_complainActionPerformed
        c = new complain();
        desktop.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_BTN_complainActionPerformed

    private void BTN_complainMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_complainMouseExited
       BTN_complain.setBackground(black);
       BTN_complain.setForeground(blu);
    }//GEN-LAST:event_BTN_complainMouseExited

    private void BTN_complainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_complainMouseEntered
     BTN_complain.setBackground(blu);
       BTN_complain.setForeground(black);
    }//GEN-LAST:event_BTN_complainMouseEntered

    private void BTN_profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_profileActionPerformed
        LoginForm lf = new LoginForm();
       lf.setVisible(true);
       desktop.add(lf);
       lf.grabFocus();
       lf.toFront();
       lf.setLocation((int)(fSize.getWidth()-lf.getWidth())/2, (int)(fSize.getHeight()-lf.getHeight())/2);
       lf.setResizable(false);
    }//GEN-LAST:event_BTN_profileActionPerformed

    private void BTN_profileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_profileMouseExited
       BTN_profile.setBackground(black);
       BTN_profile.setForeground(blu);
    }//GEN-LAST:event_BTN_profileMouseExited

    private void BTN_profileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_profileMouseEntered
       BTN_profile.setBackground(blu);
       BTN_profile.setForeground(black);
    }//GEN-LAST:event_BTN_profileMouseEntered

    private void BTN_routeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_routeActionPerformed
        RootMaster rm = new RootMaster();
        desktop.add(rm);
        rm.setVisible(true);
        rm.setLocation((int)(fSize.getWidth()-rm.getWidth())/2, (int)(fSize.getHeight()-rm.getHeight())/2-10);
        rm.toFront();
        rm.setResizable(true);
    }//GEN-LAST:event_BTN_routeActionPerformed

    private void BTN_routeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_routeMouseExited
         BTN_route.setBackground(black);
         BTN_route.setForeground(blu);
    }//GEN-LAST:event_BTN_routeMouseExited

    private void BTN_routeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_routeMouseEntered
       BTN_route.setBackground(blu);
       BTN_route.setForeground(black);
    }//GEN-LAST:event_BTN_routeMouseEntered

    private void BTN_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_studentActionPerformed
        student_pass sp = new student_pass();
        desktop.add(sp);
        sp.setVisible(true);
        sp.toFront();
        sp.setLocation((int)((fSize.getWidth()-sp.getWidth())/2), (int)((fSize.getHeight()-sp.getHeight())/2-10));
    }//GEN-LAST:event_BTN_studentActionPerformed

    private void BTN_studentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_studentMouseExited
       BTN_student.setBackground(black);
       BTN_student.setForeground(green);
    }//GEN-LAST:event_BTN_studentMouseExited

    private void BTN_studentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_studentMouseEntered
           BTN_student.setBackground(green);
           BTN_student.setForeground(black);
    }//GEN-LAST:event_BTN_studentMouseEntered

    private void BTN_seniorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_seniorActionPerformed
        senior_pass sp = new senior_pass();
        desktop.add(sp);
        sp.setVisible(true);
        sp.toFront();
        sp.setLocation((int)((fSize.getWidth()-sp.getWidth())/2), (int)((fSize.getHeight()-sp.getHeight())/2-10));
    }//GEN-LAST:event_BTN_seniorActionPerformed

    private void BTN_seniorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_seniorMouseExited
       BTN_senior.setBackground(black);
       BTN_senior.setForeground(green);
    }//GEN-LAST:event_BTN_seniorMouseExited

    private void BTN_seniorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_seniorMouseEntered
       BTN_senior.setBackground(green);
       BTN_senior.setForeground(black); 
    }//GEN-LAST:event_BTN_seniorMouseEntered

    private void BTN_generalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_generalActionPerformed
        gp = new general_pass();
        desktop.add(gp);
        gp.setVisible(true);
        gp.toFront();
        gp.setLocation((int)((this.getWidth()-gp.getWidth())/2), (int)((this.getHeight()-gp.getHeight())/2));
    }//GEN-LAST:event_BTN_generalActionPerformed

    private void BTN_generalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_generalMouseExited
       BTN_general.setBackground(black);
       BTN_general.setForeground(green);
    }//GEN-LAST:event_BTN_generalMouseExited

    private void BTN_generalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_generalMouseEntered
       BTN_general.setBackground(green);
       BTN_general.setForeground(black);
    }//GEN-LAST:event_BTN_generalMouseEntered

    private void BTN_generalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BTN_generalFocusLost

    }//GEN-LAST:event_BTN_generalFocusLost

    private void BTN_generalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BTN_generalFocusGained

    }//GEN-LAST:event_BTN_generalFocusGained

    private void BTN_renewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_renewActionPerformed
        rn = new Renew();
        desktop.add(rn);
        rn.setVisible(true);
        rn.toFront();
        rn.setLocation((int)((fSize.getWidth()-rn.getWidth())/2), (int)((fSize.getHeight()-rn.getHeight())/2-10));
    }//GEN-LAST:event_BTN_renewActionPerformed

    private void BTN_renewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_renewMouseExited
        BTN_renew.setBackground(black);
       BTN_renew.setForeground(green);
    }//GEN-LAST:event_BTN_renewMouseExited

    private void BTN_renewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_renewMouseEntered
        BTN_renew.setBackground(green);
       BTN_renew.setForeground(black);
    }//GEN-LAST:event_BTN_renewMouseEntered

    private void BTN_renewFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BTN_renewFocusLost

    }//GEN-LAST:event_BTN_renewFocusLost

    private void BTN_renewFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BTN_renewFocusGained

    }//GEN-LAST:event_BTN_renewFocusGained

    private void BTN_complain_adminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_complain_adminMouseEntered
        BTN_complain_admin.setBackground(orange);
       BTN_complain_admin.setForeground(black);
    }//GEN-LAST:event_BTN_complain_adminMouseEntered

    private void BTN_complain_adminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_complain_adminMouseExited
          BTN_complain_admin.setBackground(black);
         BTN_complain_admin.setForeground(orange);
    }//GEN-LAST:event_BTN_complain_adminMouseExited

    private void BTN_complain_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_complain_adminActionPerformed
        AnsComplain acp = new AnsComplain();
        desktop.add(acp);
        acp.setVisible(true);
        acp.toFront();
        acp.setLocation((int)(fSize.getWidth()-acp.getWidth())/2, (int)(fSize.getHeight()-acp.getHeight())/2  );
        acp.setResizable(false);
    }//GEN-LAST:event_BTN_complain_adminActionPerformed

    private void BTN_aboutusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_aboutusActionPerformed
        aboutus abs = new aboutus();
        desktop.add(abs);
        abs.setVisible(true);
        abs.toFront();
        abs.setLocation((int) ((fSize.getWidth()-abs.getWidth()))/2, (int) ((fSize.getHeight()-abs.getHeight())/2));
    }//GEN-LAST:event_BTN_aboutusActionPerformed

    private void BTN_aboutusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_aboutusMouseEntered
         BTN_aboutus.setBackground(blu);
         BTN_aboutus.setForeground(black);
    }//GEN-LAST:event_BTN_aboutusMouseEntered

    private void BTN_aboutusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_aboutusMouseExited
       BTN_aboutus.setBackground(black);
       BTN_aboutus.setForeground(blu);
    }//GEN-LAST:event_BTN_aboutusMouseExited

    private void BTN_signoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_signoutActionPerformed
       this.setVisible(false);
        login.logid = null;
        l1 = new login();
        l1.setVisible(true);
        l1.pack();
        l1.toFront();
        Dimension fSize1 = Toolkit.getDefaultToolkit().getScreenSize();
        l1.setLocation((int)(fSize1.getWidth()-l1.getWidth())/2, (int)(fSize1.getHeight()-l1.getHeight())/2  );
        l1.setResizable(false);
    }//GEN-LAST:event_BTN_signoutActionPerformed

    private void BTN_signoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_signoutMouseEntered
      BTN_signout.setBackground(red);
       BTN_signout.setForeground(black);
    }//GEN-LAST:event_BTN_signoutMouseEntered

    private void BTN_signoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_signoutMouseExited
      BTN_signout.setBackground(black);
      BTN_signout.setForeground(red);
    }//GEN-LAST:event_BTN_signoutMouseExited

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() 
            {              
            }
        });
    }

    private void initgui() {      
       Color c = new Color(186,236,251);       
       jPanel1.setBackground(c);      
    }
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_aboutus;
    private javax.swing.JButton BTN_complain;
    private javax.swing.JButton BTN_complain_admin;
    private javax.swing.JButton BTN_general;
    private javax.swing.JButton BTN_help;
    private javax.swing.JButton BTN_loginadmin;
    private javax.swing.JButton BTN_pass_admin;
    private javax.swing.JButton BTN_profile;
    private javax.swing.JButton BTN_renew;
    private javax.swing.JButton BTN_route;
    private javax.swing.JButton BTN_senior;
    private javax.swing.JButton BTN_signout;
    private javax.swing.JButton BTN_student;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        for(;;)
        {
            if( Thread.currentThread().equals(t1) )
            {
                try
                {
                    if( !state || login.logid==null || login.logid.isEmpty()  )
                    {
                        JInternalFrame frames[] = desktop.getAllFrames();
                        for( JInternalFrame frame : frames )
                            desktop.remove(frame);
                        desktop.setVisible(false);
                      
                        this.dispose();
                    }   
                    Thread.sleep(100);
                }
                catch(Exception e )
                {
                    System.out.println( e.getMessage() );
                }
            }
            else
            {
                try
                {
                    if(pic>=4)
                        pic=1;
                    else
                        pic++;
                    
                    String img = "/amts/images/home/" + String.valueOf(pic) + ".png";
                    jLabel1.setIcon(new ImageIcon( getClass().getResource(img) ));
                   
                    Thread.sleep(3000);
                }
                catch( Exception e )
                {
                    System.out.println( e.getMessage() );
                }
           }
       }  
       
    }

    private void checkAdmin()
    {
        if( Home1.admin_state )
        {
        }
        else
        {
            //BTN_loginadmin.setVisible(false);
            BTN_loginadmin.setEnabled(false);
        }
    }
    
    protected void finalize() throws Throwable
    {
        try {
            Home1.log = null;
            Home1.loginID = null;
            Home1.admin_state = false;
        } finally {
            super.finalize();
        }
    }
}