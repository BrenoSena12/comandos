/*
Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis)
*/
package entities;

public class Aluno {
	private String nome_aluno;
	private double nota1;
	private double nota2;

	// CONTRUTOR
	public Aluno(String nome_aluno, double nota1, double nota2) {
		this.nome_aluno = nome_aluno;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	// ENCAPULAMENTO
	public String getNome_aluno() {
		return nome_aluno;
	}

	public void setNome_aluno(String nome_aluno) {
		this.nome_aluno = nome_aluno;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
}
/******************************************************* */
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantidade de alunos: ");
		int quantidadeAlunos = sc.nextInt();

		Aluno[] vetor_aluno = new Aluno[quantidadeAlunos];

		for (int i = 0; i < vetor_aluno.length; i++) {
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Nota 1: ");
			double nota1 = sc.nextDouble();
			System.out.print("Nota 2: ");
			double nota2 = sc.nextDouble();
			vetor_aluno[i] = new Aluno(nome, nota1, nota2);
		}

		System.out.println("ALUNOS APROVADOS");
		for (int i = 0; i < vetor_aluno.length; i++) {
			double somaNotas = (vetor_aluno[i].getNota1() + vetor_aluno[i].getNota2()) / 2;
			if (somaNotas >= 6) {
				System.out.println("Nome: " + vetor_aluno[i].getNome_aluno());
			}
		}

		System.out.print("FINALIZADO!")
		sc.close();
	}
}
