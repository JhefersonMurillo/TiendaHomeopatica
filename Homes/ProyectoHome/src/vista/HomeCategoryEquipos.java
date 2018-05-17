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
public class HomeCategoryEquipos extends JPanel {

    public JPanel JTensiometro, JGlucometro;
    public JLabel tensiometro, glucometro, priceTensiometro, priceGlucometro;
    public JButton buttonTensiometro, buttonGlucometro;

    public HomeCategoryEquipos() {
        setPreferredSize(new java.awt.Dimension(730, 500));
        setBackground(new java.awt.Color(235, 235, 235));
        setLayout(null);

        JTensiometro = new javax.swing.JPanel();
        tensiometro = new javax.swing.JLabel();
        JGlucometro = new javax.swing.JPanel();
        glucometro = new javax.swing.JLabel();
        priceTensiometro = new javax.swing.JLabel();
        priceGlucometro = new javax.swing.JLabel();
        buttonTensiometro = new javax.swing.JButton();
        buttonGlucometro = new javax.swing.JButton();

        JTensiometro.setBackground(new java.awt.Color(255, 255, 255));
        JTensiometro.setLayout(null);
        tensiometro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tensiometro.jpg"))); // NOI18N
        tensiometro.setText("jLabel1");
        JTensiometro.add(tensiometro);
        tensiometro.setBounds(20, 20, 150, 140);
        this.add(JTensiometro);
        JTensiometro.setBounds(110, 130, 190, 170);
        
         JGlucometro.setBackground(new java.awt.Color(255, 255, 255));
        JGlucometro.setLayout(null);

        glucometro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/glucometro.jpg"))); // NOI18N
        JGlucometro.add(glucometro);
        glucometro.setBounds(20, 20, 150, 130);

        this.add(JGlucometro);
        JGlucometro.setBounds(420, 130, 190, 170);

        priceTensiometro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        priceTensiometro.setText("$ 299.000");
        this.add(priceTensiometro);
        priceTensiometro.setBounds(110, 320, 110, 40);

        priceGlucometro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        priceGlucometro.setText("$ 83.600");
        this.add(priceGlucometro);
        priceGlucometro.setBounds(420, 320, 110, 40);
        buttonTensiometro.setBackground(new java.awt.Color(100, 25, 115));
        buttonTensiometro.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        buttonTensiometro.setForeground(new java.awt.Color(204, 204, 204));
        buttonTensiometro.setText("Add");
        buttonTensiometro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.add(buttonTensiometro);
        buttonTensiometro.setBounds(240, 330, 60, 23);

        buttonGlucometro.setBackground(new java.awt.Color(100, 25, 115));
        buttonGlucometro.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        buttonGlucometro.setForeground(new java.awt.Color(204, 204, 204));
        buttonGlucometro.setText("Add");
        buttonGlucometro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.add(buttonGlucometro);
        buttonGlucometro.setBounds(550, 330, 60, 23);
    }
}
