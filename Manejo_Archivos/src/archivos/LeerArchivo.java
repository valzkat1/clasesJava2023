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
import java.util.Vector;

import modelos.Usuario;
import vistas.ListaUsuarios;

public class LeerArchivo {

	// Archivos .csv
	File archivo;
	FileReader fr;
	BufferedReader br;
	Vector<Usuario> listaUsuarios;
	String contenido[][];
	public LeerArchivo() {
		listaUsuarios= new Vector<Usuario>();
		try {
		    //archivo = new File("C:\ClasesJava2023\clasesJava2023\Manejo_Archivos\src\archivos");
		    //archivo = new File("C:\\ClasesJava2023\\usuarios.txt");
			
		    //archivo = new File("Manejo_Archivos\\src\\datos","usuarios.txt");
		    //archivo = new File("src/datos","usuarios.txt");
		    archivo = new File("src/datos/usuarios.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			String fila ="";
			// MVC
			contenido=new String[3][4];
			int fi=0;
			while((fila=br.readLine())!= null) {
				contenido[fi]=fila.split(",");
				fi++;
				String userLine[] =fila.split(","); 
				String nombre=userLine[0];
				String apellido= userLine[1];
				String cargo = userLine[2];
				String id = userLine[3];
				listaUsuarios.add(new Usuario(Integer.parseInt(id),nombre,apellido,cargo));
				
			}
	
			fr.close();	
			
			for(Usuario u:listaUsuarios) {
				
				System.out.println(u.toString());
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			// AOP programacion orientada a aspectos
		}
		finally {
			
		}
				
		
		
	}
	public String[][] matrizUsuarios(){
		return contenido;
	}

	public Vector<Usuario> getListaUser(){
		return listaUsuarios;
	}
	public static void main(String[] args) {
		new ListaUsuarios();
	}

}
