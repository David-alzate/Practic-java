package practica;

import java.util.Scanner;

public class EjercicioDinero {

	public static void main(String[] args) {
		float Guillermo;
		float Luis;
		float Juan;
		float total;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese el N de dolares de Guillermo");
		Guillermo = entrada.nextFloat();
		Luis = (Guillermo / 2);
		Juan = ((Guillermo + Luis) / 2);
		total = (Guillermo + Juan + Luis);
		
		System.out.println("El N de dolares de Guillermo es: " + Guillermo);
		System.out.println("El N de dolares de Luis es: " + Luis);
		System.out.println("El N de dolares de Juan es: " + Juan);
		System.out.print("El total de dolares es: " + total);		
		entrada.close();
	}
}