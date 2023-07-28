package clases;

public class ClaseExterna {

	static int numeroExterno=10;
	
	int numeroExternoNoStatic=15;
	
	
	class ClaseInterna{
		
		public void escribirData() {
			
			System.out.println("Miembro estatico de clase externa: "+numeroExterno);
			System.out.println("Miembro NO estatico de clase externa: "+numeroExternoNoStatic);
			
		}
		
	}
	
}
