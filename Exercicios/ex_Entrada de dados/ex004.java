/**Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais */

import java.util.Scanner;
import java.util.Locale;

public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Numero funcionario: ");
		int numFuncionario = sc.nextInt();
		System.out.print("Numero de horas trabalhadas: ");
		int numHoraTrabalhada = sc.nextInt();
		System.out.print("Valor recebido por hora: ");
		double valorHora = sc.nextDouble();

		double somaSalario = numHoraTrabalhada * valorHora;

		System.out.printf("NUMBER = %d %nSALARY = U$ %.2f", numFuncionario, somaSalario);

		sc.close();
	}