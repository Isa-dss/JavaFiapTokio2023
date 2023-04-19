package logica.aulas.aula06;

public class RevisaoOperadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 5;
		int valor = 5+ numero++; // vai dar 10, pois vai somar com o númeor antes de fazer o incremento, se quiser fazer a soma com o número de incremento
		// int valor = 5+ numero++; --> vai dar 11, pois soma 5 + (5+1)
		System.out.println(valor);
		System.out.println(numero);

	}

}
