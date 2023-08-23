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

public class LeerArchivo {

	// Archivos .csv
	File archivo;
	FileReader fr;
	BufferedReader br;
	ArrayList<Usuario> listaUsuarios;
	
	public LeerArchivo() {
		listaUsuarios= new ArrayList<Usuario>();
		try {
			
			Path ruta = Path.of("c");
			System.out.println("Ruta path**"+ruta);
		    archivo = new File("usuarios.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(br);
			String fila ="";
			
			while((fila=br.readLine())!= null) {
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

	public static void main(String[] args) {
		new LeerArchivo();
	}

}
