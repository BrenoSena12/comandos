package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("ENTRE COM CLIENTE E DATA: ");
		
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Data aniverssário (DD/MM/YYYY): ");
		String birth = sc.nextLine();
		
		
		
		
		
		
		
		sc.close();
	}

}
