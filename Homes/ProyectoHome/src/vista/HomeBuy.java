/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author TURKEYTITAN
 */
public class HomeBuy extends JPanel {

    public JButton comprardefinitiva;
    public JPanel GridPanel, jPanel1,Jbutton;
    public HomeBuy() {
        
        
        GridPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Jbutton = new javax.swing.JPanel();
        comprardefinitiva = new JButton("Confirmar");

        this.setBackground(new java.awt.Color(235, 235, 235));
        this.setLayout(null);

        GridPanel.setLayout(new java.awt.GridLayout());
        jPanel1.setBackground(new java.awt.Color(235, 235, 235));
        GridPanel.add(jPanel1);

        this.add(GridPanel);
        GridPanel.setBounds(0, 0, 730, 460);

        Jbutton.setLayout(null);

        
        Jbutton.add(comprardefinitiva);
        comprardefinitiva.setBounds(53, 0, 100, 23);
       
        comprardefinitiva.setForeground(new java.awt.Color(204, 204, 204));
        comprardefinitiva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comprardefinitiva.setBackground(new java.awt.Color(100, 25, 115));
        comprardefinitiva.setFont(new java.awt.Font("Segoe UI", 1, 11));

        this.add(Jbutton);
        Jbutton.setBounds(500, 460, 180, 30);

        this.setBounds(270, 120, 730, 500);
        /*setBackground(new java.awt.Color(235, 235, 235));
        setLayout(null);
        setBounds(270, 120, 730, 450);
        this.setBackground(new java.awt.Color(235, 235, 235));
        this.setLayout(null);

        GridPanel.setLayout(new java.awt.GridLayout());
        this.add(GridPanel);
        GridPanel.setBounds(0, 0, 730, 460);

        
       

        comprardefinitiva = new JButton("Confirmar Compra");
        comprardefinitiva.setForeground(new java.awt.Color(204, 204, 204));
        comprardefinitiva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comprardefinitiva.setBackground(new java.awt.Color(100, 25, 115));
        comprardefinitiva.setFont(new java.awt.Font("Segoe UI", 1, 11));
        comprardefinitiva.setBounds(450,380,40,10);
        GridPanel = new JPanel();
        
        
        */

    }

}
