/**
 FAZER UM PROGRAMA PARA LER OS DADOS DE UM FUNIONARIO (NOME, SALARIO BRUTO E IMPOSTO). EM SEGUIDA, MOSTRAR OS DADOS DO FUNCIONARIO (NOME E SALARIO LIQUIDO). EM SEGUIDA, AUMENTAR O SALARIO DO FUNCIONARIO COM BASE EM UMA PORCENTAGEM DADA (SOMENTE O SALARIO BRUTO É AFETADO PELA PORCENTAGEM) E MOSTRAR NOVAMENTE OS DADOS DO FUNCIONARIO.
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Funcionario funcionario = new Funcionario();

		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Salário Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();

		System.out.println();
		System.out.printf("Funcionario: %s, $ %.2f", funcionario.nome, funcionario.salarioLiquido());
		System.out.println();

		System.out.print("Digite a porcentagem de aumento do salario: ");
		double aumento = sc.nextDouble();

		System.out.println();
		System.out.printf("Updated data: %s , $ %.2f", funcionario.nome, funcionario.salarioFinal(aumento));

		sc.close();
	}

}
//-------------------------------------------------------------------
package entities;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public double salarioFinal(double porcentagem) {
		return (salarioBruto * (porcentagem / 100)) + salarioBruto - imposto;
		
	}
	
}
