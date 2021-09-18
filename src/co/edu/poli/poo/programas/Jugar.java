package co.edu.poli.poo.programas;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import co.edu.poli.poo.archivos.Archivos;

public class Jugar {
	static Scanner s;
	static Archivos archivos;
	static List<String> palabras;
	static Tableros tablero;
	
	public static void main(String[] args) {
		s = new Scanner(System.in);
		archivos = new Archivos();
		tablero = new Tableros();
		
		//Objeto para generar un numero aleatorio
		Random r = new Random();
		//variables de control
		int aleatorio, vidas, aciertos;
		boolean terminarJuego, existeLetra;
		//variables para gestionar la palabra a adivinar
		String palabraAdivinar, palabraArmada;
		//variables para gestionar las letras
		char[] palabraPorLetras, espacios;
		char letra;
				
		int opcionJuego, opcionCategoria;
		String palabraNueva;
		
		opcionJuego = menuJuego();
		
		while(opcionJuego != 4) {
			if(opcionJuego == 1) {
				System.out.println("Elije una categoría: ");
				opcionCategoria = menuPalabras();
				System.out.println("Digite la nueva palabra: ");
				palabraNueva = s.next();
				
				palabraNueva = palabraNueva.toUpperCase();
				
				switch(opcionCategoria) {
				case 1:
					archivos.escribirArchivo(Constantes.RUTA_ARCHIVOS,
											 Constantes.ARCHIVO_PAISES,
											 palabraNueva);
					break;
				case 2:
					archivos.escribirArchivo(Constantes.RUTA_ARCHIVOS, 
											 Constantes.ARCHIVO_EQUIPOS, 
											 palabraNueva);
					break;
				case 3:
					archivos.escribirArchivo(Constantes.RUTA_ARCHIVOS, 
											 Constantes.ARCHIVO_CAPITALES, 
											 palabraNueva);
					break;
				default:
					System.out.println("Opción no válida");
					break;
				}
			}
			
			if(opcionJuego == 2) {
				System.out.println("Elije una categoria: ");
				opcionCategoria = menuPalabras();
				switch(opcionCategoria) {
				case 1:
					palabras = archivos.leerArchivo(Constantes.RUTA_ARCHIVOS, Constantes.ARCHIVO_PAISES);
					break;
				case 2:
					palabras = archivos.leerArchivo(Constantes.RUTA_ARCHIVOS, Constantes.ARCHIVO_EQUIPOS);
					break;
				case 3: 
					palabras = archivos.leerArchivo(Constantes.RUTA_ARCHIVOS, Constantes.ARCHIVO_CAPITALES);
					break;
				default:
					System.out.println("Opción no válida");
					break;
				}
				aleatorio = r.nextInt(palabras.size());
				//Elegir la palabra a Adivinar
				palabraAdivinar = palabras.get(aleatorio);
				//Inicializar los arreglos con el tamaño de la palabra a adivinar
				palabraPorLetras = new char[palabraAdivinar.length()];
				espacios = new char[palabraAdivinar.length()];
				//Recorrer la palabra a adivinar y llenar los arreglos
				for(int i = 0; i<palabraAdivinar.length(); i++) {
					palabraPorLetras[i] = palabraAdivinar.charAt(i);
					espacios[i] = '_';
				}
				
				//Iniciar variables de control
				vidas = 7;
				aciertos = 0;
				palabraArmada = "";
				terminarJuego = false;
				existeLetra = false;
				
				//Solicitar letras
				do {
					existeLetra = false;
					if(aciertos == palabraPorLetras.length) {
						terminarJuego = true;
						System.out.println("GANASTE!!!!");
						System.out.println(palabraAdivinar);
					}else {
						tablero.dibujarTablero(vidas);
						palabraArmada = "";
						for(int i=0; i<espacios.length; i++) {
							palabraArmada += espacios[i]+" ";
						}
						System.out.println(palabraArmada);
						//Solicitar letras
						System.out.println("Digite una letra: ");
						letra = s.next().toUpperCase().charAt(0);
						//Verificar si la letra coincide con una letra de la palabra a adivinar
						for(int i=0; i<palabraPorLetras.length; i++) {
							if(letra == palabraPorLetras[i]) {
								//Si coincide...
								//Valido si la letra no fue adivinada antes...
								if(letra != espacios[i]) {
									aciertos++;
									existeLetra = true;
									espacios[i] = letra;
								}else{
									System.out.println("Letra ya digitada");
								}
							}
						}
						//No hay coincidencia
						if(!existeLetra) {
							vidas--;
							if(vidas == 0) {
								terminarJuego = true;
								tablero.dibujarTablero(vidas);
								System.out.println("PERDISTE!!! INTÉNTALO DE NUEVO");
							}
						}
					}
				}while(!terminarJuego);
				
			}
			
			opcionJuego = menuJuego();
		}
		
		
	}
	
	public static int menuPalabras() {
		int opcion = 0;
		while(opcion < 1 || opcion > 3) {			
			System.out.println("1. Paises");
			System.out.println("2. Equipos");
			System.out.println("3. Capitales");
			opcion = s.nextInt();
		}
		return opcion;
	}
	
	public static int menuJuego() {
		int opcion = 0;
		while(opcion < 1 || opcion > 4) {
			System.out.println("Elija una opción: ");
			System.out.println("1. Administrar palabras");
			System.out.println("2. Jugar");
			System.out.println("3. Creditos");
			System.out.println("4. Salir");
			opcion = s.nextInt();
		}
		return opcion;
	}
}
