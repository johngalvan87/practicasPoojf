package co.edu.poli.poo.clases;

public class CrearPerro {
	
	public static void main(String args[]) {
		//Crear una instancia de la clase Perro
		//Declaraci�n
		Perro p1;
		//Inicializaci�n
		p1 = new Perro();
		p1.setNombre("Rocky");
		p1.setRaza("Bulldog");
		
		System.out.println(p1.getNombre());
		
		Perro miPerro;
		miPerro = new Perro("M�a");
		miPerro.setPeso(5);
		
		System.out.println(miPerro.getNombre()+" "+miPerro.getPeso());
		
	}
}
