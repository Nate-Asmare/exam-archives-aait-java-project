
package pro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class TeacherLogin extends javax.swing.JFrame {

    private String q;
    
    public TeacherLogin() {
        initComponents();
      
        teacherTable.setVisible(false);
        departement.setVisible(true);
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
  
    public void executeSQLQuery(String query, String message)
    {
        Connection con = getConnection();
        Statement st;
        try{
            st = con.createStatement();
            if((st.executeUpdate(query)) == 1)
            {
                
                DefaultTableModel model = (DefaultTableModel)jTable_Display_Users.getModel();
                model.setRowCount(0);
               
                JOptionPane.showMessageDialog(null, "Data "+message+"Succefully");
            }else{
                JOptionPane.showMessageDialog(null, "Data Not"+message);
            }
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        teacherTable = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        homescreen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_Users = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        teachersQuestion = new javax.swing.JTextArea();
        teachersTitle = new javax.swing.JTextField();
        examNumber = new javax.swing.JTextField();
        teachersSaveButton = new javax.swing.JLabel();
        teachersTablescreenBackButton = new javax.swing.JLabel();
        teachersDeleteButton = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        departement = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        homeScreen = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        Electrical = new javax.swing.JButton();
        Chemical = new javax.swing.JButton();
        Software = new javax.swing.JButton();
        Civil = new javax.swing.JButton();
        Mechanical = new javax.swing.JButton();
        IT = new javax.swing.JButton();
        Biomedical = new javax.swing.JButton();
        teachersDepartementExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        teacherTable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setForeground(new java.awt.Color(255, 153, 0));

        label.setFont(new java.awt.Font("Segoe UI Light", 0, 48)); // NOI18N

        jLabel31.setFont(new java.awt.Font("Segoe UI Light", 0, 48)); // NOI18N
        jLabel31.setText("ExamArchives V1.0");

        homescreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home_52px_1.png"))); // NOI18N
        homescreen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homescreenMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel31)
                .addGap(43, 43, 43)
                .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(41, 41, 41)
                .addComponent(homescreen)
                .addGap(26, 26, 26))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel31)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(homescreen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        teacherTable.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 100));

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

        teacherTable.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 470, 390));

        jPanel1.setBackground(new java.awt.Color(33, 47, 91));
        jPanel1.setForeground(new java.awt.Color(0, 153, 204));

        teachersQuestion.setBackground(new java.awt.Color(204, 204, 204));
        teachersQuestion.setColumns(20);
        teachersQuestion.setRows(5);
        jScrollPane2.setViewportView(teachersQuestion);

        teachersTitle.setBackground(new java.awt.Color(33, 47, 91));
        teachersTitle.setForeground(new java.awt.Color(204, 204, 204));
        teachersTitle.setBorder(null);

        examNumber.setBackground(new java.awt.Color(33, 47, 91));
        examNumber.setForeground(new java.awt.Color(204, 204, 204));
        examNumber.setBorder(null);

        teachersSaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Save_52px.png"))); // NOI18N
        teachersSaveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teachersSaveButtonMouseClicked(evt);
            }
        });

        teachersTablescreenBackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Left_48px.png"))); // NOI18N
        teachersTablescreenBackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teachersTablescreenBackButtonMouseClicked(evt);
            }
        });

        teachersDeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete_52px.png"))); // NOI18N
        teachersDeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teachersDeleteButtonMouseClicked(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("Exam Title");

        jLabel26.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 204, 204));
        jLabel26.setText("Exam Number");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(teachersTablescreenBackButton)
                        .addGap(56, 56, 56)
                        .addComponent(teachersSaveButton)
                        .addGap(64, 64, 64)
                        .addComponent(teachersDeleteButton)
                        .addGap(0, 94, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(jSeparator2)
                                    .addComponent(examNumber)
                                    .addComponent(teachersTitle))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(examNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(teachersTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teachersTablescreenBackButton)
                    .addComponent(teachersSaveButton)
                    .addComponent(teachersDeleteButton))
                .addContainerGap())
        );

        teacherTable.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 420, 390));

        getContentPane().add(teacherTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 490));

        departement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setForeground(new java.awt.Color(255, 153, 0));

        jLabel30.setFont(new java.awt.Font("Segoe UI Light", 0, 48)); // NOI18N
        jLabel30.setText("ExamArchives V1.0");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel3.setText("Hi teacher , in which departement are we working today?");

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
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap(279, Short.MAX_VALUE)
                        .addComponent(jLabel30)
                        .addGap(166, 166, 166))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(homeScreen)
                .addGap(23, 23, 23))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(3, 3, 3))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(homeScreen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        departement.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 100));

        jPanel9.setBackground(new java.awt.Color(33, 47, 91));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Electrical.setBackground(new java.awt.Color(33, 47, 91));
        Electrical.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        Electrical.setForeground(new java.awt.Color(204, 204, 204));
        Electrical.setText("Electrical");
        Electrical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElectricalActionPerformed(evt);
            }
        });
        jPanel9.add(Electrical, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 190));

        Chemical.setBackground(new java.awt.Color(62, 89, 170));
        Chemical.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        Chemical.setForeground(new java.awt.Color(204, 204, 204));
        Chemical.setText("Chemical");
        Chemical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChemicalActionPerformed(evt);
            }
        });
        jPanel9.add(Chemical, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 220, 200));

        Software.setBackground(new java.awt.Color(62, 89, 170));
        Software.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        Software.setForeground(new java.awt.Color(204, 204, 204));
        Software.setText("Software");
        Software.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoftwareActionPerformed(evt);
            }
        });
        jPanel9.add(Software, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 230, 190));

        Civil.setBackground(new java.awt.Color(62, 89, 170));
        Civil.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        Civil.setForeground(new java.awt.Color(204, 204, 204));
        Civil.setText("Civil");
        Civil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CivilActionPerformed(evt);
            }
        });
        jPanel9.add(Civil, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 230, 200));

        Mechanical.setBackground(new java.awt.Color(33, 47, 91));
        Mechanical.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        Mechanical.setForeground(new java.awt.Color(204, 204, 204));
        Mechanical.setText("Mechanical");
        Mechanical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MechanicalActionPerformed(evt);
            }
        });
        jPanel9.add(Mechanical, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 230, 190));

        IT.setBackground(new java.awt.Color(33, 47, 91));
        IT.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        IT.setForeground(new java.awt.Color(204, 204, 204));
        IT.setText("IT");
        IT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ITActionPerformed(evt);
            }
        });
        jPanel9.add(IT, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 210, 200));

        Biomedical.setBackground(new java.awt.Color(62, 89, 170));
        Biomedical.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        Biomedical.setForeground(new java.awt.Color(204, 204, 204));
        Biomedical.setText("Biomedical");
        Biomedical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BiomedicalActionPerformed(evt);
            }
        });
        jPanel9.add(Biomedical, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 0, 210, 190));

        teachersDepartementExitButton.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        teachersDepartementExitButton.setText("Exit");
        teachersDepartementExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teachersDepartementExitButtonActionPerformed(evt);
            }
        });
        jPanel9.add(teachersDepartementExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, 230, 200));

        departement.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 890, 390));

        getContentPane().add(departement, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_Display_UsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Display_UsersMouseClicked
        // TODO add your handling code here:
        int i = jTable_Display_Users.getSelectedRow();

        TableModel model = jTable_Display_Users.getModel();
        examNumber.setText(model.getValueAt(i,0).toString());
        teachersTitle.setText(model.getValueAt(i,1).toString());

        teachersQuestion.setText(model.getValueAt(i,2).toString());
    }//GEN-LAST:event_jTable_Display_UsersMouseClicked

    private void ElectricalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElectricalActionPerformed
       
        label.setText("Electrical");
        teacherTable.setVisible(true);
        departement.setVisible(false);
        q = "Electrical";
      
        ArrayList<User> usersList = new ArrayList<User>();
        Connection connection = getConnection();
        String query = "SELECT * FROM `electrical` ";
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
    }//GEN-LAST:event_ElectricalActionPerformed

    private void BiomedicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BiomedicalActionPerformed
        // TODO add your handling code here:
        label.setText("Biomedicala");
        teacherTable.setVisible(true);
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
        label.setText("Chemical");
         teacherTable.setVisible(true);
        departement.setVisible(false);
        q = "Chemical";
      
        ArrayList<User> usersList = new ArrayList<User>();
        Connection connection = getConnection();
        String query = "SELECT * FROM `Chemical` ";
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
        label.setText("Mechanical");
        teacherTable.setVisible(true);
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

    private void ITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ITActionPerformed
        // TODO add your handling code here:
        label.setText("IT");
        teacherTable.setVisible(true);
        departement.setVisible(false);
        q = "IT";
      
        ArrayList<User> usersList = new ArrayList<User>();
        Connection connection = getConnection();
        String query = "SELECT * FROM `it` ";
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

    private void SoftwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoftwareActionPerformed
        // TODO add your handling code here:
        label.setText("Software");
        teacherTable.setVisible(true);
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
        label.setText("Civil");
         teacherTable.setVisible(true);
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

    private void teachersDepartementExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teachersDepartementExitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_teachersDepartementExitButtonActionPerformed

    private void teachersDeleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teachersDeleteButtonMouseClicked
        // TODO add your handling code here:
        if(q == "Electrical")
        {
        String query = "DELETE FROM `electrical` WHERE number = "+examNumber.getText();// this is just a query(instraction) that
        executeSQLQuery(query," Deleted");     //is send to the database to do a specified task which is in this case to delete
        
        Electrical.doClick(); // doClick is used to click a button in code. it used to reload the window after a data is deleted
        }else if (q == "Chemical")
        {
         String query = "DELETE FROM `chemical` WHERE number = "+examNumber.getText();
        executeSQLQuery(query,"Deleted"); 
        
        Chemical.doClick();
        }else if (q == "Biomedical")
        {
         String query = "DELETE FROM `biomedical` WHERE number = "+examNumber.getText();
        executeSQLQuery(query,"Deleted"); 
        
        Biomedical.doClick(); 
        }else if (q == "Mechanical")
        {
         String query = "DELETE FROM `mechnical` WHERE number = "+examNumber.getText();
        executeSQLQuery(query,"Deleted"); 
        
        Mechanical.doClick();
        }else if (q == "IT")
        {
         String query = "DELETE FROM `it` WHERE number = "+examNumber.getText();
        executeSQLQuery(query,"Deleted"); 
        
        IT.doClick();   
        }else if (q == "Software")
        {
         String query = "DELETE FROM `software` WHERE number = "+examNumber.getText();
        executeSQLQuery(query,"Deleted"); 
        
        Software.doClick();  
        }else if (q == "Civil")
        {
         String query = "DELETE FROM `civil` WHERE number = "+examNumber.getText();
        executeSQLQuery(query,"Deleted"); 
        
        Civil.doClick();
        }
    }//GEN-LAST:event_teachersDeleteButtonMouseClicked

    private void teachersSaveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teachersSaveButtonMouseClicked
        // TODO add your handling code here:
         if(q == "Electrical")
        {
        String query = "INSERT INTO `electrical`(`number`,`title`, `question`) VALUES ("+examNumber.getText()+",'"+teachersTitle.getText()+"','"+teachersQuestion.getText()+"')";
        executeSQLQuery(query," Inserted"); //again this is just a query(instraction) sent to the data base to save(insert) data
        
        Electrical.doClick(); //for reloading perposes .. since a change in database is made (saveing)
        }else if (q == "Chemical")
        {
        String query = "INSERT INTO `chemical`(`number`,`title`, `question`) VALUES ("+examNumber.getText()+",'"+teachersTitle.getText()+"','"+teachersQuestion.getText()+"')";
        executeSQLQuery(query,"Inserted");
        
        Chemical.doClick();
        }else if (q == "Biomedical")
        {
        String query = "INSERT INTO `biomedical`(`number`,`title`, `question`) VALUES ("+examNumber.getText()+",'"+teachersTitle.getText()+"','"+teachersQuestion.getText()+"')";
        executeSQLQuery(query,"Inserted");
        
        Biomedical.doClick(); 
        }else if (q == "Mechanical")
        {
        String query = "INSERT INTO `mechnical`(`number`,`title`, `question`) VALUES ("+examNumber.getText()+",'"+teachersTitle.getText()+"','"+teachersQuestion.getText()+"')";
        executeSQLQuery(query,"Inserted");
        
        Mechanical.doClick();
        }else if (q == "IT")
        {
         String query = "INSERT INTO `it`(`number`,`title`, `question`) VALUES ("+examNumber.getText()+",'"+teachersTitle.getText()+"','"+teachersQuestion.getText()+"')";
        executeSQLQuery(query,"Inserted");
        
        IT.doClick();   
        }else if (q == "Software")
        {
        String query = "INSERT INTO `software`(`number`,`title`, `question`) VALUES ("+examNumber.getText()+",'"+teachersTitle.getText()+"','"+teachersQuestion.getText()+"')";
        executeSQLQuery(query,"Inserted");
        
        Software.doClick();  
        }else if (q == "Civil")
        {
        String query = "INSERT INTO `civil`(`number`,`title`, `question`) VALUES ("+examNumber.getText()+",'"+teachersTitle.getText()+"','"+teachersQuestion.getText()+"')";
        executeSQLQuery(query,"Inserted");
        
        Civil.doClick();
        }
    }//GEN-LAST:event_teachersSaveButtonMouseClicked

    private void teachersTablescreenBackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teachersTablescreenBackButtonMouseClicked
        // TODO add your handling code here:
         teacherTable.setVisible(false);
        departement.setVisible(true);
        DefaultTableModel model =(DefaultTableModel)jTable_Display_Users.getModel();//this loop code is used to clear the jTable
        for( int i = model.getRowCount() - 1; i >= 0; i-- ) {                    //after a back button is clicked
              model.removeRow(i);
          }
    }//GEN-LAST:event_teachersTablescreenBackButtonMouseClicked

    private void homescreenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homescreenMouseClicked
        // TODO add your handling code here:
         Login log = new Login();
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homescreenMouseClicked

    private void homeScreenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeScreenMouseClicked
        // TODO add your handling code here:
         Login log = new Login();
        log.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_homeScreenMouseClicked

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
            java.util.logging.Logger.getLogger(TeacherLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherLogin().setVisible(true);
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
    private javax.swing.JTextField examNumber;
    private javax.swing.JLabel homeScreen;
    private javax.swing.JLabel homescreen;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable_Display_Users;
    private javax.swing.JLabel label;
    private javax.swing.JPanel teacherTable;
    private javax.swing.JLabel teachersDeleteButton;
    private javax.swing.JButton teachersDepartementExitButton;
    private javax.swing.JTextArea teachersQuestion;
    private javax.swing.JLabel teachersSaveButton;
    private javax.swing.JLabel teachersTablescreenBackButton;
    private javax.swing.JTextField teachersTitle;
    // End of variables declaration//GEN-END:variables
}
