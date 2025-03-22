/**Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente. */

import java.util.Scanner;

public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Valor a: ");
		int a = sc.nextInt();
		System.out.print("Valor b: ");
		int b = sc.nextInt();
		
		if(a >= b) {
			if(a % b == 0) {
				System.out.println("São multiplos");
			}else {
				System.out.println("não são multiplos");
			}
		}else {
			if(b % a == 0) {
				System.out.println("São multiplos");
			}else {
				System.out.println("não são multiplos");
			}
		}
		
		sc.close();
	}