package logica.aulas.exercicios07;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int div =0;

		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite um numero: ");
		 int n = sc.nextInt();
		 
		 for(int i = 1; i<=n;i++) {
			 if(n%i==0) {
				 div =i;
				 System.out.println("E divisivel por: " + div);

			 }
			 
		 }
		 sc.close();
	}

}
