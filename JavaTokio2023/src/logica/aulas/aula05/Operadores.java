package logica.aulas.aula05;

public class Operadores {
	public static void main (String[] args) {
		
		float num1= 5f;
		float num2 = 2f;
		
		float soma= num1+ num2;
		System.out.println(soma);
		
	
		float sub= num1- num2;
		System.out.println(sub);
		
		float multi= num1*num2;
		System.out.println(multi);
		
		float div = num1-num2;
		System.out.println(div);
		
		float resto= num1%num2;
		System.out.println(resto);
		
		
		// OPERADORES UNARIOS
		
		int numero = 15;
		System.out.println("\n" + numero);
		
		numero++;
		System.out.println("\n" + numero);
		//System.out.println(numero++); --> vai ate somar c 1, mas ta exibindo antes de somar. Logo, ficou guardado valor somado, mas é exibido antes

		
		numero--;
		System.out.println("\n" + numero);
		
		// System.out.println(numero+1)
		// o numero sera sem a soma, pois ali so ficou no print, e não foi salvo na variavel. 
		
		
		// OPERADORES DE ATRIBUIÇÃO
		
		int number = 5;
		
		number += 8;
		System.out.println(number);
		
		number /= 2;
		System.out.println(number);
		
		
	
		
		
		
		


		
		
	
	}

}
