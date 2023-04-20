package logica.aulas.aula07;

import java.util.Scanner;

public class WhileLaco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ESTRUTURA DE REPETICAO
		
		Scanner entrada = new Scanner(System.in);
		
//		
//		int i = 0;
//		
//		while (i<10) {
//			System.out.println("Ola mundo:");
//			i++;
//		}
		
//		String jogar = "sim";
//		
//		while(jogar.equals("sim")){
//			System.out.println("Repete ou inicia o jogo");
//			
//			System.out.print("Deseja jogar novamente?");
//		     jogar = entrada.nextLine();
		
		// MODIFICADORES DE LAÇO
		
		int i = 0;
		
		while (i <10) {
			i++;
			
			if(i==3 || i == 5) {
				continue; // não executa o que tem para baixo, mas volta para o while
			}
			
			if (i == 7) {
				break;
			}
			
			System.out.println("Cambalhota " + i);
		
		}
		
 System.out.println("Fim do prograama");
	}

}
