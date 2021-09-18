package co.edu.poli.poo.archivos;

import java.util.Scanner;

public class Ciudades {
	static Scanner s;
	static Archivos a;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		a = new Archivos();
		
		final String RUTA_ARCHIVOS = "C:\\workspace\\PracticaPoo\\";
		final String NOMBRE_ARCHIVO = "Ciudades.txt";
		String ciudad;
		
		System.out.println("Digite una ciudad: ");
		ciudad = s.next();
		
		a.escribirArchivo(RUTA_ARCHIVOS, NOMBRE_ARCHIVO, ciudad);		
	}
}
