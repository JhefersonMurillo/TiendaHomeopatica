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
public class HomeCategoryBelleza extends JPanel {
    public JLabel eucerin,ponds,priceEucerin,pricePonds;
    public JPanel JEucerin,JPonds;
    public JButton ButtonEucerin,buttonPonds;

    public HomeCategoryBelleza() {
        
        setPreferredSize(new java.awt.Dimension(730, 500));
        setBackground(new java.awt.Color(235, 235, 235));
        setLayout(null);
        
        JEucerin = new JPanel();
        eucerin = new JLabel();
        JPonds = new JPanel();
        ponds = new JLabel();
        priceEucerin = new JLabel();
        pricePonds = new JLabel();
        ButtonEucerin = new JButton();
        buttonPonds = new JButton();
        
        JEucerin.setBackground(new java.awt.Color(255, 255, 255));
        JEucerin.setLayout(null);
         eucerin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/EucerinBelleza.png"))); // NOI18N
        eucerin.setText("jLabel1");
        JEucerin.add(eucerin);
        eucerin.setBounds(20, 10, 160, 150);
        this.add(JEucerin);
        JEucerin.setBounds(110, 130, 190, 170);
        
        JPonds.setBackground(new java.awt.Color(255, 255, 255));
        JPonds.setLayout(null);
        ponds.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CremaBelleza.png"))); // NOI18N
        JPonds.add(ponds);
        ponds.setBounds(50, 10, 100, 160);
        this.add(JPonds);
        JPonds.setBounds(420, 130, 190, 170);
        
        priceEucerin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        priceEucerin.setText("$ 84.850");
        this.add(priceEucerin);
        priceEucerin.setBounds(110, 320, 90, 40);
        pricePonds.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pricePonds.setText("$ 33.450");
        this.add(pricePonds);
        pricePonds.setBounds(420, 320, 110, 40);
        
        ButtonEucerin.setBackground(new java.awt.Color(100, 25, 115));
        ButtonEucerin.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        ButtonEucerin.setForeground(new java.awt.Color(204, 204, 204));
        ButtonEucerin.setText("Add");
        ButtonEucerin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.add(ButtonEucerin);
        ButtonEucerin.setBounds(240, 330, 60, 23);

        buttonPonds.setBackground(new java.awt.Color(100, 25, 115));
        buttonPonds.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        buttonPonds.setForeground(new java.awt.Color(204, 204, 204));
        buttonPonds.setText("Add");
        buttonPonds.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.add(buttonPonds);
        buttonPonds.setBounds(550, 330, 60, 23);
    }
    
    
    
}
