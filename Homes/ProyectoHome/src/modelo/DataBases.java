/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Kilmainham
 */
public class DataBases {
    String url = "";
    Connection connect;
    public void conexion() {
        try {
            connect = DriverManager.getConnection("jdbc:sqlite:" + url);
            if (connect != null) {
                System.out.println("Conectado");
            }
        } catch (SQLException ex) {
            System.err.println("No se ha podido conectar a la base de datos\n" + ex.getMessage());
        }
    }
    public void cerrar() {
        try {
            connect.close();
        } catch (SQLException ex) {
            System.out.println("Error en el cierre" + ex.getMessage());
        }
    }
    public int validarUsuario(String Us, String Ps) {
        int estado = 0;
        ResultSet result;
        String claveRes;
        try {
            PreparedStatement st
                    = connect.prepareStatement("select * from usuario where usuario=?");
            st.setString(1, Us);
            result = st.executeQuery();
            while (result.next()) {
                claveRes = result.getString("clave");
                if (claveRes.equals(Ps) && !result.getString("usuario").isEmpty()) {
                    estado = 1;
                } else {
                    estado = 0;
                }
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return estado;
    }
}
