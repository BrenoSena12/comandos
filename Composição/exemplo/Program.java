package appication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
// DADOS DE ENTRADA
		System.out.print("Entre com o nome do departamento: ");
		String departmentName = sc.nextLine();
		System.out.println("Dados do trabalhador: ");
		System.out.print("Nome: ");
		String workerName = sc.nextLine();
		System.out.print("Nivel: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base Salarial: ");
		double baseSalary = sc.nextDouble();
// INSTANCIAR DADOS DO TRABALHADOR
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		
		System.out.print("Quantos contratos:");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Entre com o " + i + "° contrato");
			System.out.print("Data (DD/MM/YYYY) :");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valuerPerHour = sc.nextDouble();
			System.out.print("Duração (horas): ");
			int hours = sc.nextInt();
			
			HourContract contract = new HourContract(contractDate, valuerPerHour,hours);
		//FAZ COM QUE O CONTRATO FAÇA RELAÇÃO COM O TRABALHADOR
			worker.addContract(contract);
		}
		
		System.out.println();
		
		System.out.print("Entre com mês e ano para calcular o salario (MM/YYYY): ");
		String monthandyear = sc.next();
		int month = Integer.parseInt(monthandyear.substring(0, 2));
		int year = Integer.parseInt(monthandyear.substring(3));
		
		System.out.println("Nome: " + worker.getName());
		System.out.println("Departamento: " + worker.getDepartment().getName());
		System.out.println("Salário " + monthandyear + ": " + String.format("%.2f",worker.income(year, month)));
		
		sc.close();
	}
}
