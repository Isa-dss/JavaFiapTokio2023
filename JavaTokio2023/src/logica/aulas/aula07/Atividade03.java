package logica.aulas.aula07;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub; 
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um numero n: ");
		int num = sc.nextInt();
		
		System.out.println(" ");

		
		int i =1;
		
		while (i <= num) {
			System.out.println(i++);
		}

		sc.close();
	}
	
}
