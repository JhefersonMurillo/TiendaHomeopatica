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
public class HomePanelInicio extends JPanel {

    JLabel ofertas, l50, offbelleza, logoAzul, logoRojo, l20, offMedicamentos,tarjetas,logoTarjeta,logoPaquete,gratuito,envios,
            logoEnvio;
    JPanel JAccesibilidad, JBelleza, JEquipos, JMedicamentos, JOrtopedicos, JProtesis;
    JSeparator separaderecha,separacentro,separaizquierda;

    HomePanelInicio() {
        setPreferredSize(new java.awt.Dimension(730, 440));
        setBackground(new java.awt.Color(235, 235, 235));
        setLayout(null);
        ofertas = new javax.swing.JLabel();
        ofertas.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        ofertas.setText("¡Aprovecha Nuestras Ofertas!");
        this.add(ofertas);
        ofertas.setBounds(60, 40, 260, 30);

        l50 = new javax.swing.JLabel();
        l50.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        l50.setText("50");
        this.add(l50);
        l50.setBounds(150, 150, 50, 50);

        offbelleza = new javax.swing.JLabel();
        offbelleza.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        offbelleza.setText("En Belleza");
        this.add(offbelleza);
        offbelleza.setBounds(170, 220, 90, 30);

        logoAzul = new javax.swing.JLabel();
        logoRojo = new javax.swing.JLabel();
        logoRojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/OffInicio.png"))); // NOI18N
        this.add(logoRojo);
        logoRojo.setBounds(200, 130, 110, 100);

        l20 = new javax.swing.JLabel();
        l20.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        l20.setText("20");
        this.add(l20);
        l20.setBounds(420, 150, 50, 50);

        offMedicamentos = new javax.swing.JLabel();
        offMedicamentos.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        offMedicamentos.setText("En Medicamentos");
        this.add(offMedicamentos);
        offMedicamentos.setBounds(420, 220, 160, 30);
            
        logoAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/OffInicioBlue.png"))); // NOI18N
        this.add(logoAzul);
        logoAzul.setBounds(470, 130, 110, 100);
        
        tarjetas = new javax.swing.JLabel();
        tarjetas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tarjetas.setText("Paga con tajeta o en efectivo");
        this.add(tarjetas);
        tarjetas.setBounds(60, 380, 170, 20);
        
        logoTarjeta = new javax.swing.JLabel();
        logoTarjeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TarjetaInicio.png"))); // NOI18N
        this.add(logoTarjeta);
        logoTarjeta.setBounds(110, 310, 60, 60);
        
        separaderecha = new javax.swing.JSeparator();
        separaderecha.setForeground(new java.awt.Color(54, 33, 84));
        separaderecha.setPreferredSize(new java.awt.Dimension(0, 4));
        this.add(separaderecha);
        separaderecha.setBounds(500, 410, 170, 10);
        
        separacentro = new javax.swing.JSeparator();
        separacentro.setForeground(new java.awt.Color(54, 33, 84));
        separacentro.setPreferredSize(new java.awt.Dimension(0, 4));
        this.add(separacentro);
        separacentro.setBounds(280, 410, 170, 10);
        
        separaizquierda = new javax.swing.JSeparator();
        separaizquierda.setForeground(new java.awt.Color(54, 33, 84));
        separaizquierda.setPreferredSize(new java.awt.Dimension(0, 4));
        this.add(separaizquierda);
        separaizquierda.setBounds(60, 410, 160, 10);
        
        logoPaquete = new javax.swing.JLabel();
        logoPaquete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PaqueteInici.png"))); // NOI18N
        this.add(logoPaquete);
        logoPaquete.setBounds(340, 310, 60, 60);
        
        gratuito = new javax.swing.JLabel();
        gratuito.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        gratuito.setText("Envíos gratuitos desde $80.000");
        this.add(gratuito);
        gratuito.setBounds(280, 380, 180, 20);
        
        logoEnvio = new javax.swing.JLabel();
        logoEnvio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/EnviosInicio.png"))); // NOI18N
        this.add(logoEnvio);
        logoEnvio.setBounds(560, 310, 60, 60);
        
        envios = new javax.swing.JLabel();
        envios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        envios.setText("Envíos a la ciudad de Bogotá");
        this.add(envios);
        envios.setBounds(500, 380, 160, 20);
    }
}
