
package attendence;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class NewRegistration extends javax.swing.JFrame {

    /**
     * Creates new form NewRegistration
     */
    public NewRegistration() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        regFirstName = new javax.swing.JTextField();
        regLastName = new javax.swing.JTextField();
        regEmailId = new javax.swing.JTextField();
        regProfile = new javax.swing.JComboBox();
        regCreatePass = new javax.swing.JPasswordField();
        regConfirmPass = new javax.swing.JPasswordField();
        regButton = new javax.swing.JButton();
        BackToHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Registration");

        jLabel2.setText("Name ");

        jLabel4.setText("Email_ID :");

        jLabel5.setText("Create password :");

        jLabel6.setText("Confirm password :");

        jLabel7.setText("Profile :");

        regFirstName.setText("First");
        regFirstName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regFirstNameMouseClicked(evt);
            }
        });

        regLastName.setText("Last");
        regLastName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regLastNameMouseClicked(evt);
            }
        });

        regEmailId.setText("Enter your email_id");
        regEmailId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regEmailIdMouseClicked(evt);
            }
        });

        regProfile.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Student", "Teacher" }));
        regProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regProfileActionPerformed(evt);
            }
        });

        regCreatePass.setText("jPasswordField1");
        regCreatePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regCreatePassMouseClicked(evt);
            }
        });

        regConfirmPass.setText("jPasswordField1");
        regConfirmPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regConfirmPassMouseClicked(evt);
            }
        });

        regButton.setText("Register");
        regButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regButtonActionPerformed(evt);
            }
        });

        BackToHome.setText("BACK");
        BackToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BackToHome, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(regButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(regFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(regLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(regCreatePass)
                            .addComponent(regEmailId)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(regProfile, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(regConfirmPass))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regCreatePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regButton)
                    .addComponent(BackToHome))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regFirstNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regFirstNameMouseClicked
        // TODO add your handling code here:
        regFirstName.setText("");
    }//GEN-LAST:event_regFirstNameMouseClicked

    private void regLastNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regLastNameMouseClicked
        // TODO add your handling code here:
        regLastName.setText("");
    }//GEN-LAST:event_regLastNameMouseClicked

    private void regEmailIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regEmailIdMouseClicked
        // TODO add your handling code here:
        regEmailId.setText("");
    }//GEN-LAST:event_regEmailIdMouseClicked

    private void regProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regProfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regProfileActionPerformed

    private void regCreatePassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regCreatePassMouseClicked
        // TODO add your handling code here:
        regCreatePass.setText("");
    }//GEN-LAST:event_regCreatePassMouseClicked

    private void regConfirmPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regConfirmPassMouseClicked
        // TODO add your handling code here:
        regConfirmPass.setText("");
    }//GEN-LAST:event_regConfirmPassMouseClicked

    private void BackToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToHomeActionPerformed
        // TODO add your handling code here:
        HomePage hp = new HomePage();
        hp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackToHomeActionPerformed

    private void regButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regButtonActionPerformed
        // TODO add your handling code here:
        Statement stmt= null;
        
        
        String fn = regFirstName.getText();
        String ln = regLastName.getText();
        String eid = regEmailId.getText();
        String pass = regCreatePass.getText();
        String prof = regProfile.getSelectedItem().toString();
        
        String sql = "INSERT INTO attendance.register VALUES('"+fn+"','"+ln+"','"+eid+"','"+pass+"','"+prof+"')";
        try {
            stmt = Connectivity.mydb().createStatement();
        
            stmt.executeUpdate(sql);
        }  catch (SQLException ex) {
            Logger.getLogger(NewRegistration.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_regButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NewRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewRegistration().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton regButton;
    private javax.swing.JPasswordField regConfirmPass;
    private javax.swing.JPasswordField regCreatePass;
    private javax.swing.JTextField regEmailId;
    private javax.swing.JTextField regFirstName;
    private javax.swing.JTextField regLastName;
    private javax.swing.JComboBox regProfile;
    // End of variables declaration//GEN-END:variables
}
