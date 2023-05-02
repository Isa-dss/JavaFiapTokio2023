package logica.exercicios.aula08;

import java.util.Random;

public class Exercicio06 {
	public static void main(String[] args) {
		
		double min = 5;
		double max = 50;
		int primo =0;
		int  par=0;
		int impar =0;
		
		Random random = new Random ();

		
		
		for ( int i =0; i < 10; i++) {
			int number = random.nextInt();
			double num = min + number * (max - min);
			double in = Integer.parseInt(num);
			
			
			System.out.println("O numero sorteado foi: " +num);

			
			for(int j = 5; j <=50; j++) {
			
			if (num%j==0){
				primo++;
				
			}
			}
			 if (num%2==0) {
				 par++;
			
			}else {
				impar++;
			}
			}
			
			
		System.out.println("Sao " + par + " numeros pares");
		System.out.println("Sao " + impar + " numeros impares");
		System.out.println("Sao " + primo + " numeros pares");


			
	}
	}





