package logica.aulas.aula06;

import java.util.Scanner;

public class IntroducaoCondicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ------------------------------
         //ESTRUTURA CONDICIONAL SIMPLES
		// ------------------------------

		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite a sua nota");
		int nota = entrada.nextInt();
		
		/*
		if (nota <6) {
			System.out.println("Sua nota e:" + nota);
		}
		*/
		
		// ------------------------------
		// ESTRUTURA CONDICIONAL COMPOSTA
		// ------------------------------

		
		/*
		if (nota <6) {
			System.out.println("Voce foi reprovado , e a sua nota e:" + nota);
		}else {
			System.out.println("Voce foi aprovado , e a sua nota e:" + nota);
			
		}
		*/ 
		

		// ------------------------------
		// ESTRUTURA CONDICIONAL COMPOSTA
		// ------------------------------

		if (nota <4) {
			System.out.println("Voce foi reprovado , e a sua nota e:" + nota);
		}else if (nota < 6) {
			System.out.println("Voce esta de recuperacao , e a sua nota e:" + nota);
		} else {
			System.out.println("Voce foi aprovado , e a sua nota e:" + nota);
			
		}
		
       }
	}

