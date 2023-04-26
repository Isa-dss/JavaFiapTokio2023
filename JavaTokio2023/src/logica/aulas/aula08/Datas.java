package logica.aulas.aula08;

import java.util.Calendar;
import java.util.Date;

public class Datas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date data = new Date();
		System.out.println("Data agora: " + data);
		
		Calendar c = Calendar.getInstance(); // uma classe
		System.out.println("Data e hora atual: " + c.getTime());
		
		System.out.println("ano: " + c.get(Calendar.YEAR));
		System.out.println("mes: " + c.get(Calendar.MONTH));
		System.out.println("dia do mes: " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("dia da semana: " + c.get(Calendar.DAY_OF_WEEK));

		int hora = c.get(Calendar.HOUR_OF_DAY);
		int minuto = c.get(Calendar.MINUTE);
		
		System.out.println(" ");
		System.out.println("Hora: " + hora);
		System.out.println("Minuto: " + minuto);



	}

}
