/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import javax.swing.*;

/**
 *
 * @author TURKEYTITAN
 */
public class Panelcate extends JFrame {

    JLabel contraseña,usuario,logoUser,jLabel5,jLabel3,Close;
    JPanel JRegistrarse,JIngresar;
    JTextField textUsuario;
    JPasswordField  textContraseña;
    KGradientPanel kGradientPanel;
    
    Panelcate() {
        
        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CloseWhite.png"))); // NOI18N
        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        Close.setBounds(950, 20, 30, 20);
       
        kGradientPanel = new KGradientPanel();
        textUsuario = new javax.swing.JTextField();
        textContraseña = new javax.swing.JPasswordField();
        contraseña = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        logoUser = new javax.swing.JLabel();
        JIngresar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        JRegistrarse = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        kGradientPanel.setkEndColor(new java.awt.Color(204, 0, 204));
        kGradientPanel.setkGradientFocus(50);
        kGradientPanel.setkStartColor(new java.awt.Color(0, 204, 204));
        kGradientPanel.setLayout(null);

        textUsuario.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        textUsuario.setForeground(new java.awt.Color(255, 255, 255));
        textUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        textUsuario.setCaretColor(new java.awt.Color(255, 255, 255));
        textUsuario.setOpaque(false);
        
        kGradientPanel.add(textUsuario);
        textUsuario.setBounds(330, 230, 300, 30);
        kGradientPanel.add(Close);

        textContraseña.setForeground(new java.awt.Color(255, 255, 255));
        textContraseña.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        textContraseña.setCaretColor(new java.awt.Color(255, 255, 255));
        textContraseña.setOpaque(false);
        textContraseña.setSelectionColor(new java.awt.Color(255, 255, 255));
        kGradientPanel.add(textContraseña);
        textContraseña.setBounds(330, 310, 300, 30);

        contraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        contraseña.setForeground(new java.awt.Color(255, 255, 255));
        contraseña.setText("Contraseña");
        kGradientPanel.add(contraseña);
        contraseña.setBounds(330, 280, 80, 20);

        usuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.setText("Usuario");
        kGradientPanel.add(usuario);
        usuario.setBounds(330, 200, 60, 20);

        logoUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UsuarioLoginn.png"))); // NOI18N
        kGradientPanel.add(logoUser);
        logoUser.setBounds(450, 90, 70, 80);

        JIngresar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        JIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JIngresar.setOpaque(false);
        JIngresar.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ingresar");
        JIngresar.add(jLabel5);
        jLabel5.setBounds(30, 0, 60, 20);

        kGradientPanel.add(JIngresar);
        JIngresar.setBounds(330, 400, 120, 30);

        JRegistrarse.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        JRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JRegistrarse.setOpaque(false);
        JRegistrarse.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registrarse");
        JRegistrarse.add(jLabel3);
        jLabel3.setBounds(20, 0, 90, 20);

        kGradientPanel.add(JRegistrarse);
        JRegistrarse.setBounds(510, 400, 120, 30);

        getContentPane().add(kGradientPanel);
        kGradientPanel.setBounds(0, 0, 1000, 610);
        

    }

}
