package logica.aulas.aula05;

import java.util.Scanner;

public class Manipulacao {
	public static void main(String[] args) {

		double salario = 1300.50;
		String salarioStr = Double.toString(salario);
		System.out.println(salarioStr);

		System.out.println("------------");

		String idade = "25";
		
		int idadeInt = Integer.parseInt(idade);
		System.out.println(idadeInt);

		System.out.println("--------");

		Scanner entrada = new Scanner(System.in);

		String preco = entrada.nextLine();
		//float precofloat = Float.parseFloat(preco); // se usasse o typecast aqui (float) Float.parseFloat(true) não
													// daria erro, mesmo que true que esteja como boolan
		System.out.println(preco);

		entrada.close();
	}
}
