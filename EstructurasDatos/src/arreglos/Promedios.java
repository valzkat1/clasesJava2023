package arreglos;

import javax.swing.JOptionPane;

public class Promedios {

	public static void main(String[] args) {
		
		// Metodos de ordenamiento (Quicksort)
		
		/**
		 *  Documentacion
		 *  
		 *  Replicar el ejercicios de promedios 
		 *  utilizando matrices para n cantidad de estudiantes.
		 *  y n cantidad de calificaciones.
		 *  Almacenar califacaciones por fila y en la ultima casilla de cada 
		 *  fila calcular promedio.
		 *  
		 *  
		 */
		double promedios[][];
		String numEst = "";
		do{
			numEst = JOptionPane.showInputDialog("Por favor ingrese la cantidad de estudiantes(Datos enteros)");
		}while((!Matrices.esNumerico(numEst)));		
		int nE = Integer.parseInt(numEst);
		
		String numNotas = "";
		do{
			numNotas = JOptionPane.showInputDialog("Por favor ingrese la cantidad de Calificaciones(Datos enteros)");
		}while((!Matrices.esNumerico(numNotas)));		
		int nN = Integer.parseInt(numNotas);
		
		promedios = new double[nE][nN+1];
		double suma=0;
		
		for(int i=0;i<nE;i++) {
			suma=0;
			for(int j=0;j<nN;j++) {
				String nota=JOptionPane.showInputDialog("Por favor ingrese nota "+(j+1)+" del estudiante "+(i+1));
				while(!Matrices.esNumerico(nota)) {
					nota=JOptionPane.showInputDialog("Por favor ingrese nota "+(j+1)+" del estudiante "+(i+1));
				}
				promedios[i][j]=Double.parseDouble(nota);
				suma=suma+promedios[i][j];
				
			}
			promedios[i][nN]=suma/nN;
		}
		
		for(int i=0;i<nE;i++) {
			for(int j=0;j<nN+1;j++) {
				
				System.out.print(promedios[i][j]);
				
			}
		System.out.println("");
		}
		
		
		
	}

}
