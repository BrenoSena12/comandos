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
	
	
}
/*********************************** */
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
		
		Funcionario funcionario;
		
		List<Funcionario> listaFuncionario = new ArrayList<>();
		
		System.out.print("QUANTIDADE DE FUNCIONARIOS: ");
		int n = sc.nextInt();
		
		for(int indice = 0; indice < n; indice++) {
			System.out.println("FUNCIONARIO #" + (indice + 1));
			System.out.print("Id :");
			int id = sc.nextInt();
			System.out.print("Nome :");
			String nome = sc.nextLine();
			sc.nextLine();
			System.out.print("Salario :");
			double salario = sc.nextDouble();
			System.out.println();
			
			funcionario = new Funcionario(id, nome, salario);
			listaFuncionario.add(funcionario);
		}
		
		System.out.println(listaFuncionario.get(funcionario.getNome("Breno")));
		
		sc.close();
	}
}
