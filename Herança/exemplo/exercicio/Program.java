package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTercerizado;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
		
		System.out.print("QUANTIDADE DE FUNCIONARIOS: ");
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			System.out.println();
			
			System.out.println("Funcionario #" + (i +1) + ":");
			
			System.out.print("Tercerizado (s/n): ");
			char tercerizado = sc.next().charAt(0);
			sc.nextLine();
			
			if(tercerizado == 'n') {
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Horas: ");
				int horas = sc.nextInt();
				System.out.print("Valor por hora: ");
				double valorPorHora = sc.nextDouble();
				Funcionario funcionario = new Funcionario(nome, horas, valorPorHora);
				listaFuncionarios.add(funcionario);
			}else {
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Horas: ");
				int horas = sc.nextInt();
				System.out.print("Valor por hora: ");
				double valorPorHora = sc.nextDouble();
				System.out.print("Custo adcional: ");
				double custoAdcional = sc.nextDouble();
				Funcionario funcionarioTercerizado = new FuncionarioTercerizado(nome, horas, valorPorHora, custoAdcional);
				listaFuncionarios.add(funcionarioTercerizado);
			}
		}
		
		System.out.println();
		System.out.println("PAGAMENTOS: ");
		
		for(Funcionario F : listaFuncionarios) {
			System.out.println(F.getNome() + " - " + F.pagamento());
		}
	
		sc.close();
	}
}
