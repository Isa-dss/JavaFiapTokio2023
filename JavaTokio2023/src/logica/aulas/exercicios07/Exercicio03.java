package logica.aulas.exercicios07;

import java.util.Scanner;

public class Exercicio03 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Digite um numero: ");
		int num = sc.nextInt();
		
		for (int i=0; i<=25 ; i++) {
			int r = num*i;
			System.out.println(num + " x " + i + " = " + r);
		}
		
		sc.close();
	}

}
