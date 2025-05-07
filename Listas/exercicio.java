package entities;

public class Funcionario {

	private Integer id;
	private String nome;
	private Double salario;

	// CONSTRUTOR
	public Funcionario() {
	}

	public Funcionario(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	// ENCAPSULAMENTO
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	// METODOS

	public void aumentoSalarial(double porcentagem) {
		salario = (salario * porcentagem / 100) + salario;
	}

}

/********************************************************************** */
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Funcionario funcionario = new Funcionario();

		List<Funcionario> listaFuncionario = new ArrayList<>();

		System.out.print("QUANTIDADE DE FUNCIONARIOS: ");
		int n = sc.nextInt();

		for (int indice = 0; indice < n; indice++) {
			System.out.println();
			System.out.println("FUNCIONARIO #" + (indice + 1));
			System.out.print("Id : ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome : ");
			String nome = sc.nextLine();
			System.out.print("Salario : ");
			Double salario = sc.nextDouble();

			listaFuncionario.add(funcionario = new Funcionario(id, nome, salario));
		}

		System.out.println();

		// TRÁS O DADO DA LISTA
		// System.out.println(listaFuncionario.get(0).getNome());

		System.out.print("DIGITE O ID PARA O AUMENTO SALARIAL: ");
		double aumento = sc.nextDouble();

		System.out.print("PORCENTAGEM DE AUMENTO: ");
		double porcentagem = sc.nextDouble();

		Funcionario func = null; // ESSA VARIAVEL IRÁ GUARDAR O ID, NOME, SALARIO

		// irá filtrar um á um até achar o id selecionado. Depois de encontradado vai
		// guardar os dados na variavel func, o id, nome e salario.
		for (Funcionario f : listaFuncionario) {
			if (f.getId() == aumento) {
				func = f;
				break;
			}
		}
		// como o func contem os dados que precisamos é só passar os comandos.
		if (func != null) {
			func.aumentoSalarial(porcentagem);
		} else {
			System.out.println("Funcionário com ID " + aumento + " não encontrado.");
		}

		System.out.println();

		System.out.println("LISTA DE FUNCIONARIOS: ");

		for (Funcionario f : listaFuncionario) {
			System.out.print(f.getId() + ", ");
			System.out.print(f.getNome() + ", ");
			System.out.printf("%.2f", f.getSalario());
			System.out.println();
		}

		System.out.println(func.getNome());

		sc.close();
	}
}
