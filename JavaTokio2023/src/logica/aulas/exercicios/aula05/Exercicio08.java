package logica.aulas.exercicios.aula05;

import java.util.Scanner;

public class Exercicio08 {
	public static void main (String[] args) {
		
		System.out.println(" Digite o valor em reais:");
		Scanner entrada = new Scanner (System.in);	
		Double real = entrada.nextDouble();
		
		Double dolar = 5.8;
	    Double euro = 5.56;
		Double peso = 0.023;
		Double libra = 6.31;
		Double iene = 0.038;
		
		System.out.println("Esse valor em reais corresponde a:");
		System.out.println(real*dolar +" dolares americanos");
		System.out.println(real*euro +" euros");
		System.out.println(real*peso +" pesos");
		System.out.println(real*libra +" libras");
		System.out.println(real*iene +" ienes");

		
entrada.close();
				
	
	
		
	}

}
