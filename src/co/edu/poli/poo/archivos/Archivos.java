package co.edu.poli.poo.archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Archivos {
	
	public void escribirArchivo(String ruta, String nomArchivo, String texto) {
		FileWriter archivo;
		PrintWriter pw;
		
		try {
			//Ubicar el archivo
			archivo = new FileWriter(ruta+nomArchivo, true);
			//Abrir el archivo
			pw = new PrintWriter(archivo);
			//Escribir en el archivo
			pw.println(texto);
			//Guardar cambios en el archivo
			pw.flush();
			//Cerrar el archivo
			pw.close();
		}catch(Exception e) {
			System.out.println("Ha ocurrido un error: "+e.getMessage());
		}		
	}
	
	public List<String> leerArchivo(String ruta, String nomArchivo){
		File archivo;
		FileReader fr;
		BufferedReader br;
		List<String> lista = new ArrayList<String>();
		String lineaTexto;
		
		try {
			//Obtener el archivo
			archivo = new File(ruta+nomArchivo);
			//Abrir el archivo
			fr = new FileReader(archivo);
			//Leer el archivo linea por linea
			br = new BufferedReader(fr);
			
			while((lineaTexto = br.readLine())!=null) {
				lista.add(lineaTexto);
			}
			fr.close();
		}catch(Exception e) {
			System.out.println("Ha ocurrido un error: "+e.getMessage());
		}
		return lista;
	}
}
