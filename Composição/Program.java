package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.Worker;
import entities.enuns.WorkerLevel;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o nome do departamento : ");
		String departmentName = sc.nextLine();
		System.out.println("ENTRE COM OS DADOS DO TRABALHADOR :");
		System.out.print("Nome : ");
		String workerName = sc.nextLine();
		System.out.print("Nivel : ");
		String workerLevel = sc.nextLine();
		System.out.print("Salário base : ");
		double baseSalary = sc.nextDouble();

		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
				new Department(departmentName));

		sc.close();
	}
}
