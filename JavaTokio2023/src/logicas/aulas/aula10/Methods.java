package logicas.aulas.aula10;

import java.util.Scanner;

public class Methods {

	//METODOS SEM RETORNO E SEM ARGUMENTO
	static void saudacao() {
		System.out.println("Bem vindo ao programa");

		Scanner sc = new Scanner (System.in);
		
		System.out.println("------------------------");

		
		System.out.println("Digite o seu nome: ");
		String name = sc.nextLine();
		
		System.out.println("Digite a sua idade: ");
		int age  = sc.nextInt();
		
		
		System.out.printf("Ola, %s! Voce tem %d anos \n\n" , name,age);
		
		if (age>=18) {
			System.out.println("Maior de idade");
		}else {
			System.out.println("Menos de idade");
		}
		
	}
	
	
	
	public static void main (String[] args) { // metodo main é estatico, sendo assim só aceita metodos estaticos
		saudacao(); // so é possivel fazer pois a funcao foi chamada

		
		
	}
	
	
}
