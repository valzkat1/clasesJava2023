package vistas;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import archivos.LeerArchivo;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JToolBar;

public class ListaUsuarios extends JFrame{
	private JTable table;
	private String[][] datos;
	private LeerArchivo usoFiles;
	private JScrollPane panelScroll;
	private JToolBar toolBar;
	FrmUsuarios frmUsuarios;
	public ListaUsuarios() {
		panelScroll = new JScrollPane();
		usoFiles = new LeerArchivo();
		table = new JTable(new DefaultTableModel());
		table.setBackground(new Color(204, 204, 204));
		frmUsuarios = new FrmUsuarios();
		
		
		panelScroll.setViewportView(table);
		
		getContentPane().add(panelScroll);
		
	
		
		JButton btnLeerDatos = new JButton("Leer data");
		
		btnLeerDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				datos=usoFiles.getDatosTxt("usuarios.txt");
				System.out.println("Datos matriz "+datos);
				table.setModel(
					new DefaultTableModel(
							datos,
							new String[] {"Nombre","Apellido","Cargo","ID"}
							)
					);
			//String cargonuevo= JOptionPane.showInputDialog("Por favor ingrese el nuevo cargo:");
			}
		});
		
		JButton btnCrearDatos = new JButton("Nuevo");
		btnCrearDatos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				frmUsuarios.setVisible(true);
				
			}
		});
		
		toolBar = new JToolBar();
		toolBar.add(btnLeerDatos);
		toolBar.add(btnCrearDatos);
		add(toolBar,BorderLayout.NORTH);
		
		//getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		IniciarMarco();
		// TODO Auto-generated constructor stub
	}
	
	public void IniciarMarco() {
		setBounds(200,150,500,300);
		setVisible(true);
		setTitle("Leyendo txt");
	}

}
