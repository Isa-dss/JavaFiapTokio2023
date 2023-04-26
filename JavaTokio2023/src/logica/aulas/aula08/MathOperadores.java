package logica.aulas.aula08;

public class MathOperadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x = -20;
		double i = Math.PI;
		double num = 3.05;
		
		System.out.println(Math.round(i));
		
		System.out.println(Math.sqrt(225));
		
		System.out.println(Math.abs(x));
		
		System.out.println(Math.ceil(num));
		
		System.out.println("   ");
		
	//	----------------------------------------
	//             	RANDOM
	//	----------------------------------------
		
		double random = Math.random();
		System.out.println(random);
		
		double min = 5;
		double max = 10;
		double preparandoIntervalo = random*(max - min);
		
		double intervalo =  Math.random();
		System.out.println(min + (random * (max - min)));
		
//		double multi = random*100;
//		System.out.println(Math.ceil(multi));
		
		

		
		
		
		

	}

}
