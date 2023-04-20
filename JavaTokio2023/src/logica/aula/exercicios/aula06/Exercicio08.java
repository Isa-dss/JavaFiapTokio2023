package logica.aula.exercicios.aula06;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Qual a distancia percorrida? (em KM)");
	    float dist = entrada.nextFloat();
		
		System.out.println("Quantos litros foram gastos para fazer a viagem?");
		float comb = entrada.nextFloat();
		
		float consumo;
		consumo = dist/comb;
		
		System.out.printf("O seu carro tem um consumo medio: %.2f km/litro" , consumo);
		System.out.println(" ");
		
		if(consumo<8.00) {
			System.out.println("Esse carro bebe hein!");
		} else {
			System.out.println("Autonomia legal");
		}
		
		entrada.close();
	}

}
