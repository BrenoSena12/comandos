/**Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.

CODIGO          ESPECIFICACAO          PRECO
   1           cachorro-quente        R$ 4.00
   2           x-salada               R$ 4.50
   3           x-bacon                R$ 5.00
   4           torrada simples        R$ 2.00
   5           refrigerante           R$ 1.50
 */

import java.util.Locale;
import java.util.Scanner;

public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double codigo1_cachorroQuente = 4.0;
		double codigo2_xSalada = 4.50;
		double codigo3_xBacon = 5.0;
		double codigo4_torradaSimples = 2.0;
		double codigo5_refrigerante = 1.50;
		double pedido = 0.0;
		
		System.out.println("CODIGO          ESPECIFICACAO          PRECO\n"
				+ "   1           cachorro-quente        R$ 4.00\n"
				+ "   2           x-salada               R$ 4.50\n"
				+ "   3           x-bacon                R$ 5.00\n"
				+ "   4           torrada simples        R$ 2.00\n"
				+ "   5           refrigerante           R$ 1.50");
		
		
		System.out.print("codigo do pedido: ");
		int codigo_pedido = sc.nextInt();
		System.out.print("Quantidade: ");
		int quantidade_pedido = sc.nextInt();
		
		if (codigo_pedido == 1) {
			pedido = codigo1_cachorroQuente;
		}else if(codigo_pedido == 2) {
			pedido = codigo2_xSalada;
		}else if(codigo_pedido == 3) {
			pedido = codigo3_xBacon;
		}else if(codigo_pedido == 4) {
			pedido = codigo4_torradaSimples;
		}else{
			pedido = codigo5_refrigerante;
		}
		
		pedido = pedido * quantidade_pedido;
		
		System.out.printf("Total : R$%.2f", pedido);
		
		
		sc.close();
	}