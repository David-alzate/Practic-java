package POO;

public class persona {
	String nombre;
	int edad;

	// Metodo constructor
	public persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public void mostrarDatos() {
		System.out.println("El nombre es: " + nombre);
		System.out.println("La edad es: " + edad);
	}
	
	public void mostrarDatos(String apellido) {
		System.out.println(apellido);
		System.out.println("El nombre es: " + nombre);
		System.out.println("La edad es: " + edad);
	}



}
