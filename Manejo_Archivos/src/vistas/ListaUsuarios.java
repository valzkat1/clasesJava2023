package vistas;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JWindow;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;

import archivos.LeerArchivo;

import java.awt.BorderLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import java.util.Vector;

public class ListaUsuarios extends JFrame implements FocusListener{
	private JTable table;
	LeerArchivo readFil;
	JScrollPane jScrollPane1 = new JScrollPane();
	public ListaUsuarios() {
		readFil= new LeerArchivo();
		table = new JTable();
		table.addFocusListener(this);
		getContentPane().add(table, BorderLayout.CENTER);
		table.setModel(
						new DefaultTableModel(
								readFil.matrizUsuarios(),
								new String[] {"NOMBRE","APELLIDO","CARGO","ID"}));
		//table.
		table.addFocusListener(null);
		 jScrollPane1.setViewportView(table);
		add(jScrollPane1);
		setVisible(true);
		setBounds(10, 10, 400, 300);
	}
	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==null) {
		JOptionPane.showMessageDialog(this, "Focus en accion.");
		}
		System.out.println(e.toString());
	}
	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}

}
