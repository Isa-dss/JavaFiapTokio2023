
package logica.aulas.exercicios.aula05;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String []args) {
		
        System.out.println(" Digite um numero inteiro:");
		Scanner entrada = new Scanner (System.in);	
		System.out.println();
		
        int num = entrada.nextInt();
        
        int unidade = num%10;
        num = (num - unidade)/10;
        
        int dezena = num%10;
        num = (num - dezena)/10;
        
        int centena;
        centena=num;
       
        
        System.out.println("O numero digitado possui: centena=" +centena*100 + ", dezenas = "+ dezena*10+ " e unidades = " + unidade );
        
        entrada.close();
	}

}
