package pro;
import java.sql.*;
import javax.swing.JOptionPane;
public class Login extends javax.swing.JFrame {

    public TeacherLogin teacherllogin;
    public StudentLogin studentllogin;
    
    public Connection cn;
    public Statement st;
    
    //the code block used below is used for connecting the java program to the database
    //the database for this case is 'log' which is used to store the username and password for teachers and students
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/log?zeroDateTimeBehavior=convertToNull","root","");
            st = cn.createStatement();
           //JOptionPane.showMessageDialog(null, "Connected");
           System.out.println("connected");//this code block is only for cheacking if we are connected to the data base
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Not Connected");
        }
        wellcome.setVisible(true);
        wellomeTeacher.setVisible(false);
        wellcomeStudent.setVisible(false);
        regestration.setVisible(false);
    }
    
    public Connection getConnection()
    {
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/log?zeroDateTimeBehavior=convertToNull", "root","");
            return con; 
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    //the code block below is used to send query"instraction" to the database
     public void executeSQLQuery(String query, String message)
    {
        Connection con = getConnection();
        Statement st;
        try{
            st = con.createStatement();
            if((st.executeUpdate(query)) == 1)
            {
              
                JOptionPane.showMessageDialog(null, "You have been "+message+" Succefully");
            }else{
                JOptionPane.showMessageDialog(null, "Not "+message);
            }
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regestration = new javax.swing.JPanel();
        wellcome1 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        regesteredName = new javax.swing.JTextField();
        regesteredID = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        studentRegesterButton = new javax.swing.JLabel();
        studentRegestrationBackButton = new javax.swing.JLabel();
        regesteredPassword = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        homeScreenButton = new javax.swing.JLabel();
        wellcome = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        teacher = new javax.swing.JLabel();
        student = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        wellomeTeacher = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        homescreenButton = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        teachersUsername = new javax.swing.JTextField();
        teachersPassword = new javax.swing.JPasswordField();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        teacherLoginscreenBackButton = new javax.swing.JLabel();
        teacherLoginButton = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        wellcomeStudent = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        homeScreen = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        studentUserName = new javax.swing.JTextField();
        studentPassword = new javax.swing.JPasswordField();
        studentCreatNewAccountButton = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        studentLoginScreenLoginButton = new javax.swing.JLabel();
        sutudentLoginscreenBackButton = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regestration.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        wellcome1.setBackground(new java.awt.Color(44, 62, 80));
        wellcome1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        regestration.add(wellcome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 217, -1, -1));

        jPanel13.setBackground(new java.awt.Color(44, 62, 80));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regesteredName.setBackground(new java.awt.Color(44, 62, 80));
        regesteredName.setForeground(new java.awt.Color(204, 204, 204));
        regesteredName.setBorder(null);
        regesteredName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regesteredNameActionPerformed(evt);
            }
        });
        jPanel13.add(regesteredName, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 150, 20));

        regesteredID.setBackground(new java.awt.Color(44, 62, 80));
        regesteredID.setForeground(new java.awt.Color(204, 204, 204));
        regesteredID.setBorder(null);
        regesteredID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regesteredIDActionPerformed(evt);
            }
        });
        jPanel13.add(regesteredID, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 150, 20));

        jLabel34.setFont(new java.awt.Font("Segoe UI Light", 0, 48)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(204, 204, 204));
        jLabel34.setText("Welcome Student ");
        jPanel13.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));
        jPanel13.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 150, 10));
        jPanel13.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 150, 10));
        jPanel13.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 150, 10));

        jLabel35.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(204, 204, 204));
        jLabel35.setText("please fill the dashs below to register!");
        jPanel13.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        jLabel36.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(204, 204, 204));
        jLabel36.setText("ID");
        jPanel13.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(204, 204, 204));
        jLabel37.setText("Name");
        jPanel13.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(204, 204, 204));
        jLabel38.setText("Password ");
        jPanel13.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        studentRegesterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Right_48px.png"))); // NOI18N
        studentRegesterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentRegesterButtonMouseClicked(evt);
            }
        });
        jPanel13.add(studentRegesterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, -1));

        studentRegestrationBackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Left_48px.png"))); // NOI18N
        studentRegestrationBackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentRegestrationBackButtonMouseClicked(evt);
            }
        });
        jPanel13.add(studentRegestrationBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, -1, -1));

        regesteredPassword.setBackground(new java.awt.Color(44, 62, 80));
        regesteredPassword.setForeground(new java.awt.Color(204, 204, 204));
        regesteredPassword.setBorder(null);
        jPanel13.add(regesteredPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 150, 20));

        regestration.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 750, 370));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Segoe UI Light", 0, 48)); // NOI18N
        jLabel33.setText("ExamArchives V1.0");
        jPanel5.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        homeScreenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home_52px_1.png"))); // NOI18N
        homeScreenButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeScreenButtonMouseClicked(evt);
            }
        });
        jPanel5.add(homeScreenButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, -1, -1));

        regestration.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 120));

        getContentPane().add(regestration, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 490));

        wellcome.setBackground(new java.awt.Color(204, 204, 204));
        wellcome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aau.png"))); // NOI18N
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI Light", 0, 48)); // NOI18N
        jLabel20.setText("ExamArchives V1.0");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel21.setText("Exclusive for AAU - AAIT");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        wellcome.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 250));

        jPanel4.setBackground(new java.awt.Color(33, 47, 91));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Segoe UI Light", 0, 48)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Welcome User ");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Teacher");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 50, -1));

        teacher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/School Director_48px.png"))); // NOI18N
        teacher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teacherMouseClicked(evt);
            }
        });
        jPanel4.add(teacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

        student.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Student Male_48px_1.png"))); // NOI18N
        student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentMouseClicked(evt);
            }
        });
        jPanel4.add(student, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 128, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("please choose your login");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("Student");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        wellcome.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 750, 240));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        wellcome.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 710, 40));

        getContentPane().add(wellcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 490));

        wellomeTeacher.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Segoe UI Light", 0, 48)); // NOI18N
        jLabel26.setText("ExamArchives V1.0");
        jPanel6.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        homescreenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home_52px_1.png"))); // NOI18N
        homescreenButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homescreenButtonMouseClicked(evt);
            }
        });
        jPanel6.add(homescreenButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, -1, -1));

        wellomeTeacher.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 120));

        jPanel8.setBackground(new java.awt.Color(33, 47, 91));
        jPanel8.setForeground(new java.awt.Color(44, 62, 80));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        teachersUsername.setBackground(new java.awt.Color(33, 47, 91));
        teachersUsername.setForeground(new java.awt.Color(204, 204, 204));
        teachersUsername.setBorder(null);
        jPanel8.add(teachersUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 150, 20));

        teachersPassword.setBackground(new java.awt.Color(33, 47, 91));
        teachersPassword.setForeground(new java.awt.Color(204, 204, 204));
        teachersPassword.setBorder(null);
        teachersPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teachersPasswordActionPerformed(evt);
            }
        });
        jPanel8.add(teachersPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 150, 20));

        jLabel25.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("Password");
        jPanel8.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 204, 204));
        jLabel28.setText("User Name");
        jPanel8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));
        jPanel8.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 150, 10));
        jPanel8.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 150, 20));

        teacherLoginscreenBackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Left_48px.png"))); // NOI18N
        teacherLoginscreenBackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teacherLoginscreenBackButtonMouseClicked(evt);
            }
        });
        jPanel8.add(teacherLoginscreenBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        teacherLoginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Right_48px.png"))); // NOI18N
        teacherLoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teacherLoginButtonMouseClicked(evt);
            }
        });
        jPanel8.add(teacherLoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 204, 204));
        jLabel32.setText("Welcome Teacher");
        jPanel8.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gender Neutral User_96px_1.png"))); // NOI18N
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        wellomeTeacher.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 750, 370));

        getContentPane().add(wellomeTeacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 490));

        wellcomeStudent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Segoe UI Light", 0, 48)); // NOI18N
        jLabel29.setText("ExamArchives V1.0");
        jPanel10.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        homeScreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home_52px_1.png"))); // NOI18N
        homeScreen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeScreenMouseClicked(evt);
            }
        });
        jPanel10.add(homeScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, -1, -1));

        wellcomeStudent.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 120));

        jPanel12.setBackground(new java.awt.Color(33, 47, 91));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentUserName.setBackground(new java.awt.Color(33, 47, 91));
        studentUserName.setForeground(new java.awt.Color(204, 204, 204));
        studentUserName.setBorder(null);
        studentUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentUserNameActionPerformed(evt);
            }
        });
        jPanel12.add(studentUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 150, 20));

        studentPassword.setBackground(new java.awt.Color(33, 47, 91));
        studentPassword.setForeground(new java.awt.Color(204, 204, 204));
        studentPassword.setBorder(null);
        jPanel12.add(studentPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 150, 20));

        studentCreatNewAccountButton.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        studentCreatNewAccountButton.setForeground(new java.awt.Color(204, 204, 204));
        studentCreatNewAccountButton.setText("Click here to creat a new account?");
        studentCreatNewAccountButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentCreatNewAccountButtonMouseClicked(evt);
            }
        });
        jPanel12.add(studentCreatNewAccountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, -1, 20));

        jLabel27.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setText("Welcome Student");
        jPanel12.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));
        jPanel12.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 150, 10));
        jPanel12.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 150, 10));

        jLabel30.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 204, 204));
        jLabel30.setText("User Name");
        jPanel12.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 204, 204));
        jLabel31.setText("Password");
        jPanel12.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        studentLoginScreenLoginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Right_48px.png"))); // NOI18N
        studentLoginScreenLoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentLoginScreenLoginButtonMouseClicked(evt);
            }
        });
        jPanel12.add(studentLoginScreenLoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        sutudentLoginscreenBackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Left_48px.png"))); // NOI18N
        sutudentLoginscreenBackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sutudentLoginscreenBackButtonMouseClicked(evt);
            }
        });
        jPanel12.add(sutudentLoginscreenBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gender Neutral User_96px_1.png"))); // NOI18N
        jPanel12.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        wellcomeStudent.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 750, 370));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gender Neutral User_96px_1.png"))); // NOI18N
        wellcomeStudent.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        getContentPane().add(wellcomeStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentCreatNewAccountButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentCreatNewAccountButtonMouseClicked
        // TODO add your handling code here:
        
        regestration.setVisible(true);
        wellcome.setVisible(false);
        wellomeTeacher.setVisible(false);
        wellcomeStudent.setVisible(false);
    }//GEN-LAST:event_studentCreatNewAccountButtonMouseClicked

    private void regesteredNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regesteredNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regesteredNameActionPerformed

    private void regesteredIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regesteredIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regesteredIDActionPerformed

    private void studentUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentUserNameActionPerformed

    private void teacherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherMouseClicked
        // TODO add your handling code here:
         wellcome.setVisible(false);
        wellomeTeacher.setVisible(true);
        wellcomeStudent.setVisible(false);
    }//GEN-LAST:event_teacherMouseClicked

    private void studentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentMouseClicked
        // TODO add your handling code here:
        wellcome.setVisible(false);
        wellomeTeacher.setVisible(false);
        wellcomeStudent.setVisible(true);
    }//GEN-LAST:event_studentMouseClicked

    private void teachersPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teachersPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teachersPasswordActionPerformed

    private void teacherLoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherLoginButtonMouseClicked
        
        try {
          String sql = "select *from teachersDatabase where Username = '"+teachersUsername.getText()+"'and Password = '"+String.valueOf(teachersPassword.getPassword())+"'";
          ResultSet rss = st.executeQuery(sql);
          if(rss.next()){
              teacherllogin = new TeacherLogin();
              teacherllogin.setVisible(true);
              this.dispose();
          } else {
              JOptionPane.showMessageDialog(null, "Error Login");
          }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, " Error in Connection");
       }
         
    }//GEN-LAST:event_teacherLoginButtonMouseClicked

    private void teacherLoginscreenBackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherLoginscreenBackButtonMouseClicked
        // TODO add your handling code here:
         wellcome.setVisible(true);
        wellomeTeacher.setVisible(false);
        wellcomeStudent.setVisible(false);
    }//GEN-LAST:event_teacherLoginscreenBackButtonMouseClicked

    private void studentLoginScreenLoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentLoginScreenLoginButtonMouseClicked
        // TODO add your handling code here:
          try {
          String sql = "select *from studentsdatabase where Username = '"+studentUserName.getText()+"'and password = '"+String.valueOf(studentPassword.getPassword())+"'";
          ResultSet rss = st.executeQuery(sql);
          if(rss.next()){
              studentllogin = new StudentLogin();
              studentllogin.setVisible(true);
              this.dispose();
          } else {
              JOptionPane.showMessageDialog(null, "Error Login");
          }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, " Error in Connection");
       }
    }//GEN-LAST:event_studentLoginScreenLoginButtonMouseClicked

    private void sutudentLoginscreenBackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sutudentLoginscreenBackButtonMouseClicked
        // TODO add your handling code here:
        wellcome.setVisible(true);
        wellomeTeacher.setVisible(false);
        wellcomeStudent.setVisible(false);
    }//GEN-LAST:event_sutudentLoginscreenBackButtonMouseClicked

    private void studentRegesterButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentRegesterButtonMouseClicked
        // TODO add your handling code here:
         String query = "INSERT INTO `studentsdatabase`(`ID`,`Username`, `Password`) VALUES ("+regesteredID.getText()+",'"+regesteredName.getText()+"','"+regesteredPassword.getText()+"')";
        executeSQLQuery(query," Regestered");
        
        wellcome.setVisible(false);
        wellomeTeacher.setVisible(false);
        wellcomeStudent.setVisible(true);
        regestration.setVisible(false);
    }//GEN-LAST:event_studentRegesterButtonMouseClicked

    private void studentRegestrationBackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentRegestrationBackButtonMouseClicked
        // TODO add your handling code here:
        wellcome.setVisible(false);
        wellomeTeacher.setVisible(false);
        wellcomeStudent.setVisible(true);
        regestration.setVisible(false);
    }//GEN-LAST:event_studentRegestrationBackButtonMouseClicked

    private void homescreenButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homescreenButtonMouseClicked
        // TODO add your handling code here:
          wellcome.setVisible(true);
        wellomeTeacher.setVisible(false);
        wellcomeStudent.setVisible(false);
        regestration.setVisible(false);
    }//GEN-LAST:event_homescreenButtonMouseClicked

    private void homeScreenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeScreenMouseClicked
        // TODO add your handling code here:
        wellcome.setVisible(true);
        wellomeTeacher.setVisible(false);
        wellcomeStudent.setVisible(false);
        regestration.setVisible(false);
    }//GEN-LAST:event_homeScreenMouseClicked

    private void homeScreenButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeScreenButtonMouseClicked
        // TODO add your handling code here:
        wellcome.setVisible(true);
        wellomeTeacher.setVisible(false);
        wellcomeStudent.setVisible(false);
        regestration.setVisible(false);
    }//GEN-LAST:event_homeScreenButtonMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel homeScreen;
    private javax.swing.JLabel homeScreenButton;
    private javax.swing.JLabel homescreenButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField regesteredID;
    private javax.swing.JTextField regesteredName;
    private javax.swing.JPasswordField regesteredPassword;
    private javax.swing.JPanel regestration;
    private javax.swing.JLabel student;
    private javax.swing.JLabel studentCreatNewAccountButton;
    private javax.swing.JLabel studentLoginScreenLoginButton;
    private javax.swing.JPasswordField studentPassword;
    private javax.swing.JLabel studentRegesterButton;
    private javax.swing.JLabel studentRegestrationBackButton;
    private javax.swing.JTextField studentUserName;
    private javax.swing.JLabel sutudentLoginscreenBackButton;
    private javax.swing.JLabel teacher;
    private javax.swing.JLabel teacherLoginButton;
    private javax.swing.JLabel teacherLoginscreenBackButton;
    private javax.swing.JPasswordField teachersPassword;
    private javax.swing.JTextField teachersUsername;
    private javax.swing.JPanel wellcome;
    private javax.swing.JPanel wellcome1;
    private javax.swing.JPanel wellcomeStudent;
    private javax.swing.JPanel wellomeTeacher;
    // End of variables declaration//GEN-END:variables
}
