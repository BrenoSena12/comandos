package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}catch(FileNotFoundException e) {
			System.out.println("Erro opening file: " + e.getMessage());
		}finally {
			if(sc != null) {
				sc.close();
			}
			System.out.println("Ok");
		}
	}
}