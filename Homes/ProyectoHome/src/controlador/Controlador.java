package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.Conexion;
import modelo.Usuario;
import vista.HomeInicio;
import vista.RegisterUser;
import vista.UserLogin;

/**
 *
 * @author TURKEYTITAN
 */
public class Controlador implements MouseListener{
    private UserLogin view;
    private Usuario userModel;
    private HomeInicio home;
    private RegisterUser registeruser;

    public Controlador(UserLogin userlogin, Conexion m) {
      view = userlogin;
      view.JIngresar.addMouseListener(this);
      
      home.category.addMouseListener(this);
      //view.JRegistrarse.addMouseListener(this);
//      registeruser.JAtras.addMouseListener(this);
      //view.registeruser.JAtras.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        if (view.JIngresar.equals(me.getSource())) {
            view.setVisible(false);
            home = new HomeInicio(); 
            home.JCategoria.addMouseListener(this);
            
        }else if(view.JRegistrarse.equals(me.getSource())){
            view.setVisible(false);
            view.registeruser.setVisible(true);
            
            
        }else if (view.registeruser.JAtras.equals(me.getSource())) {
            view.setVisible(true);
            view.registeruser.setVisible(false);
        }else if( home.JCategoria.equals(me.getSource())){
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
        
    }

    @Override
    public void mouseExited(MouseEvent me) {
        
    }
    public void conectar() {
        
    }
    
}