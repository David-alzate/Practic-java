package POO;


public class Operacion {
	
	int suma;
	int resta;
	int multiplicacion;
	int dividir;
	
	// Metodo para que el usuario digite dos numeros 
	

	public void sumar(int numero1, int numero2) {
		suma = numero1 + numero2;
	}
	
	public void restar(int numero1, int numero2) {
		resta = numero1 - numero2;
	}
	
	public void multiplicar(int numero1, int numero2) {
		multiplicacion = numero1 * numero2;
	}
	
	public void division(int numero1, int numero2) {
		dividir = numero1/numero2;
	}
	
	public void mostrarResultados() {
		System.out.println("La suma es: "+ suma);
		System.out.println("La resta es: "+ resta);
		System.out.println("La multiplicacion es: "+ multiplicacion);
		System.out.println("La division es: "+ dividir);
	}

}
