/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero). 
*/

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantidade de números:");
		int quantidadeNumeros = sc.nextInt();
		
		int[] vetor = new int[quantidadeNumeros];
		
		for(int i=0; i<vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		
		int maior = vetor[0];
		int posicao = 0;
		
		for(int i=1; i<vetor.length; i++) {
			if(vetor[i] > maior) {
				maior = vetor[i];
				posicao = i;
			}
		}
		System.out.println("MAIOR VALOR = " + maior);
		System.out.println();
		System.out.println("POSIÇÃO DO MAIOR VALOR: " + posicao);
		
		
		sc.close();
	}
}
