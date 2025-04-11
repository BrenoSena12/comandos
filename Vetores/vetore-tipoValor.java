package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de valores que serão armazenados:");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		System.out.println("digite:");
		//ADICIONANDO OS VALORES EM UM VETOR
		for(int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		//SOMAR OS VALORES DE UM VETOR
		double soma = 0.0;
		for(int i = 0; i < n; i++) {
			soma += vect[i];
		}
		
		System.out.println(soma);
		
		sc.close();
		
	}
}
 