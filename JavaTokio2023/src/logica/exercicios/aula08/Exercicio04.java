package logica.exercicios.aula08;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = (int) Math.sqrt(81);
		System.out.println("O valor de X e: " + x);

		double y;
		double b = Math.pow(x, 2);
		double c = Math.cbrt(8) - Math.PI*x;
		double d = Math.pow(3, 4) + x;
		
		y = (5*x + 2*b + c)/d;
		
		System.out.println("O valor de y e: " + y);
	}

}
