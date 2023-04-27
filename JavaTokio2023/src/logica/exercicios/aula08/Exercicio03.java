package logica.exercicios.aula08;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um texto sobre o porque do feijao ser por baixo do arroz");
        String txt = sc.nextLine();
        
        int tam = txt.length();
        int ctmaius=0;
        int ctminus=0;
        int space=0;
        
        for(int i=0; i < tam; i++) {
        if((txt.charAt(i) >= 'A') && (txt.charAt(i) <= 'Z')){
        	ctmaius = ctmaius +1;

        }
        
        if((txt.charAt(i) >= 'a') && (txt.charAt(i) <= 'z')){
        	ctminus = ctminus + 1;
        }
        
        if(txt.charAt(i) == ' '){
        	space = space + 1;
        }
        	
        }
        
        System.out.println("O texto tem " + ctmaius + "  maiusculos");
        System.out.println("O texto tem " + ctminus + "  minusculos");
        System.out.println("O texto tem " + space + "  espacos ");

        
        sc.close();
        
	}

}
