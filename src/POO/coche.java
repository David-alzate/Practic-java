package POO;

public class coche {
	//Atributos
	String color;
	String marca;
	int km;
	
	// Metodo
	public static void main(String[] args) {
		coche coche1 = new coche();
		
		coche1.color = "Blanco";
		coche1.marca = "Audi";
		coche1.km = 0;
		
		System.out.println("El color del coche 1 es: "+ coche1.color);
		System.out.println("La marca del coche 1 es: "+ coche1.marca);
		System.out.println("El km del coche 1 es: "+ coche1.km);
		System.out.println();
		
		coche Coche2 = new coche();
		
		Coche2.color = "Negro";
		Coche2.marca = "BMW";
		Coche2.km = 1200;
		
		System.out.println("El color del coche 1 es: "+ Coche2.color);
		System.out.println("La marca del coche 1 es: "+ Coche2.marca);
		System.out.println("El km del coche 1 es: "+ Coche2.km);
	}
}
