/*
Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver. 
*/
package entities;

public class Pessoas {

	private String nome;
	private int idade;
	private double altura;
	
	//CONSTRUTORES
	public Pessoas() {
	}
	
	public Pessoas(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	//GETTERS and SETTERS 
	public String getNome() {
		return nome;
	}
	
	public void setNOME(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
}

//****************************************************************************
package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Pessoas;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão cadastradas: ");
		int numeroPessoas = sc.nextInt();
		
		Pessoas pessoas = new Pessoas();
		
		Pessoas[] vetor = new Pessoas[numeroPessoas];
		
		for(int i=0; i< vetor.length; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vetor[i] = new Pessoas(nome, idade, altura);
			
		}
		
		double media = 0;
		
		for(int i = 0 ; i<vetor.length; i++) {
			media += vetor[i].getAltura();
		}
		
		System.out.println();
		media = media / vetor.length;
		System.out.println("ALTURA MÉDIA: " + media);
		
		System.out.print("PESSAS COM MENOS DE 16 ANOS: ");
	
		double porcentagem = 0.0;
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i].getIdade() < 16) {
				double somaMenoresDeIdade = i++;
				porcentagem = 100 / vetor.length * somaMenoresDeIdade;
			}
		}

		System.out.println(porcentagem + "%");
		
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i].getIdade() < 16) {
				System.out.println(vetor[i].getNome());
			}
		}
		sc.close();
	}
}
