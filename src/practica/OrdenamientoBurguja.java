package practica;

import java.util.Scanner;

public class OrdenamientoBurguja {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int arreglo[],nElementos,aux;
		
		System.out.print("Digite la cantidad de elementos del arreglo");
		nElementos = entrada.nextInt();
		
		arreglo = new int[nElementos];
		
		for (int i = 0; i <	nElementos; i ++) {
			System.out.println((i+1)+ ". Digite un numero");
			arreglo[i] = entrada.nextInt();
		}

		// Metodo burguja
		for(int i = 0; i < (nElementos - 1);i++) {
			for(int j = 0 ; j <(nElementos - 1); j ++) {
				if(arreglo[j] > arreglo[j + 1]) { // si numero actual > numero siguiente
					aux = arreglo[j];
					arreglo[j] = arreglo[j + 1];
					arreglo[j + 1] = aux;
				}
			}
		}
		
		// Mostrar el arreglo ordenado en forma creciente
		System.out.print("Arreglo ordenado en forma creciente: ");
		for (int i = 0; i < nElementos; i++) {
			System.out.print(arreglo[i]+ " - ");
		}
		System.out.println("");
		entrada.close();
	}

}
