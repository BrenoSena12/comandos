package application;

import java.util.Locale;
import java.util.Scanner;

import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Numero de contribuentes: ");
		int contribuintes = sc.nextInt();
		
		for(int i = 0; i < contribuintes; i++) {
			System.out.println("DADOS DO CONTRIBUINTE " + (i + 1) + ":");
			
		}
		
		
		
		
		sc.close();
	}
}
