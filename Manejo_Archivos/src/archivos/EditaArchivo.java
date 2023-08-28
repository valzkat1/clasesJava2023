package archivos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EditaArchivo {

	public EditaArchivo() {
		// TODO Auto-generated constructor stub
	}

	
	 public static void main(String[] args) {
	        try{
	        	File archivo = new File("src/datos/","usuarios.txt");
	            //Abro stream, crea el fichero si no existe
	            FileWriter fw=new FileWriter(archivo,true);
	            //Escribimos en el fichero un String y un caracter 97 (a)
	            
	            fw.write("Esto es una prueb");
	            fw.write("\r\n");
	            //Cierro el stream
	            fw.close(); 
	                //Abro el stream, el fichero debe existir
	            FileReader fr=new FileReader(archivo);
	            //Leemos el fichero y lo mostramos por pantalla
	            int valor=fr.read();
	            while(valor!=-1){
	                System.out.print((char)valor);
	                valor=fr.read();
	            }
	            //Cerramos el stream
	            fr.close();
	        }catch(IOException e){
	            System.out.println("Error E/S: "+e);
	        }
	    }
}
