/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;


import javax.swing.*;

/**
 *
 * @author Kilmainham
 */
public class HomeCategoryOrtopedico extends JPanel {

    public JLabel correcto, almohada, priceCorrector, priceAlmohada;
    public JPanel JCorrector, JAlmohada;
    public JButton buttonCorrector, buttonAlmohada;

    public HomeCategoryOrtopedico() {
        setPreferredSize(new java.awt.Dimension(730, 500));
        setBackground(new java.awt.Color(235, 235, 235));
        setLayout(null);

        JCorrector = new javax.swing.JPanel();
        correcto = new javax.swing.JLabel();
        JAlmohada = new javax.swing.JPanel();
        almohada = new javax.swing.JLabel();
        priceCorrector = new javax.swing.JLabel();
        priceAlmohada = new javax.swing.JLabel();
        buttonCorrector = new javax.swing.JButton();
        buttonAlmohada = new javax.swing.JButton();

        JCorrector.setBackground(new java.awt.Color(255, 255, 255));
        JCorrector.setLayout(null);

        correcto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Corrector.png"))); // NOI18N
        correcto.setText("jLabel1");
        JCorrector.add(correcto);
        correcto.setBounds(20, 20, 150, 140);

        this.add(JCorrector);
        JCorrector.setBounds(110, 130, 190, 170);

        JAlmohada.setBackground(new java.awt.Color(255, 255, 255));
        JAlmohada.setLayout(null);

        almohada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AlmohadaOrtopedica.png"))); // NOI18N
        JAlmohada.add(almohada);
        almohada.setBounds(20, 20, 150, 130);

        this.add(JAlmohada);
        JAlmohada.setBounds(420, 130, 190, 170);

        priceCorrector.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        priceCorrector.setText("$ 25.900");
        this.add(priceCorrector);
        priceCorrector.setBounds(110, 320, 110, 40);

        priceAlmohada.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        priceAlmohada.setText("$ 69.900");
        this.add(priceAlmohada);
        priceAlmohada.setBounds(420, 320, 110, 40);

        buttonCorrector.setBackground(new java.awt.Color(100, 25, 115));
        buttonCorrector.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        buttonCorrector.setForeground(new java.awt.Color(204, 204, 204));
        buttonCorrector.setText("Add");
        buttonCorrector.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        this.add(buttonCorrector);
        buttonCorrector.setBounds(240, 330, 60, 23);

        buttonAlmohada.setBackground(new java.awt.Color(100, 25, 115));
        buttonAlmohada.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        buttonAlmohada.setForeground(new java.awt.Color(204, 204, 204));
        buttonAlmohada.setText("Add");
        buttonAlmohada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.add(buttonAlmohada);
        buttonAlmohada.setBounds(550, 330, 60, 23);

    }

}
