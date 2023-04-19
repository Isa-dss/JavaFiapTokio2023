package logica.aulas.exercicios.aula05;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ola! Digite sua nota 1:");
		Scanner entrada = new Scanner (System.in);	
		Double nota1 = entrada.nextDouble();
		
		System.out.println("Digite a nota 2:");
		Double nota2 = entrada.nextDouble();
		
		Double media;
		
		media = (nota1 + nota2)/2;
		
		System.out.println("A sua média simples é:" + media);

		entrada.close();


}
}
