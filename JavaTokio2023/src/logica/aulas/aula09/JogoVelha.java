package logica.aulas.aula09;

public class JogoVelha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][] tabuleiro = new char[3][3];
		
		tabuleiro[0][0] = 'x';
		tabuleiro[1][1] = 'o';
		tabuleiro[2][2] = 'x';
		
		for ( int i = 0; i<tabuleiro.length;i++) {
			System.out.println(" ");
			System.out.println(tabuleiro[i][i]);

		}


	}

}
