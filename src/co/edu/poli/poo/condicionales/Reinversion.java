package co.edu.poli.poo.condicionales;

import java.util.Scanner;

/**
 * Un hombre desea saber cu�nto dinero se genera por concepto de intereses sobre la 
 * cantidad que tiene en inversi�n en el banco. �l decidir� reinvertir los intereses 
 * siempre y cuando estos excedan a $50000, y en ese caso desea saber cu�nto dinero 
 * tendr� finalmente en su cuenta.
 * @author jlrodriguez
 *
 */
public class Reinversion {
	static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		
		//Entradas
		final int LIMITE_INTERESES = 50000;
		int valorInvertir;
		float tasaInteres;
		
		//Salidas
		float ganaciaTotal;
		
		//Proceso
		float valorIntereses;
		
		System.out.println("Digite valor a invertir: ");
		valorInvertir = s.nextInt();
		System.out.println("Digite tasa de inter�s: ");
		tasaInteres = s.nextFloat();
		
		valorIntereses = valorInvertir * tasaInteres / 100;
		
		if(valorIntereses > LIMITE_INTERESES) {
			ganaciaTotal = valorInvertir + valorIntereses + 
					(valorInvertir + valorIntereses)*tasaInteres/100; 
		}else {
			ganaciaTotal = valorInvertir + valorIntereses;
		}
		
		System.out.println("Valor de ganancia total: "+ganaciaTotal);
		//System.out.printf("Ganacia %.2f en total %n OK", );
		
		
	}
}
