/** Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.*/

import java.util.Scanner;

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um valore entre 1 e 1000:");
    int numero = sc.nextInt();

    if (numero >= 1 && numero <= 1000) {
        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }else {
        System.out.println("Valor digitado fora dos parametros pedidos");
    }

    sc.close();
}