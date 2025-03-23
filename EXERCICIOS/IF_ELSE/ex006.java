/** Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.*/

import java.util.Locale;
import java.util.Scanner;

public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite um valor entre 0 e 100: ");
		double numero = sc.nextDouble();

		if (numero < 0 || numero > 100) {
			System.out.printf("Numero %.2f fora do intervalo", numero);
		} else if (numero <= 25) {
			System.out.print("Intervalo (0,25)");
		} else if (numero <= 50) {
			System.out.print("Intervalo (25,50)");
		} else if (numero <= 75) {
			System.out.print("Intervalo (50,75)");
		} else {
			System.out.print("Intervalo (75,100)");
		}

		sc.close();
	}