package logica.exercicios.aula08;

import java.util.Calendar;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Calendar c = Calendar.getInstance();
		
		int time = c.get(Calendar.HOUR_OF_DAY);
		
		if(time < 12 ) {
			System.out.println("Bom dia, Fulano");
		}else if(time<18) {
			System.out.println("Boa tarde, Fulano");
		}else {
			System.out.println("Boa noite, Fulano");
			
		}
		System.out.println("A data de hoje e a hora atual e: " + c.getTime());

	}

}
