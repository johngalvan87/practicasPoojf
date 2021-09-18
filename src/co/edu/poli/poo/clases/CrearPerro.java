package co.edu.poli.poo.clases;

public class CrearPerro {
	
	public static void main(String args[]) {
		//Crear una instancia de la clase Perro
		//Declaración
		Perro p1;
		//Inicialización
		p1 = new Perro();
		p1.setNombre("Rocky");
		p1.setRaza("Bulldog");
		
		System.out.println(p1.getNombre());
		
		Perro miPerro;
		miPerro = new Perro("Mía");
		miPerro.setPeso(5);
		
		System.out.println(miPerro.getNombre()+" "+miPerro.getPeso());
		
	}
}
