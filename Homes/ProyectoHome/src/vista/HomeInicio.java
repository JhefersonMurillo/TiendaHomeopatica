/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Font;
import java.awt.event.MouseListener;
import javax.swing.*;
import org.w3c.dom.events.MouseEvent;

/**
 *
 * @author Kilmainham
 */
public class HomeInicio extends JFrame implements MouseListener {

    public JPanel izquierda, JAcerca, JCategoria, JAyuda, JCarrito, JHeader;
    public JLabel umedic, corazon, categoriasl, comprasl, ayudal, acercal, help, category, safe, buy, close, minimize, iconHeader, titleHeader;
    public ImageIcon logo;
    public JSeparator up;
    public HomeCategory hg;
    public HomeInformation u;
    public HomePanelInicio d;
    public HomeHelp e;

    public HomeInicio() {
        setSize(1000, 610);
        setLayout(null);
        setUndecorated(true);
        this.setLocationRelativeTo(null);
        izquierda = new JPanel();
        izquierda.setLayout(null);
        izquierda.setBounds(0, 0, 270, 610);
        izquierda.setBackground(new java.awt.Color(54, 33, 89));

        umedic = new JLabel("Umedic");
        umedic.setFont(new Font("Tahoma", Font.PLAIN, 28));
        umedic.setForeground(new java.awt.Color(255, 255, 255));
        umedic.setBounds(100, 70, 130, 60);
        umedic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        izquierda.add(umedic);

        logo = new ImageIcon(getClass().getResource("/Images/Corazon.png"));
        corazon = new JLabel();
        corazon.setIcon(logo);
        corazon.setBounds(40, 70, 50, 50);
        corazon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        izquierda.add(corazon);

        up = new JSeparator();
        up.setBounds(40, 132, 200, 10);
        izquierda.add(up);
        /*izquierda = new JPanel();
        izquierda.setLayout(null);
         */
        //this.setResizable(false);
        //this.setUndecorated(true);

        JAcerca = new javax.swing.JPanel();
        JAcerca.setBackground(new java.awt.Color(54, 33, 89));
        JAcerca.setPreferredSize(new java.awt.Dimension(270, 40));
        JAcerca.setLayout(null);
        JAcerca.setBounds(0, 340, 270, 40);
        JAcerca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        izquierda.add(JAcerca);

        JCarrito = new javax.swing.JPanel();
        JCarrito.setBackground(new java.awt.Color(54, 33, 89));
        JCarrito.setPreferredSize(new java.awt.Dimension(270, 40));
        JCarrito.setLayout(null);
        JCarrito.setBounds(0, 260, 270, 40);
        JCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        izquierda.add(JCarrito);

        JCategoria = new javax.swing.JPanel();
        JCategoria.setBackground(new java.awt.Color(54, 33, 89));
        JCategoria.setPreferredSize(new java.awt.Dimension(270, 40));
        JCategoria.setLayout(null);
        JCategoria.setBounds(0, 220, 270, 40);
        izquierda.add(JCategoria);

        JAyuda = new javax.swing.JPanel();
        JAyuda.setBackground(new java.awt.Color(54, 33, 89));
        JAyuda.setPreferredSize(new java.awt.Dimension(270, 40));
        JAyuda.setLayout(null);
        JAyuda.setBounds(0, 300, 270, 40);
        JAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        izquierda.add(JAyuda);

        categoriasl = new javax.swing.JLabel();
        categoriasl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        categoriasl.setForeground(new java.awt.Color(204, 204, 204));
        categoriasl.setText("Categorias");
        JCategoria.add(categoriasl);
        categoriasl.setBounds(70, 10, 150, 20);

        comprasl = new javax.swing.JLabel();
        comprasl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comprasl.setForeground(new java.awt.Color(204, 204, 204));
        comprasl.setText("Compras");
        JCarrito.add(comprasl);
        comprasl.setBounds(70, 10, 150, 20);

        ayudal = new javax.swing.JLabel();
        ayudal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ayudal.setForeground(new java.awt.Color(204, 204, 204));
        ayudal.setText("Ayuda/PQR");
        JAyuda.add(ayudal);
        ayudal.setBounds(70, 10, 150, 20);

        acercal = new javax.swing.JLabel();
        acercal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        acercal.setForeground(new java.awt.Color(204, 204, 204));
        acercal.setText("Acerca de ");
        JAcerca.add(acercal);
        acercal.setBounds(70, 10, 150, 20);

        help = new javax.swing.JLabel();
        help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Acerca25.png"))); // NOI18N
        JAcerca.add(help);
        help.setBounds(20, 0, 32, 30);

        safe = new javax.swing.JLabel();
        safe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/25.png"))); // NOI18N
        JAyuda.add(safe);
        safe.setBounds(20, 0, 32, 40);

        buy = new javax.swing.JLabel();
        buy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Compras25.png"))); // NOI18N
        JCarrito.add(buy);
        buy.setBounds(20, 0, 32, 40);

        category = new javax.swing.JLabel();
        category.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Category30.png"))); // NOI18N
        JCategoria.add(category);
        category.setBounds(21, 11, 40, 20);
        JCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        JHeader = new javax.swing.JPanel();
        JHeader.setBackground(new java.awt.Color(100, 25, 115));
        JHeader.setLayout(null);
        JHeader.setBounds(270, 0, 730, 100);

        close = new javax.swing.JLabel();
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Close20.png"))); // NOI18N
        JHeader.add(close);
        close.setBounds(700, 10, 20, 20);
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        minimize = new javax.swing.JLabel();
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimize.png"))); // NOI18N
        JHeader.add(minimize);
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.setBounds(670, 10, 20, 20);

        iconHeader = new javax.swing.JLabel();
        titleHeader = new javax.swing.JLabel();

        this.add(JHeader);
        this.add(izquierda);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JCategoria.addMouseListener(this);
        JAyuda.addMouseListener(this);
        JAcerca.addMouseListener(this);
        JCarrito.addMouseListener(this);
        close.addMouseListener(this);
        minimize.addMouseListener(this);

        u = new HomeInformation();
        this.add(u);
        u.setBounds(270, 120, 730, 450);
        u.setVisible(false);

        hg = new HomeCategory();
        this.add(hg);
        hg.setBounds(270, 120, 730, 450);
        hg.setVisible(false);
        hg.JAccesibilidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hg.JBelleza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hg.JEquipos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hg.JMedicamentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hg.JMedicamentos.addMouseListener(this);
        hg.JOrtopedicos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hg.JProtesis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        e = new HomeHelp();
        this.add(e);
        e.setBounds(270, 120, 730, 450);
        e.setVisible(false);

        d = new HomePanelInicio();
        this.add(d);
        d.setBounds(270, 120, 730, 450);
        d.setVisible(true);

       // JCategoria.addMouseListener(this);
        hg.medicina = new HomeCategoryMedicines();

        this.add(hg.medicina);
        hg.medicina.setBounds(250, 100, 730, 500);
        hg.medicina.setVisible(false);
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent me) {
       // if (JCategoria.equals(me.getSource())) {
            /*hg.setVisible(true);
            u.setVisible(false);
            e.setVisible(false);
            d.setVisible(false);
            hg.medicina.setVisible(false);
            titleHeader.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
            titleHeader.setForeground(new java.awt.Color(204, 204, 204));
            titleHeader.setText("Categoria");
            JHeader.add(titleHeader);
            titleHeader.setBounds(100, 30, 230, 50);
            iconHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CategoryHeader.png"))); // NOI18N
            JHeader.add(iconHeader);
            iconHeader.setBounds(30, 30, 90, 50);

        } else if (JAyuda.equals(me.getSource())) {
            e.setVisible(true);
            hg.setVisible(false);
            u.setVisible(false);
            d.setVisible(false);

            titleHeader.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
            titleHeader.setForeground(new java.awt.Color(204, 204, 204));
            titleHeader.setText("Ayuda/PQR");
            JHeader.add(titleHeader);
            titleHeader.setBounds(100, 30, 230, 50);
            iconHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SafeHeader.png"))); // NOI18N
            JHeader.add(iconHeader);
            iconHeader.setBounds(30, 30, 90, 50);

        } else */if (JAcerca.equals(me.getSource())) {
            e.setVisible(false);
            hg.setVisible(false);
            u.setVisible(true);
            d.setVisible(false);

            titleHeader.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
            titleHeader.setForeground(new java.awt.Color(204, 204, 204));
            titleHeader.setText("Acerca De...");
            JHeader.add(titleHeader);
            titleHeader.setBounds(100, 30, 230, 50);
            iconHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AcercaHeader.png"))); // NOI18N
            JHeader.add(iconHeader);
            iconHeader.setBounds(30, 30, 90, 50);

        } else if (JCarrito.equals(me.getSource())) {

            titleHeader.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
            titleHeader.setForeground(new java.awt.Color(204, 204, 204));
            titleHeader.setText("Compras");
            JHeader.add(titleHeader);
            titleHeader.setBounds(100, 30, 230, 50);
            iconHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ComprasHeader.png"))); // NOI18N
            JHeader.add(iconHeader);
            iconHeader.setBounds(30, 30, 90, 50);

        } else if (minimize.equals(me.getSource())) {
            this.setState(HomeInicio.ICONIFIED);
        } else if (hg.JMedicamentos.equals(me.getSource())) {
            hg.setVisible(false);
            hg.medicina.setVisible(true);
            System.out.println("asdasd");
        } else if (close.equals(me.getSource())) {

            System.exit(0);

        }
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent me) {

    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent me) {

    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent me) {
        if (JCategoria.equals(me.getSource())) {
            JCategoria.setBackground(new java.awt.Color(85, 65, 118));
        } else if (JAcerca.equals(me.getSource())) {
            JAcerca.setBackground(new java.awt.Color(85, 65, 118));
        } else if (JAyuda.equals(me.getSource())) {
            JAyuda.setBackground(new java.awt.Color(85, 65, 118));
        } else if (JCarrito.equals(me.getSource())) {
            JCarrito.setBackground(new java.awt.Color(85, 65, 118));
        } else if (JCarrito.equals(me.getSource())) {
            JCarrito.setBackground(new java.awt.Color(85, 65, 118));
        }

    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent me) {
        if (JCategoria.equals(me.getSource())) {
            JCategoria.setBackground(new java.awt.Color(54, 33, 89));
        } else if (JAcerca.equals(me.getSource())) {
            JAcerca.setBackground(new java.awt.Color(54, 33, 89));
        } else if (JAyuda.equals(me.getSource())) {
            JAyuda.setBackground(new java.awt.Color(54, 33, 89));
        } else if (JCarrito.equals(me.getSource())) {
            JCarrito.setBackground(new java.awt.Color(54, 33, 89));
        }
    }

}
