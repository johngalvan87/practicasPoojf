package co.edu.poli.poo.funciones;

import java.util.Scanner;

public class Calculadora {
	static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		//Definir variables
		float n1, n2, resultado = 0;
		int opcion = menuOpciones();
		
		while(opcion != 5) {
			System.out.println("Digite número 1: ");
			n1 = s.nextFloat();
			
			System.out.println("Digite número 2: ");
			n2 = s.nextFloat();
			
			switch(opcion) {
			case 1:
				resultado = sumar(n1, n2);
				break;
			case 2:
				resultado = restar(n1, n2);
				break;
			case 3:
				resultado = multiplicar(n1, n2);
				break;
			case 4:
				resultado = dividir(n1, n2);
				break;
			default:
				System.out.println("Opción no válida");
				break;
			}
			System.out.println("Resultado: "+resultado);
			opcion = menuOpciones();
		}
	}
	
	public static int menuOpciones() {
		int opcion = 0;
		while(opcion < 1 || opcion > 5) {
			System.out.println("Elija una opción: ");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Salir");
			opcion = s.nextInt();
		}
		return opcion;
	}
	
	public static float sumar(float n1, float n2) {
		float resultado = n1 + n2;
		return resultado;
	}
	
	public static float restar(float n1, float n2) {
		float resultado = n1 - n2;
		return resultado;
	}
	
	public static float multiplicar(float n1, float n2) {
		float resultado = n1 * n2;
		return resultado;
	}
	
	public static float dividir(float n1, float n2) {
		float resultado = n1 / n2;
		return resultado;
	}
}
