package logica.aulas.aula09;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matriz = new int[4][5];
		
		int qntdLinhas = matriz.length;
		int qntdColunas = matriz[3].length;
		
		System.out.println("Linhas: " + qntdLinhas);
		System.out.println("Colunas: " + qntdColunas);



		for(int i = 0; i < qntdLinhas; i++) {
		for (int j=0;j<qntdColunas;j++) {
			matriz[i][j]= 5;

		}
		}
		
		for(int i = 0; i < qntdLinhas; i++) {
		for (int j=0;j<qntdColunas;j++) {
			matriz[i][j]= 5;
			System.out.print(matriz[i][j] + "  ");
		}
			System.out.println(" ");

	}

}
}

