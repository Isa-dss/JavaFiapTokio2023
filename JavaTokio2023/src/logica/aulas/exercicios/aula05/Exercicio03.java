package logica.aulas.exercicios.aula05;

import java.util.Scanner;

public class Exercicio03 {
	public static void main (String[] args) {
		
		
		
		
		System.out.println("Ola! Digite seu nome:");
		Scanner entrada = new Scanner (System.in);	
		String nome = entrada.nextLine();
		
		System.out.println("Digite a letra que representa o seu genero, sendo: M (masculino)  F (feminino)  O (outro)  N( não responder):");
		char genero = entrada.next().charAt(0);
		
		System.out.println("Olá" + nome + ",! Você escolheu a seguinte opção de gênero: " + genero);
		
		entrada.close();
		
	}

}
