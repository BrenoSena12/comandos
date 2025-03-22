/**Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar. */

import java.util.Scanner;

public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Numero: ");
		int numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			System.out.print("Par");
		}else {
			System.out.println("Impar");
		}

		sc.close();
    }