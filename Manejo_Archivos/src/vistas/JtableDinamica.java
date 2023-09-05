package vistas;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
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
		datos = objLector.getDatosTxt("cuadromagico.txt");
		tabla= new JTable(new ModeloCuadroMagico());
		
		tabla.setDefaultRenderer(Double.class, new RenderTable());
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
		new JtableDinamica();
	}
	
	
	class ModeloCuadroMagico extends DefaultTableModel {
		
		public ModeloCuadroMagico() {
			super(datos,cabeceras);
		}
		
		// Sobreescribir el comportamiento de la funcion isCellEditable()
		@Override
		public boolean isCellEditable(int fila,int columna) {
			return fila<3 && columna<3;
		}
		
		
	}
	
	class RenderTable extends DefaultTableCellRenderer{
		
		@Override
		public Component getTableCellRendererComponent(JTable tabla, Object valor, boolean isSelected, boolean hasFocus, int row, int column) {
			
			super.getTableCellRendererComponent(tabla, valor, isSelected, hasFocus, row, column);
			
			if((row == 3) || (column == 3)) {
				setBackground(Color.GRAY);
				//setForeground(Color.WHITE);
			}
			else {
				setBackground(Color.WHITE);
				//setForeground(Color.BLACK);
			}
			
			return this;
		}
		
		
	}
	
	

}
