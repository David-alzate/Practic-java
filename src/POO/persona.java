package POO;

public class persona {
	String nombre;
	int edad;

	// Metodo constructor
	public persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;

	}

	public void mostrarDatos() {
		System.out.println("El nombre es: " + nombre);
		System.out.println("La edad es: " + edad);
	}

}
