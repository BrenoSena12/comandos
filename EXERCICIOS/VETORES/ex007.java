/*
Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes 
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome 
da pessoa mais velha. 
*/

package entities;

public class Pessoa {

	private String nome;
	private int idade;
	
	// CONTRUTORES
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public Pessoa(int idade) {
		this.idade = idade;
	}
	
	// ENCAPSULAMENTO
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
//*************************************************************** */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantidade de pessoas: ");
		int qtdPessoas = sc.nextInt();

		Pessoa[] nome_vetor, idade_vetor;

		nome_vetor = new Pessoa[qtdPessoas];
		idade_vetor = new Pessoa[qtdPessoas];

		for (int i = 0; i < qtdPessoas; i++) {
			System.out.println("DADOS DA " + (i + 1) + "a PESSOA:");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			nome_vetor[i] = new Pessoa(nome);
			idade_vetor[i] = new Pessoa(idade);
		}

		int idadeMaisVelho = idade_vetor[0].getIdade();
		String nomeMaisVelho = null;

		for (int i = 1; i < idade_vetor.length; i++) {
			if (idadeMaisVelho < idade_vetor[i].getIdade()) {
				idadeMaisVelho = idade_vetor[i].getIdade();
				nomeMaisVelho = nome_vetor[i].getNome();
			}
		}

		System.out.println("PESSOA MAIS VELHA: " + nomeMaisVelho);

		sc.close();
	}
}
  