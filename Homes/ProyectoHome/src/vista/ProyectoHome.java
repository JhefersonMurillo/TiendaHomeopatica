/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import modelo.Usuario;
import controlador.Controlador;
import modelo.Conexion;

/**
 *
 * @author Kilmainham
 */
public class ProyectoHome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //HomeInicio n= new HomeInicio();
        UserLogin userlogin = new UserLogin();
        Conexion u = new Conexion();
        Controlador c = new Controlador(userlogin,u);
       // RegisterUser n= new RegisterUser();
    }
    
}
