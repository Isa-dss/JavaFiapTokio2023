package logica.aulas.exercicios07;

import java.util.Scanner;

public class Exercicio05 {
	
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
	
		int maior = 0;
		
		for (int i=0; i<12; i++) {
			System.out.println("Digite o numero: " + (i+1));
			int num = sc.nextInt();
			
			if (num > maior) {
		      	   maior = num;
		      	  
		   	}
		}
		
		 System.out.println("O maior valor e: " + maior);
		 
		 sc.close();
		 
		
	}

}


