/*Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por exemplo).
Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for suficiente para realizar o saque e/ou pagar a taxa.
Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre mostrando os dados da conta após cada operação.*/

package entities;

public class Banco {
	
	//MEMBRO ESTATICO
	private static final double TAXA = 5;
	
	//ATRIBUTOS
	private int numeroConta;
	private String nome;
	private double saldo;
	
	//CONTRUTORES
	public Banco(int numeroConta, String nome, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		addSaldo(depositoInicial);//metodo 
	}
	
	public Banco(int numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;
	}
	
	//GET, SET
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	//METODOS
	public void addSaldo(double saldo) {
		this.saldo += saldo;
	}
	
	public void saqueSaldo(double saque) {
		this.saldo = this.saldo - saque - TAXA;
		
	}
	
	public String toString() {
		return 
		"---------------------------"
		+ "\nNumero conta: " 
		+ getNumeroConta() 
		+ "\nNome: " 
		+ getNome()
		+ "\nSaldo: R$" 
		+ String.format("%.2f", getSaldo())  
		+ "\n---------------------------";
	}
	
	
	
}

//--------------------------------------------------------------------------------------------------
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Banco banco;//DECLAREI A VARIAVEL BANCO
		
		System.out.print("Numero conta: ");
		int numeroConta = sc.nextInt();
		sc.nextLine();
		System.out.print("Nome do titular: ");
		String nome = sc.nextLine();
		
		System.out.print("Deseja adicionar um deposito inicial? (1) para sim e (2) para não.");
		int opcao = sc.nextInt();
		
		if(opcao == 1) {
			System.out.print("Deposito Inicial: ");
			double depositoInicial = sc.nextDouble();
			banco = new Banco(numeroConta, nome, depositoInicial);
			System.out.println(banco);
		}else {
			banco = new Banco(numeroConta, nome);
			System.out.println(banco.getNumeroConta() + banco.getNome());
			System.out.println(banco);
		}
		
		System.out.print("Faça um Deposito de qualquer valor:");
		double acrescentar = sc.nextDouble();
		banco.addSaldo(acrescentar);
		
		System.out.println(banco);
		
		System.out.print("Faça um saque de qualquer valor:");
		double saque = sc.nextDouble();
		banco.saqueSaldo(saque);
		
		System.out.println(banco);
		
		sc.close();
		
	}
}
