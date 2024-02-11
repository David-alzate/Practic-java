package practica;
import java.util.Scanner;

public class AdivinarNumeroAleatorio {

	public static void main(String[] args) {
		int aleatorio;
		int numero;
		int i = 0;
		
		aleatorio = (int) (Math.random() * 100) + 1;
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("Digite un numero entero: ");
			numero = entrada.nextInt();
			if (numero < aleatorio) {
				System.out.println("Digite un numero Mayor");
			}else if(numero > aleatorio) {
				System.out.println("Digite un numero Menor");
			}else {
				System.out.println("Numero correcto");
			}

		    if (numero != aleatorio) {
		    	i += 1;
		    }
		}while(numero != aleatorio);
		
		System.out.print("El numero de intentos fue de " + i);
		entrada.close();
	}
}
