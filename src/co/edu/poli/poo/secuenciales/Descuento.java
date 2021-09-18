package co.edu.poli.poo.secuenciales;

import java.util.Scanner;

/**
 * Una tienda ofrece un descuento del 15% sobre el total de la compra y 
 * un cliente desea saber cuanto deberá pagar finalmente por su compra
 * @author jlrodriguez
 *
 */
public class Descuento {
	static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		
		//Entradas
		final int PORC_DESCUENTO = 15;
		int valorCompra;
		
		//Salidas
		int valorTotal;
		
		//Proceso
		System.out.println("Digite el valor de la compra: ");
		valorCompra = s.nextInt();
		
		valorTotal = valorCompra - (valorCompra * PORC_DESCUENTO / 100);
		
		System.out.println("Valor Total: "+valorTotal);
		System.out.format("%,8d", valorTotal);
	}
}
