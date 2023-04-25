package logica.aula.exercicios.aula06;

import java.util.Scanner;

public class Exercicio11 {

		public static void main(String[] args) {

			Scanner entrada = new Scanner(System.in);

			System.out.print("Digite o codigo do seu estado: ");
			int cod = entrada.nextInt();

			System.out.print("Digite o peso do seu caminhão em toneladas: ");
			double peso = entrada.nextDouble();

			System.out.print("Digite o codigo da carga: ");
			int codcarga = entrada.nextInt();

			double pesokg, preco;
			pesokg = peso * 1000;

			System.out.println("O peso da carga em kilos é:" + pesokg);

			if ((codcarga >= 10) && (codcarga <= 20)) {
				preco = pesokg * 100.00;
				System.out.println("O valor a ser pago por esta carga é R$100,00 por kg:" + preco);

			} else if ((codcarga >= 21) && (codcarga <= 30)) {
				preco = pesokg * 250.00;
				System.out.println("O valor a ser pago por esta carga é R$250,00 por kg::" + preco);
				
			}else {
				preco= pesokg*340.00;
	        	System.out.println("O valor a ser pago por esta carga é R$340,00 por kg::" + preco);
	        	}
			
			double imposto = 0;
			
			if (cod == 1) {
				imposto = preco*0.35;
				System.out.println("O valor do imposto cobrado é 35%, que equivale a :" + imposto);

			} else if (cod == 2){
				imposto = preco*0.25;
				System.out.println("O valor do imposto cobrado é 25%, que equivale a :" + imposto);
			
			} else if (cod == 3){
				imposto = preco*0.15;
				System.out.println("O valor do imposto cobrado é 15%, que equivale a :" + imposto);
				
			} else if (cod == 4){
				imposto = preco*0.05;
				System.out.println("O valor do imposto cobrado é 5%, que equivale a :" + imposto);
				
			}else {
	        	System.out.println("O Imposto é isento");
			}
			
				System.out.print("O valor total paara este caminhao ser transportado é: " + (imposto+preco));

				entrada.close();
		}
	
	}


