package logica.aulas.exercicios.aula05;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" Digite o valor do produto:");
		Scanner entrada = new Scanner (System.in);	
		Double produto = entrada.nextDouble();
		
		System.out.println(" Digite o valor pago");
		Double valor = entrada.nextDouble();
		
		Double troco;
	    troco= valor-produto;
		
		
		System.out.println("O valor do troco e: " + troco);
		
		entrada.close();

	}

}
