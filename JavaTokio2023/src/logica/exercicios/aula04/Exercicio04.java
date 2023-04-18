package logica.exercicios.aula04;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main (String [] args) {
		
		System.out.print("Digite o seu nome: ");
		
		Scanner entrada = new Scanner (System.in);
		String nome = entrada.nextLine();
		
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.println("Ola, o seu nome e: " + nome + ", e a sua idade e: " + idade);
		
		entrada.close();
		
	}

}
