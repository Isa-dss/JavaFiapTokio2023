package logica.aulas.exercicios.aula05;

public class Exercicio02 {
	public static void main (String[] args) {
		
		int a = 5;
		
		float b = (float) 10.5;
		
		double c = 15.25;
		
		System.out.printf("%d %.2f %.2f \n" , a , b , c);
		
		
		String strA = Integer.toString(a);
		String strB = Float.toString(b);
		String strC = Double.toString(c);
		
		System.out.printf("%s %s %s \n",strA,strB,strC);

		
		
	}

}
