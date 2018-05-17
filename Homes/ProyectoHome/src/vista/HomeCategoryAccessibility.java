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
public class HomeCategoryAccessibility extends JPanel {
    public JLabel tablet,priceTablet,priceSillaRuedas,SilladeRuedas;
    public JButton buttonTablet,buttonSillaRuedas;
    public JPanel JTablet,JSillaDeRuedas;
   // JButton buttonTablet,buttonSillaRuedas;
            

    public HomeCategoryAccessibility() {
        setPreferredSize(new java.awt.Dimension(730, 500));
        setBackground(new java.awt.Color(235, 235, 235));
        setLayout(null);
        
        JTablet = new JPanel();
        tablet = new JLabel();
        JSillaDeRuedas = new JPanel();
        SilladeRuedas = new JLabel();
        priceTablet = new JLabel();
        priceSillaRuedas = new JLabel();
        buttonTablet = new JButton();
        buttonSillaRuedas = new JButton();
        
        JTablet.setBackground(new java.awt.Color(255, 255, 255));
        JTablet.setLayout(null);
        tablet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TabletCiego.jpg"))); // NOI18N
        tablet.setText("");
        JTablet.add(tablet);
        tablet.setBounds(20, 10, 160, 150);
        this.add(JTablet);
        JTablet.setBounds(110, 130, 190, 170);
        
        JSillaDeRuedas.setBackground(new java.awt.Color(255, 255, 255));
        JSillaDeRuedas.setLayout(null);
        SilladeRuedas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SillaRuedas.jpg"))); // NOI18N
        JSillaDeRuedas.add(SilladeRuedas);
        SilladeRuedas.setBounds(20, 10, 160, 160);
        this.add(JSillaDeRuedas);
        JSillaDeRuedas.setBounds(420, 130, 190, 170);
        
        priceTablet.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        priceTablet.setText("$ 10.850.000");
        this.add(priceTablet);
        priceTablet.setBounds(90, 320, 134, 40);
        
        priceSillaRuedas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        priceSillaRuedas.setText("$ 4.450.000");
        this.add(priceSillaRuedas);
        priceSillaRuedas.setBounds(400, 320, 130, 40);
        
        buttonTablet.setBackground(new java.awt.Color(100, 25, 115));
        buttonTablet.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        buttonTablet.setForeground(new java.awt.Color(204, 204, 204));
        buttonTablet.setText("Add");
        buttonTablet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.add(buttonTablet);
        buttonTablet.setBounds(240, 330, 60, 23);
        
        buttonSillaRuedas.setBackground(new java.awt.Color(100, 25, 115));
        buttonSillaRuedas.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        buttonSillaRuedas.setForeground(new java.awt.Color(204, 204, 204));
        buttonSillaRuedas.setText("Add");
        buttonSillaRuedas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.add(buttonSillaRuedas);
        buttonSillaRuedas.setBounds(560, 330, 60, 23);
    
    }
    
}
