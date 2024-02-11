package practica;

import java.util.Scanner;

public class CalificacionEstudiantes {

	public static void main(String[] args) {
		float participacion;
		float primerParcial;
		float segundoParcial;
		float examenFinal;
		float calificacionFinal;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite La calificacion de participacion: ");
		participacion = entrada.nextFloat();
		System.out.print("Digite La calificacion del primer parcial: ");
		primerParcial = entrada.nextFloat();
		System.out.print("Digite La calificacion del segundo parcial: ");
		segundoParcial = entrada.nextFloat();
		System.out.print("Digite La calificacion del examen final: ");
		examenFinal = entrada.nextFloat();
		
		participacion *= 0.10f;
		primerParcial *= 0.25f;
		segundoParcial *= 0.25f;
		examenFinal *= 0.40f;
		
		calificacionFinal = (participacion + primerParcial + segundoParcial + examenFinal);
		System.out.print("La nota final es: " + calificacionFinal);
		
		entrada.close();
	}

}
