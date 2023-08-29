package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import modelos.Usuario;

public class EditarArchivo {

	File archivo;
	FileWriter editor;
	Usuario u;
	
	public EditarArchivo(Usuario user) {
		this.u=user;
		try {
		    archivo = new File("src/datos","usuarios.txt");		
			editor = new FileWriter(archivo,true);
			
			editor.write(u.getNombre()+","+u.getApellido()+","+u.getCargo()+","+u.getId()+"\r\n");
			editor.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
