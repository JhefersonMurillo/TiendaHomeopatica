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
public class HomeInformation extends JPanel {
    JLabel l1,l2,l3,l4,l5,l6;
    JPanel JTecno;
    HomeInformation(){
        setPreferredSize(new java.awt.Dimension(730, 440));
        setBackground(new java.awt.Color(235, 235, 235));
        setLayout(null);
        
        l1 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        JTecno = new javax.swing.JPanel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        
        l1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CodigoU.png"))); // NOI18N
        this.add(l1);
        l1.setBounds(310, 60, 100, 100);

        l3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l3.setText("Tecnologías participantes");
        this.add(l3);
        l3.setBounds(280, 230, 180, 50);
        
        l2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        l2.setText("Código desarrollado en la  Universidad de Cundinamarca");
        this.add(l2);
        l2.setBounds(100, 190, 497, 27);

        JTecno.setBackground(new java.awt.Color(100, 25, 115));
        JTecno.setLayout(null);
        
        l4.setForeground(new java.awt.Color(255, 255, 255));
        l4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/JavaIcon.png"))); // NOI18N
        JTecno.add(l4);
        l4.setBounds(40, 10, 50, 50);

        l5.setForeground(new java.awt.Color(255, 255, 255));
        l5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GitIcon.png"))); // NOI18N
        JTecno.add(l5);
        l5.setBounds(190, 10, 50, 50);

        l6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PhotoIconn.png"))); // NOI18N
        JTecno.add(l6);
        l6.setBounds(320, 20, 60, 40);
        
        this.add(JTecno);        
        JTecno.setBounds(150, 300, 410, 70);

    }
}
