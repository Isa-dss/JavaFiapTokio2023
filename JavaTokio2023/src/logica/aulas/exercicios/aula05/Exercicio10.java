package logica.aulas.exercicios.aula05;

import java.util.Scanner;

public class Exercicio10 {
	public static void main (String [] args) {
		
		    System.out.println(" Digite a sua idade em anos:");
			Scanner entrada = new Scanner (System.in);	
			System.out.println();
	        int anos = entrada.nextInt();
	        
	        System.out.println(" Digite quantos meses faz que voce fez anivesário:");	
			System.out.println();
	        int meses = entrada.nextInt();
	        
	        System.out.println(" Digite sua idade em dias:");
			System.out.println();
	        int dias = entrada.nextInt();
	        
	        int vida;
	        
	        vida = anos*365 + meses*30 +dias;
	        
	        System.out.println("Voce ja viveu :" + vida + " dias!" );
	     
	        entrada.close();
	}

}
