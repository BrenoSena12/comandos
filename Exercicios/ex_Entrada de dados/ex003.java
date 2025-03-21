/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/
import java.util.Scanner;
import java.util.Locale;

public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Valor 1: ");
		int a = sc.nextInt();
		System.out.print("Valor 2: ");
		int b = sc.nextInt();
		System.out.print("Valor 3: ");
		int c = sc.nextInt();
		System.out.print("Valor 4: ");
		int d = sc.nextInt();
		
		int diferenca = (a * b) - (c * d);
		
		System.out.printf("A diferença é %d = ", diferenca);
		
		sc.close();
	}