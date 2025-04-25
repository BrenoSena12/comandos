/*
Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de N funcionários. Não deve haver repetição de id.
Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário. Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários, conforme exemplos.
Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de aumento por porcentagem dada.
*/
package entities;

public class Funcionario {
	private Integer id;
	private String name;
	private Double salary;
	
	//CONSTRUTOR PADRAO
	public Funcionario() {
	}
	
	// CONSTRUTOR COM ARGUMENTOS
	public Funcionario(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	// GETTER E SETTER
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void increaseSalary(double percentage) {
		salary = salary + (salary * percentage / 100);
	}
	
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
}

//******************************************************************************* */
package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class EmpresaProgram {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionario> listaFuncionario = new ArrayList<>();

		System.out.print("Quantos funcionarios serão cadastrados: ");
		int quantidadeFuncionarios = sc.nextInt();

		for (int indice = 0; indice < quantidadeFuncionarios; indice++) {
			System.out.println();
			System.out.println("Funcionario #" + (indice + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();

			Funcionario funcionario = new Funcionario(id, nome, salario);

			listaFuncionario.add(funcionario);
		}

		System.out.println();
		System.out.print("Entre com o Id do funcionario quer terá aumento:");
		int idAumentoSalario = sc.nextInt();

		Funcionario func = listaFuncionario.stream().filter(x -> x.getId() == idAumentoSalario).findFirst().orElse(null);

		if (func == null) {
			System.out.println("ID não encontrado");
		} else {
			System.out.print("Porcentagem do aumento: ");
			double porcentagem = sc.nextDouble();
			func.increaseSalary(porcentagem);
		}

		System.out.println();
		System.out.println("LISTA DE FUNCIONARIOS");

		for (Funcionario resultado : listaFuncionario) {
			System.out.println(resultado);
		}

		sc.close();
	}
}
