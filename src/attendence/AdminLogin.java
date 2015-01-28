/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package attendence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author admin
 */
public class AdminLogin extends javax.swing.JFrame {

    /**
     * Creates new form AdminLogin
     */
    public AdminLogin() {
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

        teacherLoginTitle = new javax.swing.JLabel();
        adminLoginUsername = new javax.swing.JTextField();
        adminPassword = new javax.swing.JLabel();
        adminUsername = new javax.swing.JLabel();
        adminLoginPassword = new javax.swing.JPasswordField();
        adminLoginbutton = new javax.swing.JButton();
        BackToHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        teacherLoginTitle.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        teacherLoginTitle.setText("Admin's Login ");

        adminLoginUsername.setText("Enter your username here");
        adminLoginUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminLoginUsernameMouseClicked(evt);
            }
        });
        adminLoginUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLoginUsernameActionPerformed(evt);
            }
        });

        adminPassword.setText("Password :");

        adminUsername.setText("Username :");

        adminLoginbutton.setText("LOGIN");
        adminLoginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLoginbuttonActionPerformed(evt);
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
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adminUsername)
                            .addComponent(adminPassword))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(adminLoginUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(adminLoginPassword)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BackToHome, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adminLoginbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(teacherLoginTitle)
                .addGap(145, 145, 145))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(teacherLoginTitle)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminUsername)
                    .addComponent(adminLoginUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminPassword)
                    .addComponent(adminLoginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminLoginbutton)
                    .addComponent(BackToHome))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminLoginUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminLoginUsernameMouseClicked
        // TODO add your handling code here:
        adminLoginUsername.setText("");
    }//GEN-LAST:event_adminLoginUsernameMouseClicked

    private void BackToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToHomeActionPerformed
        // TODO add your handling code here:
        HomePage hp = new HomePage();
        hp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackToHomeActionPerformed

    private void adminLoginUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLoginUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminLoginUsernameActionPerformed

    private void adminLoginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLoginbuttonActionPerformed
         try {
            String sql="SELECT * from attendance.admin WHERE Email='"+adminLoginUsername.getText()+"'";
            Statement stmt=null;
            stmt=Connectivity.mydb().createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            if(adminLoginPassword.getText().equals(rs.getString("Password"))){
                AdminDetail ad = new AdminDetail();
                ad.setVisible(true);
                this.setVisible(false);
            }else{showMessageDialog(null, "your Username and Password do not match!!!");}
        } catch (SQLException ex) {
            Logger.getLogger(StudentLogin.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }//GEN-LAST:event_adminLoginbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToHome;
    private javax.swing.JPasswordField adminLoginPassword;
    private javax.swing.JTextField adminLoginUsername;
    private javax.swing.JButton adminLoginbutton;
    private javax.swing.JLabel adminPassword;
    private javax.swing.JLabel adminUsername;
    private javax.swing.JLabel teacherLoginTitle;
    // End of variables declaration//GEN-END:variables
}
