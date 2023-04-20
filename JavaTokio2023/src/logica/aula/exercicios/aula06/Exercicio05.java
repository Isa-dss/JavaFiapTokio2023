package logica.aula.exercicios.aula06;

import java.util.Scanner;

public class Exercicio05 {
	public static void main (String[] args) {
		
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um valor:");
		Double a =Double.parseDouble(entrada.nextLine());
		
		System.out.println("Digite um segundo valor:");
		Double b = Double.parseDouble(entrada.nextLine());
		
		System.out.println("Digite o caracter para a operacao desejada, sendo [+] para soma, [-] para subtracao, [*] para multiplicacao e [/] para divisao:");
		char operacao= entrada.nextLine().charAt(0);
		
		@SuppressWarnings("unused")
		double resultado;
		
		
		switch(operacao){
		
		case '+':
			System.out.println("Essa operacao e uma soma, e o seu resultado e " + (resultado = a+b));
			break;
			
		case '-':
			System.out.println("Essa operacao e uma subtracao, e o seu resultado e " + (resultado = a-b));
			break;
			
		case '*':
			System.out.println("Essa operacao e uma multipliacacao, e o seu resultado e " + (resultado = a*b));
			break;
		
		case '/':
			System.out.println("Essa operacao e uma divisao, e o seu resultado e " + (resultado = a/b));
			break;
			
		default:
			System.out.println("Não foi possivel fazer essa operacao, por favor tente novamente!");
		
		}
		
		
		
entrada.close();
		
	}

}
