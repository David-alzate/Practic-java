package practica;
import java.util.Scanner;

public class EntradaYSalidaDatos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite un numero");
		numero = entrada.nextInt();
		
		System.out.print("El numero es: " + numero);
		entrada.close();

	
	}

}
