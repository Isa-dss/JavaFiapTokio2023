package logica.aulas.aula07;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		double nota1, nota2;
		
		do {
			System.out.println("Digite a primeira nota: ");
			nota1 = sc.nextDouble();
			
			if(nota1<0 || nota1>10) {
				System.out.println("Nota invalida");
			}
			
		}while(nota1<0 || nota1>10);
		
		do {
			System.out.println("Digite a segunda nota: ");
			nota2 = sc.nextDouble();
			
			if(nota2<0 || nota2>10) {
				System.out.println("Nota invalida");
			}
			
		}while(nota2<0 || nota2>10);
		
		double media;
		
		media = (nota1 + nota2)/2;
		System.out.printf("Media: %.2f" , media);
		
		sc.close();
		
		}
	}


