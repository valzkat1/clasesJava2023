package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.ArrayList;

import modelos.Usuario;
import vistas.ListaUsuarios;

public class LeerArchivo {

	// Archivos .csv
	File archivo;
	FileReader fr;
	BufferedReader br;
	ArrayList<Usuario> listaUsuarios;
	
	public String[][] getDatosTxt(){
		String[][] datos = new String[4][4];
		try {
	    archivo = new File("src/datos/","usuarios.txt");
		
				fr = new FileReader(archivo);
			
			br = new BufferedReader(fr);
			String fila ="";
			int contador=0;
			while((fila=br.readLine())!= null) {
				String userLine[] =fila.split(",");
				datos[contador]=fila.split(",");
				contador=contador+1;
				String nombre=userLine[0];
				String apellido= userLine[1];
				String cargo = userLine[2];
				String id = userLine[3];
				
				
			}
	
			
			fr.close();	
			return datos;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			return datos;
		}
		
	}
	
	public LeerArchivo() {
	
		
			
			
		
				
		
		
	}

	// Cuatro procedimientos basicos que se realizan al interactuar con datos persistentes.
	// Create Read Update Delete
	
	public static void main(String[] args) {
		//new LeerArchivo();
		new ListaUsuarios();
	}

}
