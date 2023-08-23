package vistas;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;

import archivos.LeerArchivo;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Vector;

public class ListaUsuarios extends JFrame{
	private JTable table;
	LeerArchivo readFil;
	JScrollPane jScrollPane1 = new JScrollPane();
	public ListaUsuarios() {
		readFil= new LeerArchivo();
		table = new JTable();
		getContentPane().add(table, BorderLayout.CENTER);
		table.setModel(
						new DefaultTableModel(
								readFil.matrizUsuarios(),
								new String[] {"NOMBRE","APELLIDO","CARGO","ID"}));
		//table.
		 jScrollPane1.setViewportView(table);
		add(jScrollPane1);
		setVisible(true);
		setBounds(10, 10, 400, 300);
	}

}
