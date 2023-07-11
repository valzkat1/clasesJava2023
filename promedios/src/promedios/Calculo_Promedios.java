package promedios;

import javax.swing.JOptionPane;

public class Calculo_Promedios {

	
	
	public static void main(String[] args) {
		
		operativas objetoOperativas=new operativas();
		
		int canEst,canNot;
		
		String estudiantes[];
		double promedios[];
		double sumatoria;
		
		String cantiEstudiantes = JOptionPane.showInputDialog("Por favor ingrese la cantidad de estudiantes");
		String cantiNotas = JOptionPane.showInputDialog("Por favor ingrese la cantidad de notas a promediar");
		
	
		canEst = objetoOperativas.convertirEntero(cantiEstudiantes);		
		while(canEst<1) {
		  cantiEstudiantes = JOptionPane.showInputDialog("Por favor ingrese la cantidad de estudiantes");
		  canEst = objetoOperativas.convertirEntero(cantiEstudiantes);
		}
		
		canNot = objetoOperativas.convertirEntero(cantiNotas);
		while(canNot<1) {
		  cantiNotas = JOptionPane.showInputDialog("Por favor ingrese la cantidad de Notas");
		  canNot = objetoOperativas.convertirEntero(cantiNotas);
		}
		
		estudiantes=new String[canEst];
		promedios = new double[canEst];
		
		
		
		for(int i=0; i < canEst; i++) {
			
			estudiantes[i] = JOptionPane.showInputDialog("Por favor ingrese el nombre del estudiante "+(i+1));
			sumatoria=0;
			for(int j=0; j < canNot; j++ ) {
				
				String nota= JOptionPane.showInputDialog("Por favor ingrese la nota "+(j+1));
				double califi= objetoOperativas.convertirReal(nota);
				
				while(califi<0) {
					 nota= JOptionPane.showInputDialog("Por favor ingrese la nota "+(j+1)+" (Debe ser mayor o igual a cero)");
					 califi= objetoOperativas.convertirReal(nota);
				}
				
				sumatoria=sumatoria + califi;
				
			}
			promedios[i]= sumatoria/canNot;
			
		}
		
		for(int i=0; i<canEst; i++) {
			System.out.println("Nombre: "+estudiantes[i]  +" -> Promedio: "+promedios[i]);
		}
		
		
		
		//JOptionPane.showMessageDialog(null,objetoOperativas.getNombre());
		
		//String cadena = new String("TExto inicializado en el contructor");
		
		
	}

}
