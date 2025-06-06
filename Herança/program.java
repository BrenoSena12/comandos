package application;

import entities.Conta;
import entities.ContaEmpresarial;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1001, "Alex", 0.0);
		ContaEmpresarial contaEmpresarial = new ContaEmpresarial(1002, "Maria", 0.0, 500.00); 
		
		/*
		 UPCASTING: 
		 -> pegar um objeto do tipo contEmpresarial e atribuir para uma variavel do tipo
		 Conta.
		 
		 -> ContaEmpresarial é uma Conta.
		 */
		
		Conta acc1 = contaEmpresarial;		
		Conta acc2 = new ContaEmpresarial(1003, "Bob", 0.0, 200.0);
		Conta acc3 = new ContaPoupanca(1004, "Anna", 0.0, 0.01);

		/*
		 DOWNCASTING: 
		 -> Converter da super-classe para a sub-classe

		 */
		
		ContaEmpresarial acc4 = (ContaEmpresarial)acc2;
		// ERRO: ContaEmpresarial acc5 = (ContaEmpresarial)acc3;
		
		if(acc3 instanceof ContaEmpresarial) {
			ContaEmpresarial acc5 = (ContaEmpresarial)acc3;
			acc5.emprestimo(200.0);
			System.out.println("Emprestimo!");
		}
		
		if(acc3 instanceof ContaPoupanca) {
			ContaPoupanca acc5 = (ContaPoupanca)acc3;
			acc5.atualizarSaldo();
			System.out.println("Atualizado");
		}
	}
}