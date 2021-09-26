package pro;

public class Load extends javax.swing.JFrame {

    
    public Load() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }
    
    public void setTitle(String title){   //this method is used to set the title when a specific question is selected by a 
        loadTitleField.setText(title);  //student since the filed's in this class are private we have to use public methods
    }
    public void setQuestion(String question){
        loadQuestionField.setText(question);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        homeScreen = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        loadQuestionField = new javax.swing.JTextArea();
        loadTitleField = new javax.swing.JTextField();
        studentsQuestionViewBackButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel26.setFont(new java.awt.Font("Segoe UI Light", 0, 48)); // NOI18N
        jLabel26.setText("ExamArchives V1.0");

        homeScreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home_52px_1.png"))); // NOI18N
        homeScreen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeScreenMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(629, Short.MAX_VALUE)
                .addComponent(homeScreen)
                .addGap(19, 19, 19))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel26)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(homeScreen)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel26)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 100));

        jPanel3.setBackground(new java.awt.Color(33, 47, 91));
        jPanel3.setForeground(new java.awt.Color(0, 51, 255));

        loadQuestionField.setEditable(false);
        loadQuestionField.setBackground(new java.awt.Color(33, 47, 91));
        loadQuestionField.setColumns(20);
        loadQuestionField.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        loadQuestionField.setForeground(new java.awt.Color(204, 204, 204));
        loadQuestionField.setRows(5);
        loadQuestionField.setBorder(null);
        jScrollPane1.setViewportView(loadQuestionField);

        loadTitleField.setEditable(false);
        loadTitleField.setBackground(new java.awt.Color(33, 47, 91));
        loadTitleField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        loadTitleField.setForeground(new java.awt.Color(204, 204, 204));
        loadTitleField.setBorder(null);
        loadTitleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadTitleFieldActionPerformed(evt);
            }
        });

        studentsQuestionViewBackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Left_48px.png"))); // NOI18N
        studentsQuestionViewBackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentsQuestionViewBackButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loadTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(studentsQuestionViewBackButton)
                .addGap(318, 318, 318))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loadTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(studentsQuestionViewBackButton)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 700, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadTitleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadTitleFieldActionPerformed
        
    }//GEN-LAST:event_loadTitleFieldActionPerformed

    private void studentsQuestionViewBackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentsQuestionViewBackButtonMouseClicked
        
        StudentLogin log = new StudentLogin();
        log.setVisible(true); log.StudentBack();//Calling a method in StudentLogin class to do a specified task which is commented  
        this.setVisible(false);                 //in that class
    }//GEN-LAST:event_studentsQuestionViewBackButtonMouseClicked

    private void homeScreenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeScreenMouseClicked
        // TODO add your handling code here:
         Login log = new Login();
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeScreenMouseClicked

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
            java.util.logging.Logger.getLogger(Load.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Load.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Load.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Load.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Load().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel homeScreen;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea loadQuestionField;
    private javax.swing.JTextField loadTitleField;
    private javax.swing.JLabel studentsQuestionViewBackButton;
    // End of variables declaration//GEN-END:variables
}
