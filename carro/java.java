package entities;

public class Carro {
	
	private String modelo;
	private String cor;
	private Integer ano;
	private Double preco;
	
	// CONSTRUTORES
	public Carro() {
	}
	
	public Carro(String modelo, String cor, Integer ano, Double preco) {
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.preco = preco;
	}
	
	//ENCAPSULAMENTO
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	// METODOS
	public double valorEntrada(double entrada) {
		return preco - entrada;
	}

	public String toString() {
		return "Modelo : " + modelo
			  +"\nCor    : " + cor
			  +"\nAno    : " + ano
			  +"\nPreco  : " + preco;
	}
}



package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Carro;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Modelo: ");
		String modelo = sc.nextLine();
		System.out.print("Cor   : ");
		String cor = sc.nextLine();
		System.out.print("Ano   : ");
		int ano = sc.nextInt();
		System.out.print("Preco : ");
		double preco = sc.nextDouble();
		
		Carro carro = new Carro(modelo, cor, ano, preco);
		
		System.out.println();
		System.out.println("VALOR DE ENTRADA: ");
		double entrada = sc.nextDouble();
		
		double valorRestante = carro.valorEntrada(entrada);
		
		System.out.println();
		System.out.println(carro);
		
		System.out.println();
		System.out.println("Falta: " + valorRestante);
	}
}
