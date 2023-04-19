package logica.aulas.exercicios.aula05;

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main (String[] args) {
		
		System.out.print(" Digite o nome da peca 1:");
		Scanner entrada = new Scanner (System.in);	
		String peca1 = entrada.nextLine();
		
		System.out.print(" Digite a quantidade que deseja da peca 1:");
		int npeca1 = Integer.parseInt(entrada.nextLine());
		
		System.out.print(" Digite o valor unitario da peca 1:");
		Double qntpeca1 = Double.parseDouble(entrada.nextLine());
		
		System.out.println(" A peca 1 e:" + peca1 + ", sao " + npeca1 + " pecas, e o valor unitario e: " + qntpeca1);
		
		System.out.println(" ");
		
		System.out.print(" Digite o nome da peca 2:");
		String peca2 = entrada.nextLine();
		
		System.out.print(" Digite a quantidade que deseja da peça 1:");
		int npeca2 = Integer.parseInt(entrada.nextLine());
		
		System.out.print(" Digite o valor unitario da peca 2:");
		Double qntpeca2 = Double.parseDouble(entrada.nextLine());
		
		System.out.println(" A peca 2 e: " + peca2 + ", sao " + npeca2 + " pecas, e o valor unitario e: " + qntpeca2);
		System.out.println(" ");

		
		Double total;
		total = (npeca1*qntpeca1) + (npeca2*qntpeca2);
		
		System.out.println(" O valor total desta compra sera:" + total);
		

		entrada.close();
		
		
	
	}

}
