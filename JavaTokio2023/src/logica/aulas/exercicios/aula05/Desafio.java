package logica.aulas.exercicios.aula05;

import java.util.Scanner;

public class Desafio {
	public static void main (String[] args) {
		
		  System.out.println(" Digite a sua idade em dias:");
			Scanner entrada = new Scanner (System.in);	
			System.out.println();
	        int idade = entrada.nextInt();
	        
	        int anos;
	        int meses;
	        int dias;
	        
	        anos=idade/365;
	        meses = (idade%365)/30;
	        dias = (idade%365)%30; 
	        
	        System.out.println("A sua idade em anos e: " + anos + " anos, " + meses+ " meses e " + dias + " dias");

	      entrada.close();
		
	}

}
