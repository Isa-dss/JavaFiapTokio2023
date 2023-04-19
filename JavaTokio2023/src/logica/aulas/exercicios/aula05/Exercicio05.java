package logica.aulas.exercicios.aula05;

import java.util.Scanner;

public class Exercicio05 {
	public static void main (String[] args) {
		
		System.out.println("Ola! Digite sua nota 1:");
		Scanner entrada = new Scanner (System.in);	
		Double nota1 = entrada.nextDouble();
		
		System.out.println("Digite a nota 2:");
		Double nota2 = entrada.nextDouble();
		
		Double media;
		
		media = (nota1*0.4 + nota2*0.6);
		
		System.out.println("A sua média ponderada é:" + media);
		
		entrada.close();


	}

}
