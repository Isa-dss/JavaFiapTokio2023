package logica.aula.exercicios.aula06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite o seu ano de nascimento:");
		int nasc = entrada.nextInt();
		
		System.out.println("Digite o ano atual:");
		int atual = entrada.nextInt();
		
		int idade;
		idade=(atual-nasc);
		
		
		if(idade>=18 && idade<70) {
			System.out.println("O seu voto este ano e obrigatorio");
		}else if (idade>=16 && idade<18 || idade >70) {
			System.out.println("O seu voto este ano e opcional");
		}else {
			System.out.println("O seu voto este ano e proibido");
		}

		entrada.close();
	}

}
