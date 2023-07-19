package arreglos;

public class Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vector[] = new int[3];
		
		int matriz[][] = new int[4][4];
		
		int contador=0;
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz.length;j++) {
				contador=contador+1;
				matriz[i][j]=contador;
			}
			
		}
		
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz.length;j++) {
				
				System.out.print(matriz[i][j]+" | ");
				
			}
		System.out.println("");		
		System.out.println("-------------- ");	
			}
	
		
	}

}
