package logica.aulas.exercicios07;

import java.util.Scanner;

public class Exercicio06 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um numero");
		int num = sc.nextInt();
		
		for ( int i =2; i<num; i++) {
			if(i%2==0) {
				System.out.println("Este valor e par: " + i);
			}
		}
		
		sc.close();


}
}
