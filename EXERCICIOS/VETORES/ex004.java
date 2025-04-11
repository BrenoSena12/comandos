/*
Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares. 
*/
package entities;

public class Numeros {

	private int numeros;
	
	//CONSTRUTOR
	public Numeros(int numeroDigitados) {
		numeros = numeroDigitados;
	}
	
	//Encapsulamento
	public int getNumeros() {
		return numeros;
	}
	
	public void setNumeros(int numerosEntrada) {
		numeros = numerosEntrada;
	}
}
/***************************************************************************** */
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Numeros;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantidade de números: ");
		int valorEntrada = sc.nextInt();

		Numeros[] vetor = new Numeros[valorEntrada];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			int numerosDigitados = sc.nextInt();
			vetor[i] = new Numeros(numerosDigitados);
		}

		System.out.println();
		System.out.println("NUMEROS PARES");

		int soma = 0;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].getNumeros() % 2 == 0) {
				System.out.print(vetor[i].getNumeros() + "  ");

				soma++;
			}
		}

		System.out.println();
		System.out.println("\nQUANTIDADE DE PARES: " + soma);

		sc.close();
	}
}

