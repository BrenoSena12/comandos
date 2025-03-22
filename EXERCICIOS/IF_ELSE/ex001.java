/**Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não. */
import java.util.Scanner;

public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Numero: ");
		int numero = sc.nextInt();
		
		if(numero >= 0){
			System.out.printf("O Número %d é positivo", numero);
		}else {
			System.out.printf("O Número %d é negativo", numero);
		}

		sc.close();
	}