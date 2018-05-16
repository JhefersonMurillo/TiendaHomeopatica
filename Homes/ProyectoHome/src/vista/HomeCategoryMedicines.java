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
public class HomeCategoryMedicines extends JPanel {
    JLabel Dolex,Glig,Tricovit,Dolfenox,Dolexni,voltaren,priceDolfenox,priceGli,PriceDolex,priceTricovi,PriceVoltaren,priceDolexNi;
    JPanel JDolex,JClig,JTricovi,JDolfenox,JDolexNi,JVoltaren;
    JButton buttonDolfenox,buttonGlic,butonDolex,buttonTricovit,buttonVoltaren,buttonDolexNi;
    
    HomeCategoryMedicines(){
        
        setPreferredSize(new java.awt.Dimension(730, 500));
        setBackground(new java.awt.Color(235, 235, 235));
        setLayout(null);
        
        buttonDolfenox = new javax.swing.JButton();
        buttonGlic = new javax.swing.JButton();
        butonDolex = new javax.swing.JButton();
        buttonTricovit = new javax.swing.JButton();
        buttonVoltaren = new javax.swing.JButton();
        buttonDolexNi = new javax.swing.JButton();
        
        priceDolfenox = new javax.swing.JLabel();
        priceGli = new javax.swing.JLabel();
        PriceDolex = new javax.swing.JLabel();
        priceTricovi = new javax.swing.JLabel();
        PriceVoltaren = new javax.swing.JLabel();
        priceDolexNi = new javax.swing.JLabel();
        
        priceDolfenox.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        priceDolfenox.setText("$ 30.650");
        this.add(priceDolfenox);
        priceDolfenox.setBounds(60, 450, 100, 40);

        priceGli.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        priceGli.setText("$ 81.050");
        this.add(priceGli);
        priceGli.setBounds(50, 210, 100, 40);

        PriceDolex.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        PriceDolex.setText("$ 48.100");
        this.add(PriceDolex);
        PriceDolex.setBounds(300, 210, 100, 40);

        priceTricovi.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        priceTricovi.setText("$ 173.900");
        this.add(priceTricovi);
        priceTricovi.setBounds(530, 210, 110, 40);

        PriceVoltaren.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        PriceVoltaren.setText("$ 68.300");
        this.add(PriceVoltaren);
        PriceVoltaren.setBounds(530, 450, 100, 40);

        priceDolexNi.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        priceDolexNi.setText("$ 19.200");
        this.add(priceDolexNi);
        priceDolexNi.setBounds(300, 450, 100, 40);
        
        buttonGlic.setBackground(new java.awt.Color(100, 25, 115));
        buttonGlic.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        buttonGlic.setForeground(new java.awt.Color(204, 204, 204));
        buttonGlic.setText("Add");
        buttonGlic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonGlic.setBounds(190, 460, 60, 23);
        this.add(buttonGlic);
        buttonGlic.setBounds(180, 220, 60, 23);
        
        butonDolex.setBackground(new java.awt.Color(100, 25, 115));
        butonDolex.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        butonDolex.setForeground(new java.awt.Color(204, 204, 204));
        butonDolex.setText("Add");
        butonDolex.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.add(butonDolex);
        butonDolex.setBounds(430, 220, 60, 23);
        
        buttonTricovit.setBackground(new java.awt.Color(100, 25, 115));
        buttonTricovit.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        buttonTricovit.setForeground(new java.awt.Color(204, 204, 204));
        buttonTricovit.setText("Add");
        buttonTricovit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.add(buttonTricovit);
        buttonTricovit.setBounds(650, 220, 60, 23);
        
        buttonVoltaren.setBackground(new java.awt.Color(100, 25, 115));
        buttonVoltaren.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        buttonVoltaren.setForeground(new java.awt.Color(204, 204, 204));
        buttonVoltaren.setText("Add");
        buttonVoltaren.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.add(buttonVoltaren);
        buttonVoltaren.setBounds(660, 460, 60, 23);
        
        buttonDolexNi.setBackground(new java.awt.Color(100, 25, 115));
        buttonDolexNi.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        buttonDolexNi.setForeground(new java.awt.Color(204, 204, 204));
        buttonDolexNi.setText("Add");
        buttonDolexNi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.add(buttonDolexNi);
        buttonDolexNi.setBounds(430, 460, 60, 23);
        
        
        
        
        
        JDolexNi = new javax.swing.JPanel();
        JDolexNi.setBackground(new java.awt.Color(255, 255, 255));
        JDolexNi.setLayout(null);
        this.add(JDolexNi);
        JDolexNi.setBounds(300, 280, 190, 160);
        
        Dolexni = new javax.swing.JLabel();
        Dolexni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DolexNiño.PNG"))); // NOI18N
        JDolexNi.add(Dolexni);
        Dolexni.setBounds(20, 10, 120, 120);
        
        JDolfenox = new javax.swing.JPanel();
        JDolfenox.setBackground(new java.awt.Color(255, 255, 255));
        JDolfenox.setLayout(null);
        this.add(JDolfenox);
        JDolfenox.setBounds(60, 280, 190, 160);
        
        buttonDolfenox.setBackground(new java.awt.Color(100, 25, 115));
        buttonDolfenox.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        buttonDolfenox.setForeground(new java.awt.Color(204, 204, 204));
        buttonDolfenox.setText("Add");
        buttonDolfenox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.add(buttonDolfenox);
        buttonDolfenox.setBounds(190, 460, 60, 23);
        
        Dolfenox = new javax.swing.JLabel();
        Dolfenox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Dolfe.PNG"))); // NOI18N
        JDolfenox.add(Dolfenox);
        Dolfenox.setBounds(20, 10, 160, 120);
        
        JTricovi = new javax.swing.JPanel();
        JTricovi.setBackground(new java.awt.Color(255, 255, 255));
        JTricovi.setLayout(null);
        this.add(JTricovi);
        JTricovi.setBounds(530, 20, 190, 170);
        
        JVoltaren = new javax.swing.JPanel();
        JVoltaren.setBackground(new java.awt.Color(255, 255, 255));
        JVoltaren.setLayout(null);
        JVoltaren.setBounds(530, 280, 190, 160);
        this.add(JVoltaren);
        
        voltaren = new javax.swing.JLabel();
        voltaren.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/asad.png"))); // NOI18N
        JVoltaren.add(voltaren);
        voltaren.setBounds(0, 30, 180, 100);
        
        Tricovit = new javax.swing.JLabel();
        Tricovit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Trivol.PNG"))); // NOI18N
        JTricovi.add(Tricovit);
        Tricovit.setBounds(-10, 10, 210, 200);
                        
        JClig = new javax.swing.JPanel();
        JClig.setBackground(new java.awt.Color(255, 255, 255));
        JClig.setLayout(null);
        this.add(JClig);
        JClig.setBounds(60, 20, 190, 170);
        
        Glig = new javax.swing.JLabel();
        Glig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bloqueadro.png"))); // NOI18N
        Glig.setText("jLabel1");
        JClig.add(Glig);
        Glig.setBounds(30, 10, 120, 150);
        
        JDolex = new javax.swing.JPanel();
        JDolex.setBackground(new java.awt.Color(255, 255, 255));
        JDolex.setLayout(null);
        this.add(JDolex);
        JDolex.setBounds(300, 20, 190, 170);
        
        Dolex = new javax.swing.JLabel();
        Dolex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Dolex.png"))); // NOI18N
        JDolex.add(Dolex);
        Dolex.setBounds(20, 30, 160, 130);

    }
    
}
