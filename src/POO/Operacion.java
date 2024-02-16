package POO;

import javax.swing.JOptionPane;

public class Operacion {
	
	int numero1;
	int numero2;
	int suma;
	int resta;
	int multiplicacion;
	int dividir;
	
	// Metodo para que el usuario digite dos numeros 
	
    public void leerNumeros() {
    	numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
    	numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
    }
	
	public void sumar() {
		suma = numero1 + numero2;
	}
	
	public void restar() {
		resta = numero1 - numero2;
	}
	
	public void multiplicar() {
		multiplicacion = numero1 * numero2;
	}
	
	public void division() {
		dividir = numero1/numero2;
	}
	
	public void mostrarResultados() {
		System.out.println("La suma es: "+ suma);
		System.out.println("La resta es: "+ resta);
		System.out.println("La multiplicacion es: "+ multiplicacion);
		System.out.println("La division es: "+ dividir);
	}

}
