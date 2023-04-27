package logica.aulas.exercicios.aula05;

import java.util.Scanner;

public class Exercicio08 {
	public static void main (String[] args) {
		
		System.out.println(" Digite o valor em reais:");
		Scanner entrada = new Scanner (System.in);	
		Double real = entrada.nextDouble();
		
		Double dolar= real*0.2;
	    Double euro = real*0.18;
		Double peso = real*44.65;
		Double libra= real*0.16;
		Double iene = real*26.95;
		
		System.out.println("Esse valor em reais corresponde a:");
		System.out.println(dolar +" dolares americanos");
		System.out.println(euro +" euros");
		System.out.println(peso +" pesos");
		System.out.println(libra+ " libras");
		System.out.println(iene +" ienes");

		
entrada.close();
				
	
	
		
	}

}
