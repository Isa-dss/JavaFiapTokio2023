package logica.aula.exercicios.aula06;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um valor:");
		double a = entrada.nextDouble();
		
		System.out.println("Digite um segundo valor:");
		double b = entrada.nextDouble();
		
		double m;
		m=a*b;
		
		if(m%a==0) {
			System.out.println("O numero " + a + " e o numero "+ b + " sao numeros multiplos entre si");
		}else {
			System.out.println("O " + a + " e "+ b + " nao sao numeros multiplos entre si");
		}
		
		entrada.close();
	
		
		
	}

}
