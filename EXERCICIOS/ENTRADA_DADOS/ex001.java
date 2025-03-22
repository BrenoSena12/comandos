/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.*/

import java.util.Scanner;

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Valor 1: ");
		int valor1 = sc.nextInt();
		System.out.print("Valor 2: ");
		int valor2 = sc.nextInt();
		
		int soma = valor1 + valor2;
		
		System.out.printf("A soma entre %d + %d = %d", valor1, valor2, soma);
		
		sc.close();
	}