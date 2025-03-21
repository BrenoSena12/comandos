/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.*/

import java.util.Scanner;
import java.util.Locale;

public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Raio do circulo: ");
		double raioCirculo = sc.nextDouble();
		
		double area = Math.PI * (Math.pow(raioCirculo,2));
		
		System.out.printf("A área do circulo é de %.4f", area);
		
		sc.close();
	}