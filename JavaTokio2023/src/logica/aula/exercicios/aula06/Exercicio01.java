package logica.aula.exercicios.aula06;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um numero:");
		double num = entrada.nextDouble();
		
		if(num%2==0) {
			System.out.println("Este e um numero par");
		}else {
			System.out.println("Este e um numero impar");
			
		}
		
		entrada.close();

	}

}
