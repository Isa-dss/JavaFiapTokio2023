package logica.aulas.exercicios07;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated
		
		int num =0;
		int soma=0;
		
		Scanner sc = new Scanner (System.in);
		
		
		do{
			System.out.println("Digite um numero inteiro positivo");
			 num = sc.nextInt();
		for(int i=1; i<=num;i++) {
			soma +=i;

		}
		}while(num<0);
		
		System.out.println("A soma destes valores sera:" + soma);

		sc.close();
	}
}

