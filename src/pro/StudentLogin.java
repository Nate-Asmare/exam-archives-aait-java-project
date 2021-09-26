package pro;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class StudentLogin extends javax.swing.JFrame {

    public static String q;//this line of code is very crucial , understand it will
    
    public StudentLogin() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        examTable.setVisible(false);
        departement.setVisible(true);
        
        
    }

    public void StudentBack(){          //this line of code is used when a user clicks the back button from the 'Load' screen 
       examTable.setVisible(true);      //(Question displaying window) 
       departement.setVisible(false);   // Inorder for this to happen, we have to know which departement  the user was on
          if(q == "Electrical")         // Inorder to load the database data to the jTable
        {                               // this is basicaly what this line of code is doing
                                        // Incase your wondering... it's not used in this class
        Electrical.doClick();
        }else if (q == "Chemical")
        {
        
        Chemical.doClick();
        }else if (q == "Biomedical")
        {
        
        Biomedical.doClick(); 
        }else if (q == "Mechanical")
        {
        
        Mechanical.doClick();
        }else if (q == "IT")
        {
        
        IT.doClick();   
        }else if (q == "Software")
        {
       
        Software.doClick();  
        }else if (q == "Civil")
        {
        
        Civil.doClick();
        }
    }
    public Connection getConnection()
    {
        Connection con;
        try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exams?zeroDateTimeBehavior=convertToNull", "root", "");
        return con;
        }catch (Exception e)
{      
    e.printStackTrace();
    return null;
 }
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        examTable = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        homebutton = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_Users = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        examTablescreenBackButton = new javax.swing.JLabel();
        departement = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        homeScreen = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        Chemical = new javax.swing.JButton();
        Software = new javax.swing.JButton();
        Civil = new javax.swing.JButton();
        Mechanical = new javax.swing.JButton();
        IT = new javax.swing.JButton();
        Biomedical = new javax.swing.JButton();
        studentDepartementExitButton = new javax.swing.JButton();
        Electrical = new javax.swing.JButton();

        jButton3.setText("jButton3");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        examTable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setForeground(new java.awt.Color(255, 153, 0));

        jLabel30.setFont(new java.awt.Font("Segoe UI Light", 0, 48)); // NOI18N
        jLabel30.setText("ExamArchives V1.0");

        homebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home_52px_1.png"))); // NOI18N
        homebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homebuttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(659, Short.MAX_VALUE)
                .addComponent(homebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel30)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homebutton)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel30)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        examTable.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 80));

        jPanel5.setBackground(new java.awt.Color(33, 47, 91));

        jTable_Display_Users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Exam Number", "Exam Title", "Exam Question"
            }
        ));
        jTable_Display_Users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Display_UsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Display_Users);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        examTable.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 750, 350));

        jPanel6.setBackground(new java.awt.Color(33, 47, 91));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        examTablescreenBackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Left_48px.png"))); // NOI18N
        examTablescreenBackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                examTablescreenBackButtonMouseClicked(evt);
            }
        });
        jPanel6.add(examTablescreenBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, -1, -1));

        examTable.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 750, 60));

        getContentPane().add(examTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 490));

        departement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setForeground(new java.awt.Color(255, 153, 0));

        jLabel29.setFont(new java.awt.Font("Segoe UI Light", 0, 48)); // NOI18N
        jLabel29.setText("ExamArchives V1.0");

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel1.setText("From which departement do you want to exercise on today?");

        homeScreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home_52px_1.png"))); // NOI18N
        homeScreen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeScreenMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homeScreen)
                .addGap(25, 25, 25))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(homeScreen, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        departement.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 120));

        jPanel9.setBackground(new java.awt.Color(33, 47, 91));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Chemical.setBackground(new java.awt.Color(62, 89, 170));
        Chemical.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        Chemical.setForeground(new java.awt.Color(204, 204, 204));
        Chemical.setText("Chemical");
        Chemical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChemicalActionPerformed(evt);
            }
        });
        jPanel9.add(Chemical, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 200, 180));

        Software.setBackground(new java.awt.Color(33, 47, 91));
        Software.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        Software.setForeground(new java.awt.Color(204, 204, 204));
        Software.setText("Software");
        Software.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoftwareActionPerformed(evt);
            }
        });
        jPanel9.add(Software, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 200, 190));

        Civil.setBackground(new java.awt.Color(62, 89, 170));
        Civil.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        Civil.setForeground(new java.awt.Color(204, 204, 204));
        Civil.setText("Civil");
        Civil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CivilActionPerformed(evt);
            }
        });
        jPanel9.add(Civil, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 190, 190));

        Mechanical.setBackground(new java.awt.Color(62, 89, 170));
        Mechanical.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        Mechanical.setForeground(new java.awt.Color(204, 204, 204));
        Mechanical.setText("Mechanical");
        Mechanical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MechanicalActionPerformed(evt);
            }
        });
        jPanel9.add(Mechanical, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 190));

        IT.setBackground(new java.awt.Color(62, 89, 170));
        IT.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        IT.setForeground(new java.awt.Color(204, 204, 204));
        IT.setText("IT");
        IT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ITActionPerformed(evt);
            }
        });
        jPanel9.add(IT, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 160, 180));

        Biomedical.setBackground(new java.awt.Color(33, 47, 91));
        Biomedical.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        Biomedical.setForeground(new java.awt.Color(204, 204, 204));
        Biomedical.setText("Biomedical");
        Biomedical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BiomedicalActionPerformed(evt);
            }
        });
        jPanel9.add(Biomedical, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 190, 180));

        studentDepartementExitButton.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        studentDepartementExitButton.setText("Exit");
        studentDepartementExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentDepartementExitButtonActionPerformed(evt);
            }
        });
        jPanel9.add(studentDepartementExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 160, 190));

        Electrical.setBackground(new java.awt.Color(33, 47, 91));
        Electrical.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        Electrical.setForeground(new java.awt.Color(204, 204, 204));
        Electrical.setText("Electrical");
        Electrical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElectricalActionPerformed(evt);
            }
        });
        jPanel9.add(Electrical, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 180));

        departement.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 750, 370));

        getContentPane().add(departement, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_Display_UsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Display_UsersMouseClicked
         int i = jTable_Display_Users.getSelectedRow();

        TableModel model = jTable_Display_Users.getModel();
        
        Load load = new Load();
        load.setVisible(true);
        this.setVisible(false);       //the general perpose of this methos is to send data to be displayed to LoadClass
      
        load.setTitle(model.getValueAt(i,1).toString());//setTitle- is a method which is found in load class

        load.setQuestion(model.getValueAt(i,2).toString());//setQuestion is also a method which is found in load class
    }//GEN-LAST:event_jTable_Display_UsersMouseClicked

    private void studentDepartementExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentDepartementExitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_studentDepartementExitButtonActionPerformed

    private void ElectricalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElectricalActionPerformed
        // TODO add your handling code here:
        
        examTable.setVisible(true);
        departement.setVisible(false);
        q = "Electrical";
      
        ArrayList<User> usersList = new ArrayList<User>();//watch this line of code closely , it's making an arrylist of 
        Connection connection = getConnection();          //objects from the user class
        String query = "SELECT * FROM `electrical` ";  //form this code the data form the table electrical are loded since the 
        Statement st;                                  //the electrical button is clicked
        ResultSet rs;
        
        try {                                  //what this line of code is doing is that , it retrives the 'number' , 'title' 
            st = connection.createStatement(); //and question from the data base and send it to another class called user.
            rs = st.executeQuery(query);       //class user takes all this data and store them in a private field (through a constractor)
            User user;                         //this is done to make it easier to make objects from that class and store them 
            while(rs.next())                   //In an array list
            {
                user = new User(rs.getInt("number"),rs.getString("title"),rs.getString("question"));
                usersList.add(user);         //this is the part where an array list of the user class objects are created
            }
        } catch (Exception e)
        {
            e.printStackTrace(); //this line of code is not important it is just used to display errors in console when they 
        }                        //occure
        
        ArrayList<User> list = usersList;
        DefaultTableModel model =(DefaultTableModel)jTable_Display_Users.getModel();
        Object[] col = new Object[3];
        for(int i = 0; i<list.size();i++)
        {
            col[0] = list.get(i).getNumber();   //since this array list is a list of objects form the class user we can use 
            col[1] = list.get(i).getTitle();    //the methods from the class user. which is what is done here
            col[2] = list.get(i).getQuestion();
       
            model.addRow(col);     //this line of code will display the values to the jTable. since it's in a loop it will
        }                          //iterate through all the rows
    }//GEN-LAST:event_ElectricalActionPerformed

    private void ITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ITActionPerformed
        
        examTable.setVisible(true);          //this block of code for "IT" button is exactly the same as befor(for electrical 
        departement.setVisible(false);       //button . The only difference is that the data loded in this case is form the 'IT'
        q = "IT";                            //table
      
        ArrayList<User> usersList = new ArrayList<User>();
        Connection connection = getConnection();
        String query = "SELECT * FROM `it` ";//this the line of code that loads the data form table 'IT'  
        Statement st;
        ResultSet rs;
        
        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            User user;
            while(rs.next())
            {
                user = new User(rs.getInt("number"),rs.getString("title"),rs.getString("question"));
                usersList.add(user);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        
        ArrayList<User> list = usersList;
        DefaultTableModel model =(DefaultTableModel)jTable_Display_Users.getModel();
        Object[] col = new Object[3];
        for(int i = 0; i<list.size();i++)
        {
            col[0] = list.get(i).getNumber();
            col[1] = list.get(i).getTitle();
            col[2] = list.get(i).getQuestion();
       
            model.addRow(col);
        }
    }//GEN-LAST:event_ITActionPerformed

    private void BiomedicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BiomedicalActionPerformed
        // TODO add your handling code here:
        
        examTable.setVisible(true);
        departement.setVisible(false);
        q = "Biomedical";
      
        ArrayList<User> usersList = new ArrayList<User>();
        Connection connection = getConnection();
        String query = "SELECT * FROM `biomedical` ";
        Statement st;
        ResultSet rs;
        
        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            User user;
            while(rs.next())
            {
                user = new User(rs.getInt("number"),rs.getString("title"),rs.getString("question"));
                usersList.add(user);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        
        ArrayList<User> list = usersList;
        DefaultTableModel model =(DefaultTableModel)jTable_Display_Users.getModel();
        Object[] col = new Object[3];
        for(int i = 0; i<list.size();i++)
        {
            col[0] = list.get(i).getNumber();
            col[1] = list.get(i).getTitle();
            col[2] = list.get(i).getQuestion();
       
            model.addRow(col);
        }
    }//GEN-LAST:event_BiomedicalActionPerformed

    private void ChemicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChemicalActionPerformed
        // TODO add your handling code here:
        
        examTable.setVisible(true);
        departement.setVisible(false);
        q = "Chemical";
      
        ArrayList<User> usersList = new ArrayList<User>();
        Connection connection = getConnection();
        String query = "SELECT * FROM `chemical` ";
        Statement st;
        ResultSet rs;
        
        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            User user;
            while(rs.next())
            {
                user = new User(rs.getInt("number"),rs.getString("title"),rs.getString("question"));
                usersList.add(user);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        
        ArrayList<User> list = usersList;
        DefaultTableModel model =(DefaultTableModel)jTable_Display_Users.getModel();
        Object[] col = new Object[3];
        for(int i = 0; i<list.size();i++)
        {
            col[0] = list.get(i).getNumber();
            col[1] = list.get(i).getTitle();
            col[2] = list.get(i).getQuestion();
       
            model.addRow(col);
        }
    }//GEN-LAST:event_ChemicalActionPerformed

    private void MechanicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MechanicalActionPerformed
        // TODO add your handling code here:
        
        examTable.setVisible(true);
        departement.setVisible(false);
        q = "Mechanical";
      
        ArrayList<User> usersList = new ArrayList<User>();
        Connection connection = getConnection();
        String query = "SELECT * FROM `mechnical` ";
        Statement st;
        ResultSet rs;
        
        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            User user;
            while(rs.next())
            {
                user = new User(rs.getInt("number"),rs.getString("title"),rs.getString("question"));
                usersList.add(user);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        
        ArrayList<User> list = usersList;
        DefaultTableModel model =(DefaultTableModel)jTable_Display_Users.getModel();
        Object[] col = new Object[3];
        for(int i = 0; i<list.size();i++)
        {
            col[0] = list.get(i).getNumber();
            col[1] = list.get(i).getTitle();
            col[2] = list.get(i).getQuestion();
       
            model.addRow(col);
        }
    }//GEN-LAST:event_MechanicalActionPerformed

    private void SoftwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoftwareActionPerformed
        // TODO add your handling code here:
        
        examTable.setVisible(true);
        departement.setVisible(false);
        q = "Software";
      
        ArrayList<User> usersList = new ArrayList<User>();
        Connection connection = getConnection();
        String query = "SELECT * FROM `software` ";
        Statement st;
        ResultSet rs;
        
        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            User user;
            while(rs.next())
            {
                user = new User(rs.getInt("number"),rs.getString("title"),rs.getString("question"));
                usersList.add(user);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        
        ArrayList<User> list = usersList;
        DefaultTableModel model =(DefaultTableModel)jTable_Display_Users.getModel();
        Object[] col = new Object[3];
        for(int i = 0; i<list.size();i++)
        {
            col[0] = list.get(i).getNumber();
            col[1] = list.get(i).getTitle();
            col[2] = list.get(i).getQuestion();
       
            model.addRow(col);
        }
    }//GEN-LAST:event_SoftwareActionPerformed

    private void CivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CivilActionPerformed
        // TODO add your handling code here:
        
        examTable.setVisible(true);
        departement.setVisible(false);
        q = "Civil";
      
        ArrayList<User> usersList = new ArrayList<User>();
        Connection connection = getConnection();
        String query = "SELECT * FROM `civil` ";
        Statement st;
        ResultSet rs;
        
        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            User user;
            while(rs.next())
            {
                user = new User(rs.getInt("number"),rs.getString("title"),rs.getString("question"));
                usersList.add(user);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        
        ArrayList<User> list = usersList;
        DefaultTableModel model =(DefaultTableModel)jTable_Display_Users.getModel();
        Object[] col = new Object[3];
        for(int i = 0; i<list.size();i++)
        {
            col[0] = list.get(i).getNumber();
            col[1] = list.get(i).getTitle();
            col[2] = list.get(i).getQuestion();
       
            model.addRow(col);
        }
    }//GEN-LAST:event_CivilActionPerformed

    private void examTablescreenBackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_examTablescreenBackButtonMouseClicked
        // TODO add your handling code here:
         examTable.setVisible(false);
        departement.setVisible(true);
       
        DefaultTableModel model =(DefaultTableModel)jTable_Display_Users.getModel(); //this line of code is used to clear the
        for( int i = model.getRowCount() - 1; i >= 0; i-- ) {                       //jTabel after the back button is clicked
              model.removeRow(i);
          }
    }//GEN-LAST:event_examTablescreenBackButtonMouseClicked

    private void homeScreenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeScreenMouseClicked
        // TODO add your handling code here:
        Login log = new Login();
        log.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_homeScreenMouseClicked

    private void homebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebuttonMouseClicked
        // TODO add your handling code here:
         Login log = new Login();
        log.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_homebuttonMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Biomedical;
    private javax.swing.JButton Chemical;
    private javax.swing.JButton Civil;
    private javax.swing.JButton Electrical;
    private javax.swing.JButton IT;
    private javax.swing.JButton Mechanical;
    private javax.swing.JButton Software;
    private javax.swing.JPanel departement;
    private javax.swing.JPanel examTable;
    private javax.swing.JLabel examTablescreenBackButton;
    private javax.swing.JLabel homeScreen;
    private javax.swing.JLabel homebutton;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display_Users;
    private javax.swing.JButton studentDepartementExitButton;
    // End of variables declaration//GEN-END:variables
}
