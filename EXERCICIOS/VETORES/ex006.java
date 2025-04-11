/*
Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado. 
*/

package entities;

public class Numeros {

	private int numero;

	// CONTRUTOR
	public Numeros(int numeroEntrada) {
		numero = numeroEntrada;
	}

	// ENCAPSULAMENTO
	public int getNumero() {
		return numero;
	}

}
/****************************************************************************** */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Numeros;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos valores vai em cada vetor: ");
		int numeroEntrada = sc.nextInt();

		Numeros[] a, b, c;
		a = new Numeros[numeroEntrada];
		b = new Numeros[numeroEntrada];
		c = new Numeros[numeroEntrada];

		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < a.length; i++) {
			System.out.print("Valor: ");
			int valor = sc.nextInt();
			a[i] = new Numeros(valor);
		}

		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i < a.length; i++) {
			System.out.print("Valor: ");
			int valor = sc.nextInt();
			b[i] = new Numeros(valor);
		}

		System.out.println("VETOR RESULTANTE:");
		for (int i = 0; i < c.length; i++) {
			System.out.print("Resultado: ");
			int soma = a[i].getNumero() + b[i].getNumero();
			c[i] = new Numeros(soma);
			System.out.println(c[i].getNumero());
		}

		sc.close();
	}
}
