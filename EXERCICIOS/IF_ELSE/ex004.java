/**Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. */


import java.util.Scanner;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Inicio: ");
		int inicio = sc.nextInt();
		System.out.print("Fim: ");
		int fim = sc.nextInt();
		
		int duracao;
		
		if(inicio >= fim) {
			duracao = 24 + fim - inicio;
			System.out.println(duracao);
		}else {
			duracao = 24 + fim - inicio - 24;
			System.out.println(duracao);
		}
		
		sc.close();
	}

