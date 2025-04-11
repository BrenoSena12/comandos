/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
*/
package application;

import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int entrada = sc.nextInt();

		double[] numeros = new double[entrada];

		double soma = 0.0;

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite o número: ");
			numeros[i] = sc.nextDouble();
			soma += numeros[i];
		}

		System.out.println();

		System.out.print("VALORES = ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + "  ");
		}

		System.out.println("\nSOMA: " + soma);

		double media = soma / numeros.length;
		System.out.println("Média: " + media);

		sc.close();
	}
}
