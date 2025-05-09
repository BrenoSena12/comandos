package entities;

public class Triangulo {

	// ATRIBUTOS
	private double lado1;
	private double lado2;
	private double lado3;

	// CONSTRUTOR
	public Triangulo() {
	}

	public Triangulo(double lado1, double lado2, double lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	// ENCAPSULAMENTO
	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	// METODOS
	public double calcularArea() {
		double p = (lado1 + lado2 + lado3) / 2;
		return Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
	}
}
/*********************************************************************** */
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangulo x, y;

		System.out.println("ENTRE COM OS LADOS DO TRIANGULO X : ");
		System.out.print("Lado 1: ");
		double x1 = sc.nextDouble();
		System.out.print("Lado 2: ");
		double x2 = sc.nextDouble();
		System.out.print("Lado 3: ");
		double x3 = sc.nextDouble();
		x = new Triangulo(x1, x2, x3);

		System.out.println("ENTRE COM OS LADOS DO TRIANGULO Y : ");
		System.out.print("Lado 1: ");
		double y1 = sc.nextDouble();
		System.out.print("Lado 2: ");
		double y2 = sc.nextDouble();
		System.out.print("Lado 3: ");
		double y3 = sc.nextDouble();
		y = new Triangulo(y1, y2, y3);

		double areaX = x.calcularArea();
		double areaY = y.calcularArea();

		if (areaX > areaY) {
			System.out.println("AREA X MAIOR");
		} else {
			System.out.println("AREA Y MAIOR");
		}

		sc.close();
	}
}
