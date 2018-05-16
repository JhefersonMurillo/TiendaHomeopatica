/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.awt.event.MouseListener;

/**
 *
 * @author TURKEYTITAN
 */
public class HomeCategory extends JPanel implements MouseListener {

    public JLabel accesibilidad, salud, ortopedicos, logoOrtopedicos, belleza, equipos, logoAccesibilidad, logoBelleza, logoEquipos, medicamentos, LogoMedicamentos,
            logoProtesis, protesis;
    public JPanel JAccesibilidad, JBelleza, JEquipos, JMedicamentos, JOrtopedicos, JProtesis;

    public HomeCategoryMedicines medicina;

   public HomeCategory() {

        setPreferredSize(new java.awt.Dimension(730, 440));
        setBackground(new java.awt.Color(235, 235, 235));
        setLayout(null);
        JAccesibilidad = new javax.swing.JPanel();
        JAccesibilidad.setBackground(new java.awt.Color(255, 255, 255));

        JAccesibilidad.setLayout(null);
        this.add(JAccesibilidad);
        JAccesibilidad.setBounds(80, 50, 140, 140);
        accesibilidad = new javax.swing.JLabel();
        accesibilidad.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        accesibilidad.setText("Accesibilidad");
        JAccesibilidad.add(accesibilidad);
        accesibilidad.setBounds(24, 110, 100, 21);
        logoAccesibilidad = new javax.swing.JLabel();
        logoAccesibilidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ciego.png"))); // NOI18N
        JAccesibilidad.add(logoAccesibilidad);
        JAccesibilidad.setBackground(new java.awt.Color(255, 255, 255));
        logoAccesibilidad.setBounds(40, 30, 70, 70);
        JAccesibilidad.setCursor(Cursor.getDefaultCursor().getPredefinedCursor(Cursor.HAND_CURSOR));

        JBelleza = new javax.swing.JPanel();
        logoBelleza = new javax.swing.JLabel();
        belleza = new javax.swing.JLabel();
        JBelleza.setBackground(new java.awt.Color(255, 255, 255));
        JBelleza.setLayout(null);
        logoBelleza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Belleza.png"))); // NOI18N
        JBelleza.add(logoBelleza);
        JBelleza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoBelleza.setBounds(40, 30, 70, 70);
        belleza.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        belleza.setText("Belleza");
        JBelleza.add(belleza);
        belleza.setBounds(50, 110, 50, 21);
        this.add(JBelleza);
        JBelleza.setBounds(300, 50, 140, 140);

        JEquipos = new javax.swing.JPanel();
        logoEquipos = new javax.swing.JLabel();
        equipos = new javax.swing.JLabel();
        JEquipos.setBackground(new java.awt.Color(255, 255, 255));
        JEquipos.setLayout(null);
        logoEquipos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Equipos.png"))); // NOI18N
        JEquipos.add(logoEquipos);
        logoEquipos.setBounds(40, 30, 70, 70);
        equipos.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        equipos.setText("Equipos");
        JEquipos.add(equipos);
        equipos.setBounds(40, 110, 60, 21);
        this.add(JEquipos);
        JEquipos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JEquipos.setBounds(520, 50, 140, 140);

        JMedicamentos = new javax.swing.JPanel();
        medicamentos = new javax.swing.JLabel();
        LogoMedicamentos = new javax.swing.JLabel();
        JMedicamentos.setBackground(new java.awt.Color(255, 255, 255));
        JMedicamentos.setLayout(null);
        medicamentos.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        medicamentos.setText("Medicamentos");
        JMedicamentos.add(medicamentos);
        medicamentos.setBounds(20, 110, 110, 21);
        LogoMedicamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Salud.png"))); // NOI18N
        JMedicamentos.add(LogoMedicamentos);
        LogoMedicamentos.setBounds(40, 30, 70, 70);
        this.add(JMedicamentos);
        JMedicamentos.setBounds(80, 260, 140, 140);
        JMedicamentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        JOrtopedicos = new javax.swing.JPanel();
        ortopedicos = new javax.swing.JLabel();
        logoOrtopedicos = new javax.swing.JLabel();
        JOrtopedicos.setBackground(new java.awt.Color(255, 255, 255));
        JOrtopedicos.setLayout(null);
        ortopedicos.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        ortopedicos.setText("Ortopedicos");
        JOrtopedicos.add(ortopedicos);
        ortopedicos.setBounds(30, 110, 85, 21);
        logoOrtopedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ortopedicoo.png"))); // NOI18N
        JOrtopedicos.add(logoOrtopedicos);
        logoOrtopedicos.setBounds(40, 30, 70, 70);
        this.add(JOrtopedicos);
        JOrtopedicos.setBounds(300, 260, 140, 140);
        JOrtopedicos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        JProtesis = new javax.swing.JPanel();
        logoProtesis = new javax.swing.JLabel();
        protesis = new javax.swing.JLabel();
        JProtesis.setBackground(new java.awt.Color(255, 255, 255));
        JProtesis.setLayout(null);
        logoProtesis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Protesis.png"))); // NOI18N
        JProtesis.add(logoProtesis);
        logoProtesis.setBounds(40, 30, 70, 70);
        protesis.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        protesis.setText("Prótesis");
        JProtesis.add(protesis);
        protesis.setBounds(40, 110, 60, 21);
        this.add(JProtesis);
        JProtesis.setBounds(520, 260, 140, 140);
        JProtesis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        JMedicamentos.addMouseListener(this);
        JBelleza.addMouseListener(this);
        //JAccesibilidad.addMouseListener(this);
        JOrtopedicos.addMouseListener(this);
        JEquipos.addMouseListener(this);
        JProtesis.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
    }

