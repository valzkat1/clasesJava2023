package vistas;

import java.awt.Dimension;
import java.awt.ScrollPane;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import archivos.EditarArchivo;
import archivos.LeerArchivo;

public class JtableEvents implements ListSelectionListener,TableModelListener{

	String[] cabeceras= {"A1","B1","C1","D1"};
	
	LeerArchivo objLector = new LeerArchivo();
	
	/*Object [][] datos = {
			{"A2","B2","C2","D2"},
			{"A3","B3","C3","D3"},
			{"A4","B4","C4","D4"}
	};*/
	
	Object [][] datos;
	JTable tablaExcel;
	
	TableModel tableMod;
	
	public JtableEvents() {	
		
		datos = objLector.getDatosTxt();
		tablaExcel =new JTable(datos,cabeceras);
		
		JFrame jfm = new JFrame();
		jfm.setSize(500,300);
		jfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		tableMod = tablaExcel.getModel();
		
		tablaExcel.setPreferredScrollableViewportSize(new Dimension(600,400));
		jfm.add(new JScrollPane(tablaExcel));
		jfm.setVisible(true);
		
		ListSelectionModel modeloFilas = tablaExcel.getSelectionModel();
		ListSelectionModel modeloColumnas = tablaExcel.getColumnModel().getSelectionModel();
		
		modeloFilas.addListSelectionListener(this);
		modeloColumnas.addListSelectionListener(this);
		
		tableMod.addTableModelListener(new TableModelListener() {
			
			@Override
			public void tableChanged(TableModelEvent tme) {
				
				
				String valor = (String) tableMod.getValueAt(tme.getFirstRow(), tme.getColumn());
				System.out.println("Valor celda** "+valor);
				EditarArchivo ed=new EditarArchivo(null);
				ed.Editar(valor, tme.getFirstRow(), tme.getColumn());
			}
		});
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JtableEvents();
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		
		int[] filasSeleccion = tablaExcel.getSelectedRows();
		String cadenaSeleccion="Seleccion: ";
		for(int i=0;i<filasSeleccion.length;i++) {		
			
			cadenaSeleccion+=" "+filasSeleccion[i];
		}
		
		System.out.println(cadenaSeleccion);
		
	}

	@Override
	public void tableChanged(TableModelEvent e) {
		// TODO Auto-generated method stub
		
	}

}
