package logica.aula.exercicios.aula06;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		int b = 7;
		int c = 4;
		int d = 8;
		
		boolean A = (a <= b && b < d);
		System.out.println(A);
		
		boolean B = (a == b || c != b);
		System.out.println(B);
		
		boolean C = (d > a && c >= b);
		System.out.println(C);
		
		boolean D = (a <= b || c <= d);
		System.out.println(D);
		
		boolean E = (b > c || c < a && d <= b);
		System.out.println(E);
	}
	

}
