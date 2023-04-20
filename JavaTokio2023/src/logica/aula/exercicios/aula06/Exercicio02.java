package logica.aula.exercicios.aula06;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um numero:");
		double num = entrada.nextDouble();
		
		System.out.println("Digite um outro numero:");
		double num2 = entrada.nextDouble();
		
		if(num>num2) {
			System.out.println("O numero " + num + " e maior que" + num2);
		}else {
			System.out.println("O numero " + num2 + " e maior que " + num);
			
		}

		entrada.close();
	}

}
