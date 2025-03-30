/**
 FAZER UM PROGRAMA PARA LER OS VALORES DA LARGURA E ALTURA DE UM RETÂNGULO. EM SEGUIDA, MOSTRAR NA TELA O VALOR DE SUA ÁREA, PERÍMETRO E DIAGONAL. 
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Retangulo retangulo = new Retangulo();

		System.out.println("Digite a largura e altura de um retangulo");
		System.out.print("Largura: ");
		retangulo.largura = sc.nextDouble();
		System.out.print("Altura: ");
		retangulo.altura = sc.nextDouble();

		System.out.printf("Area      = %.2f %n", retangulo.area());
		System.out.printf("Perimetro = %.2f %n", retangulo.perimetro());
		System.out.printf("Diagonal  = %.2f %n", retangulo.diagonal());

		System.out.println(retangulo);

		sc.close();
	}

}

//-----------------------------------------------------------------------

package entities;

public class Retangulo {

	public double largura;
	public double altura;

	public double area() {
		return largura * altura;
	}

	public double perimetro() {
		return 2 * (largura + altura);
	}

	public double diagonal() {
		return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
	}

	public String toString() {
		return "O valor da área do retangulo é " + String.format("%.2f", area()) + ", e o valor do perimetro é "
				+ String.format("%.2f", perimetro()) + ", e a diagonal é " + String.format("%.2f", diagonal());
	}

}
