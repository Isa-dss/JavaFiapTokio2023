package logica.aula.exercicios.aula06;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite o salario do colaborador: ");
		double salario = entrada.nextDouble();
		
		System.out.println("O seu salario atual e:" + salario);
		
		
		double a  = salario*0.2;
		double a1 = salario*0.15;
		double a2 = salario*0.1;
		double a3 = salario*0.05;
		
		if(salario<280) {
			System.out.println("O seu salario recebeu um aumneto de 20%, que equivale a " + a + " , salario final: " + salario*a );
		}else if (salario>=280.00 && salario>700) {
			System.out.println("O seu salario recebeu um aumneto de 15%, que equivale a " + a1 + " , salario final: " + salario*a1 );
		} else if (salario>=700.00 && salario>1500.00) {
			System.out.println("O seu salario recebeu um aumneto de 10%, que equivale a " + a2 + " , salario final: " + salario*a2 );
		} else {
			System.out.println("O seu salario recebeu um aumneto de 5%, que equivale a " + a3 + " , salario final: " + salario*a3 );

		}
		
		entrada.close();


	}
 
}
