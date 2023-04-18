package logica.exercicios.aula04;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o valor do salario que você recebe:");
		double salario = entrada.nextDouble();

		System.out.print("O seu salario e:" + salario);

		entrada.close();

	}

}
