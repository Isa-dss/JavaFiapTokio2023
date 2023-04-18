package logica.aulas.aula05;

import java.util.Scanner;


public class Tipos {
	public static void main(String[] args) {
		
		float preco = 10.99f;
		float preco2= (float) 12.90;
		
	System.out.println("Float 1" + preco);
	System.out.println("Float 2:" + preco2);
	
	int precoInteiro = (int) 2.50; // (tipo) -- typecast permite a digitação de numeros double em int, mas ele só pega a inteira
	System.out.println("Valor inteiro:" + precoInteiro);
	
	int numeroX = 6; // é possivel passar uma variavel int para double
	double numeroXDouble = numeroX;
	System.out.println(" ");
	System.out.println(numeroX);
	System.out.println(numeroXDouble);
	
	Scanner entrada = new Scanner (System.in);
	System.out.println("Digite um numero");
	int numero = (int) entrada.nextDouble();
	System.out.println(numero);

	



	}

}
