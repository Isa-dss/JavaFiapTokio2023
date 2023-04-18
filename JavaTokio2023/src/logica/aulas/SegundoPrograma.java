package logica.aulas;

import java.util.Scanner;

public class SegundoPrograma {
	
	public static void main(String[] args) {
		
	
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite seu nome:");
		String nome = entrada.nextLine();
		
		System.out.println("Digite a sua idade:");
		System.out.println("Sua idade e:" + entrada.nextLine());
		
		System.out.println("Bem vindo, " + nome + " :)");
		
		entrada.close(); // é importante que sempre feche o scanner, principalmente em sistemas que fazem conexão com bdd
		
		


 }
}