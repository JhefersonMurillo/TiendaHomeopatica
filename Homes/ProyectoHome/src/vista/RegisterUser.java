/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author TURKEYTITAN
 */
public class RegisterUser extends JFrame {

    public JLabel correoElctronico, Nombres, jLabel4, contraseña, usuario, logoUser, guardar, logoUmedic, atras, umedic, Minimize, Close, Apellidos, direccion;
    public JPanel JRegistrarse, JIngresar, JAtras, JGuardar;
    public JTextField textoDireccion, textoApellidos, textousuario, textoNombres, textoCorreo;
    public JPasswordField textocontraseña;
    public KGradientPanel kGradientPanel1;

    public RegisterUser() {
        setSize(1000, 610);
        setUndecorated(true);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);

        kGradientPanel1 = new KGradientPanel();
        textoNombres = new javax.swing.JTextField();
        Apellidos = new javax.swing.JLabel();
        direccion = new javax.swing.JLabel();
        JAtras = new javax.swing.JPanel();
        atras = new javax.swing.JLabel();
        JGuardar = new javax.swing.JPanel();
        guardar = new javax.swing.JLabel();
        umedic = new javax.swing.JLabel();
        logoUmedic = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textoCorreo = new javax.swing.JTextField();
        contraseña = new javax.swing.JLabel();
        Nombres = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        correoElctronico = new javax.swing.JLabel();
        textousuario = new javax.swing.JTextField();
        textoApellidos = new javax.swing.JTextField();

        textoDireccion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 240, 204));
        kGradientPanel1.setkGradientFocus(100);
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 0, 204));
        kGradientPanel1.setLayout(null);

        textoNombres.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        textoNombres.setForeground(new java.awt.Color(255, 255, 255));
        textoNombres.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        textoNombres.setCaretColor(new java.awt.Color(255, 255, 255));
        textoNombres.setOpaque(false);

        kGradientPanel1.add(textoNombres);
        textoNombres.setBounds(150, 140, 290, 30);

        Apellidos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Apellidos.setForeground(new java.awt.Color(255, 255, 255));
        Apellidos.setText("Apellidos");
        kGradientPanel1.add(Apellidos);
        Apellidos.setBounds(560, 120, 90, 20);

        direccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        direccion.setForeground(new java.awt.Color(255, 255, 255));
        direccion.setText("Dirección");
        kGradientPanel1.add(direccion);
        direccion.setBounds(560, 290, 140, 20);

        JAtras.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(215, 8, 243)));
        JAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JAtras.setOpaque(false);
        JAtras.setLayout(null);

        atras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        atras.setForeground(new java.awt.Color(215, 8, 243));
        atras.setText("Atrás");
        JAtras.add(atras);
        atras.setBounds(40, 0, 40, 20);

        kGradientPanel1.add(JAtras);
        JAtras.setBounds(640, 450, 120, 30);

        JGuardar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(215, 8, 243)));
        JGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JGuardar.setOpaque(false);
        JGuardar.setLayout(null);

        guardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        guardar.setForeground(new java.awt.Color(215, 8, 243));
        guardar.setText("Guardar");
        JGuardar.add(guardar);
        guardar.setBounds(30, 0, 60, 20);

        kGradientPanel1.add(JGuardar);
        JGuardar.setBounds(810, 450, 120, 30);

        umedic.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        umedic.setForeground(new java.awt.Color(255, 255, 255));
        umedic.setText("Umedic");
        kGradientPanel1.add(umedic);
        umedic.setBounds(80, 20, 70, 40);

        logoUmedic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Corazon40.png"))); // NOI18N
        kGradientPanel1.add(logoUmedic);
        logoUmedic.setBounds(20, 20, 50, 50);

        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CloseWhite.png"))); // NOI18N
        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kGradientPanel1.add(Close);
        Close.setBounds(950, 20, 30, 20);

        Minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menos.png"))); // NOI18N
        Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kGradientPanel1.add(Minimize);
        Minimize.setBounds(900, 20, 30, 30);

        textoCorreo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        textoCorreo.setForeground(new java.awt.Color(255, 255, 255));
        textoCorreo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        textoCorreo.setCaretColor(new java.awt.Color(255, 255, 255));
        textoCorreo.setOpaque(false);
        kGradientPanel1.add(textoCorreo);
        textoCorreo.setBounds(150, 310, 290, 30);
        
        textocontraseña= new JPasswordField();
        textocontraseña.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        textocontraseña.setForeground(new java.awt.Color(255, 255, 255));
        textocontraseña.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        textocontraseña.setCaretColor(new java.awt.Color(255, 255, 255));
        textocontraseña.setOpaque(false);
        kGradientPanel1.add(textocontraseña);
        textocontraseña.setBounds(560, 220, 290, 30);
        

        contraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        contraseña.setForeground(new java.awt.Color(255, 255, 255));
        contraseña.setText("Contraseña");
        kGradientPanel1.add(contraseña);
        contraseña.setBounds(560, 200, 80, 20);

        Nombres.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Nombres.setForeground(new java.awt.Color(255, 255, 255));
        Nombres.setText("Nombres");
        kGradientPanel1.add(Nombres);
        Nombres.setBounds(150, 120, 120, 20);

        usuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.setText("Usuario");
        kGradientPanel1.add(usuario);
        usuario.setBounds(150, 200, 80, 20);

        correoElctronico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        correoElctronico.setForeground(new java.awt.Color(255, 255, 255));
        correoElctronico.setText("Correo Electrónico");
        kGradientPanel1.add(correoElctronico);
        correoElctronico.setBounds(150, 290, 140, 20);

        textousuario.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        textousuario.setForeground(new java.awt.Color(255, 255, 255));
        textousuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        textousuario.setCaretColor(new java.awt.Color(255, 255, 255));
        textousuario.setOpaque(false);

        kGradientPanel1.add(textousuario);
        textousuario.setBounds(150, 220, 290, 30);

        textoApellidos.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        textoApellidos.setForeground(new java.awt.Color(255, 255, 255));
        textoApellidos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        textoApellidos.setCaretColor(new java.awt.Color(255, 255, 255));
        textoApellidos.setOpaque(false);

        kGradientPanel1.add(textoApellidos);
        textoApellidos.setBounds(560, 140, 290, 30);

        textoDireccion.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        textoDireccion.setForeground(new java.awt.Color(255, 255, 255));
        textoDireccion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        textoDireccion.setCaretColor(new java.awt.Color(255, 255, 255));
        textoDireccion.setOpaque(false);

        kGradientPanel1.add(textoDireccion);
        textoDireccion.setBounds(560, 310, 290, 30);

        this.add(kGradientPanel1);
        kGradientPanel1.setBounds(0, 0, 1001, 623);
       
       
    }

    public String getTextoDireccion() {
        return textoDireccion.getText();
    }

    public String getTextoUsuario() {
        return textousuario.getText();
    }

    public String getTextoNombres() {
        if (textoApellidos.getText() != "") {
            return textoNombres.getText() + " " + textoApellidos.getText();
        }
        return textoNombres.getText();
    }

    public String getTextoCorreo() {
        return textoCorreo.getText();
    }

    public String getTextPassword() {
        return String.valueOf(textocontraseña.getPassword());
    }

    public Boolean getFilledTexts() {
        if (getTextoNombres() != "" && getTextoUsuario() != "" && getTextoDireccion() != "" && getTextoCorreo() != "" && getTextPassword() != "") {
            return false;
        }
        return true;
    }
}
