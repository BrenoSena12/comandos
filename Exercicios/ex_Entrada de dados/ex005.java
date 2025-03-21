/** Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/

import java.util.Scanner;
import java.util.Locale;

public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//PEÇA 1
		System.out.print("Codigo peça 1: ");
		int codigoPeca1 = sc.nextInt();
		System.out.print("Numero de peças 1: ");
		int quantidadePeca1 = sc.nextInt();
		System.out.print("Valor unitário da peça 1: ");
		double valorUnitarioPeca1 = sc.nextDouble();
		
		//PEÇA 2
		System.out.print("Codigo peça 2: ");
		int codigoPeca2 = sc.nextInt();
		System.out.print("Numero de peças 2: ");
		int quantidadePeca2 = sc.nextInt();
		System.out.print("Valor unitário da peça 2: ");
		double valorUnitarioPeca2 = sc.nextDouble();
		
		double valorTotal = (quantidadePeca1 * valorUnitarioPeca1) + (quantidadePeca2 * valorUnitarioPeca2);
		
		System.out.printf("VALOR A PAGAR : R$ %.2f", valorTotal);

		sc.close();
	}