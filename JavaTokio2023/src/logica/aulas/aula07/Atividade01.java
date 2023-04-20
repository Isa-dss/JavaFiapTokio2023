package logica.aulas.aula07;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int num, soma =0;
		
		System.out.println("Digite um numero");
		num = entrada.nextInt();
		soma += num; // soma = soma+num
		
		System.out.print("Digite um numero: ");
		num= entrada.nextInt();
		soma +=num;
		
		System.out.print("Digite um numero: ");
		num= entrada.nextInt();
		soma +=num;
		
		
		System.out.println("A soma e: " + soma);
		
		entrada.close();
		
	
	}

}
