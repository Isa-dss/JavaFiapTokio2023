package logica.aula.exercicios.aula06;

import java.util.Scanner;

public class Exercico12 {

		public static void main (String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
		   float x;

			System.out.print("Digite o primeiro valor: ");
			float a = entrada.nextFloat();

			System.out.print("Digite o segundo valor: ");
			float b = entrada.nextFloat();

			System.out.print("Digite o terceiro valor: ");
			float c  = entrada.nextFloat();
			
			if (a<b) {
				x = a;
				a=b;
				b=x;
			}if(a<c) {
				x = a;
				a=c;
				c=x;
			}if (a<b) {
			   x = a;
			   a=b;
			   b=x;

			}
			if (a>=(b+c)){
				System.out.println("Não forma triangulo");
			}else {
				if (a*a == (b*b) + (c*c))
				System.out.println("Triangulo retangulo");
				
				}if (a*a > (b*b) + (c*c)) {
				    System.out.println("Triangulo obtusangulo");
				}if (a*a < (b*b) + (c*c)){
			    	System.out.println("Triangulo acuntangulo");
				}if (a == b && a== c){
				     System.out.println("Triangulo equilatero");
		    	}if ((a == b && a != c)|| (a == c && a!= b) || (b == c && b!= a)){
		    	    System.out.println("Triangulo isoceles");
		    	}
		    	
		    	entrada.close();

				}
			
		}


