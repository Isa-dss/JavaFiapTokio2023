package logica.aula.exercicios.aula06;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner entrada = new Scanner (System.in);
	 	
		System.out.println("O seu movel e residencia[r], comercio[c] ou industria [i]?");
	    char tipo = entrada.nextLine().charAt(0);
	    
		
		System.out.println("Qual o consumo de KW/h?");
	    double consumo = entrada.nextDouble();
	    
	    double valor;
	    
	    if(tipo=='r') {
	    	valor = consumo*0.60;
	    	System.out.println("O valor da sua conta de luz sera: R$" + valor);
	    } else if(tipo=='c') {
	    	valor = consumo*0.48;
	    	System.out.println("O valor da sua conta de luz sera: R$" + valor);
	    } else {
	    	valor= consumo*1.29;
	    	System.out.println("O valor da sua conta de luz sera: R$" + valor );
	    }
	
	    entrada.close();
	}

}
