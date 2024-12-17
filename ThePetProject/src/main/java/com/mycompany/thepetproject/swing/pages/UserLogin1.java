/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.thepetproject.swing.pages;

/**
 *
 * @author deynklarys
 */
public class UserLogin1 extends javax.swing.JFrame {

    /**
     * Creates new form UserLogin
     */
    public UserLogin1() {
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
        panelLoginCard = new javax.swing.JPanel();
        textFieldUsername = new javax.swing.JTextField();
        textFieldPassword = new javax.swing.JTextField();
        labelForgotPassword = new javax.swing.JLabel();
        buttonLogin = new javax.swing.JButton();
        labelDontHave = new javax.swing.JLabel();
        labelSignUp = new javax.swing.JLabel();
        labelLogin = new javax.swing.JLabel();
        labelUsername = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        labelAdmin = new javax.swing.JLabel();
        labelOrLoginAs = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        panelRedBg.setBackground(new java.awt.Color(226, 71, 42));

        panelLoginCard.setBackground(new java.awt.Color(251, 245, 222));
        panelLoginCard.setName(""); // NOI18N
        panelLoginCard.setPreferredSize(new java.awt.Dimension(361, 426));

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

        labelForgotPassword.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelForgotPassword.setForeground(new java.awt.Color(226, 70, 43));
        labelForgotPassword.setText("Forgot Password?");

        buttonLogin.setBackground(new java.awt.Color(38, 50, 56));
        buttonLogin.setForeground(new java.awt.Color(251, 245, 222));
        buttonLogin.setText("Login");
        buttonLogin.setPreferredSize(new java.awt.Dimension(297, 91));

        labelDontHave.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelDontHave.setForeground(new java.awt.Color(38, 50, 56));
        labelDontHave.setText("Don't have an account? ");

        labelSignUp.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelSignUp.setForeground(new java.awt.Color(226, 70, 43));
        labelSignUp.setText("Sign Up");

        labelLogin.setBackground(new java.awt.Color(251, 245, 222));
        labelLogin.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(38, 50, 56));
        labelLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogin.setText("Login");
        labelLogin.setPreferredSize(new java.awt.Dimension(130, 58));

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

        javax.swing.GroupLayout panelLoginCardLayout = new javax.swing.GroupLayout(panelLoginCard);
        panelLoginCard.setLayout(panelLoginCardLayout);
        panelLoginCardLayout.setHorizontalGroup(
            panelLoginCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(panelLoginCardLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panelLoginCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLoginCardLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(panelLoginCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLoginCardLayout.createSequentialGroup()
                                .addComponent(labelOrLoginAs)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLoginCardLayout.createSequentialGroup()
                                .addComponent(labelDontHave, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelSignUp))))
                    .addGroup(panelLoginCardLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(labelForgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panelLoginCardLayout.setVerticalGroup(
            panelLoginCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginCardLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(labelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(textFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(labelForgotPassword)
                .addGap(18, 18, 18)
                .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLoginCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDontHave)
                    .addComponent(labelSignUp))
                .addGroup(panelLoginCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOrLoginAs)
                    .addComponent(labelAdmin))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout panelRedBgLayout = new javax.swing.GroupLayout(panelRedBg);
        panelRedBg.setLayout(panelRedBgLayout);
        panelRedBgLayout.setHorizontalGroup(
            panelRedBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedBgLayout.createSequentialGroup()
                .addGap(332, 332, 332)
                .addComponent(panelLoginCard, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(332, 332, 332))
        );
        panelRedBgLayout.setVerticalGroup(
            panelRedBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRedBgLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(panelLoginCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );

        getContentPane().add(panelRedBg, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldUsernameActionPerformed

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
            java.util.logging.Logger.getLogger(UserLogin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLogin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLogin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLogin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLogin1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogin;
    private javax.swing.JLabel labelAdmin;
    private javax.swing.JLabel labelDontHave;
    private javax.swing.JLabel labelForgotPassword;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelOrLoginAs;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelSignUp;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JPanel panelLoginCard;
    private javax.swing.JPanel panelRedBg;
    private javax.swing.JTextField textFieldPassword;
    private javax.swing.JTextField textFieldUsername;
    // End of variables declaration//GEN-END:variables
}
