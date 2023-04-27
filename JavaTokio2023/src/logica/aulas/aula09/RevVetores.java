package logica.aulas.aula09;

public class RevVetores {
	public static void main(String[] args) {
		
		int [] numeros = {10,20,5,3};
				
		for (int i =0; i<numeros.length;i++) { // manipula  a forma como percorrer o vetor
			System.out.printf("Index: %d -- Valor: %d\n" , i, numeros[i]);
		}
		
		// FOR QUE LE TODO O ARRAY
		
		for(int num:numeros) { // usado para percorre todo o array sem o lenght 
			System.out.println(num);
		}
	}

}
