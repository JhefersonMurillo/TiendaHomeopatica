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
import java.util.ArrayList;
import vista.RegisterUser;

/**
 *
 * @author TURKEYTITAN
 */
public class Conexion {

	private final String URL = "jdbc:sqlite:Tienda.db";
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

	public void saveUser(Usuario usuario) {
		try {
			PreparedStatement st = conn.prepareStatement("insert into usuario (nombre,usuario,correo,password,direccion) values (?,?,?,?,?)");
			st.setString(1, usuario.getNombre());
			st.setString(2, usuario.getUsuario());
			st.setString(3, usuario.getCorreo());
			st.setString(4, usuario.getPass());
			st.setString(5, usuario.getDireccion());
			st.execute();
		} catch (SQLException ex) {
			System.err.println(ex.getMessage());
		}

	}

	public boolean userExists(String usuario) {
		ResultSet rs;
		try {
			PreparedStatement st = conn.prepareStatement("select nombre from usuario where usuario = ?");
			st.setString(1, usuario);
			rs = st.executeQuery();
			while (rs.next()) {
				return false;
			}
		} catch (SQLException ex) {
			System.err.println(ex.getMessage());
		}
		return true;
	}

	public boolean login(Usuario user) {
		ResultSet rs;
		try {
			PreparedStatement st = conn.prepareStatement("select nombre from usuario where usuario = ? and password = ?");
			st.setString(1, user.getUsuario());
			st.setString(2, user.getPass());
			rs = st.executeQuery();
			while (rs.next()) {
				return true;
			}
		} catch (SQLException ex) {
			System.err.println(ex.getMessage());
		}
		return false;
	}

	public ArrayList<Producto> cargarCarrito(String pro) {
		ResultSet rs;
		ArrayList<Producto> prod = new ArrayList<>();
		try {
			PreparedStatement st = conn.prepareStatement("select * from producto where id in(?)");
			st.setString(1, pro);
			rs = st.executeQuery();
			while (rs.next()) {
				prod.add(new Producto(rs.getLong("id"), rs.getString("nombre"), rs.getDouble("precio"), 0));
				System.out.println(prod.get(0).getNombre());
			}
		} catch (SQLException ex) {
			System.err.println(ex.getMessage());
		}
		return prod;
	}
}
