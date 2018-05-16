/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import vista.RegisterUser;

/**
 *
 * @author TURKEYTITAN
 */
public class Conexion {

        private final String URL = "/Tienda.db";
        private Connection conn;

        public void conectar() {
                try {
                        conn = DriverManager.getConnection(URL);
                } catch (Exception e) {
                        System.err.println("No se ha podido conectar a la base de datos\n" + e.getMessage());
                }
        }

        public void close() {
                try {
                        conn.close();
                } catch (SQLException ex) {
                        System.err.println("Se ha producido un error al cerrar la base de datos" + ex);
                }
        }

        public void saveAlumno(Usuario usuario, RegisterUser reg) {
                if (reg.getFilledTexts()) {
                        try {
                                PreparedStatement st = conn.prepareStatement("insert into usuario (nombre,usuario,correo,password,direccion) values (?,?,?,?,?)");
                                st.setString(1, reg.getTextoNombres());
                                st.setString(2, reg.getTextoUsuario());
                                st.setString(3, reg.getTextoCorreo());
                                st.setString(4, reg.getTextPassword());
                                st.setString(5, reg.getTextoDireccion());
                                st.execute();
                        } catch (SQLException ex) {
                                System.err.println(ex.getMessage());
                        }
                }

        }
}
