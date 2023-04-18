package logica.aulas.aula05;

public class OperadoresLogicos {
	public static void main (String[] args) {
		
		boolean verificarSenha= true;
		boolean verificarEmail= false;
		
		boolean logicaE = verificarSenha && verificarEmail;
		System.out.println(logicaE);
		
		boolean logicaOu = true || false;
		System.out.println(logicaOu);
		
		boolean negacao = !true;
		System.out.println(negacao);
		
		// OPERADORES DE STRING
		String nome1 = "joana";
		String nome2 = "joanaa";
		String nome3 = new String ("joana");
		
		System.out.println(nome1 == nome2);
		System.out.println(nome1.equals(nome3)); // tem q usar equals, pois nome3 é um obj

		
	}

}
