package application;

import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String[] args) {

		List<String> carros = new ArrayList<>();
		
		carros.add("Porshe GT3 RS");
		carros.add("Corvette C8 Z51");
		carros.add(0 , "Lamborguini SVJ"); // ESCOLHER A POSIÇÃO
		
		System.out.println(carros.get(0)); // RETORNAR ELEMENTO DA POSIÇÃO
		
		System.out.println(carros.indexOf("Corvette C8 Z51"));
		/*
		for(String n : carros) {
			System.out.println(n);
		}
		*/
	}
}
