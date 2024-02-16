package POO;

public class mainOperaciones {

	public static void main(String[] args) {
		Operacion op = new Operacion();
		
		op.sumar(1,3);
		op.restar(5,2);
		op.multiplicar(5,5);
		op.division(5,2);
		op.mostrarResultados();

	}
}
