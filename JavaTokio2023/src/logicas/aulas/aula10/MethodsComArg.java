package logicas.aulas.aula10;

import java.util.Scanner;

public class MethodsComArg {
	
//	METODOS COM ARGUMENTOS E SEM RETORNO
	
	static void saudacaoComArgs(String name, int age) { // funcoes tem que ser simples e fazer apenas uma coisa muito bem
		
		if(age>=18) {
			System.out.printf("Ola, %s! Voce tem %d , e e maior de idade :) \n" , name, age);
		}else {
			System.out.printf("Ola, %s! Voce tem %d , e menor de idade :) \n" , name, age);
		}
		
//		System.out.print(name); // parametros
//		System.out.println(age); //parametros
		
	}
	
	static void soma(int numA, int numB) {
		System.out.println("Soma: " + (numA+numB) );
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o seu nome: ");
		String nameTyped = sc.nextLine();
		
		System.out.println("Digite a sua idade: ");
		int ageTyped  = sc.nextInt();
		
		
		
		saudacaoComArgs(nameTyped , ageTyped); // variaveis
		
		soma(10,2);

		sc.close();

	}

}
