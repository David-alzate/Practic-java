package practica;

import java.util.Scanner;

public class CalificacionEstudiantes {

	public static void main(String[] args) {
		float participacion;
		float primerParcial;
		float segundoParcial;
		float examenFinal;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite La calificacion de participacion");
		participacion = entrada.nextInt();
		System.out.print("Digite La calificacion del primer parcial");
		primerParcial = entrada.nextInt();
		System.out.print("Digite La calificacion del segundo parcial ");
		segundoParcial = entrada.nextInt();
		System.out.print("Digite La calificacion del examen final");
		examenFinal = entrada.nextInt();

	}

}
