/*
Fazer um programa para ler dois números inteiros Me N, e depois ler uma matriz de M linhas por N colunas contendo números inteiros, podendo haver repetições. Em seguida, ler um número inteiro X que pertence à matriz. Para cada ocorrência de X, mostrar os valores à esquerda, acima, à direita e abaixo de X, quando houver, conforme exemplo.
*/

package application;

import java.util.Locale;
import java.util.Scanner;

public class EmpresaProgram {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("NUMERO DE LINHAS: ");
		int quantidadeLinhas = sc.nextInt();
		System.out.print("NUMERO DE COLUNAS: ");
		int quantidadeColunas = sc.nextInt();

		int[][] matriz = new int[quantidadeLinhas][quantidadeColunas];

		System.out.println("ENTRE COM OS VALORES DA MATRIZ: ");
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				matriz[linha][coluna] = sc.nextInt();
			}
		}

		System.out.print("ENTRE COM ALGUM VALOR PERTECENTE A MATRIZ: ");
		int valorMatriz = sc.nextInt();

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				if (matriz[linha][coluna] == valorMatriz) {
					System.out.println("POSIÇÃO : " + linha + ", " + coluna);

					if (coluna > 0) {
						System.out.println("ESQUERDA: " + matriz[linha][coluna - 1]);
					}

					if (coluna < matriz[linha].length - 1) {
						System.out.println("DIREITA : " + matriz[linha][coluna + 1]);
					}

					if (linha > 0) {
						System.out.println("ACIMA   : " + matriz[linha - 1][coluna]);
					}

					if (linha < matriz.length - 1) {
						System.out.println("ABAIXO  : " + matriz[linha + 1][coluna]);
					}

					System.out.println();
				}
			}
		}

		sc.close();
	}
}

