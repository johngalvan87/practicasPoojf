package co.edu.poli.poo.clases;

public class Perro {
	//Atributos
	private String nombre;
	private String raza;
	private float peso;
	
	public Perro() {}
	
	public Perro(String nombre) {
		this.nombre = nombre;		
	}
	
	public Perro(String nombre, String raza) {
		this.nombre = nombre;
		this.raza = raza;
	}
	
	public void ladrar() {}
	
	public void comer() {}
	
	public void mover() {}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getRaza() {
		return this.raza;
	}
	
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	public float getPeso() {
		return this.peso;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
}
