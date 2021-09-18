package co.edu.poli.poo.ciclicos;

import java.util.Scanner;

public class Menu {
	static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		int opcion = 0;
		
		while(opcion != 4) {
			System.out.println("Seleccione una opción: ");
			System.out.println("1. Registrar Contacto");
			System.out.println("2. Modificar Contacto");
			System.out.println("3. Ver Contacto");
			System.out.println("4. Salir");
			
			opcion = s.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("Ingresó a la opción de Registro");
				break;
			case 2:
				System.out.println("Ingresó a la opción de Modificación");
				break;
			case 3:
				System.out.println("Ingresó a la opción de Visualización");
				break;
			default:
				System.out.println("Opción no válida");
				break;
			}			
		}
	}
}
