package application;

import java.util.Locale;
import java.util.Scanner;

public class EmpresaProgram {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTRE COM O NUMERO DE LINHAS E COLUNAS: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		System.out.println("DIGITE OS VALORES: ");
		for(int linha = 0; linha < n; linha++) {
			for(int coluna = 0; coluna < mat[linha].length; coluna++) {
				mat[linha][coluna] = sc.nextInt();
			}
		}
		
		System.out.println("DIAGONAL PRINCIPAL");
		for(int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		System.out.println("NUMERO NEGATIVOS: ");
		
		for(int linha = 0; linha < mat.length; linha ++) {
			for(int coluna = 0; coluna < mat[linha].length; coluna++) {
				if(mat[linha][coluna] < 0) {
					System.out.print(mat[linha][coluna] + " ");
				}
			}
		}
		
		
		sc.close();

	}
}
