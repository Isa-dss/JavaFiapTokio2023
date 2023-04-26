package logica.aulas.exercicios07;

public class Desafio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=0;
		
	
	
	for(int j = 2; j<=2000;j++) {
		for(int i=1; i<=j; i++) {
			
			
      if (j%i==0){
    	  x++;
		}
		}

      if (x==2) {
    		System.out.println(j);
      }
      x=0; // O x é zerado pq ele nao é uma variavel dos for´s, desta forma quando for o proximo primo preciso que esteja zerado
	}
	
}
	
	}


