import java.util.Scanner;

public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("DIA DA SEMANA");

		System.out.print("Digite um numero de um a sete:");
		int numero = sc.nextInt();
		String dia;

		switch (numero) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Não encontrado";
		}

		System.out.println("Dia da semana: " + dia);

		sc.close();
	}