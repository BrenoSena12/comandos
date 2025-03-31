/**
 FAZER UM PROGRAMA PARA LER O NOME DE UM ALUNO E AS TRÊS NOTAS QUE ELE OBTEVE NOS TRÊS TRIMESTRES DO ANO (PRIMEIRO TRIMESTRE VALE 30 E O SEGUNDO E TERCEIRO VALEM 35 CADA, NÃO PRECISA VERIFICAR SE A NOTA ESTÁ DENTRO DOS 3O OU 35). AO FINAL, MOSTRAR QUAL A NOTA FINAL DO ALUNO NO ANO. DIZER TAMBÉM SE O ALUNO ESTÁ APROVADO (PASS) OU NÃO (FAILED) E, EM CASO SEGATIVO, QUANTOS PONTOS FALTAM PARA O ALUNO OBTER O MÍNIMO PARA SER APROVADO (QUE É 60% DA NOTA).
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Estudante estudante = new Estudante();

		System.out.print("Nome:");
		estudante.nome = sc.nextLine();
		System.out.print("Nota 1:");
		estudante.nota1 = sc.nextDouble();
		System.out.print("Nota 2:");
		estudante.nota2 = sc.nextDouble();
		System.out.print("Nota 3:");
		estudante.nota3 = sc.nextDouble();

		if (estudante.somaNotas() >= 60) {
			System.out.println("Final grade = " + estudante.somaNotas());
			System.out.println("PASS!");
		} else {
			System.out.println("Final grade = " + estudante.somaNotas());
			System.out.println("FAILED!");
			System.out.println("Faltam " + estudante.recuperação() + " Pontos");
		}

		sc.close();
	}

}
//------------------------------------------------------------------------------------

package entities;

public class Estudante {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;

	public double somaNotas() {
		return nota1 + nota2 + nota3;
	}

	public double recuperação() {
		return 60 - somaNotas();
	}
}


