package vistas;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import archivos.LeerArchivo;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListaUsuarios extends JFrame{
	private JTable table;
	private String[][] datos;
	private LeerArchivo usoFiles;
	private JScrollPane panelScroll;
	
	public ListaUsuarios() {
		panelScroll = new JScrollPane();
		usoFiles = new LeerArchivo();
		table = new JTable(new DefaultTableModel());
		
		panelScroll.setViewportView(table);
		
		add(panelScroll);
		
		JButton btnNewButton = new JButton("Leer data");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				datos=usoFiles.getDatosTxt();
				table.setModel(
					new DefaultTableModel(
							datos,
							new String[] {"Nombre","Apellido","Cargo","ID"}
							)
					);
			}
		});
		getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		IniciarMarco();
		// TODO Auto-generated constructor stub
	}
	
	public void IniciarMarco() {
		setBounds(200,150,500,300);
		setVisible(true);
		setTitle("Leyendo txt");
	}

}
