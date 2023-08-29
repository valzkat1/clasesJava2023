package vistas;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

public class FrmUsuarios extends JFrame implements ActionListener{

	private JPanel contenedor;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtCargo;
	private JTextField txtId;
	
	private JButton btnGuardar;
	private JButton btnCerrar;
	
	
	public FrmUsuarios() {
		setTitle("Crear usuarios");
		setBounds(200,150,500,259);
		contenedor= new JPanel();
		contenedor.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contenedor);
		contenedor.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		lblNombre.setBounds(30, 25, 100, 20);
		contenedor.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(110, 23, 200, 20);
		contenedor.add(txtNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		lblApellido.setBounds(30, 70, 100, 20);
		contenedor.add(lblApellido);
		
		
		txtApellido = new JTextField();
		txtApellido.setBounds(110, 67, 200, 20);
		contenedor.add(txtApellido);
		

		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		lblCargo.setBounds(30, 115, 100, 20);
		contenedor.add(lblCargo);
		
		txtCargo = new JTextField();
		txtCargo.setBounds(110, 112, 200, 20);
		contenedor.add(txtCargo);
		
		JLabel lblId = new JLabel("Id");
		lblId.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		lblId.setBounds(30, 160, 100, 20);
		contenedor.add(lblId);
		
		txtCargo = new JTextField();
		txtCargo.setBounds(110, 157, 200, 20);
		contenedor.add(txtCargo);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(this);
		btnGuardar.setIcon(new ImageIcon(FrmUsuarios.class.getResource("/iconos/guardar3.png")));
		btnGuardar.setBounds(350, 50, 124, 40);
		
		contenedor.add(btnGuardar);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
	   btnCerrar.setIcon(new ImageIcon(FrmUsuarios.class.getResource("/iconos/cerrar2.png")));
	   btnCerrar.setBounds(350, 120, 124, 40);
	   contenedor.add(btnCerrar);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
