package logica.exercicios.aula08;

import java.util.Calendar;

public class Exercicio02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Calendar c = Calendar.getInstance();
		
		int time = c.get(Calendar.DAY_OF_WEEK);
		
		if(time == 3 ) {
			System.out.println("Hoje e dia de comer aquele pastelzinho porque tem FEIRA :)");
		}else {
			System.out.println("Hoje nao e dia de feira :(");
		}
		

}
}