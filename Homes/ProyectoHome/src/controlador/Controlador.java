package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.Conexion;
import modelo.Producto;
import modelo.Usuario;
import vista.HomeInicio;
import vista.RegisterUser;
import vista.UserLogin;

/**
 *
 * @author TURNKEYTITAN
 */
public class Controlador implements MouseListener, ActionListener {

	private UserLogin view;
	private Usuario userModel;
	private HomeInicio home;
	private RegisterUser registeruser;
	private Conexion con;
	private ArrayList<Integer> producto;
	private ArrayList<Producto> prod;
	public JPanel pProducto[];

	@SuppressWarnings("LeakingThisInConstructor")
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
		view.registeruser.JGuardar.addMouseListener(this);
		//view.registeruser.JAtras.addMouseListener(this);
		con = m;
		producto = new ArrayList<>();
	}

	public boolean usuarioExiste(String usuario) {
		boolean temp;
		con.conectar();
		temp = con.userExists(usuario);
		con.close();
		return temp;
	}

	public void registrarUsuario(RegisterUser user) {
		try {
			if (usuarioExiste(user.getTextoUsuario())) {
				if (user.getFilledTexts()) {
					Usuario u = new Usuario(user.getTextoNombres(),
							user.getTextoUsuario(),
							user.getTextoCorreo(),
							user.getTextPassword(),
							user.getTextoDireccion());
					con.conectar();
					con.saveUser(u);
					con.close();
				} else {
					JOptionPane.showMessageDialog(null, "El usuario no se registró correctamente, los campos no están llenos en su totalidad");
				}
			} else {
				JOptionPane.showMessageDialog(null, "El usuario no se registró correctamente, el usuario ya existe");
			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	public boolean login(UserLogin user) {
		try {
			Usuario temp = new Usuario();
			boolean bol;
			temp.setUsuario(user.getUser());
			temp.setPass(user.getPass());
			con.conectar();
			bol = con.login(temp);
			con.close();
			return bol;
		} catch (Exception e) {
			System.err.println(e);
		}
		return false;
	}

	public void cargarCarrito(ArrayList<Integer> prod) {
		String ids = "";
		for (Iterator<Integer> iterator = prod.iterator(); iterator.hasNext();) {
			int next = iterator.next();
			ids += Integer.toString(next);
			if (iterator.hasNext()) {
				ids += ",";
			}
		}
		con.conectar();
		this.prod = con.cargarCarrito(ids);
		con.close();
		pProducto = new JPanel[prod.size()];
		int i = 0;
		for (Iterator<Producto> iterator = this.prod.iterator(); iterator.hasNext();) {
			Producto next = iterator.next();
			JLabel nombre = new javax.swing.JLabel();
			nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
			nombre.setText(next.getNombre());

			JLabel precio = new javax.swing.JLabel();
			precio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
			precio.setText(Double.toString(next.getPrecio()));

			pProducto[i] = new JPanel();
			pProducto[i].setLayout(new java.awt.GridLayout(2, 0));

			pProducto[i].add(nombre);
			pProducto[i].add(precio);
			home.car.GridPanel.add(pProducto[i]);
			i++;
			System.out.println(2);
		}
	}

	@Override
	public void mouseClicked(MouseEvent me) {
		if (view.registeruser.Minimize.equals(me.getSource())) {
			view.registeruser.setState(view.registeruser.ICONIFIED);
		} else if (view.registeruser.Close.equals(me.getSource())) {
			System.exit(0);
		} else if (view.JIngresar.equals(me.getSource())) {
			if (login(view)) {
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
				home.JAcerca.addMouseListener(this);
				home.JCarrito.addMouseListener(this);
				home.close.addMouseListener(this);
				home.minimize.addMouseListener(this);
			} else {
				JOptionPane.showMessageDialog(home, "El usuario o la contraseña están errados");
			}

			//home.hg.medicina.buttonGlic
		} else if (view.JRegistrarse.equals(me.getSource())) {
			view.setVisible(false);
			view.registeruser.setVisible(true);

		} else if (view.registeruser.JAtras.equals(me.getSource())) {
			view.setVisible(true);
			view.registeruser.setVisible(false);
		} else if (view.registeruser.JGuardar.equals(me.getSource())) {
			registrarUsuario(view.registeruser);
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
				home.car.setVisible(false);

				home.hg.medicina.butonDolex.addActionListener(this);
				home.hg.medicina.buttonDolexNi.addActionListener(this);
				home.hg.medicina.buttonDolfenox.addActionListener(this);
				home.hg.medicina.buttonGlic.addActionListener(this);
				home.hg.medicina.buttonTricovit.addActionListener(this);
				home.hg.medicina.buttonVoltaren.addActionListener(this);

				home.hg.medicina.setVisible(false);
				home.hg.bellezas.setVisible(false);
				home.hg.accesibility.setVisible(false);
				home.hg.VistaEquipos.setVisible(false);
				home.hg.VistaOrtopedico.setVisible(false);
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
				home.car.setVisible(false);

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
				home.car.setVisible(false);

				home.titleHeader.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
				home.titleHeader.setForeground(new java.awt.Color(204, 204, 204));
				home.titleHeader.setText("Acerca De...");
				home.JHeader.add(home.titleHeader);
				home.titleHeader.setBounds(100, 30, 230, 50);
				home.iconHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AcercaHeader.png"))); // NOI18N
				home.JHeader.add(home.iconHeader);
				home.iconHeader.setBounds(30, 30, 90, 50);

			} else if (home.JCarrito.equals(me.getSource())) {
				home.e.setVisible(false);
				home.hg.setVisible(false);
				home.u.setVisible(false);
				home.d.setVisible(false);
				home.car.setVisible(true);
				con.conectar();
				cargarCarrito(producto);
				con.close();
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
				home.titleHeader.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
				home.titleHeader.setForeground(new java.awt.Color(204, 204, 204));
				home.titleHeader.setText("Medicamentos");
				home.JHeader.add(home.titleHeader);
				home.titleHeader.setBounds(100, 30, 230, 50);
				home.iconHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GrisMedicamento.png"))); // NOI18N
				home.JHeader.add(home.iconHeader);
				home.iconHeader.setBounds(30, 30, 90, 50);
			} else if (home.close.equals(me.getSource())) {
				System.exit(0);
			} else if (home.hg.JBelleza.equals(me.getSource())) {
				home.hg.setVisible(false);
				home.hg.bellezas.setVisible(true);
				home.titleHeader.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
				home.titleHeader.setForeground(new java.awt.Color(204, 204, 204));
				home.titleHeader.setText("Belleza");
				home.JHeader.add(home.titleHeader);
				home.titleHeader.setBounds(100, 30, 230, 50);
				home.iconHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GrisBelleza.png"))); // NOI18N
				home.JHeader.add(home.iconHeader);
				home.iconHeader.setBounds(30, 30, 90, 50);
			} else if (home.hg.JAccesibilidad.equals(me.getSource())) {
				home.hg.setVisible(false);
				home.hg.accesibility.setVisible(true);
				home.titleHeader.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
				home.titleHeader.setForeground(new java.awt.Color(204, 204, 204));
				home.titleHeader.setText("Accesibilidad");
				home.JHeader.add(home.titleHeader);
				home.titleHeader.setBounds(100, 30, 230, 50);
				home.iconHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GrisAccesibilidad.png"))); // NOI18N
				home.JHeader.add(home.iconHeader);
				home.iconHeader.setBounds(30, 30, 90, 50);
			} else if (home.hg.JEquipos.equals(me.getSource())) {
				home.hg.setVisible(false);
				home.hg.VistaEquipos.setVisible(true);
				home.titleHeader.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
				home.titleHeader.setForeground(new java.awt.Color(204, 204, 204));
				home.titleHeader.setText("Equipos");
				home.JHeader.add(home.titleHeader);
				home.titleHeader.setBounds(100, 30, 230, 50);
				home.iconHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GrisEquipos.png"))); // NOI18N
				home.JHeader.add(home.iconHeader);
				home.iconHeader.setBounds(30, 30, 90, 50);
			} else if (home.hg.JOrtopedicos.equals(me.getSource())) {
				home.hg.setVisible(false);
				home.hg.VistaEquipos.setVisible(true);
				home.titleHeader.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
				home.titleHeader.setForeground(new java.awt.Color(204, 204, 204));
				home.titleHeader.setText("Ortopedicos");
				home.JHeader.add(home.titleHeader);
				home.titleHeader.setBounds(100, 30, 230, 50);
				home.iconHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GrisOrtopedico.png"))); // NOI18N
				home.JHeader.add(home.iconHeader);
				home.iconHeader.setBounds(30, 30, 90, 50);
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

	@Override
	public void actionPerformed(ActionEvent e) {
		if (home.hg.medicina.butonDolex.equals(e.getSource())) {
			producto.add(2);
		} else if (home.hg.medicina.buttonDolexNi.equals(e.getSource())) {
			producto.add(5);
		} else if (home.hg.medicina.buttonDolfenox.equals(e.getSource())) {
			producto.add(4);
		} else if (home.hg.medicina.buttonGlic.equals(e.getSource())) {
			producto.add(1);
		} else if (home.hg.medicina.buttonVoltaren.equals(e.getSource())) {
			producto.add(6);
		} else if (home.hg.medicina.buttonTricovit.equals(e.getSource())) {
			producto.add(3);
		}
	}

}
