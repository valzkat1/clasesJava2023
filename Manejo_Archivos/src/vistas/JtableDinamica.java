package vistas;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import archivos.EditarArchivo;
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
	TableModel tableMod;
	
	public JtableDinamica() {
		datos = objLector.getDatosTxt("cuadromagico.txt");
		tabla= new JTable(new ModeloCuadroMagico());
		
		tabla.setDefaultRenderer(Double.class, new RenderTable());
		JFrame jfm = new JFrame();
		jfm.setSize(500,300);
		jfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		tableMod = tabla.getModel();
		
		tabla.setPreferredScrollableViewportSize(new Dimension(600,400));
		jfm.add(new JScrollPane(tabla));
		jfm.setVisible(true);
    
		tableMod.addTableModelListener(new TableModelListener() {
			
			@Override
			public void tableChanged(TableModelEvent tme) {
				
				actualizarSumas(tme);
			
			}

			private void actualizarSumas(TableModelEvent tme) {
				
				if(tme.getType() == TableModelEvent.UPDATE) {
					
					try {
					TableModel modelo = (TableModel) tme.getSource();
					
					int fila = tme.getFirstRow();
					int columna = tme.getColumn();
					
					if((fila==3) || (columna == 3)){
						return;
					}
					
					double columna1 = Double.parseDouble(modelo.getValueAt(fila, 0).toString());
					double columna2 = Double.parseDouble(modelo.getValueAt(fila, 1).toString());
					double columna3 = Double.parseDouble(modelo.getValueAt(fila, 2).toString());
				
					modelo.setValueAt((columna1+columna2+columna3), fila, 3);
				
				
					double fila1 = Double.parseDouble(modelo.getValueAt(0, columna).toString());
					double fila2 = Double.parseDouble(modelo.getValueAt(1, columna).toString());
					double fila3 = Double.parseDouble(modelo.getValueAt(2, columna).toString());
					
					modelo.setValueAt((fila1+fila2+fila3), 3, columna);
				
					double totC1 = Double.parseDouble(modelo.getValueAt(3, 0).toString());
					double totC2 = Double.parseDouble(modelo.getValueAt(3, 1).toString());
					double totC3 = Double.parseDouble(modelo.getValueAt(3, 2).toString());
					
					double totalColumnas = totC1+totC2+totC3;
					
					double totF1 = Double.parseDouble(modelo.getValueAt(0, 3).toString());
					double totF2 = Double.parseDouble(modelo.getValueAt(1, 3).toString());
					double totF3 = Double.parseDouble(modelo.getValueAt(2, 3).toString());
					
					double totalFilas = totF1+totF2+totF3;
					
					if(totalColumnas == totalFilas) {
						JOptionPane.showMessageDialog(jfm, "EnHorabuena.! has logrado el objetivo.");
					}
					modelo.setValueAt(totalFilas-totalColumnas, 3, 3);
					}catch (Exception e) {
						
						System.out.println("Error** "+e);
						// TODO: handle exception
					}
				}
				
			}
		});
		
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
		
		@Override
		public Class<?> getColumnClass(int arg){
			return Double.class;
		}
		
		
	}
	
	class RenderTable extends DefaultTableCellRenderer{
		
		@Override
		public Component getTableCellRendererComponent(JTable tabla, Object valor, boolean isSelected, boolean hasFocus, int row, int column) {
			
			super.getTableCellRendererComponent(tabla, valor, isSelected, hasFocus, row, column);
			
			if((row == 3) || (column == 3)) {
				this.setBackground(Color.YELLOW);
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
