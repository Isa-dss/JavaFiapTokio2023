package logica.aulas.exercicios07;

import java.util.Scanner;

public class Exercicio04 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int soma=0;
		
		for (int i=0; i<10; i++) {
			System.out.println("Digite o numero " + (i+1));
			int num = sc.nextInt();
			
			 soma = soma+ num;
		}
		System.out.println("a soma é: " + soma);
		
		sc.close();
		
	}

}

