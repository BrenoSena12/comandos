/*
Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 
*/

package application;

import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		// VALOR QUE VAI SER LIDO NO VETOR
		System.out.print("Quantos numeros irá digitar? ");
		int entrada = sc.nextInt();

		// VERIFICAR SE O VETOR É MENOR QUE 10
		if (entrada <= 10) {
			int[] vetor = new int[entrada]; // DECLARANDO O VETOR

			// PASSANDO OS DADOS PARA DENTRO DO VETOR
			for (int i = 0; i < vetor.length; i++) {
				System.out.print("Digite um numero: ");
				vetor[i] = sc.nextInt();
			}
			System.out.println("NÚMEROS NEGATIVOS:");

			// VERIFICANDO SE OS VETORES SÃO NEGATIVOS
			for (int i = 0; i < vetor.length; i++) {
				if (vetor[i] < 0) {
					System.out.println(vetor[i]);
				}
			}
		}

		sc.close();
	}
}
