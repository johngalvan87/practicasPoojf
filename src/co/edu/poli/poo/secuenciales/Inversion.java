package co.edu.poli.poo.secuenciales;

import java.util.Scanner;

/**
 * Suponga que una persona desea invertir su capital en un banco y desea saber 
 * cuanto dinero ganará después de un mes si el banco paga a razón de 2% mensual
 * @author jlrodriguez
 *
 */
public class Inversion {
	//Objeto que permite capturar información a través del teclado
	static Scanner s;
	public static void main(String[] args) {
		//Inicializar el scanner como entrada de datos
		s = new Scanner(System.in);
		
		//Entradas
		final int PORC_INTERES = 2;
		int capital;
		
		//Salidas
		int valorGanado;
		
		//Proceso
		System.out.println("Digite valor del capital: ");
		capital = s.nextInt();
		
		valorGanado = capital * PORC_INTERES / 100;
		
		System.out.println("Valor Ganado: "+valorGanado);
	}
}
