package controlador;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.Conexion;
import modelo.Usuario;
import vista.HomeInicio;
import vista.RegisterUser;
import vista.UserLogin;

/**
 *
 * @author TURNKEYTITAN
 */
public class Controlador implements MouseListener {

    private UserLogin view;
    private Usuario userModel;
    private HomeInicio home;
    private RegisterUser registeruser;
    private Conexion con;

    public Controlador(UserLogin userlogin, Conexion m) {
        view = userlogin;
        view.JIngresar.addMouseListener(this);
        view.registeruser.Close.addMouseListener(this);
        view.registeruser.Minimize.addMouseListener(this);
        view.Close.addMouseListener(this);
        view.Minimize.addMouseListener(this);
        //home.category.addMouseListener(this);
        view.JRegistrarse.addMouseListener(this);
        view.registeruser.JAtras.addMouseListener(this);
        //view.registeruser.JAtras.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        if (view.registeruser.Minimize.equals(me.getSource())) {
            view.registeruser.setState(view.registeruser.ICONIFIED);
        } else if (view.registeruser.Close.equals(me.getSource())) {
            System.exit(0);
        } else if (view.JIngresar.equals(me.getSource())) {
            view.setVisible(false);
            home = new HomeInicio();
            home.JCategoria.addMouseListener(this);
            home.JAyuda.addMouseListener(this);
            home.hg.JAccesibilidad.addMouseListener(this);
            home.hg.JBelleza.addMouseListener(this);
            home.hg.JEquipos.addMouseListener(this);
            home.hg.JMedicamentos.addMouseListener(this);
            home.hg.JOrtopedicos.addMouseListener(this);
            home.hg.JProtesis.addMouseListener(this);
            home.JCategoria.addMouseListener(this);
            home.JAyuda.addMouseListener(this);
            home.JAcerca.addMouseListener(this);
            home.JCarrito.addMouseListener(this);
            home.close.addMouseListener(this);
            home.minimize.addMouseListener(this);
            

            //home.hg.medicina.buttonGlic
        } else if (view.JRegistrarse.equals(me.getSource())) {
            view.setVisible(false);
            view.registeruser.setVisible(true);

        } else if (view.registeruser.JAtras.equals(me.getSource())) {
            view.setVisible(true);
            view.registeruser.setVisible(false);
        } else if (view.Close.equals(me.getSource())) {
            System.exit(0);
        } else if (view.Minimize.equals(me.getSource())) {
            view.setState(view.ICONIFIED);
        }
        if (home != null) {
            if (home.JCategoria.equals(me.getSource())) {
                home.hg.setVisible(true);
                home.u.setVisible(false);
                home.e.setVisible(false);
                home.d.setVisible(false);
                home.hg.medicina.setVisible(false);
                home.titleHeader.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                home.titleHeader.setForeground(new java.awt.Color(204, 204, 204));
                home.titleHeader.setText("Categoria");
                home.JHeader.add(home.titleHeader);
                home.titleHeader.setBounds(100, 30, 230, 50);
                home.iconHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CategoryHeader.png"))); // NOI18N
                home.JHeader.add(home.iconHeader);
                home.iconHeader.setBounds(30, 30, 90, 50);
            } else if (home.JAyuda.equals(me.getSource())) {
                home.e.setVisible(true);
                home.hg.setVisible(false);
                home.u.setVisible(false);
                home.d.setVisible(false);
                home.titleHeader.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                home.titleHeader.setForeground(new java.awt.Color(204, 204, 204));
                home.titleHeader.setText("Ayuda/PQR");
                home.JHeader.add(home.titleHeader);
                home.titleHeader.setBounds(100, 30, 230, 50);
                home.iconHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SafeHeader.png"))); // NOI18N
                home.JHeader.add(home.iconHeader);
                home.iconHeader.setBounds(30, 30, 90, 50);
            } else if (home.JAcerca.equals(me.getSource())) {
                home.e.setVisible(false);
                home.hg.setVisible(false);
                home.u.setVisible(true);
                home.d.setVisible(false);

                home.titleHeader.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                home.titleHeader.setForeground(new java.awt.Color(204, 204, 204));
                home.titleHeader.setText("Acerca De...");
                home.JHeader.add(home.titleHeader);
                home.titleHeader.setBounds(100, 30, 230, 50);
                home.iconHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AcercaHeader.png"))); // NOI18N
                home.JHeader.add(home.iconHeader);
                home.iconHeader.setBounds(30, 30, 90, 50);

            } else if (home.JCarrito.equals(me.getSource())) {

                home.titleHeader.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                home.titleHeader.setForeground(new java.awt.Color(204, 204, 204));
                home.titleHeader.setText("Compras");
                home.JHeader.add(home.titleHeader);
                home.titleHeader.setBounds(100, 30, 230, 50);
                home.iconHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ComprasHeader.png"))); // NOI18N
                home.JHeader.add(home.iconHeader);
                home.iconHeader.setBounds(30, 30, 90, 50);

            } else if (home.minimize.equals(me.getSource())) {
                home.setState(HomeInicio.ICONIFIED);
            } else if (home.hg.JMedicamentos.equals(me.getSource())) {
                home.hg.setVisible(false);
                home.hg.medicina.setVisible(true);
                System.out.println("asdasd");
            } else if (home.close.equals(me.getSource())) {

                System.exit(0);

            }
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {

    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {
        if (home != null) {
            if (home.hg.JAccesibilidad.equals(me.getSource())) {
                home.hg.JAccesibilidad.setBackground(new java.awt.Color(100, 25, 115));
                home.hg.logoAccesibilidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GrisAccesibilidad.png")));
                home.hg.JAccesibilidad.add(home.hg.logoAccesibilidad);
                home.hg.logoAccesibilidad.setBounds(40, 30, 70, 70);
                home.hg.accesibilidad.setForeground(new Color(204, 204, 204));
                home.hg.JAccesibilidad.add(home.hg.accesibilidad);
                home.hg.add(home.hg.JAccesibilidad);
                home.hg.JAccesibilidad.setBounds(80, 50, 140, 140);
            } else if (home.hg.JProtesis.equals(me.getSource())) {

                home.hg.JProtesis.setBackground(new java.awt.Color(100, 25, 115));
                home.hg.logoProtesis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GrisProtesis.png")));
                home.hg.JProtesis.add(home.hg.protesis);
                home.hg.protesis.setForeground(new Color(204, 204, 204));
                home.hg.protesis.setBounds(40, 110, 60, 21);
                home.hg.logoProtesis.setBounds(40, 30, 70, 70);
                home.hg.JProtesis.add(home.hg.logoProtesis);
                home.hg.add(home.hg.JProtesis);
                home.hg.JProtesis.setBounds(520, 260, 140, 140);

            } else if (home.hg.JBelleza.equals(me.getSource())) {
                home.hg.JBelleza.setBackground(new java.awt.Color(100, 25, 115));
                home.hg.logoBelleza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GrisBelleza.png"))); // NOI18N
                home.hg.JBelleza.add(home.hg.logoBelleza);
                home.hg.logoBelleza.setBounds(40, 30, 70, 70);
                home.hg.belleza.setForeground(new Color(204, 204, 204));
                home.hg.JBelleza.add(home.hg.belleza);
                home.hg.add(home.hg.JBelleza);
                home.hg.JBelleza.setBounds(300, 50, 140, 140);
            } else if (home.hg.JOrtopedicos.equals(me.getSource())) {

                home.hg.JOrtopedicos.setBackground(new java.awt.Color(100, 25, 115));
                home.hg.logoOrtopedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GrisOrtopedico.png")));
                home.hg.JOrtopedicos.add(home.hg.ortopedicos);
                home.hg.ortopedicos.setForeground(new Color(204, 204, 204));
                home.hg.ortopedicos.setBounds(30, 110, 85, 21);
                home.hg.logoOrtopedicos.setBounds(40, 30, 70, 70);
                home.hg.JOrtopedicos.add(home.hg.logoOrtopedicos);
                home.hg.add(home.hg.JOrtopedicos);
                home.hg.JOrtopedicos.setBounds(300, 260, 140, 140);
            } else if (home.hg.JEquipos.equals(me.getSource())) {

                home.hg.JEquipos.setBackground(new java.awt.Color(100, 25, 115));
                home.hg.logoEquipos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GrisEquipos.png")));
                home.hg.JEquipos.add(home.hg.equipos);
                home.hg.equipos.setForeground(new Color(204, 204, 204));
                home.hg.equipos.setBounds(40, 110, 60, 21);
                home.hg.logoEquipos.setBounds(40, 30, 70, 70);
                home.hg.JEquipos.add(home.hg.logoEquipos);
                home.hg.add(home.hg.JEquipos);
                home.hg.JEquipos.setBounds(520, 50, 140, 140);
            } else if (home.hg.JMedicamentos.equals(me.getSource())) {
                home.hg.JMedicamentos.setBackground(new java.awt.Color(100, 25, 115));
                //medicamentos.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
                //medicamentos.setBounds(20, 110, 110, 21);
                home.hg.medicamentos.setForeground(new Color(204, 204, 204));
                home.hg.LogoMedicamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GrisMedicamento.png"))); // NOI18N
                home.hg.JMedicamentos.add(home.hg.LogoMedicamentos);
                home.hg.LogoMedicamentos.setBounds(40, 30, 70, 70);
                home.hg.add(home.hg.JMedicamentos);
                home.hg.JMedicamentos.setBounds(80, 260, 140, 140);
                home.hg.JMedicamentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            } else if (home.JCategoria.equals(me.getSource())) {
                home.JCategoria.setBackground(new java.awt.Color(85, 65, 118));
            } else if (home.JAcerca.equals(me.getSource())) {
                home.JAcerca.setBackground(new java.awt.Color(85, 65, 118));
            } else if (home.JAyuda.equals(me.getSource())) {
                home.JAyuda.setBackground(new java.awt.Color(85, 65, 118));
            } else if (home.JCarrito.equals(me.getSource())) {
                home.JCarrito.setBackground(new java.awt.Color(85, 65, 118));
            } else if (home.JCarrito.equals(me.getSource())) {
                home.JCarrito.setBackground(new java.awt.Color(85, 65, 118));
            }

        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
        if (home != null) {
            if (home.hg.JAccesibilidad.equals(me.getSource())) {
                home.hg.JAccesibilidad.setBackground(new java.awt.Color(255, 255, 255));
                home.hg.logoAccesibilidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ciego.png")));
                home.hg.JAccesibilidad.add(home.hg.logoAccesibilidad);
                home.hg.logoAccesibilidad.setBounds(40, 30, 70, 70);
                home.hg.accesibilidad.setForeground(new Color(0, 0, 0));
                home.hg.JAccesibilidad.add(home.hg.accesibilidad);
                home.hg.add(home.hg.JAccesibilidad);
                home.hg.JAccesibilidad.setBounds(80, 50, 140, 140);
            } else if (home.hg.JProtesis.equals(me.getSource())) {

                home.hg.JProtesis.setBackground(new java.awt.Color(255, 255, 255));
                home.hg.logoProtesis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Protesis.png")));
                home.hg.JProtesis.add(home.hg.protesis);
                home.hg.protesis.setForeground(new Color(0, 0, 0));
                home.hg.protesis.setBounds(40, 110, 60, 21);
                home.hg.logoProtesis.setBounds(40, 30, 70, 70);
                home.hg.JProtesis.add(home.hg.logoProtesis);
                home.hg.add(home.hg.JProtesis);
                home.hg.JProtesis.setBounds(520, 260, 140, 140);

            } else if (home.hg.JBelleza.equals(me.getSource())) {
                home.hg.JBelleza.setBackground(new java.awt.Color(255, 255, 255));
                home.hg.logoBelleza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Belleza.png"))); // NOI18N
                home.hg.JBelleza.add(home.hg.logoBelleza);
                home.hg.logoBelleza.setBounds(40, 30, 70, 70);
                home.hg.belleza.setForeground(new Color(0, 0, 0));
                home.hg.JBelleza.add(home.hg.belleza);
                home.hg.add(home.hg.JBelleza);
                home.hg.JBelleza.setBounds(300, 50, 140, 140);
            } else if (home.hg.JOrtopedicos.equals(me.getSource())) {
                home.hg.JOrtopedicos.setBackground(new java.awt.Color(255, 255, 255));
                home.hg.logoOrtopedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ortopedicoo.png")));
                home.hg.JOrtopedicos.add(home.hg.ortopedicos);
                home.hg.ortopedicos.setForeground(new Color(0, 0, 0));
                home.hg.ortopedicos.setBounds(30, 110, 85, 21);
                home.hg.logoOrtopedicos.setBounds(40, 30, 70, 70);
                home.hg.JOrtopedicos.add(home.hg.logoOrtopedicos);
                home.hg.add(home.hg.JOrtopedicos);
                home.hg.JOrtopedicos.setBounds(300, 260, 140, 140);

            } else if (home.hg.JEquipos.equals(me.getSource())) {
                home.hg.JEquipos.setBackground(Color.white);
                home.hg.logoEquipos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Equipos.png")));
                home.hg.JEquipos.add(home.hg.equipos);
                home.hg.equipos.setForeground(new Color(0, 0, 0));
                home.hg.equipos.setBounds(40, 110, 60, 21);
                home.hg.logoEquipos.setBounds(40, 30, 70, 70);
                home.hg.JEquipos.add(home.hg.logoEquipos);
                home.hg.add(home.hg.JEquipos);
                home.hg.JEquipos.setBounds(520, 50, 140, 140);
            } else if (home.hg.JMedicamentos.equals(me.getSource())) {
                home.hg.JMedicamentos.setBackground(new java.awt.Color(255, 255, 255));
                home.hg.medicamentos.setForeground(new Color(0, 0, 0));
                home.hg.LogoMedicamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Salud.png"))); // NOI18N
                home.hg.JMedicamentos.add(home.hg.LogoMedicamentos);
                home.hg.LogoMedicamentos.setBounds(40, 30, 70, 70);
                home.hg.add(home.hg.JMedicamentos);
                home.hg.JMedicamentos.setBounds(80, 260, 140, 140);
            } else if (home.JCategoria.equals(me.getSource())) {
                home.JCategoria.setBackground(new java.awt.Color(54, 33, 89));
            } else if (home.JAcerca.equals(me.getSource())) {
                home.JAcerca.setBackground(new java.awt.Color(54, 33, 89));
            } else if (home.JAyuda.equals(me.getSource())) {
                home.JAyuda.setBackground(new java.awt.Color(54, 33, 89));
            } else if (home.JCarrito.equals(me.getSource())) {
                home.JCarrito.setBackground(new java.awt.Color(54, 33, 89));
            }
        }
    }

}
