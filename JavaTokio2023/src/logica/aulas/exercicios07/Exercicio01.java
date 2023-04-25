package logica.aulas.exercicios07;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner (System.in);
	

		
		String i = "sim";
	
		while(i.equals("sim")){
			System.out.println("Ola mundo");
			
			System.out.print("Deseja jogar novamente?");
		     i = sc.nextLine();
		
	}
		System.out.println("Fim");
		
		sc.close();

	}
}