    @Override
    public void mousePressed(MouseEvent me) {

    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {
        /*if (JMedicamentos.equals(me.getSource())) {
            JMedicamentos.setBackground(new java.awt.Color(100, 25, 115));
            medicamentos.setForeground(new Color(204, 204, 204));
            LogoMedicamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GrisMedicamento.png"))); // NOI18N
            JMedicamentos.add(LogoMedicamentos);
            LogoMedicamentos.setBounds(40, 30, 70, 70);
            this.add(JMedicamentos);
            JMedicamentos.setBounds(80, 260, 140, 140);
        } /*else if (JBelleza.equals(me.getSource())) {
            JBelleza.setBackground(new java.awt.Color(100, 25, 115));
            logoBelleza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GrisBelleza.png"))); // NOI18N
            JBelleza.add(logoBelleza);
            logoBelleza.setBounds(40, 30, 70, 70);
            belleza.setForeground(new Color(204, 204, 204));
            JBelleza.add(belleza);
            this.add(JBelleza);
            JBelleza.setBounds(300, 50, 140, 140);
        } else if (JAccesibilidad.equals(me.getSource())) {
            JAccesibilidad.setBackground(new java.awt.Color(100, 25, 115));
            logoAccesibilidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GrisAccesibilidad.png")));
            JAccesibilidad.add(logoAccesibilidad);
            logoAccesibilidad.setBounds(40, 30, 70, 70);
            accesibilidad.setForeground(new Color(204, 204, 204));
            JAccesibilidad.add(accesibilidad);
            this.add(JAccesibilidad);
            JAccesibilidad.setBounds(80, 50, 140, 140);
        } else if (JOrtopedicos.equals(me.getSource())) {

            JOrtopedicos.setBackground(new java.awt.Color(100, 25, 115));
            logoOrtopedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GrisOrtopedico.png")));
            JOrtopedicos.add(ortopedicos);
            ortopedicos.setForeground(new Color(204, 204, 204));
            ortopedicos.setBounds(30, 110, 85, 21);
            logoOrtopedicos.setBounds(40, 30, 70, 70);
            JOrtopedicos.add(logoOrtopedicos);
            this.add(JOrtopedicos);
            JOrtopedicos.setBounds(300, 260, 140, 140);

        } else if (JEquipos.equals(me.getSource())) {

            JEquipos.setBackground(new java.awt.Color(100, 25, 115));
            logoEquipos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GrisEquipos.png")));
            JEquipos.add(equipos);
            equipos.setForeground(new Color(204, 204, 204));
            equipos.setBounds(40, 110, 60, 21);
            logoEquipos.setBounds(40, 30, 70, 70);
            JEquipos.add(logoEquipos);
            this.add(JEquipos);
            JEquipos.setBounds(520, 50, 140, 140);

        } else if (JProtesis.equals(me.getSource())) {

            JProtesis.setBackground(new java.awt.Color(100, 25, 115));
            logoProtesis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GrisProtesis.png")));
            JProtesis.add(protesis);
            protesis.setForeground(new Color(204, 204, 204));
            protesis.setBounds(40, 110, 60, 21);
            logoProtesis.setBounds(40, 30, 70, 70);
            JProtesis.add(logoProtesis);
            this.add(JProtesis);
            JProtesis.setBounds(520, 260, 140, 140);

        }*/

    }

    @Override
    public void mouseExited(MouseEvent me) {

       /* if (JMedicamentos.equals(me.getSource())) {
            JMedicamentos.setBackground(new java.awt.Color(255, 255, 255));
            //medicamentos.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
            //medicamentos.setBounds(20, 110, 110, 21);
            medicamentos.setForeground(new Color(0, 0, 0));
            LogoMedicamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Salud.png"))); // NOI18N
            JMedicamentos.add(LogoMedicamentos);
            LogoMedicamentos.setBounds(40, 30, 70, 70);
            this.add(JMedicamentos);
            JMedicamentos.setBounds(80, 260, 140, 140);
            JMedicamentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        } else if (JBelleza.equals(me.getSource())) {
            JBelleza.setBackground(new java.awt.Color(255, 255, 255));
            logoBelleza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Belleza.png"))); // NOI18N
            JBelleza.add(logoBelleza);
            logoBelleza.setBounds(40, 30, 70, 70);
            belleza.setForeground(new Color(0, 0, 0));
            JBelleza.add(belleza);
            this.add(JBelleza);
            JBelleza.setBounds(300, 50, 140, 140);
        } else if (JAccesibilidad.equals(me.getSource())) {
            JAccesibilidad.setBackground(new java.awt.Color(255, 255, 255));
            logoAccesibilidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ciego.png")));
            JAccesibilidad.add(logoAccesibilidad);
            logoAccesibilidad.setBounds(40, 30, 70, 70);
            accesibilidad.setForeground(new Color(0, 0, 0));
            JAccesibilidad.add(accesibilidad);
            this.add(JAccesibilidad);
            JAccesibilidad.setBounds(80, 50, 140, 140);

        } else if (JOrtopedicos.equals(me.getSource())) {
            JOrtopedicos.setBackground(new java.awt.Color(255, 255, 255));
            logoOrtopedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ortopedicoo.png")));
            JOrtopedicos.add(ortopedicos);
            ortopedicos.setForeground(new Color(0, 0, 0));
            ortopedicos.setBounds(30, 110, 85, 21);
            logoOrtopedicos.setBounds(40, 30, 70, 70);
            JOrtopedicos.add(logoOrtopedicos);
            this.add(JOrtopedicos);
            JOrtopedicos.setBounds(300, 260, 140, 140);

        }else if (JEquipos.equals(me.getSource())) {
            JEquipos.setBackground(Color.white);
            logoEquipos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Equipos.png")));
            JEquipos.add(equipos);
            equipos.setForeground(new Color(0, 0, 0));
            equipos.setBounds(40, 110, 60, 21);
            logoEquipos.setBounds(40, 30, 70, 70);
            JEquipos.add(logoEquipos);
            this.add(JEquipos);
            JEquipos.setBounds(520, 50, 140, 140);
        } else if (JProtesis.equals(me.getSource())) {

            JProtesis.setBackground(new java.awt.Color(255, 255, 255));
            logoProtesis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Protesis.png")));
            JProtesis.add(protesis);
            protesis.setForeground(new Color(0, 0, 0));
            protesis.setBounds(40, 110, 60, 21);
            logoProtesis.setBounds(40, 30, 70, 70);
            JProtesis.add(logoProtesis);
            this.add(JProtesis);
            JProtesis.setBounds(520, 260, 140, 140);

        }*/

    }

}
