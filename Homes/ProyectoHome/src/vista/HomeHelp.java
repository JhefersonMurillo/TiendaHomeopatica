/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.*;

/**
 *
 * @author TURKEYTITAN
 */
public class HomeHelp extends JPanel {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l14, l12, l13;

    HomeHelp() {
        setPreferredSize(new java.awt.Dimension(730, 440));
        setBackground(new java.awt.Color(235, 235, 235));
        setLayout(null);
        l9 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l11 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        l14 = new javax.swing.JLabel();
        l12 = new javax.swing.JLabel();
        l13 = new javax.swing.JLabel();

        l9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        l9.setText("Contactenos a través de la página www.Umedic.com ");
        this.add(l9);
        l9.setBounds(70, 350, 300, 30);

        l8.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        l8.setText("¿Problemas con tu producto?");
        this.add(l8);
        l8.setBounds(70, 310, 270, 30);

        l2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        l2.setText("1. Dirigase a la Categoria y seleccione una");
        this.add(l2);
        l2.setBounds(70, 110, 230, 30);

        l3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        l3.setText("2. De click en comprar");
        this.add(l3);
        l3.setBounds(70, 140, 230, 30);

        l4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        l4.setText("3. Dirigase a Compras");
        this.add(l4);
        l4.setBounds(70, 170, 230, 30);

        l5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        l5.setText("4.Genere su factura");
        this.add(l5);
        l5.setBounds(70, 200, 230, 30);

        l6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        l6.setText("5. Realice el pago");
        this.add(l6);
        l6.setBounds(70, 230, 230, 30);

        l1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        l1.setText("¿Cómo comprar?");
        this.add(l1);
        l1.setBounds(70, 60, 150, 30);

        l7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        l7.setText("5. Realice el pago");
        this.add(l7);
        l7.setBounds(70, 260, 230, 30);

        l11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        l11.setText("Recuerda realizar la actulizacion de datos");
        this.add(l11);
        l11.setBounds(440, 110, 220, 30);

        l10.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        l10.setText("¡Aviso Importante!");
        this.add(l10);
        l10.setBounds(440, 60, 180, 30);

    }

}
