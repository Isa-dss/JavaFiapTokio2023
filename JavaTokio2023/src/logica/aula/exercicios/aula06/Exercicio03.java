package logica.aula.exercicios.aula06;

import java.util.Scanner;

public class Exercicio03 {
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite a nota 1:");
		double nota = entrada.nextDouble();
		
		System.out.println("Digite a nota 2:");
		double nota1 = entrada.nextDouble();
		
	
		System.out.println("Digite a nota 3:");
		double nota2 = entrada.nextDouble();
		
		System.out.println("Digite a nota 4:");
		double nota3 = entrada.nextDouble();
		
		Double media;
		media=(nota+nota1+nota2+nota3)/4;
		
		if(media>=7.0) {
			System.out.println("Parabens, voce foi aprovado");
		}else if(media>=5.0 && media<7.0) {
			System.out.println("Voce esta de recuperacao");
		}else {
			System.out.println("Voce foi reprovado");
		}
		
		entrada.close();
	
	}
}
