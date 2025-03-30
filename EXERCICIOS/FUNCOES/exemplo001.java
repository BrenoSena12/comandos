/**CALCULAR A ÁREA DE UM TRIANGULO*/
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Entre com os valores do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com os valores do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.println("triangulo X: " + areaX);
		System.out.println("triangulo Y: " + areaY);
		
		if (areaX > areaY) {
			System.out.println("Area X maior: " + areaX);
		}else {
			System.out.println("Area Y maior: " + areaY);
		}
		
		sc.close();
		
	}
	
}
//------------------------------------------------------------------------------------
package entities;

public class Triangulo {
	public double a;
	public double b;
	public double c;
	
	public double area() {
		double p = (a + b + c) / 2;
		return Math.sqrt(p* (p - a) * (p - b) * (p - c));
	}
}
