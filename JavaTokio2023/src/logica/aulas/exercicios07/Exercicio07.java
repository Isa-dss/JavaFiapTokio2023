package logica.aulas.exercicios07;

import java.util.Scanner;

public class Exercicio07 {
	public static void main (String[] args) {
		int x =0;
		int y =0;
		int z = 0;
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite a media da turma: ");
		int media= sc.nextInt();
		
		for ( int i =0; i<20; i++) {
				System.out.print("Digite a nota do aluno: " + (i+1) + " : ");
				double nota = sc.nextDouble();
				
				if (nota > media) {
						x++;
					}else if (nota < media){
						y++;
					}else {
			      	  z++;
			   	}
		}
		
		System.out.println(x + " alunos tiveram nota maior que a media");
		System.out.println(y + " alunos tiveram nota menor que a media");
		System.out.println(z + " alunos tiveram exatamente o valor da media");

		 sc.close();
			
}
}
			
		
		


