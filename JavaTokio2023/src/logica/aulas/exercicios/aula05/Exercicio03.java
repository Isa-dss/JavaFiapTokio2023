package logica.aulas.exercicios.aula05;

import java.util.Scanner;

public class Exercicio03 {
	public static void main (String[] args) {
		
		System.out.print("Ola! Digite seu nome:");
		Scanner entrada = new Scanner (System.in);	
		String nome = entrada.nextLine();
		
		System.out.println("Digite a letra que representa o seu genero");
		System.out.println(" M (masculino) ");
		System.out.println(" F (feminino) ");
		System.out.println(" O (outro) ");
		System.out.println("N( nao responder)");

//		String a = "m".toUpperCase();
//		String b = "f".toUpperCase();
//		String c = "o".toUpperCase();  VEJAAAAAAAA AQUI DEPOIS TA?
//		String d = "n".toUpperCase();

		char genero = entrada.next().charAt(0);
		
		System.out.println("Ola" + nome + ",! voce escolheu a seguinte opcaoo de gennero: " + genero);
		
		entrada.close();
		
	}

}
