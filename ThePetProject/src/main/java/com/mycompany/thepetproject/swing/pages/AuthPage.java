/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.thepetproject.swing.pages;

/**
 *
 * @author drioj
 */

public class AuthPage extends javax.swing.JFrame {

    /**
     * Creates new form AuthPage
     */
    public AuthPage() {
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

        jPanel1 = new javax.swing.JPanel();
        tabbedAuthPage = new javax.swing.JTabbedPane();
        panelSignUp = new javax.swing.JPanel();
        panelSignUpCard = new javax.swing.JPanel();
        labelSignUp1 = new javax.swing.JLabel();
        labelUsername2 = new javax.swing.JLabel();
        labelPassword2 = new javax.swing.JLabel();
        labelAdmin1 = new javax.swing.JLabel();
        labelOrLoginAs1 = new javax.swing.JLabel();
        textFieldUsername2 = new javax.swing.JTextField();
        textFieldPassword2 = new javax.swing.JTextField();
        buttonSignUp = new javax.swing.JButton();
        labelAlreadyHave = new javax.swing.JLabel();
        labelLogin1 = new javax.swing.JLabel();
        textFieldConfirmPassword = new javax.swing.JTextField();
        panelLogin = new javax.swing.JPanel();
        panelLoginCard1 = new javax.swing.JPanel();
        textFieldUsername1 = new javax.swing.JTextField();
        textFieldPassword1 = new javax.swing.JTextField();
        labelForgotPassword1 = new javax.swing.JLabel();
        buttonLogin = new javax.swing.JButton();
        labelDontHave = new javax.swing.JLabel();
        labelSignUp = new javax.swing.JLabel();
        labelLogin = new javax.swing.JLabel();
        labelUsername1 = new javax.swing.JLabel();
        labelPassword1 = new javax.swing.JLabel();
        labelAdmin = new javax.swing.JLabel();
        labelOrLoginAs = new javax.swing.JLabel();
        panelAdmin = new javax.swing.JPanel();
        panelLoginCard = new javax.swing.JPanel();
        textFieldUsername = new javax.swing.JTextField();
        textFieldPassword = new javax.swing.JTextField();
        labelForgotPassword = new javax.swing.JLabel();
        labelUserSignUp = new javax.swing.JLabel();
        labelWelcome = new javax.swing.JLabel();
        labelUsername = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        labelUserLogin = new javax.swing.JLabel();
        labelOrGoBack = new javax.swing.JLabel();
        panelLoginBox = new javax.swing.JPanel();
        labelLoginButton = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1000, 710));
        setMinimumSize(new java.awt.Dimension(1000, 710));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelSignUp.setBackground(new java.awt.Color(226, 71, 42));
        panelSignUp.setMaximumSize(new java.awt.Dimension(1000, 710));
        panelSignUp.setMinimumSize(new java.awt.Dimension(1000, 710));

        panelSignUpCard.setBackground(new java.awt.Color(251, 245, 222));
        panelSignUpCard.setPreferredSize(new java.awt.Dimension(361, 426));

        labelSignUp1.setBackground(new java.awt.Color(251, 245, 222));
        labelSignUp1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        labelSignUp1.setForeground(new java.awt.Color(38, 50, 56));
        labelSignUp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSignUp1.setText("Sign Up");
        labelSignUp1.setPreferredSize(new java.awt.Dimension(130, 58));

        labelUsername2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelUsername2.setForeground(new java.awt.Color(38, 50, 56));
        labelUsername2.setText("Username");
        labelUsername2.setPreferredSize(new java.awt.Dimension(68, 17));

        labelPassword2.setForeground(new java.awt.Color(38, 50, 56));
        labelPassword2.setText("Password");
        labelPassword2.setPreferredSize(new java.awt.Dimension(68, 17));

        labelAdmin1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelAdmin1.setForeground(new java.awt.Color(226, 70, 43));
        labelAdmin1.setText("Admin");
        labelAdmin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAdmin1MouseClicked(evt);
            }
        });

        labelOrLoginAs1.setForeground(new java.awt.Color(38, 50, 56));
        labelOrLoginAs1.setText("Or Login as");

        textFieldUsername2.setBackground(new java.awt.Color(255, 255, 255));
        textFieldUsername2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textFieldUsername2.setForeground(new java.awt.Color(38, 50, 56));
        textFieldUsername2.setText("Enter username");
        textFieldUsername2.setAutoscrolls(false);
        textFieldUsername2.setPreferredSize(new java.awt.Dimension(297, 37));
        textFieldUsername2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldUsername2ActionPerformed(evt);
            }
        });

        textFieldPassword2.setBackground(new java.awt.Color(255, 255, 255));
        textFieldPassword2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textFieldPassword2.setForeground(new java.awt.Color(38, 50, 56));
        textFieldPassword2.setText("Enter password");
        textFieldPassword2.setPreferredSize(new java.awt.Dimension(297, 37));

        buttonSignUp.setBackground(new java.awt.Color(38, 50, 56));
        buttonSignUp.setForeground(new java.awt.Color(251, 245, 222));
        buttonSignUp.setText("Sign Up");
        buttonSignUp.setPreferredSize(new java.awt.Dimension(297, 91));

        labelAlreadyHave.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelAlreadyHave.setForeground(new java.awt.Color(38, 50, 56));
        labelAlreadyHave.setText("Already have an account?");

        labelLogin1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelLogin1.setForeground(new java.awt.Color(226, 70, 43));
        labelLogin1.setText("Login");
        labelLogin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLogin1MouseClicked(evt);
            }
        });

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
                        .addComponent(textFieldPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textFieldUsername2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelUsername2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelSignUpCardLayout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addGroup(panelSignUpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelSignUpCardLayout.createSequentialGroup()
                                    .addComponent(labelOrLoginAs1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(labelAdmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelSignUpCardLayout.createSequentialGroup()
                                    .addComponent(labelAlreadyHave)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(labelLogin1))))
                        .addComponent(textFieldConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelSignUp1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );
        panelSignUpCardLayout.setVerticalGroup(
            panelSignUpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSignUpCardLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(labelSignUp1)
                .addGap(18, 18, 18)
                .addComponent(labelUsername2)
                .addGap(5, 5, 5)
                .addComponent(textFieldUsername2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelPassword2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textFieldConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSignUpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAlreadyHave)
                    .addComponent(labelLogin1))
                .addGroup(panelSignUpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOrLoginAs1)
                    .addComponent(labelAdmin1))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout panelSignUpLayout = new javax.swing.GroupLayout(panelSignUp);
        panelSignUp.setLayout(panelSignUpLayout);
        panelSignUpLayout.setHorizontalGroup(
            panelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSignUpLayout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addComponent(panelSignUpCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(317, 317, 317))
        );
        panelSignUpLayout.setVerticalGroup(
            panelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSignUpLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(panelSignUpCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(289, 289, 289))
        );

        tabbedAuthPage.addTab("tab3", panelSignUp);

        panelLogin.setBackground(new java.awt.Color(226, 71, 42));

        panelLoginCard1.setBackground(new java.awt.Color(251, 245, 222));
        panelLoginCard1.setName(""); // NOI18N
        panelLoginCard1.setPreferredSize(new java.awt.Dimension(361, 426));

        textFieldUsername1.setBackground(new java.awt.Color(255, 255, 255));
        textFieldUsername1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textFieldUsername1.setForeground(new java.awt.Color(38, 50, 56));
        textFieldUsername1.setText("Enter username");
        textFieldUsername1.setAutoscrolls(false);
        textFieldUsername1.setPreferredSize(new java.awt.Dimension(297, 37));
        textFieldUsername1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldUsername1ActionPerformed(evt);
            }
        });

        textFieldPassword1.setBackground(new java.awt.Color(255, 255, 255));
        textFieldPassword1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textFieldPassword1.setForeground(new java.awt.Color(38, 50, 56));
        textFieldPassword1.setText("Enter password");
        textFieldPassword1.setPreferredSize(new java.awt.Dimension(297, 37));

        labelForgotPassword1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelForgotPassword1.setForeground(new java.awt.Color(226, 70, 43));
        labelForgotPassword1.setText("Forgot Password?");

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
        labelSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSignUpMouseClicked(evt);
            }
        });

        labelLogin.setBackground(new java.awt.Color(251, 245, 222));
        labelLogin.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(38, 50, 56));
        labelLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogin.setText("Login");
        labelLogin.setPreferredSize(new java.awt.Dimension(130, 58));

        labelUsername1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelUsername1.setForeground(new java.awt.Color(38, 50, 56));
        labelUsername1.setText("Username");
        labelUsername1.setPreferredSize(new java.awt.Dimension(68, 17));

        labelPassword1.setForeground(new java.awt.Color(38, 50, 56));
        labelPassword1.setText("Password");
        labelPassword1.setPreferredSize(new java.awt.Dimension(68, 17));

        labelAdmin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelAdmin.setForeground(new java.awt.Color(226, 70, 43));
        labelAdmin.setText("Admin");
        labelAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAdminMouseClicked(evt);
            }
        });

        labelOrLoginAs.setForeground(new java.awt.Color(38, 50, 56));
        labelOrLoginAs.setText("Or Login as");

        javax.swing.GroupLayout panelLoginCard1Layout = new javax.swing.GroupLayout(panelLoginCard1);
        panelLoginCard1.setLayout(panelLoginCard1Layout);
        panelLoginCard1Layout.setHorizontalGroup(
            panelLoginCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(panelLoginCard1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panelLoginCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLoginCard1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(panelLoginCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLoginCard1Layout.createSequentialGroup()
                                .addComponent(labelOrLoginAs)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLoginCard1Layout.createSequentialGroup()
                                .addComponent(labelDontHave, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelSignUp))))
                    .addGroup(panelLoginCard1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(labelForgotPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panelLoginCard1Layout.setVerticalGroup(
            panelLoginCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginCard1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(labelLogin)
                .addGap(18, 18, 18)
                .addComponent(labelUsername1)
                .addGap(5, 5, 5)
                .addComponent(textFieldUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelPassword1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(labelForgotPassword1)
                .addGap(18, 18, 18)
                .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLoginCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDontHave)
                    .addComponent(labelSignUp))
                .addGroup(panelLoginCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOrLoginAs)
                    .addComponent(labelAdmin))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(332, 332, 332)
                .addComponent(panelLoginCard1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(332, 332, 332))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(panelLoginCard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );

        tabbedAuthPage.addTab("tab2", panelLogin);

        panelAdmin.setBackground(new java.awt.Color(251, 245, 222));
        panelAdmin.setMaximumSize(new java.awt.Dimension(1000, 710));
        panelAdmin.setMinimumSize(new java.awt.Dimension(1000, 710));

        panelLoginCard.setBackground(new java.awt.Color(226, 71, 42));
        panelLoginCard.setMaximumSize(new java.awt.Dimension(361, 426));
        panelLoginCard.setMinimumSize(new java.awt.Dimension(361, 426));
        panelLoginCard.setName(""); // NOI18N

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

        labelUserSignUp.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelUserSignUp.setForeground(new java.awt.Color(251, 245, 222));
        labelUserSignUp.setText("/Sign Up");
        labelUserSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelUserSignUpMouseClicked(evt);
            }
        });

        labelWelcome.setBackground(new java.awt.Color(251, 245, 222));
        labelWelcome.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        labelWelcome.setForeground(new java.awt.Color(38, 50, 56));
        labelWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelWelcome.setText("Welcome");
        labelWelcome.setPreferredSize(new java.awt.Dimension(130, 58));

        labelUsername.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelUsername.setForeground(new java.awt.Color(38, 50, 56));
        labelUsername.setText("Username");
        labelUsername.setPreferredSize(new java.awt.Dimension(68, 17));

        labelPassword.setForeground(new java.awt.Color(38, 50, 56));
        labelPassword.setText("Password");
        labelPassword.setPreferredSize(new java.awt.Dimension(68, 17));

        labelUserLogin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelUserLogin.setForeground(new java.awt.Color(251, 245, 222));
        labelUserLogin.setText("User Login");
        labelUserLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelUserLoginMouseClicked(evt);
            }
        });

        labelOrGoBack.setForeground(new java.awt.Color(38, 50, 56));
        labelOrGoBack.setText("Or go back to");

        panelLoginBox.setBackground(new java.awt.Color(38, 50, 56));
        panelLoginBox.setForeground(new java.awt.Color(255, 255, 255));
        panelLoginBox.setMaximumSize(new java.awt.Dimension(297, 91));
        panelLoginBox.setMinimumSize(new java.awt.Dimension(297, 91));

        labelLoginButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelLoginButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLoginButton.setText("Login");

        javax.swing.GroupLayout panelLoginBoxLayout = new javax.swing.GroupLayout(panelLoginBox);
        panelLoginBox.setLayout(panelLoginBoxLayout);
        panelLoginBoxLayout.setHorizontalGroup(
            panelLoginBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginBoxLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLoginBoxLayout.setVerticalGroup(
            panelLoginBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginBoxLayout.createSequentialGroup()
                .addComponent(labelLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelLoginCardLayout = new javax.swing.GroupLayout(panelLoginCard);
        panelLoginCard.setLayout(panelLoginCardLayout);
        panelLoginCardLayout.setHorizontalGroup(
            panelLoginCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginCardLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panelLoginCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLoginCardLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(labelOrGoBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelUserLogin)
                        .addGap(0, 0, 0)
                        .addComponent(labelUserSignUp))
                    .addComponent(labelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLoginCardLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(labelForgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelLoginBox, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLoginCardLayout.setVerticalGroup(
            panelLoginCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginCardLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(labelWelcome)
                .addGap(18, 18, 18)
                .addComponent(labelUsername)
                .addGap(5, 5, 5)
                .addComponent(textFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(labelForgotPassword)
                .addGap(16, 16, 16)
                .addComponent(panelLoginBox, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLoginCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOrGoBack)
                    .addComponent(labelUserLogin)
                    .addComponent(labelUserSignUp))
                .addGap(71, 71, 71))
        );

        javax.swing.GroupLayout panelAdminLayout = new javax.swing.GroupLayout(panelAdmin);
        panelAdmin.setLayout(panelAdminLayout);
        panelAdminLayout.setHorizontalGroup(
            panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdminLayout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addComponent(panelLoginCard, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(422, Short.MAX_VALUE))
        );
        panelAdminLayout.setVerticalGroup(
            panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdminLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(panelLoginCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
        );

        tabbedAuthPage.addTab("tab1", panelAdmin);

        jPanel1.add(tabbedAuthPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -34, -1, 830));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldUsernameActionPerformed

    private void textFieldUsername1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldUsername1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldUsername1ActionPerformed

    private void labelSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSignUpMouseClicked
        tabbedAuthPage.setSelectedIndex(0);
    }//GEN-LAST:event_labelSignUpMouseClicked

    private void textFieldUsername2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldUsername2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldUsername2ActionPerformed

    private void textFieldConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldConfirmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldConfirmPasswordActionPerformed

    private void labelUserLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUserLoginMouseClicked
        tabbedAuthPage.setSelectedIndex(1);
    }//GEN-LAST:event_labelUserLoginMouseClicked

    private void labelUserSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUserSignUpMouseClicked
        tabbedAuthPage.setSelectedIndex(0);
    }//GEN-LAST:event_labelUserSignUpMouseClicked

    private void labelAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAdminMouseClicked
        tabbedAuthPage.setSelectedIndex(2);
    }//GEN-LAST:event_labelAdminMouseClicked

    private void labelLogin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLogin1MouseClicked
        tabbedAuthPage.setSelectedIndex(1);
    }//GEN-LAST:event_labelLogin1MouseClicked

    private void labelAdmin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAdmin1MouseClicked
        tabbedAuthPage.setSelectedIndex(2);
    }//GEN-LAST:event_labelAdmin1MouseClicked

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
            java.util.logging.Logger.getLogger(AuthPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AuthPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AuthPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuthPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AuthPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogin;
    private javax.swing.JButton buttonSignUp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAdmin;
    private javax.swing.JLabel labelAdmin1;
    private javax.swing.JLabel labelAlreadyHave;
    private javax.swing.JLabel labelDontHave;
    private javax.swing.JLabel labelForgotPassword;
    private javax.swing.JLabel labelForgotPassword1;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelLogin1;
    private javax.swing.JLabel labelLoginButton;
    private javax.swing.JLabel labelOrGoBack;
    private javax.swing.JLabel labelOrLoginAs;
    private javax.swing.JLabel labelOrLoginAs1;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelPassword1;
    private javax.swing.JLabel labelPassword2;
    private javax.swing.JLabel labelSignUp;
    private javax.swing.JLabel labelSignUp1;
    private javax.swing.JLabel labelUserLogin;
    private javax.swing.JLabel labelUserSignUp;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JLabel labelUsername1;
    private javax.swing.JLabel labelUsername2;
    private javax.swing.JLabel labelWelcome;
    private javax.swing.JPanel panelAdmin;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelLoginBox;
    private javax.swing.JPanel panelLoginCard;
    private javax.swing.JPanel panelLoginCard1;
    private javax.swing.JPanel panelSignUp;
    private javax.swing.JPanel panelSignUpCard;
    private javax.swing.JTabbedPane tabbedAuthPage;
    private javax.swing.JTextField textFieldConfirmPassword;
    private javax.swing.JTextField textFieldPassword;
    private javax.swing.JTextField textFieldPassword1;
    private javax.swing.JTextField textFieldPassword2;
    private javax.swing.JTextField textFieldUsername;
    private javax.swing.JTextField textFieldUsername1;
    private javax.swing.JTextField textFieldUsername2;
    // End of variables declaration//GEN-END:variables
}
