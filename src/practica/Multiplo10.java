package practica;

import java.util.Scanner;

public class Multiplo10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite un numero entero: ");
		int numero = entrada.nextInt();
		
		if (numero % 10 == 0) {
			System.out.print("El numero " + numero + " es multiplo de 10");
		}else {
			System.out.print("El numero "+ numero + " no es multiplo de 10");
		}
	 entrada.close();
	}
}
