package logica.exercicios.aula08;

import java.util.Random;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double min = 5;
		double max = 50;
		double soma=0;
		
		for ( int i =0; i < 10; i++) {
			double num = min + Math.random() * (max - min);
			
			System.out.println("O numero sorteado foi: " +num);
			
			soma +=num;			
		}
		
		System.out.println("A soma destes valores e: "+soma);

		

	}

}
