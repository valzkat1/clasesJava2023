package vistas;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import archivos.LeerArchivo;

public class JtableDinamica {

	/*
	 * Crear una Jtable de 4 x 4 donde las 
	 * ultima fila y la ultima columna sean el resultado de la suma de 
	 * las filas y columnas respectivamente.
	 * 
	 */
	
	
    String[] cabeceras= {"A1","B1","C1","D1"};
	
	LeerArchivo objLector = new LeerArchivo();
	
	/*Object [][] datos = {
			{"A2","B2","C2","D2"},
			{"A3","B3","C3","D3"},
			{"A4","B4","C4","D4"}
	};*/
	
	Object [][] datos;
	JTable tabla;
	
	public JtableDinamica() {
		tabla= new JTable(new ModeloCuadroMagico());
		JFrame jfm = new JFrame();
		jfm.setSize(500,300);
		jfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		//tableMod = tablaExcel.getModel();
		
		tabla.setPreferredScrollableViewportSize(new Dimension(600,400));
		jfm.add(new JScrollPane(tabla));
		jfm.setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	class ModeloCuadroMagico extends DefaultTableModel {
		
		public ModeloCuadroMagico() {
			super(datos,cabeceras);
		}
		
		@Override
		public boolean isCellEditable(int fila,int columna) {
			return fila<2 && columna<2;
		}
		
		
	}
	
	

}
