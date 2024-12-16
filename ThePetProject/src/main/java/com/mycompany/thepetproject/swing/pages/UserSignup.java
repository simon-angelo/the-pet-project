/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.thepetproject.swing.pages;

/**
 *
 * @author deynklarys
 */
public class UserSignup extends javax.swing.JFrame {

    /**
     * Creates new form UserSignup
     */
    public UserSignup() {
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

        panelRedBg = new javax.swing.JPanel();
        panelSignUpCard = new javax.swing.JPanel();
        labelSignUp = new javax.swing.JLabel();
        labelUsername = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        labelAdmin = new javax.swing.JLabel();
        labelOrLoginAs = new javax.swing.JLabel();
        textFieldUsername = new javax.swing.JTextField();
        textFieldPassword = new javax.swing.JTextField();
        buttonSignUp = new javax.swing.JButton();
        labelAlreadyHave = new javax.swing.JLabel();
        labelLogin = new javax.swing.JLabel();
        textFieldConfirmPassword = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelRedBg.setBackground(new java.awt.Color(226, 71, 42));

        panelSignUpCard.setBackground(new java.awt.Color(251, 245, 222));
        panelSignUpCard.setPreferredSize(new java.awt.Dimension(361, 426));

        labelSignUp.setBackground(new java.awt.Color(251, 245, 222));
        labelSignUp.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        labelSignUp.setForeground(new java.awt.Color(38, 50, 56));
        labelSignUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSignUp.setText("Sign Up");
        labelSignUp.setPreferredSize(new java.awt.Dimension(130, 58));

        labelUsername.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelUsername.setForeground(new java.awt.Color(38, 50, 56));
        labelUsername.setText("Username");
        labelUsername.setPreferredSize(new java.awt.Dimension(68, 17));

        labelPassword.setForeground(new java.awt.Color(38, 50, 56));
        labelPassword.setText("Password");
        labelPassword.setPreferredSize(new java.awt.Dimension(68, 17));

        labelAdmin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelAdmin.setForeground(new java.awt.Color(226, 70, 43));
        labelAdmin.setText("Admin");

        labelOrLoginAs.setForeground(new java.awt.Color(38, 50, 56));
        labelOrLoginAs.setText("Or Login as");

        textFieldUsername.setBackground(new java.awt.Color(255, 255, 255));
        textFieldUsername.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textFieldUsername.setForeground(new java.awt.Color(38, 50, 56));
        textFieldUsername.setText("Enter username");
        textFieldUsername.setAutoscrolls(false);
        textFieldUsername.setPreferredSize(new java.awt.Dimension(297, 37));
        textFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldUsernameActionPerformed(evt);
            }
        });

        textFieldPassword.setBackground(new java.awt.Color(255, 255, 255));
        textFieldPassword.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textFieldPassword.setForeground(new java.awt.Color(38, 50, 56));
        textFieldPassword.setText("Enter password");
        textFieldPassword.setPreferredSize(new java.awt.Dimension(297, 37));

        buttonSignUp.setBackground(new java.awt.Color(38, 50, 56));
        buttonSignUp.setForeground(new java.awt.Color(251, 245, 222));
        buttonSignUp.setText("Sign Up");
        buttonSignUp.setPreferredSize(new java.awt.Dimension(297, 91));

        labelAlreadyHave.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelAlreadyHave.setForeground(new java.awt.Color(38, 50, 56));
        labelAlreadyHave.setText("Already have an account?");

        labelLogin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(226, 70, 43));
        labelLogin.setText("Login");

        textFieldConfirmPassword.setBackground(new java.awt.Color(255, 255, 255));
        textFieldConfirmPassword.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textFieldConfirmPassword.setForeground(new java.awt.Color(38, 50, 56));
        textFieldConfirmPassword.setText("Confirm password");
        textFieldConfirmPassword.setPreferredSize(new java.awt.Dimension(297, 37));
        textFieldConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldConfirmPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSignUpCardLayout = new javax.swing.GroupLayout(panelSignUpCard);
        panelSignUpCard.setLayout(panelSignUpCardLayout);
        panelSignUpCardLayout.setHorizontalGroup(
            panelSignUpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSignUpCardLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(panelSignUpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelSignUpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(buttonSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelSignUpCardLayout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addGroup(panelSignUpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelSignUpCardLayout.createSequentialGroup()
                                    .addComponent(labelOrLoginAs, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(labelAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelSignUpCardLayout.createSequentialGroup()
                                    .addComponent(labelAlreadyHave)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(labelLogin))))
                        .addComponent(textFieldConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );
        panelSignUpCardLayout.setVerticalGroup(
            panelSignUpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSignUpCardLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(labelSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(textFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textFieldConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSignUpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAlreadyHave)
                    .addComponent(labelLogin))
                .addGroup(panelSignUpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOrLoginAs)
                    .addComponent(labelAdmin))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout panelRedBgLayout = new javax.swing.GroupLayout(panelRedBg);
        panelRedBg.setLayout(panelRedBgLayout);
        panelRedBgLayout.setHorizontalGroup(
            panelRedBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedBgLayout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addComponent(panelSignUpCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(317, 317, 317))
        );
        panelRedBgLayout.setVerticalGroup(
            panelRedBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedBgLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(panelSignUpCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );

        getContentPane().add(panelRedBg, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldUsernameActionPerformed

    private void textFieldConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldConfirmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldConfirmPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(UserSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserSignup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSignUp;
    private javax.swing.JLabel labelAdmin;
    private javax.swing.JLabel labelAlreadyHave;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelOrLoginAs;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelSignUp;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JPanel panelRedBg;
    private javax.swing.JPanel panelSignUpCard;
    private javax.swing.JTextField textFieldConfirmPassword;
    private javax.swing.JTextField textFieldPassword;
    private javax.swing.JTextField textFieldUsername;
    // End of variables declaration//GEN-END:variables
}
