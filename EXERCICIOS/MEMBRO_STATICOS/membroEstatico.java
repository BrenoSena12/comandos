package util;

public class CurrencyCoverter {
	
	public static final double IOF = 0.06;

	public static double conversao(double valorDolar, double totalDolar) {
		return (valorDolar * totalDolar) * IOF + (valorDolar * totalDolar);
	}
}

//-------------------------------------------------------------------------------
package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyCoverter;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor do dolar: ");
		double valorDolar = sc.nextDouble();
		System.out.println("Quantos dolares deseja comprar: ");
		double totalDolar = sc.nextDouble();
		
		double totalReais = CurrencyCoverter.conversao(valorDolar, totalDolar);
		
		System.out.println("O total a ser pago em reais: " + totalReais);

		
		sc.close();
		
	}

}
